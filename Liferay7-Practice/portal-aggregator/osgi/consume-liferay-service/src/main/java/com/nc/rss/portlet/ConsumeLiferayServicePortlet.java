package com.nc.rss.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;


import com.tahir.liferaypractice.service.TestServiceModuleLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.tahir",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=consume-liferay-service Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/jsp/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ConsumeLiferayServicePortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("Do view Method + " +_testServiceModuleLocalService.getTestServiceModulesCount());
		//System.out.println("liferayServiceTestLocalService : count : "+liferayServiceTestLocalService.getLiferayServiceTestsCount());
		super.doView(renderRequest, renderResponse);
	}

	@Reference
	private TestServiceModuleLocalService _testServiceModuleLocalService;


	/*@Reference
	private
*/

}