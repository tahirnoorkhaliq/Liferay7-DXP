package com.tahir.filter;

import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.filter.ActionFilter;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import java.io.IOException;

/**
 * Created by tana0616 on 1/25/2017.
 */
@Component(
        immediate = true,
        property = {
                "javax.portlet.name=OSGITestPortlet",
                "mvc.command.name=testfilterAction"
        },
        service = PortletFilter.class
)
public class TestActionFilter implements ActionFilter {

    @Override
    public void doFilter(ActionRequest actionRequest, ActionResponse actionResponse, FilterChain filterChain) throws IOException, PortletException {
        System.out.println("Before ActionFilter");
        actionRequest.setAttribute("filterAttribute", "Tahir Noor Khaliq");
        filterChain.doFilter(actionRequest, actionResponse);
        System.out.println("After ActionFilter");
    }

    @Override
    public void init(FilterConfig filterConfig) throws PortletException {
        System.out.println("init ActionFilter filter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy ActionFilter filter");
    }

}
