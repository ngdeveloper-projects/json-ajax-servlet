$(document).ready(function() {
		name = "javadomain.in";
		// on page load itself calling servlet and printing the JSON value in JSP page
                $.get('JSONAjaxServlet', {
                        siteName : name
                }, function(responseText) {
                	//alert(JSON.stringify(responseText))
                	
                	// for json [if responseText is JSON ]
                        $('#printJSON').text(JSON.stringify(responseText));
                        
                    // for string [if responseText is String ]
                      //  $('#printJSON').text(responseText);
                        
                });
});