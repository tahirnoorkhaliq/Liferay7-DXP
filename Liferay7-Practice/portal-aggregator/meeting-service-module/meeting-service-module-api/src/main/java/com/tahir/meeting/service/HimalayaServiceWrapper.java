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

package com.tahir.meeting.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HimalayaService}.
 *
 * @author Tahir Noor
 * @see HimalayaService
 * @generated
 */
@ProviderType
public class HimalayaServiceWrapper implements HimalayaService,
	ServiceWrapper<HimalayaService> {
	public HimalayaServiceWrapper(HimalayaService himalayaService) {
		_himalayaService = himalayaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _himalayaService.getOSGiServiceIdentifier();
	}

	@Override
	public HimalayaService getWrappedService() {
		return _himalayaService;
	}

	@Override
	public void setWrappedService(HimalayaService himalayaService) {
		_himalayaService = himalayaService;
	}

	private HimalayaService _himalayaService;
}