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

package com.tahir.liferaypractice.service.persistence.test;

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

import com.tahir.liferaypractice.exception.NoSuchTestServiceModuleException;
import com.tahir.liferaypractice.model.TestServiceModule;
import com.tahir.liferaypractice.service.TestServiceModuleLocalServiceUtil;
import com.tahir.liferaypractice.service.persistence.TestServiceModulePersistence;
import com.tahir.liferaypractice.service.persistence.TestServiceModuleUtil;

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
public class TestServiceModulePersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = TestServiceModuleUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<TestServiceModule> iterator = _testServiceModules.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TestServiceModule testServiceModule = _persistence.create(pk);

		Assert.assertNotNull(testServiceModule);

		Assert.assertEquals(testServiceModule.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		_persistence.remove(newTestServiceModule);

		TestServiceModule existingTestServiceModule = _persistence.fetchByPrimaryKey(newTestServiceModule.getPrimaryKey());

		Assert.assertNull(existingTestServiceModule);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addTestServiceModule();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TestServiceModule newTestServiceModule = _persistence.create(pk);

		newTestServiceModule.setUuid(RandomTestUtil.randomString());

		newTestServiceModule.setGroupId(RandomTestUtil.nextLong());

		newTestServiceModule.setCompanyId(RandomTestUtil.nextLong());

		newTestServiceModule.setUserId(RandomTestUtil.nextLong());

		newTestServiceModule.setUserName(RandomTestUtil.randomString());

		newTestServiceModule.setCreateDate(RandomTestUtil.nextDate());

		newTestServiceModule.setModifiedDate(RandomTestUtil.nextDate());

		newTestServiceModule.setName(RandomTestUtil.randomString());

		newTestServiceModule.setAge(RandomTestUtil.nextInt());

		newTestServiceModule.setProfession(RandomTestUtil.randomString());

		newTestServiceModule.setDob(RandomTestUtil.nextDate());

		_testServiceModules.add(_persistence.update(newTestServiceModule));

		TestServiceModule existingTestServiceModule = _persistence.findByPrimaryKey(newTestServiceModule.getPrimaryKey());

		Assert.assertEquals(existingTestServiceModule.getUuid(),
			newTestServiceModule.getUuid());
		Assert.assertEquals(existingTestServiceModule.getTestServiceModuleId(),
			newTestServiceModule.getTestServiceModuleId());
		Assert.assertEquals(existingTestServiceModule.getGroupId(),
			newTestServiceModule.getGroupId());
		Assert.assertEquals(existingTestServiceModule.getCompanyId(),
			newTestServiceModule.getCompanyId());
		Assert.assertEquals(existingTestServiceModule.getUserId(),
			newTestServiceModule.getUserId());
		Assert.assertEquals(existingTestServiceModule.getUserName(),
			newTestServiceModule.getUserName());
		Assert.assertEquals(Time.getShortTimestamp(
				existingTestServiceModule.getCreateDate()),
			Time.getShortTimestamp(newTestServiceModule.getCreateDate()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingTestServiceModule.getModifiedDate()),
			Time.getShortTimestamp(newTestServiceModule.getModifiedDate()));
		Assert.assertEquals(existingTestServiceModule.getName(),
			newTestServiceModule.getName());
		Assert.assertEquals(existingTestServiceModule.getAge(),
			newTestServiceModule.getAge());
		Assert.assertEquals(existingTestServiceModule.getProfession(),
			newTestServiceModule.getProfession());
		Assert.assertEquals(Time.getShortTimestamp(
				existingTestServiceModule.getDob()),
			Time.getShortTimestamp(newTestServiceModule.getDob()));
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
		TestServiceModule newTestServiceModule = addTestServiceModule();

		TestServiceModule existingTestServiceModule = _persistence.findByPrimaryKey(newTestServiceModule.getPrimaryKey());

		Assert.assertEquals(existingTestServiceModule, newTestServiceModule);
	}

	@Test(expected = NoSuchTestServiceModuleException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<TestServiceModule> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("NC__TestServiceModule",
			"uuid", true, "testServiceModuleId", true, "groupId", true,
			"companyId", true, "userId", true, "userName", true, "createDate",
			true, "modifiedDate", true, "name", true, "age", true,
			"profession", true, "dob", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		TestServiceModule existingTestServiceModule = _persistence.fetchByPrimaryKey(newTestServiceModule.getPrimaryKey());

		Assert.assertEquals(existingTestServiceModule, newTestServiceModule);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TestServiceModule missingTestServiceModule = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingTestServiceModule);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		TestServiceModule newTestServiceModule1 = addTestServiceModule();
		TestServiceModule newTestServiceModule2 = addTestServiceModule();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTestServiceModule1.getPrimaryKey());
		primaryKeys.add(newTestServiceModule2.getPrimaryKey());

		Map<Serializable, TestServiceModule> testServiceModules = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, testServiceModules.size());
		Assert.assertEquals(newTestServiceModule1,
			testServiceModules.get(newTestServiceModule1.getPrimaryKey()));
		Assert.assertEquals(newTestServiceModule2,
			testServiceModules.get(newTestServiceModule2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, TestServiceModule> testServiceModules = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(testServiceModules.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTestServiceModule.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, TestServiceModule> testServiceModules = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, testServiceModules.size());
		Assert.assertEquals(newTestServiceModule,
			testServiceModules.get(newTestServiceModule.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, TestServiceModule> testServiceModules = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(testServiceModules.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTestServiceModule.getPrimaryKey());

		Map<Serializable, TestServiceModule> testServiceModules = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, testServiceModules.size());
		Assert.assertEquals(newTestServiceModule,
			testServiceModules.get(newTestServiceModule.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = TestServiceModuleLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<TestServiceModule>() {
				@Override
				public void performAction(TestServiceModule testServiceModule) {
					Assert.assertNotNull(testServiceModule);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(TestServiceModule.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("testServiceModuleId",
				newTestServiceModule.getTestServiceModuleId()));

		List<TestServiceModule> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		TestServiceModule existingTestServiceModule = result.get(0);

		Assert.assertEquals(existingTestServiceModule, newTestServiceModule);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(TestServiceModule.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("testServiceModuleId",
				RandomTestUtil.nextLong()));

		List<TestServiceModule> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(TestServiceModule.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"testServiceModuleId"));

		Object newTestServiceModuleId = newTestServiceModule.getTestServiceModuleId();

		dynamicQuery.add(RestrictionsFactoryUtil.in("testServiceModuleId",
				new Object[] { newTestServiceModuleId }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingTestServiceModuleId = result.get(0);

		Assert.assertEquals(existingTestServiceModuleId, newTestServiceModuleId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(TestServiceModule.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"testServiceModuleId"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("testServiceModuleId",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		TestServiceModule newTestServiceModule = addTestServiceModule();

		_persistence.clearCache();

		TestServiceModule existingTestServiceModule = _persistence.findByPrimaryKey(newTestServiceModule.getPrimaryKey());

		Assert.assertTrue(Validator.equals(
				existingTestServiceModule.getUuid(),
				ReflectionTestUtil.invoke(existingTestServiceModule,
					"getOriginalUuid", new Class<?>[0])));
		Assert.assertEquals(Long.valueOf(existingTestServiceModule.getGroupId()),
			ReflectionTestUtil.<Long>invoke(existingTestServiceModule,
				"getOriginalGroupId", new Class<?>[0]));
	}

	protected TestServiceModule addTestServiceModule()
		throws Exception {
		long pk = RandomTestUtil.nextLong();

		TestServiceModule testServiceModule = _persistence.create(pk);

		testServiceModule.setUuid(RandomTestUtil.randomString());

		testServiceModule.setGroupId(RandomTestUtil.nextLong());

		testServiceModule.setCompanyId(RandomTestUtil.nextLong());

		testServiceModule.setUserId(RandomTestUtil.nextLong());

		testServiceModule.setUserName(RandomTestUtil.randomString());

		testServiceModule.setCreateDate(RandomTestUtil.nextDate());

		testServiceModule.setModifiedDate(RandomTestUtil.nextDate());

		testServiceModule.setName(RandomTestUtil.randomString());

		testServiceModule.setAge(RandomTestUtil.nextInt());

		testServiceModule.setProfession(RandomTestUtil.randomString());

		testServiceModule.setDob(RandomTestUtil.nextDate());

		_testServiceModules.add(_persistence.update(testServiceModule));

		return testServiceModule;
	}

	private List<TestServiceModule> _testServiceModules = new ArrayList<TestServiceModule>();
	private TestServiceModulePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}