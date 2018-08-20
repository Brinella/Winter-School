<?
    $conn = new mysqli('localhost', 'root','') ;
 if($conn->connect_error)
 {
	 die("Connection failed: ". $conn->connect_error);
 }
 echo "DB successfully connected <br>";
 mysqli_select_db($conn,"school");
?>
<?php include("inc/header.html"); ?>
<center><body background = "download-moving-wallpapers-15.jpg">
<div class="container">
    <div class="page-header">
		<h1>RCR <small> Customer List</small></h1>
	</div>
	
	<script src="js/customer.js"></script>
	<div class="container">
	<div class="row">
		<table class="table table-hover table-responsive" id="custTable">
		    <thead>
			<tbody>
			 <a href="register_customer.php" class="btn btn-primary btn-xs pull-right"><b>+</b> Add new Customer</a>
		        <tr>
		            <th>ID</th>
		            <th>First Name</th>
		            <th>Last Name</th>
		            <th>Email</th>
		            <th>Edit</th>
		            <th>Delete</th>
		        </tr>
				<tbody  class="customersTable"> </tbody>
		    </thead>
		    
		</table>
	</div>
</div>
<div id="edit" class="modal fade" role="dialog">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">×</button>
        <h4 class="modal-title">Update Data</h4>
      </div>
      <div class="modal-body">
           <input id="fn" type="text" class="form-control" name="fname" placeholder="First Name">
           <input id="ln" type="text" class="form-control" name="lname" placeholder="Last Name">
           <input id="mn" type="text" class="form-control" name="mname" placeholder="Middle Name">
      </div>
      <div class="modal-footer">
        <button type="button" id="up" class="btn btn-warning" data-dismiss="modal">Update</button>
        <a href="index.php" button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
<div id="delete" class="modal fade" role="dialog">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">×</button>
        <h4 class="modal-title">Delete Data</h4>
      </div>
      <div class="modal-body">
        <strong>Are you sure you want to delete this data?</strong>
      </div>
      <div class="modal-footer">
        <button type="button" id="del" class="btn btn-danger" data-dismiss="modal">Delete</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>

</div>
<script src="js/viewAllCustomers.js"></script>
<?php include("inc/footer.html"); ?>
