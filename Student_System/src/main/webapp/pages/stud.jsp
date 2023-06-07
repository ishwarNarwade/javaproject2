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

.a1
{
	padding :0px;
}
table
{
	margin-left : 300px;
}


a
{
	text-decoration:none;
	border:1px solid grey;
	padding:10px 20px;
	background-color:grey;
	color:magenta;
	
}

</style>
	
</head>

<body>

<marquee width="100%" direction="left" height="80px" bgcolor="cyan">

<h1> ${message} </h1>


</marquee><br><br>
<table>
		<tr>
			<th>sid</th>
			
			<th>name</th>
			
			<th>add</th>
			
			<th>email</th>
			
			<th>contact</th>
			
			<th>gender</th>
			
			<th>contry</th>
						
			<th>edit</th>
			
			<th>delete</th>
			
		</tr>
		
			<c:forEach var="stud" items="${allStuds}">
			
				<tr>
						<td>${stud.sid}</td>
						<td>${stud.name}</td>
						<td>${stud.add}</td>
						<td>${stud.email}</td>
						<td>${stud.contact}</td>
						<td>${stud.gender}</td>
						<td>${stud.contry}</td>
						
						<td class="a1"><a href="/api/showStud/${stud.sid}"> edit </a></td>
						<td class="a1"><a href="/api/deleteStud/${stud.sid}"> delete </a></tr>
				</tr>
					
		</c:forEach>
		
</table>
<div>
<form>
<br><br><br>
<div align="center">
	
	<input type="submit" value="view" formaction="/api/view">
					
	<input type="submit" value="add" formaction="/api/addstud">
	
	<h3> ${message2} </h3><br><br><br>
	
	</div>
	
</form>

</div>

</body>
		
</html>