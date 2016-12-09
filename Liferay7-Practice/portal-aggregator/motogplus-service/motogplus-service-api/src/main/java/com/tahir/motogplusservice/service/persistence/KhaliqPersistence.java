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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tahir.motogplusservice.exception.NoSuchKhaliqException;
import com.tahir.motogplusservice.model.Khaliq;

/**
 * The persistence interface for the khaliq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TahirNoor
 * @see com.tahir.motogplusservice.service.persistence.impl.KhaliqPersistenceImpl
 * @see KhaliqUtil
 * @generated
 */
@ProviderType
public interface KhaliqPersistence extends BasePersistence<Khaliq> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KhaliqUtil} to access the khaliq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the khaliqs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching khaliqs
	*/
	public java.util.List<Khaliq> findByUuid(java.lang.String uuid);

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
	public java.util.List<Khaliq> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Khaliq> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

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
	public java.util.List<Khaliq> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public Khaliq findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException;

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public Khaliq findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException;

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

	/**
	* Returns the khaliqs before and after the current khaliq in the ordered set where uuid = &#63;.
	*
	* @param khaliqId the primary key of the current khaliq
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khaliq
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public Khaliq[] findByUuid_PrevAndNext(long khaliqId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException;

	/**
	* Removes all the khaliqs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of khaliqs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching khaliqs
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the khaliq where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchKhaliqException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public Khaliq findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchKhaliqException;

	/**
	* Returns the khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the khaliq where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the khaliq that was removed
	*/
	public Khaliq removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchKhaliqException;

	/**
	* Returns the number of khaliqs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching khaliqs
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching khaliqs
	*/
	public java.util.List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

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
	public java.util.List<Khaliq> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public Khaliq findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException;

	/**
	* Returns the first khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public Khaliq findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException;

	/**
	* Returns the last khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

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
	public Khaliq[] findByUuid_C_PrevAndNext(long khaliqId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException;

	/**
	* Removes all the khaliqs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of khaliqs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching khaliqs
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the khaliq where name = &#63; or throws a {@link NoSuchKhaliqException} if it could not be found.
	*
	* @param name the name
	* @return the matching khaliq
	* @throws NoSuchKhaliqException if a matching khaliq could not be found
	*/
	public Khaliq findBykhaliqName(java.lang.String name)
		throws NoSuchKhaliqException;

	/**
	* Returns the khaliq where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchBykhaliqName(java.lang.String name);

	/**
	* Returns the khaliq where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	*/
	public Khaliq fetchBykhaliqName(java.lang.String name,
		boolean retrieveFromCache);

	/**
	* Removes the khaliq where name = &#63; from the database.
	*
	* @param name the name
	* @return the khaliq that was removed
	*/
	public Khaliq removeBykhaliqName(java.lang.String name)
		throws NoSuchKhaliqException;

	/**
	* Returns the number of khaliqs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching khaliqs
	*/
	public int countBykhaliqName(java.lang.String name);

	/**
	* Caches the khaliq in the entity cache if it is enabled.
	*
	* @param khaliq the khaliq
	*/
	public void cacheResult(Khaliq khaliq);

	/**
	* Caches the khaliqs in the entity cache if it is enabled.
	*
	* @param khaliqs the khaliqs
	*/
	public void cacheResult(java.util.List<Khaliq> khaliqs);

	/**
	* Creates a new khaliq with the primary key. Does not add the khaliq to the database.
	*
	* @param khaliqId the primary key for the new khaliq
	* @return the new khaliq
	*/
	public Khaliq create(long khaliqId);

	/**
	* Removes the khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param khaliqId the primary key of the khaliq
	* @return the khaliq that was removed
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public Khaliq remove(long khaliqId) throws NoSuchKhaliqException;

	public Khaliq updateImpl(Khaliq khaliq);

	/**
	* Returns the khaliq with the primary key or throws a {@link NoSuchKhaliqException} if it could not be found.
	*
	* @param khaliqId the primary key of the khaliq
	* @return the khaliq
	* @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	*/
	public Khaliq findByPrimaryKey(long khaliqId) throws NoSuchKhaliqException;

	/**
	* Returns the khaliq with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param khaliqId the primary key of the khaliq
	* @return the khaliq, or <code>null</code> if a khaliq with the primary key could not be found
	*/
	public Khaliq fetchByPrimaryKey(long khaliqId);

	@Override
	public java.util.Map<java.io.Serializable, Khaliq> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the khaliqs.
	*
	* @return the khaliqs
	*/
	public java.util.List<Khaliq> findAll();

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
	public java.util.List<Khaliq> findAll(int start, int end);

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
	public java.util.List<Khaliq> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator);

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
	public java.util.List<Khaliq> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Khaliq> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the khaliqs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of khaliqs.
	*
	* @return the number of khaliqs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}