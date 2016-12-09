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

package com.liferay.blade.samples.strutsportletaction;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;

import com.tahir.liferaypractice.service.TestServiceModuleLocalServiceUtil;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


import java.util.Date;

/**
 * @author Liferay
 */
@Component(
		property = {
                "javax.portlet.name=" +  "com_liferay_login_web_portlet_LoginPortlet",
				"mvc.command.name=/login/login",
                "service.ranking:Integer=100"
		},
		service = MVCActionCommand.class)
public class BladePortletAction extends BaseMVCActionCommand {


    @Reference(target = "(&(mvc.command.name=/login/login)" +"(javax.portlet.name=com_liferay_login_web_portlet_LoginPortlet))")
     protected MVCActionCommand mvcActionCommand;

    @Override
    protected void doProcessAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>>>OVERRIDING MVCACTIONCOMMAND<<<<<<<<<<<<<<<<<<<<<< "+TestServiceModuleLocalServiceUtil.getTestServiceModulesCount());
        mvcActionCommand.processAction(actionRequest,actionResponse);
    }

}