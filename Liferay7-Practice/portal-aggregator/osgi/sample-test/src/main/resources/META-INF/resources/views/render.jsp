<%@ include file="init.jsp" %>

<portlet:defineObjects/>

<portlet:resourceURL var="testAjaxResourceUrl" id="/test/osgi"></portlet:resourceURL>
<portlet:resourceURL id="/test/Captcha" var="captchaURL"/>

<liferay-ui:captcha url="<%= captchaURL %>"/>
<button onclick="ajaxCall()">resourceURL in Ajax</button>
<br/><br/>


<button onclick="showUsers()">click</button>


<script type="text/javascript">
    function showUsers() {
        Liferay.fire('showUserData', {name: 'Tahir Noor'});
    }

    function ajaxCall() {
        AUI().use('aui-io-request', function (A) {
            A.io.request('${testAjaxResourceUrl}', {
                method: 'post',
                data: {
                    <portlet:namespace />sampleParam: 'value2',
                },
                on: {
                    success: function () {
                        alert(this.get('responseData'));
                    }

                }
            });
        });
    }
</script>