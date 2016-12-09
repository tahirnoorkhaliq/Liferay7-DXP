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

package com.tahir.motogplusservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Khaliq service. Represents a row in the &quot;moto_Khaliq&quot; database table, with each column mapped to a property of this class.
 *
 * @author TahirNoor
 * @see KhaliqModel
 * @see com.tahir.motogplusservice.model.impl.KhaliqImpl
 * @see com.tahir.motogplusservice.model.impl.KhaliqModelImpl
 * @generated
 */
@ImplementationClassName("com.tahir.motogplusservice.model.impl.KhaliqImpl")
@ProviderType
public interface Khaliq extends KhaliqModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.tahir.motogplusservice.model.impl.KhaliqImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Khaliq, Long> KHALIQ_ID_ACCESSOR = new Accessor<Khaliq, Long>() {
			@Override
			public Long get(Khaliq khaliq) {
				return khaliq.getKhaliqId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Khaliq> getTypeClass() {
				return Khaliq.class;
			}
		};
}