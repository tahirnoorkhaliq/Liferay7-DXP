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

package com.tahir.meeting.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.TransactionalTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;

import com.tahir.meeting.exception.NoSuchHimalayaException;
import com.tahir.meeting.model.Himalaya;
import com.tahir.meeting.service.HimalayaLocalServiceUtil;
import com.tahir.meeting.service.persistence.HimalayaPersistence;
import com.tahir.meeting.service.persistence.HimalayaUtil;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.junit.runner.RunWith;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class HimalayaPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = HimalayaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Himalaya> iterator = _himalayas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Himalaya himalaya = _persistence.create(pk);

		Assert.assertNotNull(himalaya);

		Assert.assertEquals(himalaya.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Himalaya newHimalaya = addHimalaya();

		_persistence.remove(newHimalaya);

		Himalaya existingHimalaya = _persistence.fetchByPrimaryKey(newHimalaya.getPrimaryKey());

		Assert.assertNull(existingHimalaya);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addHimalaya();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Himalaya newHimalaya = _persistence.create(pk);

		newHimalaya.setUuid(RandomTestUtil.randomString());

		newHimalaya.setGroupId(RandomTestUtil.nextLong());

		newHimalaya.setCompanyId(RandomTestUtil.nextLong());

		newHimalaya.setUserId(RandomTestUtil.nextLong());

		newHimalaya.setUserName(RandomTestUtil.randomString());

		newHimalaya.setCreateDate(RandomTestUtil.nextDate());

		newHimalaya.setModifiedDate(RandomTestUtil.nextDate());

		newHimalaya.setName(RandomTestUtil.randomString());

		newHimalaya.setDesignation(RandomTestUtil.randomString());

		newHimalaya.setComapany(RandomTestUtil.randomString());

		newHimalaya.setDob(RandomTestUtil.nextDate());

		newHimalaya.setDoj(RandomTestUtil.nextDate());

		_himalayas.add(_persistence.update(newHimalaya));

		Himalaya existingHimalaya = _persistence.findByPrimaryKey(newHimalaya.getPrimaryKey());

		Assert.assertEquals(existingHimalaya.getUuid(), newHimalaya.getUuid());
		Assert.assertEquals(existingHimalaya.getHimalayaId(),
			newHimalaya.getHimalayaId());
		Assert.assertEquals(existingHimalaya.getGroupId(),
			newHimalaya.getGroupId());
		Assert.assertEquals(existingHimalaya.getCompanyId(),
			newHimalaya.getCompanyId());
		Assert.assertEquals(existingHimalaya.getUserId(),
			newHimalaya.getUserId());
		Assert.assertEquals(existingHimalaya.getUserName(),
			newHimalaya.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingHimalaya.getCreateDate()),
			Time.getShortTimestamp(newHimalaya.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingHimalaya.getModifiedDate()),
			Time.getShortTimestamp(newHimalaya.getModifiedDate()));
		Assert.assertEquals(existingHimalaya.getName(), newHimalaya.getName());
		Assert.assertEquals(existingHimalaya.getDesignation(),
			newHimalaya.getDesignation());
		Assert.assertEquals(existingHimalaya.getComapany(),
			newHimalaya.getComapany());
		Assert.assertEquals(Time.getShortTimestamp(existingHimalaya.getDob()),
			Time.getShortTimestamp(newHimalaya.getDob()));
		Assert.assertEquals(Time.getShortTimestamp(existingHimalaya.getDoj()),
			Time.getShortTimestamp(newHimalaya.getDoj()));
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid(StringPool.BLANK);

		_persistence.countByUuid(StringPool.NULL);

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G(StringPool.BLANK, RandomTestUtil.nextLong());

		_persistence.countByUUID_G(StringPool.NULL, 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C(StringPool.BLANK, RandomTestUtil.nextLong());

		_persistence.countByUuid_C(StringPool.NULL, 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Himalaya newHimalaya = addHimalaya();

		Himalaya existingHimalaya = _persistence.findByPrimaryKey(newHimalaya.getPrimaryKey());

		Assert.assertEquals(existingHimalaya, newHimalaya);
	}

	@Test(expected = NoSuchHimalayaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Himalaya> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("meeting_Himalaya", "uuid",
			true, "himalayaId", true, "groupId", true, "companyId", true,
			"userId", true, "userName", true, "createDate", true,
			"modifiedDate", true, "name", true, "designation", true,
			"comapany", true, "dob", true, "doj", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Himalaya newHimalaya = addHimalaya();

		Himalaya existingHimalaya = _persistence.fetchByPrimaryKey(newHimalaya.getPrimaryKey());

		Assert.assertEquals(existingHimalaya, newHimalaya);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Himalaya missingHimalaya = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingHimalaya);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Himalaya newHimalaya1 = addHimalaya();
		Himalaya newHimalaya2 = addHimalaya();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newHimalaya1.getPrimaryKey());
		primaryKeys.add(newHimalaya2.getPrimaryKey());

		Map<Serializable, Himalaya> himalayas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, himalayas.size());
		Assert.assertEquals(newHimalaya1,
			himalayas.get(newHimalaya1.getPrimaryKey()));
		Assert.assertEquals(newHimalaya2,
			himalayas.get(newHimalaya2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Himalaya> himalayas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(himalayas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Himalaya newHimalaya = addHimalaya();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newHimalaya.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Himalaya> himalayas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, himalayas.size());
		Assert.assertEquals(newHimalaya,
			himalayas.get(newHimalaya.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Himalaya> himalayas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(himalayas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Himalaya newHimalaya = addHimalaya();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newHimalaya.getPrimaryKey());

		Map<Serializable, Himalaya> himalayas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, himalayas.size());
		Assert.assertEquals(newHimalaya,
			himalayas.get(newHimalaya.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = HimalayaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Himalaya>() {
				@Override
				public void performAction(Himalaya himalaya) {
					Assert.assertNotNull(himalaya);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Himalaya newHimalaya = addHimalaya();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Himalaya.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("himalayaId",
				newHimalaya.getHimalayaId()));

		List<Himalaya> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Himalaya existingHimalaya = result.get(0);

		Assert.assertEquals(existingHimalaya, newHimalaya);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Himalaya.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("himalayaId",
				RandomTestUtil.nextLong()));

		List<Himalaya> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Himalaya newHimalaya = addHimalaya();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Himalaya.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("himalayaId"));

		Object newHimalayaId = newHimalaya.getHimalayaId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("himalayaId",
				new Object[] { newHimalayaId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingHimalayaId = result.get(0);

		Assert.assertEquals(existingHimalayaId, newHimalayaId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Himalaya.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("himalayaId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("himalayaId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Himalaya newHimalaya = addHimalaya();

		_persistence.clearCache();

		Himalaya existingHimalaya = _persistence.findByPrimaryKey(newHimalaya.getPrimaryKey());

		Assert.assertTrue(Validator.equals(existingHimalaya.getUuid(),
				ReflectionTestUtil.invoke(existingHimalaya, "getOriginalUuid",
					new Class<?>[0])));
		Assert.assertEquals(Long.valueOf(existingHimalaya.getGroupId()),
			ReflectionTestUtil.<Long>invoke(existingHimalaya,
				"getOriginalGroupId", new Class<?>[0]));
	}

	protected Himalaya addHimalaya() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Himalaya himalaya = _persistence.create(pk);

		himalaya.setUuid(RandomTestUtil.randomString());

		himalaya.setGroupId(RandomTestUtil.nextLong());

		himalaya.setCompanyId(RandomTestUtil.nextLong());

		himalaya.setUserId(RandomTestUtil.nextLong());

		himalaya.setUserName(RandomTestUtil.randomString());

		himalaya.setCreateDate(RandomTestUtil.nextDate());

		himalaya.setModifiedDate(RandomTestUtil.nextDate());

		himalaya.setName(RandomTestUtil.randomString());

		himalaya.setDesignation(RandomTestUtil.randomString());

		himalaya.setComapany(RandomTestUtil.randomString());

		himalaya.setDob(RandomTestUtil.nextDate());

		himalaya.setDoj(RandomTestUtil.nextDate());

		_himalayas.add(_persistence.update(himalaya));

		return himalaya;
	}

	private List<Himalaya> _himalayas = new ArrayList<Himalaya>();
	private HimalayaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}