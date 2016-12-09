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

package com.tahir.liferaypractice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TestServiceModule service. Represents a row in the &quot;NC__TestServiceModule&quot; database table, with each column mapped to a property of this class.
 *
 * @author Tahir
 * @see TestServiceModuleModel
 * @see com.tahir.liferaypractice.model.impl.TestServiceModuleImpl
 * @see com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl
 * @generated
 */
@ImplementationClassName("com.tahir.liferaypractice.model.impl.TestServiceModuleImpl")
@ProviderType
public interface TestServiceModule extends TestServiceModuleModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.tahir.liferaypractice.model.impl.TestServiceModuleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TestServiceModule, Long> TEST_SERVICE_MODULE_ID_ACCESSOR =
		new Accessor<TestServiceModule, Long>() {
			@Override
			public Long get(TestServiceModule testServiceModule) {
				return testServiceModule.getTestServiceModuleId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TestServiceModule> getTypeClass() {
				return TestServiceModule.class;
			}
		};
}