<html>
<head>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<style>

body
{
	background-color: pink;
}


</style>
	
</head>
<body>
<form>
<div align="center">

	Sid:- <input type="text" name="sid" value="${stud.sid}" readonly><br><br>
	
	Name:- <input type="text" name="name"  value="${stud.name}"><br><br>
		
	Add:- <input type="text" name="add" value="${stud.add}"><br><br>
	
	Email:- <input type="text" name="email"  value="${stud.email}"><br><br>
		
	Contact:- <input type="text" name="contact" value="${stud.contact}"><br><br>
	
	
	Gender:-
	<input type="radio" name="gender" id="male" value="male"/>Male
	<input type="radio" name="gender" id="female" value="female" />Female  
    <input type="radio" name="gender" id="other" value="other" />
    Other
    	<br><br>

	Country:-<select name="contry" value="${stud.contry}">
    <option value="Amerika">Amerika</option>
	<option value="Austrolia">Austrolia</option>
	<option value="WestIndies">WestIndies</option>
	<option value="india">india</option>
	<option value="SouthAfrica">SouthAfrica</option>
	<option value="Pakistan">Pakistan</option>
	<option value="Shrilanka">Shrilanka</option>
	<option value="England">England</option>
	</select><br><br>
	
		
	<input type="submit" value="update" formaction="/api/updateStud">
		
	<input type="submit" value="Back" formaction="/api/showStud">
	
			
	
	<h3> ${message2} </h3><br><br><br>
	
	
	</div>
</form>


</body>
</html>