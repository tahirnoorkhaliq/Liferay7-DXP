package com.tahir.hook.portlet;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.PersistentHttpServletRequestWrapper;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
@Component(
		immediate = true, property = {"key=login.events.post"},
		service = LifecycleAction.class
)
public class LoginPostActionPortlet implements LifecycleAction {
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		System.out.println("============Ur logic========");
		System.out.println("key=login.events.post=" + lifecycleEvent);
		HttpServletRequest request=lifecycleEvent.getRequest();
		HttpServletResponse response=lifecycleEvent.getResponse();

		try {
			if(PortalUtil.isOmniadmin(PortalUtil.getUser( request ).getUserId())){
				try {
					//x.compareTo(passwordPolicy)
				HttpSession ses = request.getSession();
				LastPath lastPath = new LastPath("", "/web/guest/admin");
				ses.setAttribute(WebKeys.LAST_PATH, lastPath);

					/*System.out.println("PortalUtil.getHomeURL(request) "+PortalUtil.getHomeURL(request));
					response.sendRedirect(PortalUtil.getHomeURL(request));*/
				}
				catch (Exception e) {
					throw new ActionException(e);
				}
			}
		} catch (PortalException e1) {
			System.out.println("---------PortalException--------------");
		} catch (SystemException e1) {
			System.out.println("--------------SystemException---------");

		}
	}
}
