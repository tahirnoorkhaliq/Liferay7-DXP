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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tahir.liferaypractice.model.TestServiceModule;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TestServiceModule in entity cache.
 *
 * @author Tahir
 * @see TestServiceModule
 * @generated
 */
@ProviderType
public class TestServiceModuleCacheModel implements CacheModel<TestServiceModule>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestServiceModuleCacheModel)) {
			return false;
		}

		TestServiceModuleCacheModel testServiceModuleCacheModel = (TestServiceModuleCacheModel)obj;

		if (testServiceModuleId == testServiceModuleCacheModel.testServiceModuleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, testServiceModuleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", testServiceModuleId=");
		sb.append(testServiceModuleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append(", profession=");
		sb.append(profession);
		sb.append(", dob=");
		sb.append(dob);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestServiceModule toEntityModel() {
		TestServiceModuleImpl testServiceModuleImpl = new TestServiceModuleImpl();

		if (uuid == null) {
			testServiceModuleImpl.setUuid(StringPool.BLANK);
		}
		else {
			testServiceModuleImpl.setUuid(uuid);
		}

		testServiceModuleImpl.setTestServiceModuleId(testServiceModuleId);
		testServiceModuleImpl.setGroupId(groupId);
		testServiceModuleImpl.setCompanyId(companyId);
		testServiceModuleImpl.setUserId(userId);

		if (userName == null) {
			testServiceModuleImpl.setUserName(StringPool.BLANK);
		}
		else {
			testServiceModuleImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			testServiceModuleImpl.setCreateDate(null);
		}
		else {
			testServiceModuleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			testServiceModuleImpl.setModifiedDate(null);
		}
		else {
			testServiceModuleImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			testServiceModuleImpl.setName(StringPool.BLANK);
		}
		else {
			testServiceModuleImpl.setName(name);
		}

		testServiceModuleImpl.setAge(age);

		if (profession == null) {
			testServiceModuleImpl.setProfession(StringPool.BLANK);
		}
		else {
			testServiceModuleImpl.setProfession(profession);
		}

		if (dob == Long.MIN_VALUE) {
			testServiceModuleImpl.setDob(null);
		}
		else {
			testServiceModuleImpl.setDob(new Date(dob));
		}

		testServiceModuleImpl.resetOriginalValues();

		return testServiceModuleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		testServiceModuleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		age = objectInput.readInt();
		profession = objectInput.readUTF();
		dob = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(testServiceModuleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(age);

		if (profession == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(profession);
		}

		objectOutput.writeLong(dob);
	}

	public String uuid;
	public long testServiceModuleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int age;
	public String profession;
	public long dob;
}