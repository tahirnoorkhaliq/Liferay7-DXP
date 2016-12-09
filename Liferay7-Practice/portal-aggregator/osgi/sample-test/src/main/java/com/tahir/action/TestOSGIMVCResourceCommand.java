package com.tahir.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
@Component(
		property = {
			"javax.portlet.name=OSGITestPortlet",
			"mvc.command.name=/test/osgi"
		},
		service = MVCResourceCommand.class
	)
public class TestOSGIMVCResourceCommand  implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(TestOSGIMVCResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("ajax");
		_log.info("Ajax");
		resourceResponse.setContentType("text/html");
		PrintWriter out;
		try {
		out = resourceResponse.getWriter();		
		out.println("AUI Ajax call is performed");
		out.flush();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		return true;
	}

}
