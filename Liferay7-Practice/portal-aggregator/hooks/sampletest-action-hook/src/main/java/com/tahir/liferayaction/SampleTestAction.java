package com.tahir.liferayaction;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Created by tana0616 on 11/22/2016.
 */
@Component(
        property = {
                "javax.portlet.name=" +  "OSGITestPortlet",
                "mvc.command.name=testAction",
                "service.ranking:Integer=600"
        },
        service = MVCActionCommand.class)
public class SampleTestAction extends BaseMVCActionCommand {


    @Reference(target = "(&(mvc.command.name=testAction)" +
                        "(javax.portlet.name=OSGITestPortlet)" +
                        "(component.name=com.tahir.action.TestOSGIMVCActionCommand))")
    protected MVCActionCommand mvcActionCommand;

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        System.out.println("======OVERRIDING MVC COMMANDS======");
        mvcActionCommand.processAction(actionRequest,actionResponse);
    }
}
