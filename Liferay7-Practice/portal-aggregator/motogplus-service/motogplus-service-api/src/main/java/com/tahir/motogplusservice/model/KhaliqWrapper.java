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

package com.tahir.motogplusservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Khaliq}.
 * </p>
 *
 * @author TahirNoor
 * @see Khaliq
 * @generated
 */
@ProviderType
public class KhaliqWrapper implements Khaliq, ModelWrapper<Khaliq> {
	public KhaliqWrapper(Khaliq khaliq) {
		_khaliq = khaliq;
	}

	@Override
	public Class<?> getModelClass() {
		return Khaliq.class;
	}

	@Override
	public String getModelClassName() {
		return Khaliq.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("khaliqId", getKhaliqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("designation", getDesignation());
		attributes.put("dob", getDob());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long khaliqId = (Long)attributes.get("khaliqId");

		if (khaliqId != null) {
			setKhaliqId(khaliqId);
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

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}
	}

	@Override
	public Khaliq toEscapedModel() {
		return new KhaliqWrapper(_khaliq.toEscapedModel());
	}

	@Override
	public Khaliq toUnescapedModel() {
		return new KhaliqWrapper(_khaliq.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _khaliq.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _khaliq.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _khaliq.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _khaliq.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Khaliq> toCacheModel() {
		return _khaliq.toCacheModel();
	}

	@Override
	public int compareTo(Khaliq khaliq) {
		return _khaliq.compareTo(khaliq);
	}

	@Override
	public int hashCode() {
		return _khaliq.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _khaliq.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new KhaliqWrapper((Khaliq)_khaliq.clone());
	}

	/**
	* Returns the designation of this khaliq.
	*
	* @return the designation of this khaliq
	*/
	@Override
	public java.lang.String getDesignation() {
		return _khaliq.getDesignation();
	}

	/**
	* Returns the name of this khaliq.
	*
	* @return the name of this khaliq
	*/
	@Override
	public java.lang.String getName() {
		return _khaliq.getName();
	}

	/**
	* Returns the user name of this khaliq.
	*
	* @return the user name of this khaliq
	*/
	@Override
	public java.lang.String getUserName() {
		return _khaliq.getUserName();
	}

	/**
	* Returns the user uuid of this khaliq.
	*
	* @return the user uuid of this khaliq
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _khaliq.getUserUuid();
	}

	/**
	* Returns the uuid of this khaliq.
	*
	* @return the uuid of this khaliq
	*/
	@Override
	public java.lang.String getUuid() {
		return _khaliq.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _khaliq.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khaliq.toXmlString();
	}

	/**
	* Returns the create date of this khaliq.
	*
	* @return the create date of this khaliq
	*/
	@Override
	public Date getCreateDate() {
		return _khaliq.getCreateDate();
	}

	/**
	* Returns the dob of this khaliq.
	*
	* @return the dob of this khaliq
	*/
	@Override
	public Date getDob() {
		return _khaliq.getDob();
	}

	/**
	* Returns the modified date of this khaliq.
	*
	* @return the modified date of this khaliq
	*/
	@Override
	public Date getModifiedDate() {
		return _khaliq.getModifiedDate();
	}

	/**
	* Returns the company ID of this khaliq.
	*
	* @return the company ID of this khaliq
	*/
	@Override
	public long getCompanyId() {
		return _khaliq.getCompanyId();
	}

	/**
	* Returns the group ID of this khaliq.
	*
	* @return the group ID of this khaliq
	*/
	@Override
	public long getGroupId() {
		return _khaliq.getGroupId();
	}

	/**
	* Returns the khaliq ID of this khaliq.
	*
	* @return the khaliq ID of this khaliq
	*/
	@Override
	public long getKhaliqId() {
		return _khaliq.getKhaliqId();
	}

	/**
	* Returns the primary key of this khaliq.
	*
	* @return the primary key of this khaliq
	*/
	@Override
	public long getPrimaryKey() {
		return _khaliq.getPrimaryKey();
	}

	/**
	* Returns the user ID of this khaliq.
	*
	* @return the user ID of this khaliq
	*/
	@Override
	public long getUserId() {
		return _khaliq.getUserId();
	}

	@Override
	public void persist() {
		_khaliq.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khaliq.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this khaliq.
	*
	* @param companyId the company ID of this khaliq
	*/
	@Override
	public void setCompanyId(long companyId) {
		_khaliq.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this khaliq.
	*
	* @param createDate the create date of this khaliq
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_khaliq.setCreateDate(createDate);
	}

	/**
	* Sets the designation of this khaliq.
	*
	* @param designation the designation of this khaliq
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_khaliq.setDesignation(designation);
	}

	/**
	* Sets the dob of this khaliq.
	*
	* @param dob the dob of this khaliq
	*/
	@Override
	public void setDob(Date dob) {
		_khaliq.setDob(dob);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_khaliq.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_khaliq.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_khaliq.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this khaliq.
	*
	* @param groupId the group ID of this khaliq
	*/
	@Override
	public void setGroupId(long groupId) {
		_khaliq.setGroupId(groupId);
	}

	/**
	* Sets the khaliq ID of this khaliq.
	*
	* @param khaliqId the khaliq ID of this khaliq
	*/
	@Override
	public void setKhaliqId(long khaliqId) {
		_khaliq.setKhaliqId(khaliqId);
	}

	/**
	* Sets the modified date of this khaliq.
	*
	* @param modifiedDate the modified date of this khaliq
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_khaliq.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this khaliq.
	*
	* @param name the name of this khaliq
	*/
	@Override
	public void setName(java.lang.String name) {
		_khaliq.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_khaliq.setNew(n);
	}

	/**
	* Sets the primary key of this khaliq.
	*
	* @param primaryKey the primary key of this khaliq
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_khaliq.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_khaliq.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this khaliq.
	*
	* @param userId the user ID of this khaliq
	*/
	@Override
	public void setUserId(long userId) {
		_khaliq.setUserId(userId);
	}

	/**
	* Sets the user name of this khaliq.
	*
	* @param userName the user name of this khaliq
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_khaliq.setUserName(userName);
	}

	/**
	* Sets the user uuid of this khaliq.
	*
	* @param userUuid the user uuid of this khaliq
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_khaliq.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this khaliq.
	*
	* @param uuid the uuid of this khaliq
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_khaliq.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhaliqWrapper)) {
			return false;
		}

		KhaliqWrapper khaliqWrapper = (KhaliqWrapper)obj;

		if (Objects.equals(_khaliq, khaliqWrapper._khaliq)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _khaliq.getStagedModelType();
	}

	@Override
	public Khaliq getWrappedModel() {
		return _khaliq;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _khaliq.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _khaliq.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_khaliq.resetOriginalValues();
	}

	private final Khaliq _khaliq;
}