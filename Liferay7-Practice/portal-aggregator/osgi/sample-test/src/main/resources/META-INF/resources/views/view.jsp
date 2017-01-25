<%@ include file="init.jsp" %>
<portlet:renderURL var="viewRenderURL">
    <portlet:param name="mvcRenderCommandName" value="/tahir/test"/>
</portlet:renderURL>
<portlet:actionURL name="testAction" var="actionTestURL"/>
<portlet:actionURL name="testfilterAction" var="actionTestFilterURL"/>
<p>
    <b><liferay-ui:message key="sample_test_SampleTestmvcportlet.caption"/></b>
    <a href="${viewRenderURL} ">Click to Render</a>
</p>
<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <aui:button-row>
                <aui:button name="saveButton" type="button" value="Test js" cssClass="test-js"/>
            </aui:button-row>
            <form name="" action="${actionTestURL}" method="post" class="login-form">
                <div class="form-group">
                    <label for="email">Email address:</label>
                    <input type="email" class="form-control" id="email" name="emailId">
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" name="pwd">
                </div>
                <div class="checkbox">
                    <label><input type="checkbox"> Remember me</label>
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
            <aui:form name="fm" action="${actionTestFilterURL}" method="post">
                <!-- Use of aui:layout -->
                <!-- Use of aui:column -->
                <aui:input name="firstName"/>
                <aui:input name="middleName"/>
                <aui:input name="lastName"/>
                <aui:input name="age"/>
                <aui:input name="email"/>
                <aui:input name="contact"/>
                <aui:button-row>
                    <aui:button name="saveButton" type="submit" value="save"/>
                    <aui:button name="cancelButton" type="button" value="cancel"/>
                </aui:button-row>
            </aui:form>
        </div>
    </div>
</div>
<%@include file="customer.jspf" %>
