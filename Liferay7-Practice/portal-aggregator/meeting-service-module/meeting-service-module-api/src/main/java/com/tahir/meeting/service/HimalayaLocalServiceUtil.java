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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Himalaya. This utility wraps
 * {@link com.tahir.meeting.service.impl.HimalayaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Tahir Noor
 * @see HimalayaLocalService
 * @see com.tahir.meeting.service.base.HimalayaLocalServiceBaseImpl
 * @see com.tahir.meeting.service.impl.HimalayaLocalServiceImpl
 * @generated
 */
@ProviderType
public class HimalayaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.tahir.meeting.service.impl.HimalayaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the himalaya to the database. Also notifies the appropriate model listeners.
	*
	* @param himalaya the himalaya
	* @return the himalaya that was added
	*/
	public static com.tahir.meeting.model.Himalaya addHimalaya(
		com.tahir.meeting.model.Himalaya himalaya) {
		return getService().addHimalaya(himalaya);
	}

	/**
	* Creates a new himalaya with the primary key. Does not add the himalaya to the database.
	*
	* @param himalayaId the primary key for the new himalaya
	* @return the new himalaya
	*/
	public static com.tahir.meeting.model.Himalaya createHimalaya(
		long himalayaId) {
		return getService().createHimalaya(himalayaId);
	}

	/**
	* Deletes the himalaya from the database. Also notifies the appropriate model listeners.
	*
	* @param himalaya the himalaya
	* @return the himalaya that was removed
	*/
	public static com.tahir.meeting.model.Himalaya deleteHimalaya(
		com.tahir.meeting.model.Himalaya himalaya) {
		return getService().deleteHimalaya(himalaya);
	}

	/**
	* Deletes the himalaya with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya that was removed
	* @throws PortalException if a himalaya with the primary key could not be found
	*/
	public static com.tahir.meeting.model.Himalaya deleteHimalaya(
		long himalayaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHimalaya(himalayaId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.tahir.meeting.model.Himalaya fetchHimalaya(
		long himalayaId) {
		return getService().fetchHimalaya(himalayaId);
	}

	/**
	* Returns the himalaya matching the UUID and group.
	*
	* @param uuid the himalaya's UUID
	* @param groupId the primary key of the group
	* @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static com.tahir.meeting.model.Himalaya fetchHimalayaByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchHimalayaByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	* Returns the himalaya with the primary key.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya
	* @throws PortalException if a himalaya with the primary key could not be found
	*/
	public static com.tahir.meeting.model.Himalaya getHimalaya(long himalayaId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHimalaya(himalayaId);
	}

	/**
	* Returns the himalaya matching the UUID and group.
	*
	* @param uuid the himalaya's UUID
	* @param groupId the primary key of the group
	* @return the matching himalaya
	* @throws PortalException if a matching himalaya could not be found
	*/
	public static com.tahir.meeting.model.Himalaya getHimalayaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHimalayaByUuidAndGroupId(uuid, groupId);
	}

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
	public static java.util.List<com.tahir.meeting.model.Himalaya> getHimalayas(
		int start, int end) {
		return getService().getHimalayas(start, end);
	}

	/**
	* Returns all the himalayas matching the UUID and company.
	*
	* @param uuid the UUID of the himalayas
	* @param companyId the primary key of the company
	* @return the matching himalayas, or an empty list if no matches were found
	*/
	public static java.util.List<com.tahir.meeting.model.Himalaya> getHimalayasByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getHimalayasByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<com.tahir.meeting.model.Himalaya> getHimalayasByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tahir.meeting.model.Himalaya> orderByComparator) {
		return getService()
				   .getHimalayasByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of himalayas.
	*
	* @return the number of himalayas
	*/
	public static int getHimalayasCount() {
		return getService().getHimalayasCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the himalaya in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param himalaya the himalaya
	* @return the himalaya that was updated
	*/
	public static com.tahir.meeting.model.Himalaya updateHimalaya(
		com.tahir.meeting.model.Himalaya himalaya) {
		return getService().updateHimalaya(himalaya);
	}

	public static HimalayaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HimalayaLocalService, HimalayaLocalService> _serviceTracker =
		ServiceTrackerFactory.open(HimalayaLocalService.class);
}