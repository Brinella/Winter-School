
var localhost1 = "http://localhost:8080";
function validate() {
		var name = document.getElementById('custName').value 
		var surname = document.getElementById('lastname').value 
		var email = document.getElementById('email').value 
		var address = document.getElementById('address').value 
		console.log(name+surname+email+address);

        if (name == false || surname == false || email == false || address == false){
            event.preventDefault();
            return;
        }
        else {

		
			// jquery starts here..
            $(document).ready(function(){
                var customerData =  "name=" + name+ "&surname=" + surname+ "&email=" + email + "&address=" + address;
                $.ajax({
                    type: "POST",
                    dataType: "json",
                    url: localhost1 + "/customer/addCustomer?",
                    data: customerData,
                    success: function (response) {
                        location.href="customer.php";
                    },
                    error: function(xhr){
                        alert("Adding Customer Failed");
                    }
                })
            });
        }
}