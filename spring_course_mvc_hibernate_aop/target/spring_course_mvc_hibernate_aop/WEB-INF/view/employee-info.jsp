<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
  <h2>Employee Info</h2>

  <br>
<form:form action="saveEmployee" modelAttribute="employee">

  <form:hidden path="id"/>

  Name <form:input path="name"/>
  <br><br>
  Surname <form:input path="surname"/>
  <br><br>
  Department <form:input path="department"/>
  <br><br>
  Salary <form:input path="salary"/>
  <br><br>
  <input type="submit" value="OK">
</form:form>

</body>
</html>
