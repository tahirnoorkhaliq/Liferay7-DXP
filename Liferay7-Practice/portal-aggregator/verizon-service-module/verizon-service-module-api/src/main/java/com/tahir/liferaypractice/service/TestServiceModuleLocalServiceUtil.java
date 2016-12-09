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

package com.tahir.liferaypractice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for TestServiceModule. This utility wraps
 * {@link com.tahir.liferaypractice.service.impl.TestServiceModuleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Tahir
 * @see TestServiceModuleLocalService
 * @see com.tahir.liferaypractice.service.base.TestServiceModuleLocalServiceBaseImpl
 * @see com.tahir.liferaypractice.service.impl.TestServiceModuleLocalServiceImpl
 * @generated
 */
@ProviderType
public class TestServiceModuleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.tahir.liferaypractice.service.impl.TestServiceModuleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the test service module to the database. Also notifies the appropriate model listeners.
	*
	* @param testServiceModule the test service module
	* @return the test service module that was added
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule addTestServiceModule(
		com.tahir.liferaypractice.model.TestServiceModule testServiceModule) {
		return getService().addTestServiceModule(testServiceModule);
	}

	/**
	* Creates a new test service module with the primary key. Does not add the test service module to the database.
	*
	* @param testServiceModuleId the primary key for the new test service module
	* @return the new test service module
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule createTestServiceModule(
		long testServiceModuleId) {
		return getService().createTestServiceModule(testServiceModuleId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the test service module from the database. Also notifies the appropriate model listeners.
	*
	* @param testServiceModule the test service module
	* @return the test service module that was removed
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule deleteTestServiceModule(
		com.tahir.liferaypractice.model.TestServiceModule testServiceModule) {
		return getService().deleteTestServiceModule(testServiceModule);
	}

	/**
	* Deletes the test service module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module that was removed
	* @throws PortalException if a test service module with the primary key could not be found
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule deleteTestServiceModule(
		long testServiceModuleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTestServiceModule(testServiceModuleId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.tahir.liferaypractice.model.TestServiceModule fetchTestServiceModule(
		long testServiceModuleId) {
		return getService().fetchTestServiceModule(testServiceModuleId);
	}

	/**
	* Returns the test service module matching the UUID and group.
	*
	* @param uuid the test service module's UUID
	* @param groupId the primary key of the group
	* @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule fetchTestServiceModuleByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchTestServiceModuleByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	* Returns the test service module with the primary key.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module
	* @throws PortalException if a test service module with the primary key could not be found
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule getTestServiceModule(
		long testServiceModuleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTestServiceModule(testServiceModuleId);
	}

	/**
	* Returns the test service module matching the UUID and group.
	*
	* @param uuid the test service module's UUID
	* @param groupId the primary key of the group
	* @return the matching test service module
	* @throws PortalException if a matching test service module could not be found
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule getTestServiceModuleByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTestServiceModuleByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the test service modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @return the range of test service modules
	*/
	public static java.util.List<com.tahir.liferaypractice.model.TestServiceModule> getTestServiceModules(
		int start, int end) {
		return getService().getTestServiceModules(start, end);
	}

	/**
	* Returns all the test service modules matching the UUID and company.
	*
	* @param uuid the UUID of the test service modules
	* @param companyId the primary key of the company
	* @return the matching test service modules, or an empty list if no matches were found
	*/
	public static java.util.List<com.tahir.liferaypractice.model.TestServiceModule> getTestServiceModulesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService()
				   .getTestServiceModulesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of test service modules matching the UUID and company.
	*
	* @param uuid the UUID of the test service modules
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching test service modules, or an empty list if no matches were found
	*/
	public static java.util.List<com.tahir.liferaypractice.model.TestServiceModule> getTestServiceModulesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tahir.liferaypractice.model.TestServiceModule> orderByComparator) {
		return getService()
				   .getTestServiceModulesByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of test service modules.
	*
	* @return the number of test service modules
	*/
	public static int getTestServiceModulesCount() {
		return getService().getTestServiceModulesCount();
	}

	/**
	* Updates the test service module in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param testServiceModule the test service module
	* @return the test service module that was updated
	*/
	public static com.tahir.liferaypractice.model.TestServiceModule updateTestServiceModule(
		com.tahir.liferaypractice.model.TestServiceModule testServiceModule) {
		return getService().updateTestServiceModule(testServiceModule);
	}

	public static TestServiceModuleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestServiceModuleLocalService, TestServiceModuleLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TestServiceModuleLocalService.class);
}