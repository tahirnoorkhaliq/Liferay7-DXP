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

package com.tahir.motogplusservice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KhaliqService}.
 *
 * @author TahirNoor
 * @see KhaliqService
 * @generated
 */
@ProviderType
public class KhaliqServiceWrapper implements KhaliqService,
	ServiceWrapper<KhaliqService> {
	public KhaliqServiceWrapper(KhaliqService khaliqService) {
		_khaliqService = khaliqService;
	}

	@Override
	public com.tahir.motogplusservice.model.Khaliq getKhaliqByName(
		java.lang.String name)
		throws com.tahir.motogplusservice.exception.NoSuchKhaliqException {
		return _khaliqService.getKhaliqByName(name);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _khaliqService.getOSGiServiceIdentifier();
	}

	@Override
	public KhaliqService getWrappedService() {
		return _khaliqService;
	}

	@Override
	public void setWrappedService(KhaliqService khaliqService) {
		_khaliqService = khaliqService;
	}

	private KhaliqService _khaliqService;
}