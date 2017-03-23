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


import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.tahir.liferaypractice.service.TestServiceModuleLocalServiceUtil;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;




/**
 * @author Liferay
 */
@Component(
		property = {
                "javax.portlet.name=com_liferay_login_web_portlet_LoginPortlet",
				"mvc.command.name=/login/login",
                "service.ranking:Integer=1000"
		},
		service = MVCActionCommand.class)
public class BladePortletAction extends BaseMVCActionCommand {


    @Reference(target = "(&(mvc.command.name=/login/login)" +
                        "(javax.portlet.name=com_liferay_login_web_portlet_LoginPortlet)"+
                        "(component.name=com.liferay.login.web.internal.portlet.action.LoginMVCActionCommand))")


     protected MVCActionCommand mvcActionCommand;

    @Override
    protected void doProcessAction(
            ActionRequest actionRequest, ActionResponse actionResponse)
            throws Exception {
        String url = "http://www.google.com/search?q=httpClient";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

        System.out.println(">>>>>>>>>>>>>>>>>>>OVERRIDING MVCACTIONCOMMAND<<<<<<<<<<<<<<<<<<<<<< "+TestServiceModuleLocalServiceUtil.getTestServiceModulesCount());
        mvcActionCommand.processAction(actionRequest,actionResponse);
        //actionResponse.sendRedirect("/web/guest/home");
        //https://www.mkyong.com/java/apache-httpclient-examples/
    }

}
