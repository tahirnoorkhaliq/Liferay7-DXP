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

package com.tahir.liferaypractice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TestServiceModule}.
 * </p>
 *
 * @author Tahir
 * @see TestServiceModule
 * @generated
 */
@ProviderType
public class TestServiceModuleWrapper implements TestServiceModule,
	ModelWrapper<TestServiceModule> {
	public TestServiceModuleWrapper(TestServiceModule testServiceModule) {
		_testServiceModule = testServiceModule;
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

	@Override
	public java.lang.Object clone() {
		return new TestServiceModuleWrapper((TestServiceModule)_testServiceModule.clone());
	}

	@Override
	public int compareTo(
		com.tahir.liferaypractice.model.TestServiceModule testServiceModule) {
		return _testServiceModule.compareTo(testServiceModule);
	}

	/**
	* Returns the age of this test service module.
	*
	* @return the age of this test service module
	*/
	@Override
	public int getAge() {
		return _testServiceModule.getAge();
	}

	/**
	* Returns the company ID of this test service module.
	*
	* @return the company ID of this test service module
	*/
	@Override
	public long getCompanyId() {
		return _testServiceModule.getCompanyId();
	}

	/**
	* Returns the create date of this test service module.
	*
	* @return the create date of this test service module
	*/
	@Override
	public Date getCreateDate() {
		return _testServiceModule.getCreateDate();
	}

	/**
	* Returns the dob of this test service module.
	*
	* @return the dob of this test service module
	*/
	@Override
	public Date getDob() {
		return _testServiceModule.getDob();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _testServiceModule.getExpandoBridge();
	}

	/**
	* Returns the group ID of this test service module.
	*
	* @return the group ID of this test service module
	*/
	@Override
	public long getGroupId() {
		return _testServiceModule.getGroupId();
	}

	/**
	* Returns the modified date of this test service module.
	*
	* @return the modified date of this test service module
	*/
	@Override
	public Date getModifiedDate() {
		return _testServiceModule.getModifiedDate();
	}

	/**
	* Returns the name of this test service module.
	*
	* @return the name of this test service module
	*/
	@Override
	public java.lang.String getName() {
		return _testServiceModule.getName();
	}

	/**
	* Returns the primary key of this test service module.
	*
	* @return the primary key of this test service module
	*/
	@Override
	public long getPrimaryKey() {
		return _testServiceModule.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testServiceModule.getPrimaryKeyObj();
	}

	/**
	* Returns the profession of this test service module.
	*
	* @return the profession of this test service module
	*/
	@Override
	public java.lang.String getProfession() {
		return _testServiceModule.getProfession();
	}

	/**
	* Returns the test service module ID of this test service module.
	*
	* @return the test service module ID of this test service module
	*/
	@Override
	public long getTestServiceModuleId() {
		return _testServiceModule.getTestServiceModuleId();
	}

	/**
	* Returns the user ID of this test service module.
	*
	* @return the user ID of this test service module
	*/
	@Override
	public long getUserId() {
		return _testServiceModule.getUserId();
	}

	/**
	* Returns the user name of this test service module.
	*
	* @return the user name of this test service module
	*/
	@Override
	public java.lang.String getUserName() {
		return _testServiceModule.getUserName();
	}

	/**
	* Returns the user uuid of this test service module.
	*
	* @return the user uuid of this test service module
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _testServiceModule.getUserUuid();
	}

	/**
	* Returns the uuid of this test service module.
	*
	* @return the uuid of this test service module
	*/
	@Override
	public java.lang.String getUuid() {
		return _testServiceModule.getUuid();
	}

	@Override
	public int hashCode() {
		return _testServiceModule.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _testServiceModule.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _testServiceModule.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _testServiceModule.isNew();
	}

	@Override
	public void persist() {
		_testServiceModule.persist();
	}

	/**
	* Sets the age of this test service module.
	*
	* @param age the age of this test service module
	*/
	@Override
	public void setAge(int age) {
		_testServiceModule.setAge(age);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_testServiceModule.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this test service module.
	*
	* @param companyId the company ID of this test service module
	*/
	@Override
	public void setCompanyId(long companyId) {
		_testServiceModule.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this test service module.
	*
	* @param createDate the create date of this test service module
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_testServiceModule.setCreateDate(createDate);
	}

	/**
	* Sets the dob of this test service module.
	*
	* @param dob the dob of this test service module
	*/
	@Override
	public void setDob(Date dob) {
		_testServiceModule.setDob(dob);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_testServiceModule.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_testServiceModule.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_testServiceModule.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this test service module.
	*
	* @param groupId the group ID of this test service module
	*/
	@Override
	public void setGroupId(long groupId) {
		_testServiceModule.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this test service module.
	*
	* @param modifiedDate the modified date of this test service module
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_testServiceModule.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this test service module.
	*
	* @param name the name of this test service module
	*/
	@Override
	public void setName(java.lang.String name) {
		_testServiceModule.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_testServiceModule.setNew(n);
	}

	/**
	* Sets the primary key of this test service module.
	*
	* @param primaryKey the primary key of this test service module
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_testServiceModule.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_testServiceModule.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the profession of this test service module.
	*
	* @param profession the profession of this test service module
	*/
	@Override
	public void setProfession(java.lang.String profession) {
		_testServiceModule.setProfession(profession);
	}

	/**
	* Sets the test service module ID of this test service module.
	*
	* @param testServiceModuleId the test service module ID of this test service module
	*/
	@Override
	public void setTestServiceModuleId(long testServiceModuleId) {
		_testServiceModule.setTestServiceModuleId(testServiceModuleId);
	}

	/**
	* Sets the user ID of this test service module.
	*
	* @param userId the user ID of this test service module
	*/
	@Override
	public void setUserId(long userId) {
		_testServiceModule.setUserId(userId);
	}

	/**
	* Sets the user name of this test service module.
	*
	* @param userName the user name of this test service module
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_testServiceModule.setUserName(userName);
	}

	/**
	* Sets the user uuid of this test service module.
	*
	* @param userUuid the user uuid of this test service module
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_testServiceModule.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this test service module.
	*
	* @param uuid the uuid of this test service module
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_testServiceModule.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.tahir.liferaypractice.model.TestServiceModule> toCacheModel() {
		return _testServiceModule.toCacheModel();
	}

	@Override
	public com.tahir.liferaypractice.model.TestServiceModule toEscapedModel() {
		return new TestServiceModuleWrapper(_testServiceModule.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _testServiceModule.toString();
	}

	@Override
	public com.tahir.liferaypractice.model.TestServiceModule toUnescapedModel() {
		return new TestServiceModuleWrapper(_testServiceModule.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _testServiceModule.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestServiceModuleWrapper)) {
			return false;
		}

		TestServiceModuleWrapper testServiceModuleWrapper = (TestServiceModuleWrapper)obj;

		if (Validator.equals(_testServiceModule,
					testServiceModuleWrapper._testServiceModule)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _testServiceModule.getStagedModelType();
	}

	@Override
	public TestServiceModule getWrappedModel() {
		return _testServiceModule;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _testServiceModule.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _testServiceModule.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_testServiceModule.resetOriginalValues();
	}

	private final TestServiceModule _testServiceModule;
}