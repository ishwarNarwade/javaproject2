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
	
	
	Name:- <input type="text" name="name"  value=""><br><br>
		
	Add:- <input type="text" name="add" value=""><br><br>
	
	Email:- <input type="text" name="email"  value=""><br><br>
		
	Contact:- <input type="text" name="contact" value=""><br><br>
		
	Gender:-<input type="radio" name="gender" value="male"> Male
			<input type="radio" name="gender" value="female"> Female
			<input type="radio" name="gender" value="other"> other<br><br>

	Country:-<select name="contry">
    <option value="Amerika">Amerika</option>
	<option value="Austrolia">Austrolia</option>
	<option value="WestIndies">WestIndies</option>
	<option value="india">india</option>
	<option value="SouthAfrica">SouthAfrica</option>
	<option value="Pakistan">Pakistan</option>
	<option value="Shrilanka">Shrilanka</option>
	<option value="England">England</option>
	</select><br><br>
	
	<input type="submit" value="AddStud" formaction="/api/saveStud">
		
	<input type="submit" value="Back" formaction="/api/showStud">
	
	<h3>${message2}</h3>
		</div>	
</form>	


</body>
</html>