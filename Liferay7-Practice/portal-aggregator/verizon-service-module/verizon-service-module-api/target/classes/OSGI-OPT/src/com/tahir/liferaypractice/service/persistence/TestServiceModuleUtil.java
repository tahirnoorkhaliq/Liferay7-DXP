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

package com.tahir.liferaypractice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tahir.liferaypractice.model.TestServiceModule;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the test service module service. This utility wraps {@link com.tahir.liferaypractice.service.persistence.impl.TestServiceModulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Tahir
 * @see TestServiceModulePersistence
 * @see com.tahir.liferaypractice.service.persistence.impl.TestServiceModulePersistenceImpl
 * @generated
 */
@ProviderType
public class TestServiceModuleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TestServiceModule testServiceModule) {
		getPersistence().clearCache(testServiceModule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TestServiceModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestServiceModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestServiceModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestServiceModule update(TestServiceModule testServiceModule) {
		return getPersistence().update(testServiceModule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestServiceModule update(
		TestServiceModule testServiceModule, ServiceContext serviceContext) {
		return getPersistence().update(testServiceModule, serviceContext);
	}

	/**
	* Returns all the test service modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test service modules
	*/
	public static List<TestServiceModule> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the test service modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @return the range of matching test service modules
	*/
	public static List<TestServiceModule> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the test service modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test service modules
	*/
	public static List<TestServiceModule> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test service modules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test service modules
	*/
	public static List<TestServiceModule> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public static TestServiceModule findByUuid_First(java.lang.String uuid,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static TestServiceModule fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public static TestServiceModule findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static TestServiceModule fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the test service modules before and after the current test service module in the ordered set where uuid = &#63;.
	*
	* @param testServiceModuleId the primary key of the current test service module
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test service module
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public static TestServiceModule[] findByUuid_PrevAndNext(
		long testServiceModuleId, java.lang.String uuid,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence()
				   .findByUuid_PrevAndNext(testServiceModuleId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the test service modules where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of test service modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test service modules
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the test service module where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTestServiceModuleException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public static TestServiceModule findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the test service module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static TestServiceModule fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the test service module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static TestServiceModule fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the test service module where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the test service module that was removed
	*/
	public static TestServiceModule removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of test service modules where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching test service modules
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the test service modules where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching test service modules
	*/
	public static List<TestServiceModule> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the test service modules where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @return the range of matching test service modules
	*/
	public static List<TestServiceModule> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the test service modules where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching test service modules
	*/
	public static List<TestServiceModule> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test service modules where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching test service modules
	*/
	public static List<TestServiceModule> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public static TestServiceModule findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TestServiceModule> orderByComparator)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static TestServiceModule fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public static TestServiceModule findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TestServiceModule> orderByComparator)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public static TestServiceModule fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the test service modules before and after the current test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param testServiceModuleId the primary key of the current test service module
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test service module
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public static TestServiceModule[] findByUuid_C_PrevAndNext(
		long testServiceModuleId, java.lang.String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(testServiceModuleId, uuid,
			companyId, orderByComparator);
	}

	/**
	* Removes all the test service modules where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of test service modules where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching test service modules
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the test service module in the entity cache if it is enabled.
	*
	* @param testServiceModule the test service module
	*/
	public static void cacheResult(TestServiceModule testServiceModule) {
		getPersistence().cacheResult(testServiceModule);
	}

	/**
	* Caches the test service modules in the entity cache if it is enabled.
	*
	* @param testServiceModules the test service modules
	*/
	public static void cacheResult(List<TestServiceModule> testServiceModules) {
		getPersistence().cacheResult(testServiceModules);
	}

	/**
	* Creates a new test service module with the primary key. Does not add the test service module to the database.
	*
	* @param testServiceModuleId the primary key for the new test service module
	* @return the new test service module
	*/
	public static TestServiceModule create(long testServiceModuleId) {
		return getPersistence().create(testServiceModuleId);
	}

	/**
	* Removes the test service module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module that was removed
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public static TestServiceModule remove(long testServiceModuleId)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence().remove(testServiceModuleId);
	}

	public static TestServiceModule updateImpl(
		TestServiceModule testServiceModule) {
		return getPersistence().updateImpl(testServiceModule);
	}

	/**
	* Returns the test service module with the primary key or throws a {@link NoSuchTestServiceModuleException} if it could not be found.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public static TestServiceModule findByPrimaryKey(long testServiceModuleId)
		throws com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException {
		return getPersistence().findByPrimaryKey(testServiceModuleId);
	}

	/**
	* Returns the test service module with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module, or <code>null</code> if a test service module with the primary key could not be found
	*/
	public static TestServiceModule fetchByPrimaryKey(long testServiceModuleId) {
		return getPersistence().fetchByPrimaryKey(testServiceModuleId);
	}

	public static java.util.Map<java.io.Serializable, TestServiceModule> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the test service modules.
	*
	* @return the test service modules
	*/
	public static List<TestServiceModule> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the test service modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @return the range of test service modules
	*/
	public static List<TestServiceModule> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the test service modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of test service modules
	*/
	public static List<TestServiceModule> findAll(int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the test service modules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TestServiceModuleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of test service modules
	* @param end the upper bound of the range of test service modules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of test service modules
	*/
	public static List<TestServiceModule> findAll(int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the test service modules from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of test service modules.
	*
	* @return the number of test service modules
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TestServiceModulePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestServiceModulePersistence, TestServiceModulePersistence> _serviceTracker =
		ServiceTrackerFactory.open(TestServiceModulePersistence.class);
}