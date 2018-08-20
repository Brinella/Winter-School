<?php include("inc/header.html"); ?>
<div class="container">
    <div class="page-header">
		<h1>RCR <small> Customer Registration</small></h1>
	</div>

<form class="form-horizontal">
<fieldset>
<div class="form-group">
  <label class="col-md-4 control-label" for="custName">First name</label>  
  <div class="col-md-4">
  <input id="custName" name="custName" type="text" placeholder="Famba" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->


<div class="form-group">
  <label class="col-md-4 control-label" for="lastname">Last name</label>  
  <div class="col-md-4">
  <input id="lastname" name="lastname" type="text" placeholder="Matanzima" class="form-control input-md" required=""> 
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="address">address</label>  
  <div class="col-md-4">
  <textarea id="address" rows="4" cols="50" name="address" class="form-control input-md" required="" placeholder=" Enter your full residential addr.."> </textarea>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="email">E-mail</label>  
  <div class="col-md-4">
  <input id="email" name="email" type="text" placeholder="Famba17@mail.com" class="form-control input-md" required="">
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="passwordinput">Password</label>
  <div class="col-md-4">
    <input id="passwordinput" name="passwordinput" type="password" placeholder="Enter your password" class="form-control input-md" required="">
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="passwordinput">Repeat password </label>
  <div class="col-md-4">
    <input id="passwordinput" name="passwordinput" type="password" placeholder="Repeat your password" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Button -->
<div class="form-group text-right">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
	  <button id="back" name="back" class="btn btn-warning " onclick="location.href='customer.php';">Back  <span class="glyphicon glyphicon-remove-circle"></span></button>
	  <button id="singlebutton" type = "submit" name="singlebutton" class="btn btn-primary" onclick="validate(); return false;">Register <span class="glyphicon glyphicon-ok-circle"></span></button>
  </div>
  
</div>

</fieldset>
</form>
</div><br/><br/><br/><br/><br/><br/><br/><br/><br/>
 <script src="js/addAndEditCustomer.js"></script>
<?php include("inc/footer.html"); ?>