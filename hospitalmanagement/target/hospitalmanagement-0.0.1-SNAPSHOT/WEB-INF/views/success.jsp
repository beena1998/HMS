<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Success!!
Patient ${patient.firstName}
<a href="home">Home</a>
<table>
		<tbody>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Department</th>
				<th>Insurance Plan</th>
				
			</tr>
			

				<tr>
					<td>${physician.firstName}</td>
					<td>${physician.lastName}</td>
					<td>${physician.department}</td>
					<td>${physician.insurancePlan}</td>


				</tr>
			
		</tbody>
	</table>
</body>
</html>