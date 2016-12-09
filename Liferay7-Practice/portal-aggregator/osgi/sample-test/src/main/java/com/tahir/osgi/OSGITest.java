package com.tahir.osgi;


import java.io.IOException;
import java.util.HashMap;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=OSGITestPortlet",
			"com.liferay.portlet.display-category=category.tahir",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=sample-test Portlet",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/views/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"com.liferay.portlet.requires-namespaced-parameters=false"
		},
		service = Portlet.class
	)
public class OSGITest extends MVCPortlet {	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		renderRequest.setAttribute("customer", "tahir");
        System.out.println(">>>>>>>>>>>>>>>>>>>OSGITest<<<<<<<<<<<<<<<<<<<<<< ");
		super.doView(renderRequest, renderResponse);
	}	
}
