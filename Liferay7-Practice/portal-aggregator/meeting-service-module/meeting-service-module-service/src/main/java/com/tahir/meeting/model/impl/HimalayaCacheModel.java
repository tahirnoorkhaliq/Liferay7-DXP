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

package com.tahir.meeting.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tahir.meeting.model.Himalaya;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Himalaya in entity cache.
 *
 * @author Tahir Noor
 * @see Himalaya
 * @generated
 */
@ProviderType
public class HimalayaCacheModel implements CacheModel<Himalaya>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HimalayaCacheModel)) {
			return false;
		}

		HimalayaCacheModel himalayaCacheModel = (HimalayaCacheModel)obj;

		if (himalayaId == himalayaCacheModel.himalayaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, himalayaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", himalayaId=");
		sb.append(himalayaId);
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
		sb.append(", comapany=");
		sb.append(comapany);
		sb.append(", dob=");
		sb.append(dob);
		sb.append(", doj=");
		sb.append(doj);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Himalaya toEntityModel() {
		HimalayaImpl himalayaImpl = new HimalayaImpl();

		if (uuid == null) {
			himalayaImpl.setUuid(StringPool.BLANK);
		}
		else {
			himalayaImpl.setUuid(uuid);
		}

		himalayaImpl.setHimalayaId(himalayaId);
		himalayaImpl.setGroupId(groupId);
		himalayaImpl.setCompanyId(companyId);
		himalayaImpl.setUserId(userId);

		if (userName == null) {
			himalayaImpl.setUserName(StringPool.BLANK);
		}
		else {
			himalayaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			himalayaImpl.setCreateDate(null);
		}
		else {
			himalayaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			himalayaImpl.setModifiedDate(null);
		}
		else {
			himalayaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			himalayaImpl.setName(StringPool.BLANK);
		}
		else {
			himalayaImpl.setName(name);
		}

		if (designation == null) {
			himalayaImpl.setDesignation(StringPool.BLANK);
		}
		else {
			himalayaImpl.setDesignation(designation);
		}

		if (comapany == null) {
			himalayaImpl.setComapany(StringPool.BLANK);
		}
		else {
			himalayaImpl.setComapany(comapany);
		}

		if (dob == Long.MIN_VALUE) {
			himalayaImpl.setDob(null);
		}
		else {
			himalayaImpl.setDob(new Date(dob));
		}

		if (doj == Long.MIN_VALUE) {
			himalayaImpl.setDoj(null);
		}
		else {
			himalayaImpl.setDoj(new Date(doj));
		}

		himalayaImpl.resetOriginalValues();

		return himalayaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		himalayaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		designation = objectInput.readUTF();
		comapany = objectInput.readUTF();
		dob = objectInput.readLong();
		doj = objectInput.readLong();
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

		objectOutput.writeLong(himalayaId);

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

		if (comapany == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comapany);
		}

		objectOutput.writeLong(dob);
		objectOutput.writeLong(doj);
	}

	public String uuid;
	public long himalayaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String designation;
	public String comapany;
	public long dob;
	public long doj;
}