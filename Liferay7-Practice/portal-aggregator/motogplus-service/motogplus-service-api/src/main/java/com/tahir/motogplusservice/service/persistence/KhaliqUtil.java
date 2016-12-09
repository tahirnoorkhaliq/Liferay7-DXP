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

package com.tahir.motogplusservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tahir.motogplusservice.model.Khaliq;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the khaliq service. This utility wraps {@link com.tahir.motogplusservice.service.persistence.impl.KhaliqPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TahirNoor
 * @see KhaliqPersistence
 * @see com.tahir.motogplusservice.service.persistence.impl.KhaliqPersistenceImpl
 * @generated
 */
@ProviderType
public class KhaliqUtil {
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
	public static void clearCache(Khaliq khaliq) {
		getPersistence().clearCache(khaliq);
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
	public static List<Khaliq> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Khaliq> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Khaliq> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Khaliq update(Khaliq khaliq) {
		return getPersistence().update(khaliq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Khaliq update(Khaliq khaliq, ServiceContext serviceContext) {
		return getPersistence().update(khaliq, serviceContext);
	}

	/**
	* Returns all the khaliqs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching khaliqs
	*/
	public static List<Khaliq> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the khaliqs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @return the range of matching khaliqs
	*/
	public static List<Khaliq> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the khaliqs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching khaliqs
	*/
	public static List<Khaliq> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the khaliqs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching khaliqs
	*/
	public static List<Khaliq> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Khaliq> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public static Khaliq findByUuid_First(java.lang.String uuid,
		OrderByComparator<Khaliq> orderByComparator)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public static Khaliq findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Khaliq> orderByComparator)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the khaliqs before and after the current khaliq in the ordered set where uuid = &#63;.
	*
	* @param khaliqId the primary key of the current khaliq
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khaliq
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public static Khaliq[] findByUuid_PrevAndNext(long khaliqId,
		java.lang.String uuid, OrderByComparator<Khaliq> orderByComparator)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence()
				   .findByUuid_PrevAndNext(khaliqId, uuid, orderByComparator);
	}

	/**
	* Removes all the khaliqs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of khaliqs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching khaliqs
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the khaliq where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchKhaliqException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public static Khaliq findByUUID_G(java.lang.String uuid, long groupId)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the khaliq where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the khaliq that was removed
	*/
	public static Khaliq removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of khaliqs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching khaliqs
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching khaliqs
	*/
	public static List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @return the range of matching khaliqs
	*/
	public static List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching khaliqs
	*/
	public static List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching khaliqs
	*/
	public static List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Khaliq> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public static Khaliq findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Khaliq> orderByComparator)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public static Khaliq findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Khaliq> orderByComparator)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the khaliqs before and after the current khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param khaliqId the primary key of the current khaliq
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khaliq
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public static Khaliq[] findByUuid_C_PrevAndNext(long khaliqId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Khaliq> orderByComparator)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(khaliqId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the khaliqs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching khaliqs
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the khaliq where name = &#63; or throws a {@link NoSuchKhaliqException} if it could not be found.
	*
	* @param name the name
	* @return the matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public static Khaliq findBykhaliqName(java.lang.String name)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().findBykhaliqName(name);
	}

	/**
	* Returns the khaliq where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchBykhaliqName(java.lang.String name) {
		return getPersistence().fetchBykhaliqName(name);
	}

	/**
	* Returns the khaliq where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public static Khaliq fetchBykhaliqName(java.lang.String name,
		boolean retrieveFromCache) {
		return getPersistence().fetchBykhaliqName(name, retrieveFromCache);
	}

	/**
	* Removes the khaliq where name = &#63; from the database.
	*
	* @param name the name
	* @return the khaliq that was removed
	*/
	public static Khaliq removeBykhaliqName(java.lang.String name)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().removeBykhaliqName(name);
	}

	/**
	* Returns the number of khaliqs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching khaliqs
	*/
	public static int countBykhaliqName(java.lang.String name) {
		return getPersistence().countBykhaliqName(name);
	}

	/**
	* Caches the khaliq in the entity cache if it is enabled.
	*
	* @param khaliq the khaliq
	*/
	public static void cacheResult(Khaliq khaliq) {
		getPersistence().cacheResult(khaliq);
	}

	/**
	* Caches the khaliqs in the entity cache if it is enabled.
	*
	* @param khaliqs the khaliqs
	*/
	public static void cacheResult(List<Khaliq> khaliqs) {
		getPersistence().cacheResult(khaliqs);
	}

	/**
	* Creates a new khaliq with the primary key. Does not add the khaliq to the database.
	*
	* @param khaliqId the primary key for the new khaliq
	* @return the new khaliq
	*/
	public static Khaliq create(long khaliqId) {
		return getPersistence().create(khaliqId);
	}

	/**
	* Removes the khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param khaliqId the primary key of the khaliq
	* @return the khaliq that was removed
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public static Khaliq remove(long khaliqId)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().remove(khaliqId);
	}

	public static Khaliq updateImpl(Khaliq khaliq) {
		return getPersistence().updateImpl(khaliq);
	}

	/**
	* Returns the khaliq with the primary key or throws a {@link NoSuchKhaliqException} if it could not be found.
	*
	* @param khaliqId the primary key of the khaliq
	* @return the khaliq
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public static Khaliq findByPrimaryKey(long khaliqId)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return getPersistence().findByPrimaryKey(khaliqId);
	}

	/**
	* Returns the khaliq with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param khaliqId the primary key of the khaliq
	* @return the khaliq, or <code>null</code> if a khaliq with the primary key could not be found
	*/
	public static Khaliq fetchByPrimaryKey(long khaliqId) {
		return getPersistence().fetchByPrimaryKey(khaliqId);
	}

	public static java.util.Map<java.io.Serializable, Khaliq> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the khaliqs.
	*
	* @return the khaliqs
	*/
	public static List<Khaliq> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @return the range of khaliqs
	*/
	public static List<Khaliq> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of khaliqs
	*/
	public static List<Khaliq> findAll(int start, int end,
		OrderByComparator<Khaliq> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the khaliqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KhaliqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khaliqs
	* @param end the upper bound of the range of khaliqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of khaliqs
	*/
	public static List<Khaliq> findAll(int start, int end,
		OrderByComparator<Khaliq> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the khaliqs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of khaliqs.
	*
	* @return the number of khaliqs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static KhaliqPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<KhaliqPersistence, KhaliqPersistence> _serviceTracker =
		ServiceTrackerFactory.open(KhaliqPersistence.class);
}