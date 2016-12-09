package com.tahir.motog.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.tahir.motogplusservice.model.Khaliq;
import com.tahir.motogplusservice.service.KhaliqLocalService;
import com.tahir.motogplusservice.service.KhaliqLocalServiceUtil;
import com.tahir.motogplusservice.service.persistence.KhaliqPersistence;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.Date;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=motog-test Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MotoGPlusPortlet extends MVCPortlet {

	private KhaliqLocalService khaliqLocalService;
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		KhaliqLocalServiceUtil.addInToKhaliq("Ayesh","AP",new Date(),"He is Gud");
		khaliqLocalService.addInToKhaliq("tahirnoor","SE",new Date(),"He is Gud");
		super.doView(renderRequest, renderResponse);
	}
	@Reference
	public void setMvcActionCommand(KhaliqLocalService khaliqLocalService) {
		      this.khaliqLocalService = khaliqLocalService;
	}
}