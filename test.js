$(document).ready(function(){
	console.log('Inside document ready');
});

function changeStatus(){
	
	var ipJson = {}
    ipJson["customerId"] = "A1";
	ipJson["shippingId"] = "B2";
	ipJson["orderId"] = "C3";
	ipJson["otherDetails"] = "Other";
	
    console.log(JSON.stringify(ipJson));
	
	$.ajax({
         type: "POST",
         url: "http://localhost:8080/demo/callAdyen",
         contentType: "application/json; charset=utf-8",
         data: JSON.stringify(ipJson),
         dataType: "json",
         success: function (data) {
			 console.log(data);
			 console.log('success');
			 $( "#status" ).html('Shipped');
			 
         },
     
         error: function (e) {
             console.log('Error');
         }
     });
	
}