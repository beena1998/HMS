<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page errorPage="errorPage"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$.datepicker.setDefaults({
			onClose : function(date, inst) {
				$("#selectedDtaeVal").html(date);
			}
		});

		$("#datepicker").datepicker();
	});
</script>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>


	${error} Hospital Management System ENROLL!!!! ${succcessMessage}
	${patient.firstName}

	<div align="center">
		<form:form action="after_enroll" method="post"
			modelAttribute="patient">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Patient Enrollment</h2></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input path="firstName" /></td>
					<td><form:errors path="firstName" cssClass="error"></form:errors></td>


				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input path="lastName" /></td>
					<td><form:errors path="lastName" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td><label for="datepicker">Date of Birth</label></td>
					<td><form:input path="dob" id="datepicker" /></td>
					<td><form:errors path="dob" cssClass="error"></form:errors></td>

					<%-- <label for="datepicker">Enter date:</label>
                <form:input  path="DOj" id="datepicker"/> --%>

				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input path="number" /></td>
					<td><form:errors path="number" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>State</td>
					<td><form:input path="state" /></td>
					<td><form:errors path="state" cssClass="error"></form:errors></td>


				</tr>
				<tr>
					<td>Insurance Plan</td>
					<td><form:input path="insurancePlan" /></td>
					<td><form:errors path="insurancePlan" cssClass="error"></form:errors></td>
				</tr>
				<tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit">Submit</button>
						<button type="reset">Reset</button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>


</body>
</html>