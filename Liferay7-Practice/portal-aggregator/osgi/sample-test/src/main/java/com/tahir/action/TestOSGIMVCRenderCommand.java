package com.tahir.action;

import javax.portlet.PortletException;


import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;


@Component(
		property = {
			"javax.portlet.name=OSGITestPortlet",
			"mvc.command.name=/tahir/test"
		},
		service = MVCRenderCommand.class
	)

public class TestOSGIMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		System.out.println("MVCRenderCommand");
		return "/views/render.jsp";
	}

}
