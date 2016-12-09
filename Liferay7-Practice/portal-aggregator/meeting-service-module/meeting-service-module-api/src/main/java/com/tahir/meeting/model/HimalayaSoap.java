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

package com.tahir.meeting.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.tahir.meeting.service.http.HimalayaServiceSoap}.
 *
 * @author Tahir Noor
 * @see com.tahir.meeting.service.http.HimalayaServiceSoap
 * @generated
 */
@ProviderType
public class HimalayaSoap implements Serializable {
	public static HimalayaSoap toSoapModel(Himalaya model) {
		HimalayaSoap soapModel = new HimalayaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setHimalayaId(model.getHimalayaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setComapany(model.getComapany());
		soapModel.setDob(model.getDob());
		soapModel.setDoj(model.getDoj());

		return soapModel;
	}

	public static HimalayaSoap[] toSoapModels(Himalaya[] models) {
		HimalayaSoap[] soapModels = new HimalayaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HimalayaSoap[][] toSoapModels(Himalaya[][] models) {
		HimalayaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HimalayaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HimalayaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HimalayaSoap[] toSoapModels(List<Himalaya> models) {
		List<HimalayaSoap> soapModels = new ArrayList<HimalayaSoap>(models.size());

		for (Himalaya model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HimalayaSoap[soapModels.size()]);
	}

	public HimalayaSoap() {
	}

	public long getPrimaryKey() {
		return _himalayaId;
	}

	public void setPrimaryKey(long pk) {
		setHimalayaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getHimalayaId() {
		return _himalayaId;
	}

	public void setHimalayaId(long himalayaId) {
		_himalayaId = himalayaId;
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

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public String getComapany() {
		return _comapany;
	}

	public void setComapany(String comapany) {
		_comapany = comapany;
	}

	public Date getDob() {
		return _dob;
	}

	public void setDob(Date dob) {
		_dob = dob;
	}

	public Date getDoj() {
		return _doj;
	}

	public void setDoj(Date doj) {
		_doj = doj;
	}

	private String _uuid;
	private long _himalayaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _designation;
	private String _comapany;
	private Date _dob;
	private Date _doj;
}