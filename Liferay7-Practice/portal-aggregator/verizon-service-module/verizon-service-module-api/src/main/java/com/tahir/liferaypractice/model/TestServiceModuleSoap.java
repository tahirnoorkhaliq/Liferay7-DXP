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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.tahir.liferaypractice.service.http.TestServiceModuleServiceSoap}.
 *
 * @author Tahir
 * @see com.tahir.liferaypractice.service.http.TestServiceModuleServiceSoap
 * @generated
 */
@ProviderType
public class TestServiceModuleSoap implements Serializable {
	public static TestServiceModuleSoap toSoapModel(TestServiceModule model) {
		TestServiceModuleSoap soapModel = new TestServiceModuleSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTestServiceModuleId(model.getTestServiceModuleId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setAge(model.getAge());
		soapModel.setProfession(model.getProfession());
		soapModel.setDob(model.getDob());

		return soapModel;
	}

	public static TestServiceModuleSoap[] toSoapModels(
		TestServiceModule[] models) {
		TestServiceModuleSoap[] soapModels = new TestServiceModuleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestServiceModuleSoap[][] toSoapModels(
		TestServiceModule[][] models) {
		TestServiceModuleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestServiceModuleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestServiceModuleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestServiceModuleSoap[] toSoapModels(
		List<TestServiceModule> models) {
		List<TestServiceModuleSoap> soapModels = new ArrayList<TestServiceModuleSoap>(models.size());

		for (TestServiceModule model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestServiceModuleSoap[soapModels.size()]);
	}

	public TestServiceModuleSoap() {
	}

	public long getPrimaryKey() {
		return _testServiceModuleId;
	}

	public void setPrimaryKey(long pk) {
		setTestServiceModuleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTestServiceModuleId() {
		return _testServiceModuleId;
	}

	public void setTestServiceModuleId(long testServiceModuleId) {
		_testServiceModuleId = testServiceModuleId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public String getProfession() {
		return _profession;
	}

	public void setProfession(String profession) {
		_profession = profession;
	}

	public Date getDob() {
		return _dob;
	}

	public void setDob(Date dob) {
		_dob = dob;
	}

	private String _uuid;
	private long _testServiceModuleId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private int _age;
	private String _profession;
	private Date _dob;
}