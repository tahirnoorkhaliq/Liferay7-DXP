package com.tahir.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
		property = {
			"javax.portlet.name=OSGITestPortlet",			
			"mvc.command.name=testAction"
		},
		service = MVCActionCommand.class
	)

public class TestOSGIMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		System.out.println("::::::::::::::: "+ParamUtil.getString(actionRequest, "emailId"));
		System.out.println("::::::::::::::: "+ParamUtil.getString(actionRequest, "pwd"));
		
	}

}
