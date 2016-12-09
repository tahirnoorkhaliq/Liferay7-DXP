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

package com.tahir.motogplusservice.service.persistence.impl;

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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.tahir.motogplusservice.exception.NoSuchKhaliqException;
import com.tahir.motogplusservice.model.Khaliq;
import com.tahir.motogplusservice.model.impl.KhaliqImpl;
import com.tahir.motogplusservice.model.impl.KhaliqModelImpl;
import com.tahir.motogplusservice.service.persistence.KhaliqPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the khaliq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TahirNoor
 * @see KhaliqPersistence
 * @see com.tahir.motogplusservice.service.persistence.KhaliqUtil
 * @generated
 */
@ProviderType
public class KhaliqPersistenceImpl extends BasePersistenceImpl<Khaliq>
	implements KhaliqPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhaliqUtil} to access the khaliq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhaliqImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			KhaliqModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the khaliqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching khaliqs
	 */
	@Override
	public List<Khaliq> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Khaliq> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Khaliq> findByUuid(String uuid, int start, int end,
		OrderByComparator<Khaliq> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Khaliq> findByUuid(String uuid, int start, int end,
		OrderByComparator<Khaliq> orderByComparator, boolean retrieveFromCache) {
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

		List<Khaliq> list = null;

		if (retrieveFromCache) {
			list = (List<Khaliq>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Khaliq khaliq : list) {
					if (!Objects.equals(uuid, khaliq.getUuid())) {
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

			query.append(_SQL_SELECT_KHALIQ_WHERE);

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
				query.append(KhaliqModelImpl.ORDER_BY_JPQL);
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
					list = (List<Khaliq>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Khaliq>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khaliq
	 * @throws NoSuchKhaliqException if a matching khaliq could not be found
	 */
	@Override
	public Khaliq findByUuid_First(String uuid,
		OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException {
		Khaliq khaliq = fetchByUuid_First(uuid, orderByComparator);

		if (khaliq != null) {
			return khaliq;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhaliqException(msg.toString());
	}

	/**
	 * Returns the first khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchByUuid_First(String uuid,
		OrderByComparator<Khaliq> orderByComparator) {
		List<Khaliq> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khaliq
	 * @throws NoSuchKhaliqException if a matching khaliq could not be found
	 */
	@Override
	public Khaliq findByUuid_Last(String uuid,
		OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException {
		Khaliq khaliq = fetchByUuid_Last(uuid, orderByComparator);

		if (khaliq != null) {
			return khaliq;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhaliqException(msg.toString());
	}

	/**
	 * Returns the last khaliq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchByUuid_Last(String uuid,
		OrderByComparator<Khaliq> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Khaliq> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Khaliq[] findByUuid_PrevAndNext(long khaliqId, String uuid,
		OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException {
		Khaliq khaliq = findByPrimaryKey(khaliqId);

		Session session = null;

		try {
			session = openSession();

			Khaliq[] array = new KhaliqImpl[3];

			array[0] = getByUuid_PrevAndNext(session, khaliq, uuid,
					orderByComparator, true);

			array[1] = khaliq;

			array[2] = getByUuid_PrevAndNext(session, khaliq, uuid,
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

	protected Khaliq getByUuid_PrevAndNext(Session session, Khaliq khaliq,
		String uuid, OrderByComparator<Khaliq> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KHALIQ_WHERE);

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
			query.append(KhaliqModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(khaliq);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Khaliq> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the khaliqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Khaliq khaliq : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(khaliq);
		}
	}

	/**
	 * Returns the number of khaliqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching khaliqs
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KHALIQ_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "khaliq.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "khaliq.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(khaliq.uuid IS NULL OR khaliq.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			KhaliqModelImpl.UUID_COLUMN_BITMASK |
			KhaliqModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the khaliq where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchKhaliqException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching khaliq
	 * @throws NoSuchKhaliqException if a matching khaliq could not be found
	 */
	@Override
	public Khaliq findByUUID_G(String uuid, long groupId)
		throws NoSuchKhaliqException {
		Khaliq khaliq = fetchByUUID_G(uuid, groupId);

		if (khaliq == null) {
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

			throw new NoSuchKhaliqException(msg.toString());
		}

		return khaliq;
	}

	/**
	 * Returns the khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the khaliq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Khaliq) {
			Khaliq khaliq = (Khaliq)result;

			if (!Objects.equals(uuid, khaliq.getUuid()) ||
					(groupId != khaliq.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_KHALIQ_WHERE);

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

				List<Khaliq> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Khaliq khaliq = list.get(0);

					result = khaliq;

					cacheResult(khaliq);

					if ((khaliq.getUuid() == null) ||
							!khaliq.getUuid().equals(uuid) ||
							(khaliq.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, khaliq);
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
			return (Khaliq)result;
		}
	}

	/**
	 * Removes the khaliq where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the khaliq that was removed
	 */
	@Override
	public Khaliq removeByUUID_G(String uuid, long groupId)
		throws NoSuchKhaliqException {
		Khaliq khaliq = findByUUID_G(uuid, groupId);

		return remove(khaliq);
	}

	/**
	 * Returns the number of khaliqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching khaliqs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KHALIQ_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "khaliq.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "khaliq.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(khaliq.uuid IS NULL OR khaliq.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "khaliq.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			KhaliqModelImpl.UUID_COLUMN_BITMASK |
			KhaliqModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the khaliqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching khaliqs
	 */
	@Override
	public List<Khaliq> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Khaliq> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Khaliq> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Khaliq> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Khaliq> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Khaliq> orderByComparator,
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

		List<Khaliq> list = null;

		if (retrieveFromCache) {
			list = (List<Khaliq>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Khaliq khaliq : list) {
					if (!Objects.equals(uuid, khaliq.getUuid()) ||
							(companyId != khaliq.getCompanyId())) {
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

			query.append(_SQL_SELECT_KHALIQ_WHERE);

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
				query.append(KhaliqModelImpl.ORDER_BY_JPQL);
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
					list = (List<Khaliq>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Khaliq>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khaliq
	 * @throws NoSuchKhaliqException if a matching khaliq could not be found
	 */
	@Override
	public Khaliq findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException {
		Khaliq khaliq = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (khaliq != null) {
			return khaliq;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhaliqException(msg.toString());
	}

	/**
	 * Returns the first khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Khaliq> orderByComparator) {
		List<Khaliq> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Khaliq findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException {
		Khaliq khaliq = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (khaliq != null) {
			return khaliq;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhaliqException(msg.toString());
	}

	/**
	 * Returns the last khaliq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Khaliq> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Khaliq> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Khaliq[] findByUuid_C_PrevAndNext(long khaliqId, String uuid,
		long companyId, OrderByComparator<Khaliq> orderByComparator)
		throws NoSuchKhaliqException {
		Khaliq khaliq = findByPrimaryKey(khaliqId);

		Session session = null;

		try {
			session = openSession();

			Khaliq[] array = new KhaliqImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, khaliq, uuid,
					companyId, orderByComparator, true);

			array[1] = khaliq;

			array[2] = getByUuid_C_PrevAndNext(session, khaliq, uuid,
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

	protected Khaliq getByUuid_C_PrevAndNext(Session session, Khaliq khaliq,
		String uuid, long companyId,
		OrderByComparator<Khaliq> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_KHALIQ_WHERE);

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
			query.append(KhaliqModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(khaliq);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Khaliq> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the khaliqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Khaliq khaliq : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(khaliq);
		}
	}

	/**
	 * Returns the number of khaliqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching khaliqs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KHALIQ_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "khaliq.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "khaliq.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(khaliq.uuid IS NULL OR khaliq.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "khaliq.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_KHALIQNAME = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, KhaliqImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBykhaliqName",
			new String[] { String.class.getName() },
			KhaliqModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KHALIQNAME = new FinderPath(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBykhaliqName",
			new String[] { String.class.getName() });

	/**
	 * Returns the khaliq where name = &#63; or throws a {@link NoSuchKhaliqException} if it could not be found.
	 *
	 * @param name the name
	 * @return the matching khaliq
	 * @throws NoSuchKhaliqException if a matching khaliq could not be found
	 */
	@Override
	public Khaliq findBykhaliqName(String name) throws NoSuchKhaliqException {
		Khaliq khaliq = fetchBykhaliqName(name);

		if (khaliq == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("name=");
			msg.append(name);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchKhaliqException(msg.toString());
		}

		return khaliq;
	}

	/**
	 * Returns the khaliq where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchBykhaliqName(String name) {
		return fetchBykhaliqName(name, true);
	}

	/**
	 * Returns the khaliq where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching khaliq, or <code>null</code> if a matching khaliq could not be found
	 */
	@Override
	public Khaliq fetchBykhaliqName(String name, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { name };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_KHALIQNAME,
					finderArgs, this);
		}

		if (result instanceof Khaliq) {
			Khaliq khaliq = (Khaliq)result;

			if (!Objects.equals(name, khaliq.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_KHALIQ_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_KHALIQNAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KHALIQNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_KHALIQNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				List<Khaliq> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_KHALIQNAME,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"KhaliqPersistenceImpl.fetchBykhaliqName(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Khaliq khaliq = list.get(0);

					result = khaliq;

					cacheResult(khaliq);

					if ((khaliq.getName() == null) ||
							!khaliq.getName().equals(name)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_KHALIQNAME,
							finderArgs, khaliq);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_KHALIQNAME,
					finderArgs);

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
			return (Khaliq)result;
		}
	}

	/**
	 * Removes the khaliq where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the khaliq that was removed
	 */
	@Override
	public Khaliq removeBykhaliqName(String name) throws NoSuchKhaliqException {
		Khaliq khaliq = findBykhaliqName(name);

		return remove(khaliq);
	}

	/**
	 * Returns the number of khaliqs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching khaliqs
	 */
	@Override
	public int countBykhaliqName(String name) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KHALIQNAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KHALIQ_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_KHALIQNAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KHALIQNAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_KHALIQNAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_KHALIQNAME_NAME_1 = "khaliq.name IS NULL";
	private static final String _FINDER_COLUMN_KHALIQNAME_NAME_2 = "khaliq.name = ?";
	private static final String _FINDER_COLUMN_KHALIQNAME_NAME_3 = "(khaliq.name IS NULL OR khaliq.name = '')";

	public KhaliqPersistenceImpl() {
		setModelClass(Khaliq.class);
	}

	/**
	 * Caches the khaliq in the entity cache if it is enabled.
	 *
	 * @param khaliq the khaliq
	 */
	@Override
	public void cacheResult(Khaliq khaliq) {
		entityCache.putResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqImpl.class, khaliq.getPrimaryKey(), khaliq);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { khaliq.getUuid(), khaliq.getGroupId() }, khaliq);

		finderCache.putResult(FINDER_PATH_FETCH_BY_KHALIQNAME,
			new Object[] { khaliq.getName() }, khaliq);

		khaliq.resetOriginalValues();
	}

	/**
	 * Caches the khaliqs in the entity cache if it is enabled.
	 *
	 * @param khaliqs the khaliqs
	 */
	@Override
	public void cacheResult(List<Khaliq> khaliqs) {
		for (Khaliq khaliq : khaliqs) {
			if (entityCache.getResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
						KhaliqImpl.class, khaliq.getPrimaryKey()) == null) {
				cacheResult(khaliq);
			}
			else {
				khaliq.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all khaliqs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(KhaliqImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the khaliq.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Khaliq khaliq) {
		entityCache.removeResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqImpl.class, khaliq.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((KhaliqModelImpl)khaliq);
	}

	@Override
	public void clearCache(List<Khaliq> khaliqs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Khaliq khaliq : khaliqs) {
			entityCache.removeResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
				KhaliqImpl.class, khaliq.getPrimaryKey());

			clearUniqueFindersCache((KhaliqModelImpl)khaliq);
		}
	}

	protected void cacheUniqueFindersCache(KhaliqModelImpl khaliqModelImpl,
		boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					khaliqModelImpl.getUuid(), khaliqModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				khaliqModelImpl);

			args = new Object[] { khaliqModelImpl.getName() };

			finderCache.putResult(FINDER_PATH_COUNT_BY_KHALIQNAME, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_KHALIQNAME, args,
				khaliqModelImpl);
		}
		else {
			if ((khaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						khaliqModelImpl.getUuid(), khaliqModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					khaliqModelImpl);
			}

			if ((khaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_KHALIQNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { khaliqModelImpl.getName() };

				finderCache.putResult(FINDER_PATH_COUNT_BY_KHALIQNAME, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_KHALIQNAME, args,
					khaliqModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(KhaliqModelImpl khaliqModelImpl) {
		Object[] args = new Object[] {
				khaliqModelImpl.getUuid(), khaliqModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((khaliqModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					khaliqModelImpl.getOriginalUuid(),
					khaliqModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { khaliqModelImpl.getName() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_KHALIQNAME, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_KHALIQNAME, args);

		if ((khaliqModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_KHALIQNAME.getColumnBitmask()) != 0) {
			args = new Object[] { khaliqModelImpl.getOriginalName() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KHALIQNAME, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_KHALIQNAME, args);
		}
	}

	/**
	 * Creates a new khaliq with the primary key. Does not add the khaliq to the database.
	 *
	 * @param khaliqId the primary key for the new khaliq
	 * @return the new khaliq
	 */
	@Override
	public Khaliq create(long khaliqId) {
		Khaliq khaliq = new KhaliqImpl();

		khaliq.setNew(true);
		khaliq.setPrimaryKey(khaliqId);

		String uuid = PortalUUIDUtil.generate();

		khaliq.setUuid(uuid);

		khaliq.setCompanyId(companyProvider.getCompanyId());

		return khaliq;
	}

	/**
	 * Removes the khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param khaliqId the primary key of the khaliq
	 * @return the khaliq that was removed
	 * @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	 */
	@Override
	public Khaliq remove(long khaliqId) throws NoSuchKhaliqException {
		return remove((Serializable)khaliqId);
	}

	/**
	 * Removes the khaliq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the khaliq
	 * @return the khaliq that was removed
	 * @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	 */
	@Override
	public Khaliq remove(Serializable primaryKey) throws NoSuchKhaliqException {
		Session session = null;

		try {
			session = openSession();

			Khaliq khaliq = (Khaliq)session.get(KhaliqImpl.class, primaryKey);

			if (khaliq == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhaliqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khaliq);
		}
		catch (NoSuchKhaliqException nsee) {
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
	protected Khaliq removeImpl(Khaliq khaliq) {
		khaliq = toUnwrappedModel(khaliq);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khaliq)) {
				khaliq = (Khaliq)session.get(KhaliqImpl.class,
						khaliq.getPrimaryKeyObj());
			}

			if (khaliq != null) {
				session.delete(khaliq);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khaliq != null) {
			clearCache(khaliq);
		}

		return khaliq;
	}

	@Override
	public Khaliq updateImpl(Khaliq khaliq) {
		khaliq = toUnwrappedModel(khaliq);

		boolean isNew = khaliq.isNew();

		KhaliqModelImpl khaliqModelImpl = (KhaliqModelImpl)khaliq;

		if (Validator.isNull(khaliq.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			khaliq.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (khaliq.getCreateDate() == null)) {
			if (serviceContext == null) {
				khaliq.setCreateDate(now);
			}
			else {
				khaliq.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!khaliqModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				khaliq.setModifiedDate(now);
			}
			else {
				khaliq.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (khaliq.isNew()) {
				session.save(khaliq);

				khaliq.setNew(false);
			}
			else {
				khaliq = (Khaliq)session.merge(khaliq);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KhaliqModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((khaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { khaliqModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { khaliqModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((khaliqModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						khaliqModelImpl.getOriginalUuid(),
						khaliqModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						khaliqModelImpl.getUuid(),
						khaliqModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
			KhaliqImpl.class, khaliq.getPrimaryKey(), khaliq, false);

		clearUniqueFindersCache(khaliqModelImpl);
		cacheUniqueFindersCache(khaliqModelImpl, isNew);

		khaliq.resetOriginalValues();

		return khaliq;
	}

	protected Khaliq toUnwrappedModel(Khaliq khaliq) {
		if (khaliq instanceof KhaliqImpl) {
			return khaliq;
		}

		KhaliqImpl khaliqImpl = new KhaliqImpl();

		khaliqImpl.setNew(khaliq.isNew());
		khaliqImpl.setPrimaryKey(khaliq.getPrimaryKey());

		khaliqImpl.setUuid(khaliq.getUuid());
		khaliqImpl.setKhaliqId(khaliq.getKhaliqId());
		khaliqImpl.setGroupId(khaliq.getGroupId());
		khaliqImpl.setCompanyId(khaliq.getCompanyId());
		khaliqImpl.setUserId(khaliq.getUserId());
		khaliqImpl.setUserName(khaliq.getUserName());
		khaliqImpl.setCreateDate(khaliq.getCreateDate());
		khaliqImpl.setModifiedDate(khaliq.getModifiedDate());
		khaliqImpl.setName(khaliq.getName());
		khaliqImpl.setDesignation(khaliq.getDesignation());
		khaliqImpl.setDob(khaliq.getDob());

		return khaliqImpl;
	}

	/**
	 * Returns the khaliq with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the khaliq
	 * @return the khaliq
	 * @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	 */
	@Override
	public Khaliq findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhaliqException {
		Khaliq khaliq = fetchByPrimaryKey(primaryKey);

		if (khaliq == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhaliqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khaliq;
	}

	/**
	 * Returns the khaliq with the primary key or throws a {@link NoSuchKhaliqException} if it could not be found.
	 *
	 * @param khaliqId the primary key of the khaliq
	 * @return the khaliq
	 * @throws NoSuchKhaliqException if a khaliq with the primary key could not be found
	 */
	@Override
	public Khaliq findByPrimaryKey(long khaliqId) throws NoSuchKhaliqException {
		return findByPrimaryKey((Serializable)khaliqId);
	}

	/**
	 * Returns the khaliq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the khaliq
	 * @return the khaliq, or <code>null</code> if a khaliq with the primary key could not be found
	 */
	@Override
	public Khaliq fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
				KhaliqImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Khaliq khaliq = (Khaliq)serializable;

		if (khaliq == null) {
			Session session = null;

			try {
				session = openSession();

				khaliq = (Khaliq)session.get(KhaliqImpl.class, primaryKey);

				if (khaliq != null) {
					cacheResult(khaliq);
				}
				else {
					entityCache.putResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
						KhaliqImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
					KhaliqImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khaliq;
	}

	/**
	 * Returns the khaliq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param khaliqId the primary key of the khaliq
	 * @return the khaliq, or <code>null</code> if a khaliq with the primary key could not be found
	 */
	@Override
	public Khaliq fetchByPrimaryKey(long khaliqId) {
		return fetchByPrimaryKey((Serializable)khaliqId);
	}

	@Override
	public Map<Serializable, Khaliq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Khaliq> map = new HashMap<Serializable, Khaliq>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Khaliq khaliq = fetchByPrimaryKey(primaryKey);

			if (khaliq != null) {
				map.put(primaryKey, khaliq);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
					KhaliqImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Khaliq)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_KHALIQ_WHERE_PKS_IN);

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

			for (Khaliq khaliq : (List<Khaliq>)q.list()) {
				map.put(khaliq.getPrimaryKeyObj(), khaliq);

				cacheResult(khaliq);

				uncachedPrimaryKeys.remove(khaliq.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(KhaliqModelImpl.ENTITY_CACHE_ENABLED,
					KhaliqImpl.class, primaryKey, nullModel);
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
	 * Returns all the khaliqs.
	 *
	 * @return the khaliqs
	 */
	@Override
	public List<Khaliq> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Khaliq> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Khaliq> findAll(int start, int end,
		OrderByComparator<Khaliq> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Khaliq> findAll(int start, int end,
		OrderByComparator<Khaliq> orderByComparator, boolean retrieveFromCache) {
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

		List<Khaliq> list = null;

		if (retrieveFromCache) {
			list = (List<Khaliq>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_KHALIQ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHALIQ;

				if (pagination) {
					sql = sql.concat(KhaliqModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Khaliq>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Khaliq>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the khaliqs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Khaliq khaliq : findAll()) {
			remove(khaliq);
		}
	}

	/**
	 * Returns the number of khaliqs.
	 *
	 * @return the number of khaliqs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_KHALIQ);

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
		return KhaliqModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the khaliq persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(KhaliqImpl.class.getName());
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
	private static final String _SQL_SELECT_KHALIQ = "SELECT khaliq FROM Khaliq khaliq";
	private static final String _SQL_SELECT_KHALIQ_WHERE_PKS_IN = "SELECT khaliq FROM Khaliq khaliq WHERE khaliqId IN (";
	private static final String _SQL_SELECT_KHALIQ_WHERE = "SELECT khaliq FROM Khaliq khaliq WHERE ";
	private static final String _SQL_COUNT_KHALIQ = "SELECT COUNT(khaliq) FROM Khaliq khaliq";
	private static final String _SQL_COUNT_KHALIQ_WHERE = "SELECT COUNT(khaliq) FROM Khaliq khaliq WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khaliq.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Khaliq exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Khaliq exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(KhaliqPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}