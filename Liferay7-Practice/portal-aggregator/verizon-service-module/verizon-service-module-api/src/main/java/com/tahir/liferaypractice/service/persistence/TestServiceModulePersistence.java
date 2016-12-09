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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException;
import com.tahir.liferaypractice.model.TestServiceModule;

/**
 * The persistence interface for the test service module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Tahir
 * @see com.tahir.liferaypractice.service.persistence.impl.TestServiceModulePersistenceImpl
 * @see TestServiceModuleUtil
 * @generated
 */
@ProviderType
public interface TestServiceModulePersistence extends BasePersistence<TestServiceModule> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestServiceModuleUtil} to access the test service module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the test service modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching test service modules
	*/
	public java.util.List<TestServiceModule> findByUuid(java.lang.String uuid);

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
	public java.util.List<TestServiceModule> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<TestServiceModule> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

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
	public java.util.List<TestServiceModule> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public TestServiceModule findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the first test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public TestServiceModule fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

	/**
	* Returns the last test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public TestServiceModule findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the last test service module in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public TestServiceModule fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

	/**
	* Returns the test service modules before and after the current test service module in the ordered set where uuid = &#63;.
	*
	* @param testServiceModuleId the primary key of the current test service module
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next test service module
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public TestServiceModule[] findByUuid_PrevAndNext(
		long testServiceModuleId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException;

	/**
	* Removes all the test service modules where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of test service modules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching test service modules
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the test service module where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTestServiceModuleException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public TestServiceModule findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the test service module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public TestServiceModule fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the test service module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public TestServiceModule fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the test service module where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the test service module that was removed
	*/
	public TestServiceModule removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the number of test service modules where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching test service modules
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the test service modules where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching test service modules
	*/
	public java.util.List<TestServiceModule> findByUuid_C(
		java.lang.String uuid, long companyId);

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
	public java.util.List<TestServiceModule> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);

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
	public java.util.List<TestServiceModule> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

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
	public java.util.List<TestServiceModule> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public TestServiceModule findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the first test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public TestServiceModule fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

	/**
	* Returns the last test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module
	* @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	*/
	public TestServiceModule findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the last test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching test service module, or <code>null</code> if a matching test service module could not be found
	*/
	public TestServiceModule fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

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
	public TestServiceModule[] findByUuid_C_PrevAndNext(
		long testServiceModuleId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException;

	/**
	* Removes all the test service modules where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of test service modules where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching test service modules
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the test service module in the entity cache if it is enabled.
	*
	* @param testServiceModule the test service module
	*/
	public void cacheResult(TestServiceModule testServiceModule);

	/**
	* Caches the test service modules in the entity cache if it is enabled.
	*
	* @param testServiceModules the test service modules
	*/
	public void cacheResult(
		java.util.List<TestServiceModule> testServiceModules);

	/**
	* Creates a new test service module with the primary key. Does not add the test service module to the database.
	*
	* @param testServiceModuleId the primary key for the new test service module
	* @return the new test service module
	*/
	public TestServiceModule create(long testServiceModuleId);

	/**
	* Removes the test service module with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module that was removed
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public TestServiceModule remove(long testServiceModuleId)
		throws NoSuchTestServiceModuleException;

	public TestServiceModule updateImpl(TestServiceModule testServiceModule);

	/**
	* Returns the test service module with the primary key or throws a {@link NoSuchTestServiceModuleException} if it could not be found.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module
	* @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	*/
	public TestServiceModule findByPrimaryKey(long testServiceModuleId)
		throws NoSuchTestServiceModuleException;

	/**
	* Returns the test service module with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param testServiceModuleId the primary key of the test service module
	* @return the test service module, or <code>null</code> if a test service module with the primary key could not be found
	*/
	public TestServiceModule fetchByPrimaryKey(long testServiceModuleId);

	@Override
	public java.util.Map<java.io.Serializable, TestServiceModule> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the test service modules.
	*
	* @return the test service modules
	*/
	public java.util.List<TestServiceModule> findAll();

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
	public java.util.List<TestServiceModule> findAll(int start, int end);

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
	public java.util.List<TestServiceModule> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator);

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
	public java.util.List<TestServiceModule> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the test service modules from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of test service modules.
	*
	* @return the number of test service modules
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}