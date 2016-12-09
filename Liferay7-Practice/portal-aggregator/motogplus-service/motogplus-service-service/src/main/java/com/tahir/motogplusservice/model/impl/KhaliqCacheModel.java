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

package com.tahir.motogplusservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tahir.motogplusservice.model.Khaliq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Khaliq in entity cache.
 *
 * @author TahirNoor
 * @see Khaliq
 * @generated
 */
@ProviderType
public class KhaliqCacheModel implements CacheModel<Khaliq>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhaliqCacheModel)) {
			return false;
		}

		KhaliqCacheModel khaliqCacheModel = (KhaliqCacheModel)obj;

		if (khaliqId == khaliqCacheModel.khaliqId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, khaliqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", khaliqId=");
		sb.append(khaliqId);
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
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", dob=");
		sb.append(dob);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Khaliq toEntityModel() {
		KhaliqImpl khaliqImpl = new KhaliqImpl();

		if (uuid == null) {
			khaliqImpl.setUuid(StringPool.BLANK);
		}
		else {
			khaliqImpl.setUuid(uuid);
		}

		khaliqImpl.setKhaliqId(khaliqId);
		khaliqImpl.setGroupId(groupId);
		khaliqImpl.setCompanyId(companyId);
		khaliqImpl.setUserId(userId);

		if (userName == null) {
			khaliqImpl.setUserName(StringPool.BLANK);
		}
		else {
			khaliqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			khaliqImpl.setCreateDate(null);
		}
		else {
			khaliqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			khaliqImpl.setModifiedDate(null);
		}
		else {
			khaliqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			khaliqImpl.setName(StringPool.BLANK);
		}
		else {
			khaliqImpl.setName(name);
		}

		if (designation == null) {
			khaliqImpl.setDesignation(StringPool.BLANK);
		}
		else {
			khaliqImpl.setDesignation(designation);
		}

		if (dob == Long.MIN_VALUE) {
			khaliqImpl.setDob(null);
		}
		else {
			khaliqImpl.setDob(new Date(dob));
		}

		khaliqImpl.resetOriginalValues();

		return khaliqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		khaliqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		designation = objectInput.readUTF();
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

		objectOutput.writeLong(khaliqId);

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

		if (designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designation);
		}

		objectOutput.writeLong(dob);
	}

	public String uuid;
	public long khaliqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String designation;
	public long dob;
}