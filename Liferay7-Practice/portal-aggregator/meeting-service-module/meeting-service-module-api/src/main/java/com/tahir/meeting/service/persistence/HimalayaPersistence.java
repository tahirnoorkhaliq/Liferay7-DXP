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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tahir.meeting.exception.NoSuchHimalayaException;
import com.tahir.meeting.model.Himalaya;

/**
 * The persistence interface for the himalaya service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Tahir Noor
 * @see com.tahir.meeting.service.persistence.impl.HimalayaPersistenceImpl
 * @see HimalayaUtil
 * @generated
 */
@ProviderType
public interface HimalayaPersistence extends BasePersistence<Himalaya> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HimalayaUtil} to access the himalaya persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the himalayas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching himalayas
	*/
	public java.util.List<Himalaya> findByUuid(java.lang.String uuid);

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
	public java.util.List<Himalaya> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Himalaya> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

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
	public java.util.List<Himalaya> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public Himalaya findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException;

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public Himalaya fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public Himalaya findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException;

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public Himalaya fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

	/**
	* Returns the himalayas before and after the current himalaya in the ordered set where uuid = &#63;.
	*
	* @param himalayaId the primary key of the current himalaya
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next himalaya
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public Himalaya[] findByUuid_PrevAndNext(long himalayaId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException;

	/**
	* Removes all the himalayas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of himalayas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching himalayas
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the himalaya where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHimalayaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public Himalaya findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHimalayaException;

	/**
	* Returns the himalaya where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public Himalaya fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the himalaya where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public Himalaya fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the himalaya where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the himalaya that was removed
	*/
	public Himalaya removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchHimalayaException;

	/**
	* Returns the number of himalayas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching himalayas
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the himalayas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching himalayas
	*/
	public java.util.List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

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
	public java.util.List<Himalaya> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public Himalaya findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException;

	/**
	* Returns the first himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public Himalaya fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya
	* @throws NoSuchHimalayaException if a matching himalaya could not be found
	*/
	public Himalaya findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException;

	/**
	* Returns the last himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching himalaya, or <code>null</code> if a matching himalaya could not be found
	*/
	public Himalaya fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

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
	public Himalaya[] findByUuid_C_PrevAndNext(long himalayaId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException;

	/**
	* Removes all the himalayas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of himalayas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching himalayas
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the himalaya in the entity cache if it is enabled.
	*
	* @param himalaya the himalaya
	*/
	public void cacheResult(Himalaya himalaya);

	/**
	* Caches the himalayas in the entity cache if it is enabled.
	*
	* @param himalayas the himalayas
	*/
	public void cacheResult(java.util.List<Himalaya> himalayas);

	/**
	* Creates a new himalaya with the primary key. Does not add the himalaya to the database.
	*
	* @param himalayaId the primary key for the new himalaya
	* @return the new himalaya
	*/
	public Himalaya create(long himalayaId);

	/**
	* Removes the himalaya with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya that was removed
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public Himalaya remove(long himalayaId) throws NoSuchHimalayaException;

	public Himalaya updateImpl(Himalaya himalaya);

	/**
	* Returns the himalaya with the primary key or throws a {@link NoSuchHimalayaException} if it could not be found.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya
	* @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	*/
	public Himalaya findByPrimaryKey(long himalayaId)
		throws NoSuchHimalayaException;

	/**
	* Returns the himalaya with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param himalayaId the primary key of the himalaya
	* @return the himalaya, or <code>null</code> if a himalaya with the primary key could not be found
	*/
	public Himalaya fetchByPrimaryKey(long himalayaId);

	@Override
	public java.util.Map<java.io.Serializable, Himalaya> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the himalayas.
	*
	* @return the himalayas
	*/
	public java.util.List<Himalaya> findAll();

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
	public java.util.List<Himalaya> findAll(int start, int end);

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
	public java.util.List<Himalaya> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator);

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
	public java.util.List<Himalaya> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Himalaya> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the himalayas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of himalayas.
	*
	* @return the number of himalayas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}