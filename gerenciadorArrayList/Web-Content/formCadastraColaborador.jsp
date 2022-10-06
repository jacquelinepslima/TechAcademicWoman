<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<c:url value="/Colaborador" var= "linkColaborador"/>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>



	<form action=${linkColaborador} method="post">

		Colaborador 
		<br><br>
		Nome: <input type="text" name="nome" />
		<br>
		Data Nascimento: <input type="text" name="data" />
		<input type="submit" />



	</form>


</body>
</html>