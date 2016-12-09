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

package com.tahir.motogplusservice.service.persistence.test;

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
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;

import com.tahir.motogplusservice.exception.NoSuchKhaliqException;
import com.tahir.motogplusservice.model.Khaliq;
import com.tahir.motogplusservice.service.KhaliqLocalServiceUtil;
import com.tahir.motogplusservice.service.persistence.KhaliqPersistence;
import com.tahir.motogplusservice.service.persistence.KhaliqUtil;

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
import java.util.Objects;
import java.util.Set;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class KhaliqPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = KhaliqUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Khaliq> iterator = _khaliqs.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Khaliq khaliq = _persistence.create(pk);

		Assert.assertNotNull(khaliq);

		Assert.assertEquals(khaliq.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Khaliq newKhaliq = addKhaliq();

		_persistence.remove(newKhaliq);

		Khaliq existingKhaliq = _persistence.fetchByPrimaryKey(newKhaliq.getPrimaryKey());

		Assert.assertNull(existingKhaliq);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addKhaliq();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Khaliq newKhaliq = _persistence.create(pk);

		newKhaliq.setUuid(RandomTestUtil.randomString());

		newKhaliq.setGroupId(RandomTestUtil.nextLong());

		newKhaliq.setCompanyId(RandomTestUtil.nextLong());

		newKhaliq.setUserId(RandomTestUtil.nextLong());

		newKhaliq.setUserName(RandomTestUtil.randomString());

		newKhaliq.setCreateDate(RandomTestUtil.nextDate());

		newKhaliq.setModifiedDate(RandomTestUtil.nextDate());

		newKhaliq.setName(RandomTestUtil.randomString());

		newKhaliq.setDesignation(RandomTestUtil.randomString());

		newKhaliq.setDob(RandomTestUtil.nextDate());

		_khaliqs.add(_persistence.update(newKhaliq));

		Khaliq existingKhaliq = _persistence.findByPrimaryKey(newKhaliq.getPrimaryKey());

		Assert.assertEquals(existingKhaliq.getUuid(), newKhaliq.getUuid());
		Assert.assertEquals(existingKhaliq.getKhaliqId(),
			newKhaliq.getKhaliqId());
		Assert.assertEquals(existingKhaliq.getGroupId(), newKhaliq.getGroupId());
		Assert.assertEquals(existingKhaliq.getCompanyId(),
			newKhaliq.getCompanyId());
		Assert.assertEquals(existingKhaliq.getUserId(), newKhaliq.getUserId());
		Assert.assertEquals(existingKhaliq.getUserName(),
			newKhaliq.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingKhaliq.getCreateDate()),
			Time.getShortTimestamp(newKhaliq.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingKhaliq.getModifiedDate()),
			Time.getShortTimestamp(newKhaliq.getModifiedDate()));
		Assert.assertEquals(existingKhaliq.getName(), newKhaliq.getName());
		Assert.assertEquals(existingKhaliq.getDesignation(),
			newKhaliq.getDesignation());
		Assert.assertEquals(Time.getShortTimestamp(existingKhaliq.getDob()),
			Time.getShortTimestamp(newKhaliq.getDob()));
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
	public void testCountBykhaliqName() throws Exception {
		_persistence.countBykhaliqName(StringPool.BLANK);

		_persistence.countBykhaliqName(StringPool.NULL);

		_persistence.countBykhaliqName((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Khaliq newKhaliq = addKhaliq();

		Khaliq existingKhaliq = _persistence.findByPrimaryKey(newKhaliq.getPrimaryKey());

		Assert.assertEquals(existingKhaliq, newKhaliq);
	}

	@Test(expected = NoSuchKhaliqException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Khaliq> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("moto_Khaliq", "uuid", true,
			"khaliqId", true, "groupId", true, "companyId", true, "userId",
			true, "userName", true, "createDate", true, "modifiedDate", true,
			"name", true, "designation", true, "dob", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Khaliq newKhaliq = addKhaliq();

		Khaliq existingKhaliq = _persistence.fetchByPrimaryKey(newKhaliq.getPrimaryKey());

		Assert.assertEquals(existingKhaliq, newKhaliq);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Khaliq missingKhaliq = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingKhaliq);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Khaliq newKhaliq1 = addKhaliq();
		Khaliq newKhaliq2 = addKhaliq();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newKhaliq1.getPrimaryKey());
		primaryKeys.add(newKhaliq2.getPrimaryKey());

		Map<Serializable, Khaliq> khaliqs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, khaliqs.size());
		Assert.assertEquals(newKhaliq1, khaliqs.get(newKhaliq1.getPrimaryKey()));
		Assert.assertEquals(newKhaliq2, khaliqs.get(newKhaliq2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Khaliq> khaliqs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(khaliqs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Khaliq newKhaliq = addKhaliq();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newKhaliq.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Khaliq> khaliqs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, khaliqs.size());
		Assert.assertEquals(newKhaliq, khaliqs.get(newKhaliq.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Khaliq> khaliqs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(khaliqs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Khaliq newKhaliq = addKhaliq();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newKhaliq.getPrimaryKey());

		Map<Serializable, Khaliq> khaliqs = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, khaliqs.size());
		Assert.assertEquals(newKhaliq, khaliqs.get(newKhaliq.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = KhaliqLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Khaliq>() {
				@Override
				public void performAction(Khaliq khaliq) {
					Assert.assertNotNull(khaliq);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Khaliq newKhaliq = addKhaliq();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Khaliq.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("khaliqId",
				newKhaliq.getKhaliqId()));

		List<Khaliq> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Khaliq existingKhaliq = result.get(0);

		Assert.assertEquals(existingKhaliq, newKhaliq);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Khaliq.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("khaliqId",
				RandomTestUtil.nextLong()));

		List<Khaliq> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Khaliq newKhaliq = addKhaliq();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Khaliq.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("khaliqId"));

		Object newKhaliqId = newKhaliq.getKhaliqId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("khaliqId",
				new Object[] { newKhaliqId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingKhaliqId = result.get(0);

		Assert.assertEquals(existingKhaliqId, newKhaliqId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Khaliq.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("khaliqId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("khaliqId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Khaliq newKhaliq = addKhaliq();

		_persistence.clearCache();

		Khaliq existingKhaliq = _persistence.findByPrimaryKey(newKhaliq.getPrimaryKey());

		Assert.assertTrue(Objects.equals(existingKhaliq.getUuid(),
				ReflectionTestUtil.invoke(existingKhaliq, "getOriginalUuid",
					new Class<?>[0])));
		Assert.assertEquals(Long.valueOf(existingKhaliq.getGroupId()),
			ReflectionTestUtil.<Long>invoke(existingKhaliq,
				"getOriginalGroupId", new Class<?>[0]));

		Assert.assertTrue(Objects.equals(existingKhaliq.getName(),
				ReflectionTestUtil.invoke(existingKhaliq, "getOriginalName",
					new Class<?>[0])));
	}

	protected Khaliq addKhaliq() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Khaliq khaliq = _persistence.create(pk);

		khaliq.setUuid(RandomTestUtil.randomString());

		khaliq.setGroupId(RandomTestUtil.nextLong());

		khaliq.setCompanyId(RandomTestUtil.nextLong());

		khaliq.setUserId(RandomTestUtil.nextLong());

		khaliq.setUserName(RandomTestUtil.randomString());

		khaliq.setCreateDate(RandomTestUtil.nextDate());

		khaliq.setModifiedDate(RandomTestUtil.nextDate());

		khaliq.setName(RandomTestUtil.randomString());

		khaliq.setDesignation(RandomTestUtil.randomString());

		khaliq.setDob(RandomTestUtil.nextDate());

		_khaliqs.add(_persistence.update(khaliq));

		return khaliq;
	}

	private List<Khaliq> _khaliqs = new ArrayList<Khaliq>();
	private KhaliqPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}