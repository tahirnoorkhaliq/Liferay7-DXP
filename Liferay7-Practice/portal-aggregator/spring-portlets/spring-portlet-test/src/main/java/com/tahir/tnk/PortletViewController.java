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

package com.tahir.tnk;

import com.liferay.portal.kernel.util.ReleaseInfo;

import com.tahir.motogplusservice.model.Khaliq;
import com.tahir.motogplusservice.service.KhaliqLocalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
@RequestMapping("VIEW")
public class PortletViewController {

	MotoGKhaliqServiceTracker khaliqServiceTracker=null;
	@PostConstruct
	public void init() {
		 khaliqServiceTracker = new MotoGKhaliqServiceTracker(this);
		khaliqServiceTracker.open();
	}

	@RenderMapping
	public String question(Model model) {

		if (!khaliqServiceTracker.isEmpty()) {
			KhaliqLocalService khaliqLocalService= khaliqServiceTracker.getService();
			Khaliq khaliq=khaliqLocalService.addInToKhaliq("tash","SE",null,"goood");
			System.out.println(khaliq.getName());
		}
		return "spring-portlet-test/view";
	}
	@PreDestroy
	public void destroy() {
		khaliqServiceTracker.close();
	}
}
