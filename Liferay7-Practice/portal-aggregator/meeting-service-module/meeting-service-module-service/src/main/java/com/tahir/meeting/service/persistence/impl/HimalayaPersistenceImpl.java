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

package com.tahir.meeting.service.persistence.impl;

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

import com.tahir.meeting.exception.NoSuchHimalayaException;
import com.tahir.meeting.model.Himalaya;
import com.tahir.meeting.model.impl.HimalayaImpl;
import com.tahir.meeting.model.impl.HimalayaModelImpl;
import com.tahir.meeting.service.persistence.HimalayaPersistence;

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
 * The persistence implementation for the himalaya service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Tahir Noor
 * @see HimalayaPersistence
 * @see com.tahir.meeting.service.persistence.HimalayaUtil
 * @generated
 */
@ProviderType
public class HimalayaPersistenceImpl extends BasePersistenceImpl<Himalaya>
	implements HimalayaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HimalayaUtil} to access the himalaya persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HimalayaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			HimalayaModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the himalayas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching himalayas
	 */
	@Override
	public List<Himalaya> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Himalaya> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Himalaya> findByUuid(String uuid, int start, int end,
		OrderByComparator<Himalaya> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Himalaya> findByUuid(String uuid, int start, int end,
		OrderByComparator<Himalaya> orderByComparator, boolean retrieveFromCache) {
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

		List<Himalaya> list = null;

		if (retrieveFromCache) {
			list = (List<Himalaya>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Himalaya himalaya : list) {
					if (!Validator.equals(uuid, himalaya.getUuid())) {
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

			query.append(_SQL_SELECT_HIMALAYA_WHERE);

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
				query.append(HimalayaModelImpl.ORDER_BY_JPQL);
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
					list = (List<Himalaya>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Himalaya>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first himalaya in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himalaya
	 * @throws NoSuchHimalayaException if a matching himalaya could not be found
	 */
	@Override
	public Himalaya findByUuid_First(String uuid,
		OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException {
		Himalaya himalaya = fetchByUuid_First(uuid, orderByComparator);

		if (himalaya != null) {
			return himalaya;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHimalayaException(msg.toString());
	}

	/**
	 * Returns the first himalaya in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himalaya, or <code>null</code> if a matching himalaya could not be found
	 */
	@Override
	public Himalaya fetchByUuid_First(String uuid,
		OrderByComparator<Himalaya> orderByComparator) {
		List<Himalaya> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last himalaya in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himalaya
	 * @throws NoSuchHimalayaException if a matching himalaya could not be found
	 */
	@Override
	public Himalaya findByUuid_Last(String uuid,
		OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException {
		Himalaya himalaya = fetchByUuid_Last(uuid, orderByComparator);

		if (himalaya != null) {
			return himalaya;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHimalayaException(msg.toString());
	}

	/**
	 * Returns the last himalaya in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himalaya, or <code>null</code> if a matching himalaya could not be found
	 */
	@Override
	public Himalaya fetchByUuid_Last(String uuid,
		OrderByComparator<Himalaya> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Himalaya> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Himalaya[] findByUuid_PrevAndNext(long himalayaId, String uuid,
		OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException {
		Himalaya himalaya = findByPrimaryKey(himalayaId);

		Session session = null;

		try {
			session = openSession();

			Himalaya[] array = new HimalayaImpl[3];

			array[0] = getByUuid_PrevAndNext(session, himalaya, uuid,
					orderByComparator, true);

			array[1] = himalaya;

			array[2] = getByUuid_PrevAndNext(session, himalaya, uuid,
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

	protected Himalaya getByUuid_PrevAndNext(Session session,
		Himalaya himalaya, String uuid,
		OrderByComparator<Himalaya> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HIMALAYA_WHERE);

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
			query.append(HimalayaModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(himalaya);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Himalaya> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the himalayas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Himalaya himalaya : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(himalaya);
		}
	}

	/**
	 * Returns the number of himalayas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching himalayas
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_HIMALAYA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "himalaya.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "himalaya.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(himalaya.uuid IS NULL OR himalaya.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			HimalayaModelImpl.UUID_COLUMN_BITMASK |
			HimalayaModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the himalaya where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHimalayaException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching himalaya
	 * @throws NoSuchHimalayaException if a matching himalaya could not be found
	 */
	@Override
	public Himalaya findByUUID_G(String uuid, long groupId)
		throws NoSuchHimalayaException {
		Himalaya himalaya = fetchByUUID_G(uuid, groupId);

		if (himalaya == null) {
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

			throw new NoSuchHimalayaException(msg.toString());
		}

		return himalaya;
	}

	/**
	 * Returns the himalaya where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	 */
	@Override
	public Himalaya fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the himalaya where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching himalaya, or <code>null</code> if a matching himalaya could not be found
	 */
	@Override
	public Himalaya fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Himalaya) {
			Himalaya himalaya = (Himalaya)result;

			if (!Validator.equals(uuid, himalaya.getUuid()) ||
					(groupId != himalaya.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_HIMALAYA_WHERE);

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

				List<Himalaya> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Himalaya himalaya = list.get(0);

					result = himalaya;

					cacheResult(himalaya);

					if ((himalaya.getUuid() == null) ||
							!himalaya.getUuid().equals(uuid) ||
							(himalaya.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, himalaya);
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
			return (Himalaya)result;
		}
	}

	/**
	 * Removes the himalaya where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the himalaya that was removed
	 */
	@Override
	public Himalaya removeByUUID_G(String uuid, long groupId)
		throws NoSuchHimalayaException {
		Himalaya himalaya = findByUUID_G(uuid, groupId);

		return remove(himalaya);
	}

	/**
	 * Returns the number of himalayas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching himalayas
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_HIMALAYA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "himalaya.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "himalaya.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(himalaya.uuid IS NULL OR himalaya.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "himalaya.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, HimalayaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			HimalayaModelImpl.UUID_COLUMN_BITMASK |
			HimalayaModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the himalayas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching himalayas
	 */
	@Override
	public List<Himalaya> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Himalaya> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Himalaya> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Himalaya> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Himalaya> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Himalaya> orderByComparator,
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

		List<Himalaya> list = null;

		if (retrieveFromCache) {
			list = (List<Himalaya>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Himalaya himalaya : list) {
					if (!Validator.equals(uuid, himalaya.getUuid()) ||
							(companyId != himalaya.getCompanyId())) {
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

			query.append(_SQL_SELECT_HIMALAYA_WHERE);

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
				query.append(HimalayaModelImpl.ORDER_BY_JPQL);
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
					list = (List<Himalaya>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Himalaya>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himalaya
	 * @throws NoSuchHimalayaException if a matching himalaya could not be found
	 */
	@Override
	public Himalaya findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException {
		Himalaya himalaya = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (himalaya != null) {
			return himalaya;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHimalayaException(msg.toString());
	}

	/**
	 * Returns the first himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching himalaya, or <code>null</code> if a matching himalaya could not be found
	 */
	@Override
	public Himalaya fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Himalaya> orderByComparator) {
		List<Himalaya> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Himalaya findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException {
		Himalaya himalaya = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (himalaya != null) {
			return himalaya;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHimalayaException(msg.toString());
	}

	/**
	 * Returns the last himalaya in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching himalaya, or <code>null</code> if a matching himalaya could not be found
	 */
	@Override
	public Himalaya fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Himalaya> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Himalaya> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Himalaya[] findByUuid_C_PrevAndNext(long himalayaId, String uuid,
		long companyId, OrderByComparator<Himalaya> orderByComparator)
		throws NoSuchHimalayaException {
		Himalaya himalaya = findByPrimaryKey(himalayaId);

		Session session = null;

		try {
			session = openSession();

			Himalaya[] array = new HimalayaImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, himalaya, uuid,
					companyId, orderByComparator, true);

			array[1] = himalaya;

			array[2] = getByUuid_C_PrevAndNext(session, himalaya, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Himalaya getByUuid_C_PrevAndNext(Session session,
		Himalaya himalaya, String uuid, long companyId,
		OrderByComparator<Himalaya> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_HIMALAYA_WHERE);

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
			query.append(HimalayaModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(himalaya);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Himalaya> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the himalayas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Himalaya himalaya : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(himalaya);
		}
	}

	/**
	 * Returns the number of himalayas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching himalayas
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_HIMALAYA_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "himalaya.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "himalaya.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(himalaya.uuid IS NULL OR himalaya.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "himalaya.companyId = ?";

	public HimalayaPersistenceImpl() {
		setModelClass(Himalaya.class);
	}

	/**
	 * Caches the himalaya in the entity cache if it is enabled.
	 *
	 * @param himalaya the himalaya
	 */
	@Override
	public void cacheResult(Himalaya himalaya) {
		entityCache.putResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaImpl.class, himalaya.getPrimaryKey(), himalaya);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { himalaya.getUuid(), himalaya.getGroupId() }, himalaya);

		himalaya.resetOriginalValues();
	}

	/**
	 * Caches the himalayas in the entity cache if it is enabled.
	 *
	 * @param himalayas the himalayas
	 */
	@Override
	public void cacheResult(List<Himalaya> himalayas) {
		for (Himalaya himalaya : himalayas) {
			if (entityCache.getResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
						HimalayaImpl.class, himalaya.getPrimaryKey()) == null) {
				cacheResult(himalaya);
			}
			else {
				himalaya.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all himalayas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HimalayaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the himalaya.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Himalaya himalaya) {
		entityCache.removeResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaImpl.class, himalaya.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((HimalayaModelImpl)himalaya);
	}

	@Override
	public void clearCache(List<Himalaya> himalayas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Himalaya himalaya : himalayas) {
			entityCache.removeResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
				HimalayaImpl.class, himalaya.getPrimaryKey());

			clearUniqueFindersCache((HimalayaModelImpl)himalaya);
		}
	}

	protected void cacheUniqueFindersCache(
		HimalayaModelImpl himalayaModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					himalayaModelImpl.getUuid(), himalayaModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				himalayaModelImpl);
		}
		else {
			if ((himalayaModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						himalayaModelImpl.getUuid(),
						himalayaModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					himalayaModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(HimalayaModelImpl himalayaModelImpl) {
		Object[] args = new Object[] {
				himalayaModelImpl.getUuid(), himalayaModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((himalayaModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					himalayaModelImpl.getOriginalUuid(),
					himalayaModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new himalaya with the primary key. Does not add the himalaya to the database.
	 *
	 * @param himalayaId the primary key for the new himalaya
	 * @return the new himalaya
	 */
	@Override
	public Himalaya create(long himalayaId) {
		Himalaya himalaya = new HimalayaImpl();

		himalaya.setNew(true);
		himalaya.setPrimaryKey(himalayaId);

		String uuid = PortalUUIDUtil.generate();

		himalaya.setUuid(uuid);

		himalaya.setCompanyId(companyProvider.getCompanyId());

		return himalaya;
	}

	/**
	 * Removes the himalaya with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param himalayaId the primary key of the himalaya
	 * @return the himalaya that was removed
	 * @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	 */
	@Override
	public Himalaya remove(long himalayaId) throws NoSuchHimalayaException {
		return remove((Serializable)himalayaId);
	}

	/**
	 * Removes the himalaya with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the himalaya
	 * @return the himalaya that was removed
	 * @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	 */
	@Override
	public Himalaya remove(Serializable primaryKey)
		throws NoSuchHimalayaException {
		Session session = null;

		try {
			session = openSession();

			Himalaya himalaya = (Himalaya)session.get(HimalayaImpl.class,
					primaryKey);

			if (himalaya == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHimalayaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(himalaya);
		}
		catch (NoSuchHimalayaException nsee) {
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
	protected Himalaya removeImpl(Himalaya himalaya) {
		himalaya = toUnwrappedModel(himalaya);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(himalaya)) {
				himalaya = (Himalaya)session.get(HimalayaImpl.class,
						himalaya.getPrimaryKeyObj());
			}

			if (himalaya != null) {
				session.delete(himalaya);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (himalaya != null) {
			clearCache(himalaya);
		}

		return himalaya;
	}

	@Override
	public Himalaya updateImpl(Himalaya himalaya) {
		himalaya = toUnwrappedModel(himalaya);

		boolean isNew = himalaya.isNew();

		HimalayaModelImpl himalayaModelImpl = (HimalayaModelImpl)himalaya;

		if (Validator.isNull(himalaya.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			himalaya.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (himalaya.getCreateDate() == null)) {
			if (serviceContext == null) {
				himalaya.setCreateDate(now);
			}
			else {
				himalaya.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!himalayaModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				himalaya.setModifiedDate(now);
			}
			else {
				himalaya.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (himalaya.isNew()) {
				session.save(himalaya);

				himalaya.setNew(false);
			}
			else {
				himalaya = (Himalaya)session.merge(himalaya);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !HimalayaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((himalayaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { himalayaModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { himalayaModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((himalayaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						himalayaModelImpl.getOriginalUuid(),
						himalayaModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						himalayaModelImpl.getUuid(),
						himalayaModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
			HimalayaImpl.class, himalaya.getPrimaryKey(), himalaya, false);

		clearUniqueFindersCache(himalayaModelImpl);
		cacheUniqueFindersCache(himalayaModelImpl, isNew);

		himalaya.resetOriginalValues();

		return himalaya;
	}

	protected Himalaya toUnwrappedModel(Himalaya himalaya) {
		if (himalaya instanceof HimalayaImpl) {
			return himalaya;
		}

		HimalayaImpl himalayaImpl = new HimalayaImpl();

		himalayaImpl.setNew(himalaya.isNew());
		himalayaImpl.setPrimaryKey(himalaya.getPrimaryKey());

		himalayaImpl.setUuid(himalaya.getUuid());
		himalayaImpl.setHimalayaId(himalaya.getHimalayaId());
		himalayaImpl.setGroupId(himalaya.getGroupId());
		himalayaImpl.setCompanyId(himalaya.getCompanyId());
		himalayaImpl.setUserId(himalaya.getUserId());
		himalayaImpl.setUserName(himalaya.getUserName());
		himalayaImpl.setCreateDate(himalaya.getCreateDate());
		himalayaImpl.setModifiedDate(himalaya.getModifiedDate());
		himalayaImpl.setName(himalaya.getName());
		himalayaImpl.setDesignation(himalaya.getDesignation());
		himalayaImpl.setComapany(himalaya.getComapany());
		himalayaImpl.setDob(himalaya.getDob());
		himalayaImpl.setDoj(himalaya.getDoj());

		return himalayaImpl;
	}

	/**
	 * Returns the himalaya with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the himalaya
	 * @return the himalaya
	 * @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	 */
	@Override
	public Himalaya findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHimalayaException {
		Himalaya himalaya = fetchByPrimaryKey(primaryKey);

		if (himalaya == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHimalayaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return himalaya;
	}

	/**
	 * Returns the himalaya with the primary key or throws a {@link NoSuchHimalayaException} if it could not be found.
	 *
	 * @param himalayaId the primary key of the himalaya
	 * @return the himalaya
	 * @throws NoSuchHimalayaException if a himalaya with the primary key could not be found
	 */
	@Override
	public Himalaya findByPrimaryKey(long himalayaId)
		throws NoSuchHimalayaException {
		return findByPrimaryKey((Serializable)himalayaId);
	}

	/**
	 * Returns the himalaya with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the himalaya
	 * @return the himalaya, or <code>null</code> if a himalaya with the primary key could not be found
	 */
	@Override
	public Himalaya fetchByPrimaryKey(Serializable primaryKey) {
		Himalaya himalaya = (Himalaya)entityCache.getResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
				HimalayaImpl.class, primaryKey);

		if (himalaya == _nullHimalaya) {
			return null;
		}

		if (himalaya == null) {
			Session session = null;

			try {
				session = openSession();

				himalaya = (Himalaya)session.get(HimalayaImpl.class, primaryKey);

				if (himalaya != null) {
					cacheResult(himalaya);
				}
				else {
					entityCache.putResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
						HimalayaImpl.class, primaryKey, _nullHimalaya);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
					HimalayaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return himalaya;
	}

	/**
	 * Returns the himalaya with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param himalayaId the primary key of the himalaya
	 * @return the himalaya, or <code>null</code> if a himalaya with the primary key could not be found
	 */
	@Override
	public Himalaya fetchByPrimaryKey(long himalayaId) {
		return fetchByPrimaryKey((Serializable)himalayaId);
	}

	@Override
	public Map<Serializable, Himalaya> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Himalaya> map = new HashMap<Serializable, Himalaya>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Himalaya himalaya = fetchByPrimaryKey(primaryKey);

			if (himalaya != null) {
				map.put(primaryKey, himalaya);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Himalaya himalaya = (Himalaya)entityCache.getResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
					HimalayaImpl.class, primaryKey);

			if (himalaya == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, himalaya);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_HIMALAYA_WHERE_PKS_IN);

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

			for (Himalaya himalaya : (List<Himalaya>)q.list()) {
				map.put(himalaya.getPrimaryKeyObj(), himalaya);

				cacheResult(himalaya);

				uncachedPrimaryKeys.remove(himalaya.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(HimalayaModelImpl.ENTITY_CACHE_ENABLED,
					HimalayaImpl.class, primaryKey, _nullHimalaya);
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
	 * Returns all the himalayas.
	 *
	 * @return the himalayas
	 */
	@Override
	public List<Himalaya> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Himalaya> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Himalaya> findAll(int start, int end,
		OrderByComparator<Himalaya> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Himalaya> findAll(int start, int end,
		OrderByComparator<Himalaya> orderByComparator, boolean retrieveFromCache) {
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

		List<Himalaya> list = null;

		if (retrieveFromCache) {
			list = (List<Himalaya>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_HIMALAYA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HIMALAYA;

				if (pagination) {
					sql = sql.concat(HimalayaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Himalaya>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Himalaya>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the himalayas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Himalaya himalaya : findAll()) {
			remove(himalaya);
		}
	}

	/**
	 * Returns the number of himalayas.
	 *
	 * @return the number of himalayas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HIMALAYA);

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
		return HimalayaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the himalaya persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(HimalayaImpl.class.getName());
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
	private static final String _SQL_SELECT_HIMALAYA = "SELECT himalaya FROM Himalaya himalaya";
	private static final String _SQL_SELECT_HIMALAYA_WHERE_PKS_IN = "SELECT himalaya FROM Himalaya himalaya WHERE himalayaId IN (";
	private static final String _SQL_SELECT_HIMALAYA_WHERE = "SELECT himalaya FROM Himalaya himalaya WHERE ";
	private static final String _SQL_COUNT_HIMALAYA = "SELECT COUNT(himalaya) FROM Himalaya himalaya";
	private static final String _SQL_COUNT_HIMALAYA_WHERE = "SELECT COUNT(himalaya) FROM Himalaya himalaya WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "himalaya.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Himalaya exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Himalaya exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(HimalayaPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static final Himalaya _nullHimalaya = new HimalayaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Himalaya> toCacheModel() {
				return _nullHimalayaCacheModel;
			}
		};

	private static final CacheModel<Himalaya> _nullHimalayaCacheModel = new CacheModel<Himalaya>() {
			@Override
			public Himalaya toEntityModel() {
				return _nullHimalaya;
			}
		};
}