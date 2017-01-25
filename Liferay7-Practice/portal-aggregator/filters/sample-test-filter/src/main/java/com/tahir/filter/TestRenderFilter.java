/**
 * Copyright 2000-present Liferay, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tahir.filter;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;

import org.osgi.service.component.annotations.Component;

/**
 * Created by tana0616 on 1/25/2017.
 */

@Component(
        immediate = true,
        property = {"javax.portlet.name=OSGITestPortlet"},
        service = PortletFilter.class
)
public class TestRenderFilter implements RenderFilter {

    @Override
    public void init(FilterConfig filterConfig) throws PortletException {
        System.out.println("init RenderFilter filter");
    }

    @Override
    public void doFilter(
            RenderRequest renderRequest, RenderResponse renderResponse, FilterChain filterChain)
            throws IOException, PortletException {
        System.out.println("Before Filter");
        renderRequest.setAttribute("filterAttribute", "Tahir Noor Khaliq");
        filterChain.doFilter(renderRequest, renderResponse);
        System.out.println("After Filter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy RenderFilter filter");
    }


}