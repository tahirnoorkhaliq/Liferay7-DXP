<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>


<%@ include file="/init.jsp" %>
<script type="text/javascript">
	$(document).ready(function(){
		$('.modal-title').html('Sign in to Liferay Portal');
	});

</script>

<style>


	input:-webkit-autofill, textarea:-webkit-autofill, select:-webkit-autofill {
		background-color: white !important;
		background-image: none;
	}

	.form-control{
		background-color: white !important;
		border: 1px solid rgba(0,0,0,0.075) !important;
	}

	.form-control .clearable{
		border-width : 1px !important;
	}

	#signinmodal{
		height: 340px !important;
		width: 789px !important;
		left: 600px !important;
		top: 169px !important;
		z-index: 1201 !important;
		background-color:white;
	}
	.info-registration ul li{
		color:silver;
		font-size: 15px;
	}
	.info-registration ul {
		list-style: none;
		margin-left: -22px;
	}
	.info-registration ul li:before {
		content: '\2022' !important;
		padding-right: 8px;
		color: #4db8ff !important;
		font-size: 1.3em;
		position: relative;
		top: 4px;
		line-height: 23px !important;
	}
	.modal-body {
		 background-color: white !important;
	}
	.info-registration{
		border-left: 2px solid #f5f4f4;
		margin-top: 20px;
	}
	.header-text{
		font-size: 16px;
		font-weight: bold;
	}
	.rows{
		margin-top: 10px !important;
	}
	.form-group {
		margin-top: 24px !important;
	}
	.clearable {
		margin-left: 38px !important;
		height: 33px !important;
		border-width: 0 0 0 0 !important;
	}
    .password-text{
		margin-left: 68px !important;
        height: 33px !important;
        border-width: 0 0 0 0 !important;
    }
	.control-label{
		color:black !important;
		font-size: 14px !important;
		font-weight: 700 !important;
	}
	.input-checkbox-wrapper{

		margin-left: 139px !important

	}
	.button-holder{
		margin-left: 139px !important
	}

	.btn-login{
		width: 62%;
		border-radius: 0px !important;
		height: 35px !important;
	}
	.modal-title {
		font-weight: 800 !important;
		font-size: 30px !important;
	}
	.li-info{
		margin-top: 10px;
	}
	label {
		font-size: 14px !important;
		font-weight: 700 !important;
		color: black !important;
	}
	.clearable{
		border-width : 1px !important;
	}
	.password-text{
		border-width : 1px !important;
	}

</style>

<div class="row">
	<div class="col-sm-6">
<c:choose>
	<c:when test="<%= themeDisplay.isSignedIn() %>">

		<%
		String signedInAs = HtmlUtil.escape(user.getFullName());

		if (themeDisplay.isShowMyAccountIcon() && (themeDisplay.getURLMyAccount() != null)) {
			String myAccountURL = String.valueOf(themeDisplay.getURLMyAccount());

			signedInAs = "<a class=\"signed-in\" href=\"" + HtmlUtil.escape(myAccountURL) + "\">" + signedInAs + "</a>";
		}
		%>

		<liferay-ui:message arguments="<%= signedInAs %>" key="you-are-signed-in-as-x" translateArguments="<%= false %>" />
	</c:when>
	<c:otherwise>

		<%
		String redirect = ParamUtil.getString(request, "redirect");

		String login = LoginUtil.getLogin(request, "login", company);
		String password = StringPool.BLANK;
		boolean rememberMe = ParamUtil.getBoolean(request, "rememberMe");

		if (Validator.isNull(authType)) {
			authType = company.getAuthType();
		}
		%>

		<portlet:actionURL name="/login/login" secure="<%= PropsValues.COMPANY_SECURITY_AUTH_REQUIRES_HTTPS || request.isSecure() %>" var="loginURL" />

		<aui:form action="<%= loginURL %>" autocomplete='<%= PropsValues.COMPANY_SECURITY_LOGIN_FORM_AUTOCOMPLETE ? "on" : "off" %>' cssClass="sign-in-form form-inline" method="post" name="fm" onSubmit="event.preventDefault();">
			<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
			<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
			<aui:input name="doActionAfterLogin" type="hidden" value="<%= portletName.equals(PortletKeys.FAST_LOGIN) ? true : false %>" />

			<c:choose>
				<c:when test='<%= SessionMessages.contains(request, "userAdded") %>'>

					<%
					String userEmailAddress = (String)SessionMessages.get(request, "userAdded");
					String userPassword = (String)SessionMessages.get(request, "userAddedPassword");
					%>

					<div class="alert alert-success">
						<c:choose>
							<c:when test="<%= company.isStrangersVerify() || Validator.isNull(userPassword) %>">
								<liferay-ui:message key="thank-you-for-creating-an-account" />

								<c:if test="<%= company.isStrangersVerify() %>">
									<liferay-ui:message arguments="<%= userEmailAddress %>" key="your-email-verification-code-has-been-sent-to-x" translateArguments="<%= false %>" />
								</c:if>
							</c:when>
							<c:otherwise>
								<liferay-ui:message arguments="<%= userPassword %>" key="thank-you-for-creating-an-account.-your-password-is-x" translateArguments="<%= false %>" />
							</c:otherwise>
						</c:choose>

						<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.ADMIN_EMAIL_USER_ADDED_ENABLED) %>">
							<liferay-ui:message arguments="<%= userEmailAddress %>" key="your-password-has-been-sent-to-x" translateArguments="<%= false %>" />
						</c:if>
					</div>
				</c:when>
				<c:when test='<%= SessionMessages.contains(request, "userPending") %>'>

					<%
					String userEmailAddress = (String)SessionMessages.get(request, "userPending");
					%>

					<div class="alert alert-success">
						<liferay-ui:message arguments="<%= userEmailAddress %>" key="thank-you-for-creating-an-account.-you-will-be-notified-via-email-at-x-when-your-account-has-been-approved" translateArguments="<%= false %>" />
					</div>
				</c:when>
			</c:choose>

			<liferay-ui:error exception="<%= AuthException.class %>" message="authentication-failed" />
			<liferay-ui:error exception="<%= CompanyMaxUsersException.class %>" message="unable-to-log-in-because-the-maximum-number-of-users-has-been-reached" />
			<liferay-ui:error exception="<%= CookieNotSupportedException.class %>" message="authentication-failed-please-enable-browser-cookies" />
			<liferay-ui:error exception="<%= NoSuchUserException.class %>" message="authentication-failed" />
			<liferay-ui:error exception="<%= PasswordExpiredException.class %>" message="your-password-has-expired" />
			<liferay-ui:error exception="<%= UserEmailAddressException.MustNotBeNull.class %>" message="please-enter-an-email-address" />
			<liferay-ui:error exception="<%= UserLockoutException.LDAPLockout.class %>" message="this-account-is-locked" />

			<liferay-ui:error exception="<%= UserLockoutException.PasswordPolicyLockout.class %>">

				<%
				UserLockoutException.PasswordPolicyLockout ule = (UserLockoutException.PasswordPolicyLockout)errorException;
				%>

				<liferay-ui:message arguments="<%= ule.user.getUnlockDate() %>" key="this-account-is-locked-until-x" translateArguments="<%= false %>" />
			</liferay-ui:error>

			<liferay-ui:error exception="<%= UserPasswordException.class %>" message="authentication-failed" />
			<liferay-ui:error exception="<%= UserScreenNameException.MustNotBeNull.class %>" message="the-screen-name-cannot-be-blank" />

			<aui:fieldset>

				<%
				String loginLabel = null;

				if (authType.equals(CompanyConstants.AUTH_TYPE_EA)) {
					loginLabel = "email-address";
				}
				else if (authType.equals(CompanyConstants.AUTH_TYPE_SN)) {
					loginLabel = "screen-name";
				}
				else if (authType.equals(CompanyConstants.AUTH_TYPE_ID)) {
					loginLabel = "id";
				}
				%>

				<aui:input autoFocus="<%= windowState.equals(LiferayWindowState.EXCLUSIVE) || windowState.equals(WindowState.MAXIMIZED) %>" cssClass="clearable" label="<%= loginLabel %>" name="login" showRequiredLabel="<%= false %>" type="text" value="<%= login %>">
					<aui:validator name="required" />
				</aui:input>

				<aui:input name="password" showRequiredLabel="<%= false %>" type="password" value="<%= password %>" cssClass="password-text">
					<aui:validator name="required" />
				</aui:input>

				<span id="<portlet:namespace />passwordCapsLockSpan" style="display: none;"><liferay-ui:message key="caps-lock-is-on" /></span>

				<c:if test="<%= company.isAutoLogin() && !PropsValues.SESSION_DISABLED %>">
					<aui:input checked="<%= rememberMe %>" name="rememberMe" type="checkbox" cssClass="remember-me" />
				</c:if>
			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit" value="sign-in" cssClass="btn-login" />
			</aui:button-row>
		</aui:form>

		<liferay-util:include page="/navigation.jsp" servletContext="<%= application %>" />



		<aui:script sandbox="<%= true %>">
			var form = AUI.$(document.<portlet:namespace />fm);

			form.on(
				'submit',
				function(event) {
					var redirect = form.fm('redirect');

					if (redirect) {
						var redirectVal = redirect.val();

						redirect.val(redirectVal + window.location.hash);
					}

					submitForm(form);
				}
			);

			form.fm('password').on(
				'keypress',
				function(event) {
					Liferay.Util.showCapsLock(event, '<portlet:namespace />passwordCapsLockSpan');
				}
			);
		</aui:script>
	</c:otherwise>
</c:choose>
	</div>
	<div class="col-sm-6 info-registration">
		<div class="row">
		<div class="col-sm-1"></div>
		<div div class="col-sm-9 header-text">With registration you will receive</div>
		</div>

		<div class="row li-info">
			<div class=""></div>
			<div class="col-sm-10">
		<ul>
			<li>Get Just for you deals</li>
			<li>Receive important vehicle notification</li>
			<li>Pay your Ford Credit bills</li>
			<li>View your service history</li>
			<li>Manage SYNC Settings</li>
			<li>And more!</li>
		</ul>
			</div>
			</div>
	</div>
</div>

