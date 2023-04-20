<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your details</h2>

<br>
<br>

<form:form action ="showDetails" modelAttribute="employee" method="post">

	Name <form:input path="name"/>
	<form:errors path="name"></form:errors>
	<br><br>
	Surname <form:input path="surname"/>
	<form:errors path="surname"></form:errors>
	<br><br>
	Salary <form:input path="salary"/>
	<form:errors path="salary"></form:errors>
	<br><br>
	Department <form:select path="department">
	<form:options items="${employee.departments}"/>
	</form:select>
	<br><br>
	Which car do you want?
	<form:radiobuttons path="carBrand" items ="${employee.carBrands}"/>
	<br><br>
	Foreign Language(s)
	<form:checkboxes items="${employee.languageList}" path="languages"/>
	<br><br>
	Phone number <form:input path="phoneNumber"/>
	<form:errors path="phoneNumber"></form:errors>
	
	<br><br>
	Email <form:input path="email"/>
	<form:errors path="email"></form:errors>
	
	<br><br>
	<input type="submit" value="OK">
	
</form:form>

</body>

</html>