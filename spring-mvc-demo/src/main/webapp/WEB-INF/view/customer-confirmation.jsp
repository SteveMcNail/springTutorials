<jsp:useBean id="customer" scope="request" type="com.luv2code.springdemo.mvc.Customer"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
  <title>Customer Confirmation</title>
</head>

<body>

<span>The customer is confirmed: ${customer.firstName} ${customer.lastName}<br><br>He has ${customer.freePasses} free passes.

</span>

</body>

</html>


