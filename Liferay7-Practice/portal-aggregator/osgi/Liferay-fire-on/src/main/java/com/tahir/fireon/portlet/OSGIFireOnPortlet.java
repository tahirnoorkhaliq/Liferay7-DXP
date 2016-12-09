package com.tahir.fireon.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.tahir",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Liferay-fire-on Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OSGIFireOnPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(OSGIFireOnPortlet.class.getName());
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		System.out.println("ajax");
		List<com.liferay.portal.kernel.model.Portlet> portletList = PortletLocalServiceUtil.getPortlets(0, 100);
		for (com.liferay.portal.kernel.model.Portlet portlet : portletList) {
			System.out.println("++++++ "+portlet.getDisplayName()); 
		}
		List<com.liferay.portal.kernel.model.Portlet> portletLt=PortletLocalServiceUtil.getPortlets(themeDisplay.getCompanyId());
		for (com.liferay.portal.kernel.model.Portlet portlet : portletLt) {
			System.out.println(">>> "+portlet.getDisplayName());
		}
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
		//super.serveResource(resourceRequest, resourceResponse);
	}
}