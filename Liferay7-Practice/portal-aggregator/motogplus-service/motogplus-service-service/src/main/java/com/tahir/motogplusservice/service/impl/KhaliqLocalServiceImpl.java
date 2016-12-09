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

package com.tahir.motogplusservice.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.tahir.motogplusservice.exception.NoSuchKhaliqException;
import com.tahir.motogplusservice.model.Khaliq;
import com.tahir.motogplusservice.service.KhaliqLocalServiceUtil;
import com.tahir.motogplusservice.service.base.KhaliqLocalServiceBaseImpl;
import com.tahir.motogplusservice.service.persistence.KhaliqUtil;

import java.util.Date;

/**
 * The implementation of the khaliq local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.tahir.motogplusservice.service.KhaliqLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author TahirNoor
 * @see KhaliqLocalServiceBaseImpl
 * @see com.tahir.motogplusservice.service.KhaliqLocalServiceUtil
 */
@ProviderType
public class KhaliqLocalServiceImpl extends KhaliqLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.tahir.motogplusservice.service.KhaliqLocalServiceUtil} to access the khaliq local service.
	 */
    public Khaliq addInToKhaliq(String name, String designation, Date birthday,
                         String comment) {
        long khaliqId = counterLocalService.increment();
        Khaliq khaliq = khaliqPersistence.create(khaliqId);
        khaliq.setName(name);
        khaliq.setDesignation(designation);
        khaliq.setDob(birthday);
        return  KhaliqLocalServiceUtil.addKhaliq(khaliq);

    }
    public Khaliq getKhaliqByName(String name)throws NoSuchKhaliqException{
        return KhaliqUtil.findBykhaliqName(name);
    }
}