<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<html>

<head>
  <title>Student registration form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

  <h2>Student registration form</h2>

  <span>First name:  <form:input path="firstName"/></span>
  <br>
  <br>
  <span>Last name:  <form:input path="lastName"/></span>
  <br>
  <br>
  <span>
    <form:select path="country">
      <form:options items="${student.countryOptions}"/>
    </form:select>
  </span>

  <br>
  <br>
  <input type="submit" value="register">

</form:form>

</body>

</html>
