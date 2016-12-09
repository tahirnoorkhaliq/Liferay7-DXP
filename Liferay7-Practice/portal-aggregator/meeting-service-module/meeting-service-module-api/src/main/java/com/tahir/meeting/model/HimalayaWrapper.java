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
 * This class is a wrapper for {@link Himalaya}.
 * </p>
 *
 * @author Tahir Noor
 * @see Himalaya
 * @generated
 */
@ProviderType
public class HimalayaWrapper implements Himalaya, ModelWrapper<Himalaya> {
	public HimalayaWrapper(Himalaya himalaya) {
		_himalaya = himalaya;
	}

	@Override
	public Class<?> getModelClass() {
		return Himalaya.class;
	}

	@Override
	public String getModelClassName() {
		return Himalaya.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("himalayaId", getHimalayaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("designation", getDesignation());
		attributes.put("comapany", getComapany());
		attributes.put("dob", getDob());
		attributes.put("doj", getDoj());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long himalayaId = (Long)attributes.get("himalayaId");

		if (himalayaId != null) {
			setHimalayaId(himalayaId);
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

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		String comapany = (String)attributes.get("comapany");

		if (comapany != null) {
			setComapany(comapany);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}

		Date doj = (Date)attributes.get("doj");

		if (doj != null) {
			setDoj(doj);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new HimalayaWrapper((Himalaya)_himalaya.clone());
	}

	@Override
	public int compareTo(com.tahir.meeting.model.Himalaya himalaya) {
		return _himalaya.compareTo(himalaya);
	}

	/**
	* Returns the comapany of this himalaya.
	*
	* @return the comapany of this himalaya
	*/
	@Override
	public java.lang.String getComapany() {
		return _himalaya.getComapany();
	}

	/**
	* Returns the company ID of this himalaya.
	*
	* @return the company ID of this himalaya
	*/
	@Override
	public long getCompanyId() {
		return _himalaya.getCompanyId();
	}

	/**
	* Returns the create date of this himalaya.
	*
	* @return the create date of this himalaya
	*/
	@Override
	public Date getCreateDate() {
		return _himalaya.getCreateDate();
	}

	/**
	* Returns the designation of this himalaya.
	*
	* @return the designation of this himalaya
	*/
	@Override
	public java.lang.String getDesignation() {
		return _himalaya.getDesignation();
	}

	/**
	* Returns the dob of this himalaya.
	*
	* @return the dob of this himalaya
	*/
	@Override
	public Date getDob() {
		return _himalaya.getDob();
	}

	/**
	* Returns the doj of this himalaya.
	*
	* @return the doj of this himalaya
	*/
	@Override
	public Date getDoj() {
		return _himalaya.getDoj();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _himalaya.getExpandoBridge();
	}

	/**
	* Returns the group ID of this himalaya.
	*
	* @return the group ID of this himalaya
	*/
	@Override
	public long getGroupId() {
		return _himalaya.getGroupId();
	}

	/**
	* Returns the himalaya ID of this himalaya.
	*
	* @return the himalaya ID of this himalaya
	*/
	@Override
	public long getHimalayaId() {
		return _himalaya.getHimalayaId();
	}

	/**
	* Returns the modified date of this himalaya.
	*
	* @return the modified date of this himalaya
	*/
	@Override
	public Date getModifiedDate() {
		return _himalaya.getModifiedDate();
	}

	/**
	* Returns the name of this himalaya.
	*
	* @return the name of this himalaya
	*/
	@Override
	public java.lang.String getName() {
		return _himalaya.getName();
	}

	/**
	* Returns the primary key of this himalaya.
	*
	* @return the primary key of this himalaya
	*/
	@Override
	public long getPrimaryKey() {
		return _himalaya.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _himalaya.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this himalaya.
	*
	* @return the user ID of this himalaya
	*/
	@Override
	public long getUserId() {
		return _himalaya.getUserId();
	}

	/**
	* Returns the user name of this himalaya.
	*
	* @return the user name of this himalaya
	*/
	@Override
	public java.lang.String getUserName() {
		return _himalaya.getUserName();
	}

	/**
	* Returns the user uuid of this himalaya.
	*
	* @return the user uuid of this himalaya
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _himalaya.getUserUuid();
	}

	/**
	* Returns the uuid of this himalaya.
	*
	* @return the uuid of this himalaya
	*/
	@Override
	public java.lang.String getUuid() {
		return _himalaya.getUuid();
	}

	@Override
	public int hashCode() {
		return _himalaya.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _himalaya.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _himalaya.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _himalaya.isNew();
	}

	@Override
	public void persist() {
		_himalaya.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_himalaya.setCachedModel(cachedModel);
	}

	/**
	* Sets the comapany of this himalaya.
	*
	* @param comapany the comapany of this himalaya
	*/
	@Override
	public void setComapany(java.lang.String comapany) {
		_himalaya.setComapany(comapany);
	}

	/**
	* Sets the company ID of this himalaya.
	*
	* @param companyId the company ID of this himalaya
	*/
	@Override
	public void setCompanyId(long companyId) {
		_himalaya.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this himalaya.
	*
	* @param createDate the create date of this himalaya
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_himalaya.setCreateDate(createDate);
	}

	/**
	* Sets the designation of this himalaya.
	*
	* @param designation the designation of this himalaya
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_himalaya.setDesignation(designation);
	}

	/**
	* Sets the dob of this himalaya.
	*
	* @param dob the dob of this himalaya
	*/
	@Override
	public void setDob(Date dob) {
		_himalaya.setDob(dob);
	}

	/**
	* Sets the doj of this himalaya.
	*
	* @param doj the doj of this himalaya
	*/
	@Override
	public void setDoj(Date doj) {
		_himalaya.setDoj(doj);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_himalaya.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_himalaya.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_himalaya.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this himalaya.
	*
	* @param groupId the group ID of this himalaya
	*/
	@Override
	public void setGroupId(long groupId) {
		_himalaya.setGroupId(groupId);
	}

	/**
	* Sets the himalaya ID of this himalaya.
	*
	* @param himalayaId the himalaya ID of this himalaya
	*/
	@Override
	public void setHimalayaId(long himalayaId) {
		_himalaya.setHimalayaId(himalayaId);
	}

	/**
	* Sets the modified date of this himalaya.
	*
	* @param modifiedDate the modified date of this himalaya
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_himalaya.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this himalaya.
	*
	* @param name the name of this himalaya
	*/
	@Override
	public void setName(java.lang.String name) {
		_himalaya.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_himalaya.setNew(n);
	}

	/**
	* Sets the primary key of this himalaya.
	*
	* @param primaryKey the primary key of this himalaya
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_himalaya.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_himalaya.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this himalaya.
	*
	* @param userId the user ID of this himalaya
	*/
	@Override
	public void setUserId(long userId) {
		_himalaya.setUserId(userId);
	}

	/**
	* Sets the user name of this himalaya.
	*
	* @param userName the user name of this himalaya
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_himalaya.setUserName(userName);
	}

	/**
	* Sets the user uuid of this himalaya.
	*
	* @param userUuid the user uuid of this himalaya
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_himalaya.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this himalaya.
	*
	* @param uuid the uuid of this himalaya
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_himalaya.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.tahir.meeting.model.Himalaya> toCacheModel() {
		return _himalaya.toCacheModel();
	}

	@Override
	public com.tahir.meeting.model.Himalaya toEscapedModel() {
		return new HimalayaWrapper(_himalaya.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _himalaya.toString();
	}

	@Override
	public com.tahir.meeting.model.Himalaya toUnescapedModel() {
		return new HimalayaWrapper(_himalaya.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _himalaya.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HimalayaWrapper)) {
			return false;
		}

		HimalayaWrapper himalayaWrapper = (HimalayaWrapper)obj;

		if (Validator.equals(_himalaya, himalayaWrapper._himalaya)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _himalaya.getStagedModelType();
	}

	@Override
	public Himalaya getWrappedModel() {
		return _himalaya;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _himalaya.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _himalaya.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_himalaya.resetOriginalValues();
	}

	private final Himalaya _himalaya;
}