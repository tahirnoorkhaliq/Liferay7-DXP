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

package com.tahir.liferaypractice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException;
import com.tahir.liferaypractice.model.TestServiceModule;
import com.tahir.liferaypractice.model.impl.TestServiceModuleImpl;
import com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl;
import com.tahir.liferaypractice.service.persistence.TestServiceModulePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the test service module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Tahir
 * @see TestServiceModulePersistence
 * @see com.tahir.liferaypractice.service.persistence.TestServiceModuleUtil
 * @generated
 */
@ProviderType
public class TestServiceModulePersistenceImpl extends BasePersistenceImpl<TestServiceModule>
	implements TestServiceModulePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TestServiceModuleUtil} to access the test service module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TestServiceModuleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TestServiceModuleModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the test service modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching test service modules
	 */
	@Override
	public List<TestServiceModule> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestServiceModule> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<TestServiceModule> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<TestServiceModule> findByUuid(String uuid, int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<TestServiceModule> list = null;

		if (retrieveFromCache) {
			list = (List<TestServiceModule>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestServiceModule testServiceModule : list) {
					if (!Validator.equals(uuid, testServiceModule.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TESTSERVICEMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestServiceModuleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<TestServiceModule>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestServiceModule>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first test service module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test service module
	 * @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule findByUuid_First(String uuid,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = fetchByUuid_First(uuid,
				orderByComparator);

		if (testServiceModule != null) {
			return testServiceModule;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestServiceModuleException(msg.toString());
	}

	/**
	 * Returns the first test service module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test service module, or <code>null</code> if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule fetchByUuid_First(String uuid,
		OrderByComparator<TestServiceModule> orderByComparator) {
		List<TestServiceModule> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test service module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test service module
	 * @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule findByUuid_Last(String uuid,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = fetchByUuid_Last(uuid,
				orderByComparator);

		if (testServiceModule != null) {
			return testServiceModule;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestServiceModuleException(msg.toString());
	}

	/**
	 * Returns the last test service module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test service module, or <code>null</code> if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule fetchByUuid_Last(String uuid,
		OrderByComparator<TestServiceModule> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TestServiceModule> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestServiceModule[] findByUuid_PrevAndNext(
		long testServiceModuleId, String uuid,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = findByPrimaryKey(testServiceModuleId);

		Session session = null;

		try {
			session = openSession();

			TestServiceModule[] array = new TestServiceModuleImpl[3];

			array[0] = getByUuid_PrevAndNext(session, testServiceModule, uuid,
					orderByComparator, true);

			array[1] = testServiceModule;

			array[2] = getByUuid_PrevAndNext(session, testServiceModule, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestServiceModule getByUuid_PrevAndNext(Session session,
		TestServiceModule testServiceModule, String uuid,
		OrderByComparator<TestServiceModule> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESTSERVICEMODULE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TestServiceModuleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testServiceModule);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestServiceModule> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test service modules where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TestServiceModule testServiceModule : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testServiceModule);
		}
	}

	/**
	 * Returns the number of test service modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching test service modules
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESTSERVICEMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "testServiceModule.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "testServiceModule.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(testServiceModule.uuid IS NULL OR testServiceModule.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TestServiceModuleModelImpl.UUID_COLUMN_BITMASK |
			TestServiceModuleModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the test service module where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTestServiceModuleException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching test service module
	 * @throws NoSuchTestServiceModuleException if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule findByUUID_G(String uuid, long groupId)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = fetchByUUID_G(uuid, groupId);

		if (testServiceModule == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTestServiceModuleException(msg.toString());
		}

		return testServiceModule;
	}

	/**
	 * Returns the test service module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the test service module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching test service module, or <code>null</code> if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof TestServiceModule) {
			TestServiceModule testServiceModule = (TestServiceModule)result;

			if (!Validator.equals(uuid, testServiceModule.getUuid()) ||
					(groupId != testServiceModule.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TESTSERVICEMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<TestServiceModule> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					TestServiceModule testServiceModule = list.get(0);

					result = testServiceModule;

					cacheResult(testServiceModule);

					if ((testServiceModule.getUuid() == null) ||
							!testServiceModule.getUuid().equals(uuid) ||
							(testServiceModule.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, testServiceModule);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TestServiceModule)result;
		}
	}

	/**
	 * Removes the test service module where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the test service module that was removed
	 */
	@Override
	public TestServiceModule removeByUUID_G(String uuid, long groupId)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = findByUUID_G(uuid, groupId);

		return remove(testServiceModule);
	}

	/**
	 * Returns the number of test service modules where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching test service modules
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TESTSERVICEMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "testServiceModule.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "testServiceModule.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(testServiceModule.uuid IS NULL OR testServiceModule.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "testServiceModule.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED,
			TestServiceModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			TestServiceModuleModelImpl.UUID_COLUMN_BITMASK |
			TestServiceModuleModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the test service modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching test service modules
	 */
	@Override
	public List<TestServiceModule> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestServiceModule> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<TestServiceModule> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<TestServiceModule> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<TestServiceModule> list = null;

		if (retrieveFromCache) {
			list = (List<TestServiceModule>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestServiceModule testServiceModule : list) {
					if (!Validator.equals(uuid, testServiceModule.getUuid()) ||
							(companyId != testServiceModule.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TESTSERVICEMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TestServiceModuleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<TestServiceModule>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestServiceModule>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public TestServiceModule findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (testServiceModule != null) {
			return testServiceModule;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestServiceModuleException(msg.toString());
	}

	/**
	 * Returns the first test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test service module, or <code>null</code> if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator) {
		List<TestServiceModule> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestServiceModule findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (testServiceModule != null) {
			return testServiceModule;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTestServiceModuleException(msg.toString());
	}

	/**
	 * Returns the last test service module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test service module, or <code>null</code> if a matching test service module could not be found
	 */
	@Override
	public TestServiceModule fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TestServiceModule> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public TestServiceModule[] findByUuid_C_PrevAndNext(
		long testServiceModuleId, String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = findByPrimaryKey(testServiceModuleId);

		Session session = null;

		try {
			session = openSession();

			TestServiceModule[] array = new TestServiceModuleImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, testServiceModule,
					uuid, companyId, orderByComparator, true);

			array[1] = testServiceModule;

			array[2] = getByUuid_C_PrevAndNext(session, testServiceModule,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TestServiceModule getByUuid_C_PrevAndNext(Session session,
		TestServiceModule testServiceModule, String uuid, long companyId,
		OrderByComparator<TestServiceModule> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TESTSERVICEMODULE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(TestServiceModuleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(testServiceModule);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TestServiceModule> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the test service modules where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TestServiceModule testServiceModule : findByUuid_C(uuid,
				companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(testServiceModule);
		}
	}

	/**
	 * Returns the number of test service modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching test service modules
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TESTSERVICEMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "testServiceModule.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "testServiceModule.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(testServiceModule.uuid IS NULL OR testServiceModule.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "testServiceModule.companyId = ?";

	public TestServiceModulePersistenceImpl() {
		setModelClass(TestServiceModule.class);
	}

	/**
	 * Caches the test service module in the entity cache if it is enabled.
	 *
	 * @param testServiceModule the test service module
	 */
	@Override
	public void cacheResult(TestServiceModule testServiceModule) {
		entityCache.putResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleImpl.class, testServiceModule.getPrimaryKey(),
			testServiceModule);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				testServiceModule.getUuid(), testServiceModule.getGroupId()
			}, testServiceModule);

		testServiceModule.resetOriginalValues();
	}

	/**
	 * Caches the test service modules in the entity cache if it is enabled.
	 *
	 * @param testServiceModules the test service modules
	 */
	@Override
	public void cacheResult(List<TestServiceModule> testServiceModules) {
		for (TestServiceModule testServiceModule : testServiceModules) {
			if (entityCache.getResult(
						TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
						TestServiceModuleImpl.class,
						testServiceModule.getPrimaryKey()) == null) {
				cacheResult(testServiceModule);
			}
			else {
				testServiceModule.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test service modules.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestServiceModuleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test service module.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestServiceModule testServiceModule) {
		entityCache.removeResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleImpl.class, testServiceModule.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TestServiceModuleModelImpl)testServiceModule);
	}

	@Override
	public void clearCache(List<TestServiceModule> testServiceModules) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestServiceModule testServiceModule : testServiceModules) {
			entityCache.removeResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
				TestServiceModuleImpl.class, testServiceModule.getPrimaryKey());

			clearUniqueFindersCache((TestServiceModuleModelImpl)testServiceModule);
		}
	}

	protected void cacheUniqueFindersCache(
		TestServiceModuleModelImpl testServiceModuleModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					testServiceModuleModelImpl.getUuid(),
					testServiceModuleModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				testServiceModuleModelImpl);
		}
		else {
			if ((testServiceModuleModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testServiceModuleModelImpl.getUuid(),
						testServiceModuleModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					testServiceModuleModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TestServiceModuleModelImpl testServiceModuleModelImpl) {
		Object[] args = new Object[] {
				testServiceModuleModelImpl.getUuid(),
				testServiceModuleModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((testServiceModuleModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					testServiceModuleModelImpl.getOriginalUuid(),
					testServiceModuleModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new test service module with the primary key. Does not add the test service module to the database.
	 *
	 * @param testServiceModuleId the primary key for the new test service module
	 * @return the new test service module
	 */
	@Override
	public TestServiceModule create(long testServiceModuleId) {
		TestServiceModule testServiceModule = new TestServiceModuleImpl();

		testServiceModule.setNew(true);
		testServiceModule.setPrimaryKey(testServiceModuleId);

		String uuid = PortalUUIDUtil.generate();

		testServiceModule.setUuid(uuid);

		testServiceModule.setCompanyId(companyProvider.getCompanyId());

		return testServiceModule;
	}

	/**
	 * Removes the test service module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testServiceModuleId the primary key of the test service module
	 * @return the test service module that was removed
	 * @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	 */
	@Override
	public TestServiceModule remove(long testServiceModuleId)
		throws NoSuchTestServiceModuleException {
		return remove((Serializable)testServiceModuleId);
	}

	/**
	 * Removes the test service module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test service module
	 * @return the test service module that was removed
	 * @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	 */
	@Override
	public TestServiceModule remove(Serializable primaryKey)
		throws NoSuchTestServiceModuleException {
		Session session = null;

		try {
			session = openSession();

			TestServiceModule testServiceModule = (TestServiceModule)session.get(TestServiceModuleImpl.class,
					primaryKey);

			if (testServiceModule == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestServiceModuleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(testServiceModule);
		}
		catch (NoSuchTestServiceModuleException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TestServiceModule removeImpl(TestServiceModule testServiceModule) {
		testServiceModule = toUnwrappedModel(testServiceModule);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testServiceModule)) {
				testServiceModule = (TestServiceModule)session.get(TestServiceModuleImpl.class,
						testServiceModule.getPrimaryKeyObj());
			}

			if (testServiceModule != null) {
				session.delete(testServiceModule);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (testServiceModule != null) {
			clearCache(testServiceModule);
		}

		return testServiceModule;
	}

	@Override
	public TestServiceModule updateImpl(TestServiceModule testServiceModule) {
		testServiceModule = toUnwrappedModel(testServiceModule);

		boolean isNew = testServiceModule.isNew();

		TestServiceModuleModelImpl testServiceModuleModelImpl = (TestServiceModuleModelImpl)testServiceModule;

		if (Validator.isNull(testServiceModule.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			testServiceModule.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (testServiceModule.getCreateDate() == null)) {
			if (serviceContext == null) {
				testServiceModule.setCreateDate(now);
			}
			else {
				testServiceModule.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!testServiceModuleModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				testServiceModule.setModifiedDate(now);
			}
			else {
				testServiceModule.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (testServiceModule.isNew()) {
				session.save(testServiceModule);

				testServiceModule.setNew(false);
			}
			else {
				testServiceModule = (TestServiceModule)session.merge(testServiceModule);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TestServiceModuleModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((testServiceModuleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testServiceModuleModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { testServiceModuleModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((testServiceModuleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						testServiceModuleModelImpl.getOriginalUuid(),
						testServiceModuleModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						testServiceModuleModelImpl.getUuid(),
						testServiceModuleModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
			TestServiceModuleImpl.class, testServiceModule.getPrimaryKey(),
			testServiceModule, false);

		clearUniqueFindersCache(testServiceModuleModelImpl);
		cacheUniqueFindersCache(testServiceModuleModelImpl, isNew);

		testServiceModule.resetOriginalValues();

		return testServiceModule;
	}

	protected TestServiceModule toUnwrappedModel(
		TestServiceModule testServiceModule) {
		if (testServiceModule instanceof TestServiceModuleImpl) {
			return testServiceModule;
		}

		TestServiceModuleImpl testServiceModuleImpl = new TestServiceModuleImpl();

		testServiceModuleImpl.setNew(testServiceModule.isNew());
		testServiceModuleImpl.setPrimaryKey(testServiceModule.getPrimaryKey());

		testServiceModuleImpl.setUuid(testServiceModule.getUuid());
		testServiceModuleImpl.setTestServiceModuleId(testServiceModule.getTestServiceModuleId());
		testServiceModuleImpl.setGroupId(testServiceModule.getGroupId());
		testServiceModuleImpl.setCompanyId(testServiceModule.getCompanyId());
		testServiceModuleImpl.setUserId(testServiceModule.getUserId());
		testServiceModuleImpl.setUserName(testServiceModule.getUserName());
		testServiceModuleImpl.setCreateDate(testServiceModule.getCreateDate());
		testServiceModuleImpl.setModifiedDate(testServiceModule.getModifiedDate());
		testServiceModuleImpl.setName(testServiceModule.getName());
		testServiceModuleImpl.setAge(testServiceModule.getAge());
		testServiceModuleImpl.setProfession(testServiceModule.getProfession());
		testServiceModuleImpl.setDob(testServiceModule.getDob());

		return testServiceModuleImpl;
	}

	/**
	 * Returns the test service module with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the test service module
	 * @return the test service module
	 * @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	 */
	@Override
	public TestServiceModule findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestServiceModuleException {
		TestServiceModule testServiceModule = fetchByPrimaryKey(primaryKey);

		if (testServiceModule == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestServiceModuleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return testServiceModule;
	}

	/**
	 * Returns the test service module with the primary key or throws a {@link NoSuchTestServiceModuleException} if it could not be found.
	 *
	 * @param testServiceModuleId the primary key of the test service module
	 * @return the test service module
	 * @throws NoSuchTestServiceModuleException if a test service module with the primary key could not be found
	 */
	@Override
	public TestServiceModule findByPrimaryKey(long testServiceModuleId)
		throws NoSuchTestServiceModuleException {
		return findByPrimaryKey((Serializable)testServiceModuleId);
	}

	/**
	 * Returns the test service module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test service module
	 * @return the test service module, or <code>null</code> if a test service module with the primary key could not be found
	 */
	@Override
	public TestServiceModule fetchByPrimaryKey(Serializable primaryKey) {
		TestServiceModule testServiceModule = (TestServiceModule)entityCache.getResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
				TestServiceModuleImpl.class, primaryKey);

		if (testServiceModule == _nullTestServiceModule) {
			return null;
		}

		if (testServiceModule == null) {
			Session session = null;

			try {
				session = openSession();

				testServiceModule = (TestServiceModule)session.get(TestServiceModuleImpl.class,
						primaryKey);

				if (testServiceModule != null) {
					cacheResult(testServiceModule);
				}
				else {
					entityCache.putResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
						TestServiceModuleImpl.class, primaryKey,
						_nullTestServiceModule);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
					TestServiceModuleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return testServiceModule;
	}

	/**
	 * Returns the test service module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param testServiceModuleId the primary key of the test service module
	 * @return the test service module, or <code>null</code> if a test service module with the primary key could not be found
	 */
	@Override
	public TestServiceModule fetchByPrimaryKey(long testServiceModuleId) {
		return fetchByPrimaryKey((Serializable)testServiceModuleId);
	}

	@Override
	public Map<Serializable, TestServiceModule> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TestServiceModule> map = new HashMap<Serializable, TestServiceModule>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TestServiceModule testServiceModule = fetchByPrimaryKey(primaryKey);

			if (testServiceModule != null) {
				map.put(primaryKey, testServiceModule);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			TestServiceModule testServiceModule = (TestServiceModule)entityCache.getResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
					TestServiceModuleImpl.class, primaryKey);

			if (testServiceModule == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, testServiceModule);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TESTSERVICEMODULE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (TestServiceModule testServiceModule : (List<TestServiceModule>)q.list()) {
				map.put(testServiceModule.getPrimaryKeyObj(), testServiceModule);

				cacheResult(testServiceModule);

				uncachedPrimaryKeys.remove(testServiceModule.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TestServiceModuleModelImpl.ENTITY_CACHE_ENABLED,
					TestServiceModuleImpl.class, primaryKey,
					_nullTestServiceModule);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the test service modules.
	 *
	 * @return the test service modules
	 */
	@Override
	public List<TestServiceModule> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestServiceModule> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestServiceModule> findAll(int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestServiceModule> findAll(int start, int end,
		OrderByComparator<TestServiceModule> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TestServiceModule> list = null;

		if (retrieveFromCache) {
			list = (List<TestServiceModule>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TESTSERVICEMODULE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESTSERVICEMODULE;

				if (pagination) {
					sql = sql.concat(TestServiceModuleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TestServiceModule>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TestServiceModule>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the test service modules from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestServiceModule testServiceModule : findAll()) {
			remove(testServiceModule);
		}
	}

	/**
	 * Returns the number of test service modules.
	 *
	 * @return the number of test service modules
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESTSERVICEMODULE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TestServiceModuleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test service module persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TestServiceModuleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TESTSERVICEMODULE = "SELECT testServiceModule FROM TestServiceModule testServiceModule";
	private static final String _SQL_SELECT_TESTSERVICEMODULE_WHERE_PKS_IN = "SELECT testServiceModule FROM TestServiceModule testServiceModule WHERE testServiceModuleId IN (";
	private static final String _SQL_SELECT_TESTSERVICEMODULE_WHERE = "SELECT testServiceModule FROM TestServiceModule testServiceModule WHERE ";
	private static final String _SQL_COUNT_TESTSERVICEMODULE = "SELECT COUNT(testServiceModule) FROM TestServiceModule testServiceModule";
	private static final String _SQL_COUNT_TESTSERVICEMODULE_WHERE = "SELECT COUNT(testServiceModule) FROM TestServiceModule testServiceModule WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "testServiceModule.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TestServiceModule exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TestServiceModule exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TestServiceModulePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static final TestServiceModule _nullTestServiceModule = new TestServiceModuleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TestServiceModule> toCacheModel() {
				return _nullTestServiceModuleCacheModel;
			}
		};

	private static final CacheModel<TestServiceModule> _nullTestServiceModuleCacheModel =
		new CacheModel<TestServiceModule>() {
			@Override
			public TestServiceModule toEntityModel() {
				return _nullTestServiceModule;
			}
		};
}