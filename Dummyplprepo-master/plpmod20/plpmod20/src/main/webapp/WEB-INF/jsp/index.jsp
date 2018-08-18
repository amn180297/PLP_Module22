<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file = "header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add/Delete Coupons</title>
<link href="css/body.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/footer.css" rel="stylesheet">
</head>
<body>
<h3> Genertae Coupons For Customer</h3><br>
	<form action="/addcoupon" method="post">
		<center>
			<table cellpadding="10">
				<tr>
					<td>CouponId:</td>
					<td><input type="text" name="coupon_id"
						 required="required" /></td>
				</tr>
				<tr>
					<td>Discount %:</td>
					<td><input type="text" name="discount"
						 required="required" /></td>
				</tr>
				
				<tr>
					<td>Number Of Transaction:</td>
					<td><input type="text" name="no_of_transaction"
						 required="required" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						name="save" value="Generate Coupon" /></td>
				</tr>
			</table>
		</center>
	</form>
	<footer class="footer">
	<center>
		<p style="font-size: 15px;">Copyright ©2018. All rights reserved.</p>
	</center>
	</footer>
</body>
</html>