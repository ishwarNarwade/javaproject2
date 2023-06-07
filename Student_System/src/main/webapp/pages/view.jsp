<html>
<head>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<style>

body
{
	background-color: pink;
}

table,th,td
{
	border : 1px solid green;
	//border-collapse:collapse;
	
}

td
{
	color:blue;
	
}

th
{
	color:red;
}

th,td
{
	padding:10px;
	text-align:center;
}

</style>
	
</head>
<body>

<form>
<div align="center">
	Sid:- <input type="text" name="sid" value=""><br><br>
	
	
	<input type="submit" value="View" formaction="/api/viewStud">
		
	<input type="submit" value="Back" formaction="/api/showStud">
			<br><br><br>
			<table>
		<tr>
			<th>sid</th>
			
			<th>name</th>
			
			<th>add</th>
			
			<th>email</th>
			
			<th>contact</th>
			
			<th>gender</th>
			
			<th>contry</th>
						
			
			
		</tr>
		
			<c:forEach var="stud" items="${stud}">
			
				<tr>
						<td>${stud.sid}</td>
						<td>${stud.name}</td>
						<td>${stud.add}</td>
						<td>${stud.email}</td>
						<td>${stud.contact}</td>
						<td>${stud.gender}</td>
						<td>${stud.contry}</td>
					</tr>
					
		</c:forEach>
		
</table>
	</div>
</form>

</body>
</html>