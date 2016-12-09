/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.tahir.liferaypractice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tahir.liferaypractice.model.TestServiceModule;
import com.tahir.liferaypractice.model.TestServiceModuleModel;
import com.tahir.liferaypractice.model.TestServiceModuleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TestServiceModule service. Represents a row in the &quot;NC__TestServiceModule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TestServiceModuleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestServiceModuleImpl}.
 * </p>
 *
 * @author Tahir
 * @see TestServiceModuleImpl
 * @see TestServiceModule
 * @see TestServiceModuleModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class TestServiceModuleModelImpl extends BaseModelImpl<TestServiceModule>
	implements TestServiceModuleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a test service module model instance should use the {@link TestServiceModule} interface instead.
	 */
	public static final String TABLE_NAME = "NC__TestServiceModule";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "testServiceModuleId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "age", Types.INTEGER },
			{ "profession", Types.VARCHAR },
			{ "dob", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("testServiceModuleId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("age", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("profession", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dob", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table NC__TestServiceModule (uuid_ VARCHAR(75) null,testServiceModuleId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,age INTEGER,profession VARCHAR(75) null,dob DATE null)";
	public static final String TABLE_SQL_DROP = "drop table NC__TestServiceModule";
	public static final String ORDER_BY_JPQL = " ORDER BY testServiceModule.testServiceModuleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY NC__TestServiceModule.testServiceModuleId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.tahir.liferaypractice.service.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.tahir.liferaypractice.model.TestServiceModule"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.tahir.liferaypractice.service.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.tahir.liferaypractice.model.TestServiceModule"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.tahir.liferaypractice.service.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.tahir.liferaypractice.model.TestServiceModule"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long TESTSERVICEMODULEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TestServiceModule toModel(TestServiceModuleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TestServiceModule model = new TestServiceModuleImpl();

		model.setUuid(soapModel.getUuid());
		model.setTestServiceModuleId(soapModel.getTestServiceModuleId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setAge(soapModel.getAge());
		model.setProfession(soapModel.getProfession());
		model.setDob(soapModel.getDob());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TestServiceModule> toModels(
		TestServiceModuleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TestServiceModule> models = new ArrayList<TestServiceModule>(soapModels.length);

		for (TestServiceModuleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.tahir.liferaypractice.service.util.PropsUtil.get(
				"lock.expiration.time.com.tahir.liferaypractice.model.TestServiceModule"));

	public TestServiceModuleModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _testServiceModuleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTestServiceModuleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testServiceModuleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TestServiceModule.class;
	}

	@Override
	public String getModelClassName() {
		return TestServiceModule.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("testServiceModuleId", getTestServiceModuleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("age", getAge());
		attributes.put("profession", getProfession());
		attributes.put("dob", getDob());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long testServiceModuleId = (Long)attributes.get("testServiceModuleId");

		if (testServiceModuleId != null) {
			setTestServiceModuleId(testServiceModuleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String profession = (String)attributes.get("profession");

		if (profession != null) {
			setProfession(profession);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getTestServiceModuleId() {
		return _testServiceModuleId;
	}

	@Override
	public void setTestServiceModuleId(long testServiceModuleId) {
		_testServiceModuleId = testServiceModuleId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public int getAge() {
		return _age;
	}

	@Override
	public void setAge(int age) {
		_age = age;
	}

	@JSON
	@Override
	public String getProfession() {
		if (_profession == null) {
			return StringPool.BLANK;
		}
		else {
			return _profession;
		}
	}

	@Override
	public void setProfession(String profession) {
		_profession = profession;
	}

	@JSON
	@Override
	public Date getDob() {
		return _dob;
	}

	@Override
	public void setDob(Date dob) {
		_dob = dob;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				TestServiceModule.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TestServiceModule.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TestServiceModule toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TestServiceModule)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TestServiceModuleImpl testServiceModuleImpl = new TestServiceModuleImpl();

		testServiceModuleImpl.setUuid(getUuid());
		testServiceModuleImpl.setTestServiceModuleId(getTestServiceModuleId());
		testServiceModuleImpl.setGroupId(getGroupId());
		testServiceModuleImpl.setCompanyId(getCompanyId());
		testServiceModuleImpl.setUserId(getUserId());
		testServiceModuleImpl.setUserName(getUserName());
		testServiceModuleImpl.setCreateDate(getCreateDate());
		testServiceModuleImpl.setModifiedDate(getModifiedDate());
		testServiceModuleImpl.setName(getName());
		testServiceModuleImpl.setAge(getAge());
		testServiceModuleImpl.setProfession(getProfession());
		testServiceModuleImpl.setDob(getDob());

		testServiceModuleImpl.resetOriginalValues();

		return testServiceModuleImpl;
	}

	@Override
	public int compareTo(TestServiceModule testServiceModule) {
		long primaryKey = testServiceModule.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestServiceModule)) {
			return false;
		}

		TestServiceModule testServiceModule = (TestServiceModule)obj;

		long primaryKey = testServiceModule.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		TestServiceModuleModelImpl testServiceModuleModelImpl = this;

		testServiceModuleModelImpl._originalUuid = testServiceModuleModelImpl._uuid;

		testServiceModuleModelImpl._originalGroupId = testServiceModuleModelImpl._groupId;

		testServiceModuleModelImpl._setOriginalGroupId = false;

		testServiceModuleModelImpl._originalCompanyId = testServiceModuleModelImpl._companyId;

		testServiceModuleModelImpl._setOriginalCompanyId = false;

		testServiceModuleModelImpl._setModifiedDate = false;

		testServiceModuleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TestServiceModule> toCacheModel() {
		TestServiceModuleCacheModel testServiceModuleCacheModel = new TestServiceModuleCacheModel();

		testServiceModuleCacheModel.uuid = getUuid();

		String uuid = testServiceModuleCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			testServiceModuleCacheModel.uuid = null;
		}

		testServiceModuleCacheModel.testServiceModuleId = getTestServiceModuleId();

		testServiceModuleCacheModel.groupId = getGroupId();

		testServiceModuleCacheModel.companyId = getCompanyId();

		testServiceModuleCacheModel.userId = getUserId();

		testServiceModuleCacheModel.userName = getUserName();

		String userName = testServiceModuleCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			testServiceModuleCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			testServiceModuleCacheModel.createDate = createDate.getTime();
		}
		else {
			testServiceModuleCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			testServiceModuleCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			testServiceModuleCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		testServiceModuleCacheModel.name = getName();

		String name = testServiceModuleCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			testServiceModuleCacheModel.name = null;
		}

		testServiceModuleCacheModel.age = getAge();

		testServiceModuleCacheModel.profession = getProfession();

		String profession = testServiceModuleCacheModel.profession;

		if ((profession != null) && (profession.length() == 0)) {
			testServiceModuleCacheModel.profession = null;
		}

		Date dob = getDob();

		if (dob != null) {
			testServiceModuleCacheModel.dob = dob.getTime();
		}
		else {
			testServiceModuleCacheModel.dob = Long.MIN_VALUE;
		}

		return testServiceModuleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", testServiceModuleId=");
		sb.append(getTestServiceModuleId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", profession=");
		sb.append(getProfession());
		sb.append(", dob=");
		sb.append(getDob());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.tahir.liferaypractice.model.TestServiceModule");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>testServiceModuleId</column-name><column-value><![CDATA[");
		sb.append(getTestServiceModuleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>profession</column-name><column-value><![CDATA[");
		sb.append(getProfession());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dob</column-name><column-value><![CDATA[");
		sb.append(getDob());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TestServiceModule.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TestServiceModule.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _testServiceModuleId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private int _age;
	private String _profession;
	private Date _dob;
	private long _columnBitmask;
	private TestServiceModule _escapedModel;
}