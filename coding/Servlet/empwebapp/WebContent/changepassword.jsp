<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change password here</title>
<link rel="stylesheet" href="./Bootstrap/bootstrap-4.3.1-dist/css/bootstrap.min.css">
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<h4><%=msg%></h4>
<fieldset align="center">
<form action="./changepassword" class="col-md-4 offset-4 mt-5 mb-5 card card-body" method="post">
    <h1 class="text-center" style="background-color: gray;">Change password</h1>
     <a href="./home">&nbsp; &nbsp; Home &nbsp; &nbsp;</a>
     <a href="./logout">&nbsp; &nbsp; Logout &nbsp; &nbsp;</a><br>
    <br>
    <div class="formgroup">
        New Password :<input type="text" name="password"class="form-control mb-1" placeholder="Enter new password....">
    </div>
    <br>
    <div class="formgroup">
       Conform Password : <input type="text" name="conformpassword" class="form-control mb-1" placeholder="Confirm password....">
    </div>
    <br>
    <div class="formgroup">
        <button type="submit" class="btn btn-primary float-right mb-1" >Change</button>
         <button type="reset" class="btn btn-primary float-right mb-1" >Reset</button>
    </div>
</form>
</fieldset>
</body>
</html>