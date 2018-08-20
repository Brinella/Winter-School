
//function to validate the submit button from the form
function addCar()
{
    var regnumber = document.getElementById('regnumber').value;
	//var name = document.getElementById('custName').value 
    var status = true;
    var make = document.getElementById('inMake').value;
	var model = document.getElementById('inModel').value
    var year= document.getElementById('year').value;
    var inCategory = document.getElementById('inCategory').value;
	
	console.log(regnumber + status + make + model + year + inCategory);

    var data = "make=" + make + "&model="+model+"&year="+year+"&regnumber="+regnumber+"&status=" + status;
    event.preventDefault();

    if(inCategory == false || make == false || model == false || year == false || regnumber == false)
    {
    	event.preventDefault();
    	return;
    }
    else
    {
		//$.getJSON('http://localhost:8080/car/readAllCars

    	// jquery starts here..
            $(document).ready(function(){
                var carData = "make=" + make + "&model="+model+"&year="+year+"&regnumber="+regnumber+"&status=" + status;
                $.ajax({
                    type: "POST",
                    dataType: "json",
                    url:"http://localhost:8080/car/" + inCategory + "/addCar?",
                    data: carData,
                    success: function (response) {
                        location.href="car.php";
                    },
                    error: function(xhr){
                        alert("Adding Car Failed");
                    }
                })
            });
    }


}


