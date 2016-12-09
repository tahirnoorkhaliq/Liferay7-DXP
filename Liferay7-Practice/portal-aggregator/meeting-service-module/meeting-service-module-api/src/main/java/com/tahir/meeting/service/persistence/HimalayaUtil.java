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

package com.tahir.meeting.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tahir.meeting.model.Himalaya;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the himalaya service. This utility wraps {@link com.tahir.meeting.service.persistence.impl.HimalayaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Tahir Noor
 * @see HimalayaPersistence
 * @see com.tahir.meeting.service.persistence.impl.HimalayaPersistenceImpl
 * @generated
 */
@ProviderType
public class HimalayaUtil {
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
	public static void clearCache(Himalaya himalaya) {
		getPersistence().clearCache(himalaya);
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
	public static List<Himalaya> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Himalaya> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Himalaya> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Himalaya update(Himalaya himalaya) {
		return getPersistence().update(himalaya);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Himalaya update(Himalaya himalaya,
		ServiceContext serviceContext) {
		return getPersistence().update(himalaya, serviceContext);
	}

	/**
	* Returns all the himalayas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching himalayas
	*/
	public static List<Himalaya> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the himalayas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @return the range of matching himalayas
	*/
	public static List<Himalaya> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the himalayas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching himalayas
	*/
	public static List<Himalaya> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the himalayas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching himalayas
	*/
	public static List<Himalaya> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Himalaya> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public static Himalaya findByUuid_First(java.lang.String uuid,
		OrderByComparator<Himalaya> orderByComparator)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static Himalaya fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public static Himalaya findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Himalaya> orderByComparator)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static Himalaya fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the himalayas before and after the current himalaya in the ordered set where uuid = &#63;.
	*
	* @param himalayaId the primary key of the current himalaya
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next himalaya
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public static Himalaya[] findByUuid_PrevAndNext(long himalayaId,
		java.lang.String uuid, OrderByComparator<Himalaya> orderByComparator)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(himalayaId, uuid, orderByComparator);
	}

	/**
	* Removes all the himalayas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of himalayas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching himalayas
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the himalaya where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHimalayaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public static Himalaya findByUUID_G(java.lang.String uuid, long groupId)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the himalaya where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static Himalaya fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the himalaya where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static Himalaya fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the himalaya where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the himalaya that was removed
	*/
	public static Himalaya removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of himalayas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching himalayas
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the himalayas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching himalayas
	*/
	public static List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the himalayas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @return the range of matching himalayas
	*/
	public static List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the himalayas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching himalayas
	*/
	public static List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the himalayas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching himalayas
	*/
	public static List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Himalaya> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public static Himalaya findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Himalaya> orderByComparator)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static Himalaya fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public static Himalaya findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Himalaya> orderByComparator)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public static Himalaya fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the himalayas before and after the current himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param himalayaId the primary key of the current himalaya
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next himalaya
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public static Himalaya[] findByUuid_C_PrevAndNext(long himalayaId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Himalaya> orderByComparator)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(himalayaId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the himalayas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of himalayas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching himalayas
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the himalaya in the entity cache if it is enabled.
	*
	* @param himalaya the himalaya
	*/
	public static void cacheResult(Himalaya himalaya) {
		getPersistence().cacheResult(himalaya);
	}

	/**
	* Caches the himalayas in the entity cache if it is enabled.
	*
	* @param himalayas the himalayas
	*/
	public static void cacheResult(List<Himalaya> himalayas) {
		getPersistence().cacheResult(himalayas);
	}

	/**
	* Creates a new himalaya with the primary key. Does not add the himalaya to the database.
	*
	* @param himalayaId the primary key for the new himalaya
	* @return the new himalaya
	*/
	public static Himalaya create(long himalayaId) {
		return getPersistence().create(himalayaId);
	}

	/**
	* Removes the himalaya with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya that was removed
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public static Himalaya remove(long himalayaId)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence().remove(himalayaId);
	}

	public static Himalaya updateImpl(Himalaya himalaya) {
		return getPersistence().updateImpl(himalaya);
	}

	/**
	* Returns the himalaya with the primary key or throws a {@link NoSuchHimalayaException} if it could not be found.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public static Himalaya findByPrimaryKey(long himalayaId)
		throws com.tahir.meeting.exception.NoSuchHimalayaException {
		return getPersistence().findByPrimaryKey(himalayaId);
	}

	/**
	* Returns the himalaya with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya, or <code>null</code> if a himalaya with the primary key could not be found
	*/
	public static Himalaya fetchByPrimaryKey(long himalayaId) {
		return getPersistence().fetchByPrimaryKey(himalayaId);
	}

	public static java.util.Map<java.io.Serializable, Himalaya> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the himalayas.
	*
	* @return the himalayas
	*/
	public static List<Himalaya> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the himalayas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @return the range of himalayas
	*/
	public static List<Himalaya> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the himalayas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of himalayas
	*/
	public static List<Himalaya> findAll(int start, int end,
		OrderByComparator<Himalaya> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the himalayas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HimalayaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of himalayas
	* @param end the upper bound of the range of himalayas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of himalayas
	*/
	public static List<Himalaya> findAll(int start, int end,
		OrderByComparator<Himalaya> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the himalayas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of himalayas.
	*
	* @return the number of himalayas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static HimalayaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HimalayaPersistence, HimalayaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(HimalayaPersistence.class);
}