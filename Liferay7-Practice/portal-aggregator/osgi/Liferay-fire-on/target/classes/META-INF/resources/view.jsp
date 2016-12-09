<%@ include file="/init.jsp" %>
<portlet:defineObjects />
<portlet:resourceURL var="testAjaxResourceUrl" id="/test/osgi"></portlet:resourceURL>
<p>
	<b><liferay-ui:message key="liferay_fire_on_OSGIFireOn.caption"/></b>
	
	
</p>
<div id="res-data"></div>

<script type="text/javascript">

Liferay.on('showUserData',function(event) {
	
	 $('#res-data').html("hellooooooooo");
	  AUI().use('aui-io-request', function(A){
	        A.io.request('${testAjaxResourceUrl}', {
	               method: 'post',
	               data: {
	            	   <portlet:namespace />sampleParam: event.name,
	               },
	               on: {
	                   	success: function() {
	                       $('#res-data').html(this.get('responseData')); 
	                        
	                    }
	              }
	        });
	    }); 
	 
	  
	 
	});

</script>