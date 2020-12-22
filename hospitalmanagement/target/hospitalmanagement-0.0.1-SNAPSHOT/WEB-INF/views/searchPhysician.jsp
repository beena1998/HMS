<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Search Physician by:
	<br>
	<br> State
	<form action="searchPhysicianByState">
		<input type="text" name="state">
		<button>Find</button>
	</form>
	<br>
	<br> Plan
	<form action="searchPhysicianByPlan">
		<input type="text" name="plan">
		<button>Find</button>
	</form>
	<br>
	<br> Department
	<form action="searchPhysicianByDepartment">
		<input type="text" name="dept">
		<button>Find</button>
	</form>


	<table>
		<tbody>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Department</th>
				<th>Insurance Plan</th>
				
			</tr>
			<c:forEach items="${physician}" var="phy">

				<tr>
					<td>${phy.firstName}</td>
					<td>${phy.lastName}</td>
					<td>${phy.department}</td>
					<td>${phy.insurancePlan}</td>


				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>