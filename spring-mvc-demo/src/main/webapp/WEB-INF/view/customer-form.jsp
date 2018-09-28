<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<html>

  <head>
    <title>Student registration form</title>

    <style>
      .error {color:darkred}
    </style>
  </head>

  <body>
  <i>Fill out the form, please! Asteriks (*) means required</i>
    <form:form action="processForm" modelAttribute="customer">

      <h2>Customer registration form</h2>

      <span>First name:  <form:input path="firstName"/></span>
      <br>
      <span>
        Last name (*):  <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error" />
      </span>
      <br>
      <span>
        Free passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error" />
      </span>
      <br>
      <span>
        Postal code: <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error"/>
      </span>
      <input type="submit" value="Submit">

    </form:form>

  </body>

</html>
