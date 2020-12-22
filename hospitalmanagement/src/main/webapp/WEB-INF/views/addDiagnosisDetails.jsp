<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	<div align="center">
		<form:form action="detailsadded" method="post"
			modelAttribute="diagnosisDetails">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Diagnosis Details</h2></td>
				</tr>
				<tr>
					<td>Patient ID</td>
					<td><form:select path="patientId">
							<c:forEach items="${patients}" var="patient">
								<option value="${patient.id}">${patient.id}</option>
							</c:forEach>
						</form:select></td>
						<td><form:errors path="patientId" cssClass="error"></form:errors></td>

				</tr>
				<tr>
					<td>Symptoms</td>
					<td><form:input path="symptoms" /></td>
					<td><form:errors path="symptoms" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Diagnosis Provided</td>
					<td><form:input path="diagnosisProvided" /></td>
					<td><form:errors path="diagnosisProvided" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Administered By</td>
					<td><form:select path="administratedBy">
							<c:forEach items="${physicians}" var="physicians">
								<option value="${physicians.id}">${physicians.firstName}-${physicians.department}</option>
							</c:forEach>
						</form:select></td>
						<td><form:errors path="administratedBy" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Date of Diagnosis</td>
					<td><form:input path="DOD" /></td>
					<td><form:errors path="DOD" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Follow-up Required</td>
					<td><form:input path="followUpRequired" /></td>
					<td><form:errors path="followUpRequired" cssClass="error"></form:errors></td>
				</tr>
				<tr>

					<td>Date of Follow-up</td>
					<td><form:input path="DOF" /></td>
					<td><form:errors path="DOF" cssClass="error"></form:errors></td>


				</tr>
				<tr>
					<td>Bill Amount</td>
					<td><form:input path="bill" /></td>
					<td><form:errors path="bill" cssClass="error"></form:errors></td>
				</tr>
				<tr>

					<td>Card Number</td>
					<td><form:input path="cardNo" /></td>
					<td><form:errors path="cardNo" cssClass="error"></form:errors></td>
					


				</tr>
				<tr>

					<td>Mode of payment</td>
					<td><form:input path="modeOfPayment" /></td>
					<td><form:errors path="modeOfPayment" cssClass="error"></form:errors></td>


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