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
	<table>
		<tbody>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>DOB</th>
				<th>Email</th>
				<th>Number</th>
				<th>State</th>
				<th>Insurance Plan</th>
				

			</tr>


			<tr>
				<td>${patient.firstName}</td>
				<td>${patient.lastName}</td>
				<td>${patient.dob}</td>
				<td>${patient.email}</td>
				<td>${patient.number}</td>
				<td>${patient.state}</td>
				<td>${patient.insurancePlan}</td>

			</tr>

		</tbody>
	</table>



	<table>
		<tbody>
			<tr>
				<th>Symptoms</th>
				<th>Diagnosis Provided By</th>
				<th>Administered by</th>
				<th>Date of Diagnosis</th>
				<th>Follow-up Required</th>
				<th>Date of Follow-up</th>

			</tr>
			<c:forEach items="${details}" var="detail">

				<tr>
					<td>${detail.symptoms}</td>
					<td>${detail.diagnosisProvided}</td>
					<td>${detail.administratedBy}</td>
					<td>${detail.DOD}</td>
					<td>${detail.followUpRequired}</td>
					<td>${detail.DOF}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>