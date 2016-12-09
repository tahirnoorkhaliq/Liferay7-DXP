package com.tahir.action;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
@Component(
		property = {
			"javax.portlet.name=OSGITestPortlet",
			"mvc.command.name=/test/Captcha"
		},
		service = MVCResourceCommand.class
	)
public class TestCaptcha implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("Captcha Captcha Captcha");
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);

			return false;
		}
		catch (Exception e) {
		e.printStackTrace();
			return true;
		}
	}

}
