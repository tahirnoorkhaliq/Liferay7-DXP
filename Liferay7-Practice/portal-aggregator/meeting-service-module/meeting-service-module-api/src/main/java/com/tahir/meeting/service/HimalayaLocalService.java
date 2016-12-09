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

package com.tahir.meeting.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tahir.meeting.model.Himalaya;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Himalaya. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Tahir Noor
 * @see HimalayaLocalServiceUtil
 * @see com.tahir.meeting.service.base.HimalayaLocalServiceBaseImpl
 * @see com.tahir.meeting.service.impl.HimalayaLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface HimalayaLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HimalayaLocalServiceUtil} to access the himalaya local service. Add custom service methods to {@link com.tahir.meeting.service.impl.HimalayaLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the himalaya to the database. Also notifies the appropriate model listeners.
	*
	* @param himalaya the himalaya
	* @return the himalaya that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Himalaya addHimalaya(Himalaya himalaya);

	/**
	* Creates a new himalaya with the primary key. Does not add the himalaya to the database.
	*
	* @param himalayaId the primary key for the new himalaya
	* @return the new himalaya
	*/
	public Himalaya createHimalaya(long himalayaId);

	/**
	* Deletes the himalaya from the database. Also notifies the appropriate model listeners.
	*
	* @param himalaya the himalaya
	* @return the himalaya that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Himalaya deleteHimalaya(Himalaya himalaya);

	/**
	* Deletes the himalaya with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya that was removed
	* @throws PortalException if a himalaya with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Himalaya deleteHimalaya(long himalayaId) throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.meeting.model.impl.HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.meeting.model.impl.HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Himalaya fetchHimalaya(long himalayaId);

	/**
	* Returns the himalaya matching the UUID and group.
	*
	* @param uuid the himalaya's UUID
	* @param groupId the primary key of the group
	* @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Himalaya fetchHimalayaByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	/**
	* Returns the himalaya with the primary key.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya
	* @throws PortalException if a himalaya with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Himalaya getHimalaya(long himalayaId) throws PortalException;

	/**
	* Returns the himalaya matching the UUID and group.
	*
	* @param uuid the himalaya's UUID
	* @param groupId the primary key of the group
	* @return the matching himalaya
	* @throws PortalException if a matching himalaya could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Himalaya getHimalayaByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	/**
	* Returns a range of all the himalayas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.meeting.model.impl.HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @return the range of himalayas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Himalaya> getHimalayas(int start, int end);

	/**
	* Returns all the himalayas matching the UUID and company.
	*
	* @param uuid the UUID of the himalayas
	* @param companyId the primary key of the company
	* @return the matching himalayas, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Himalaya> getHimalayasByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of himalayas matching the UUID and company.
	*
	* @param uuid the UUID of the himalayas
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching himalayas, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Himalaya> getHimalayasByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<Himalaya> orderByComparator);

	/**
	* Returns the number of himalayas.
	*
	* @return the number of himalayas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getHimalayasCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the himalaya in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param himalaya the himalaya
	* @return the himalaya that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Himalaya updateHimalaya(Himalaya himalaya);
}