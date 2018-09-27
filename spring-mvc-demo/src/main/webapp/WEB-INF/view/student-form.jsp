<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
      <form:option value="Brazil" label="Brazil"/>
      <form:option value="France" label="France"/>
      <form:option value="Germany" label="Germany"/>
      <form:option value="UK" label="UK"/>
      <form:option value="India" label="India"/>
    </form:select>
  </span>

  <br>
  <br>
  <input type="submit" value="register">

</form:form>

</body>

</html>
