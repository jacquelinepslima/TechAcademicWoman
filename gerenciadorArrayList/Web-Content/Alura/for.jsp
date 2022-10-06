<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<c:url value="/Colaborador" var= "linkColaborador"/>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>


		<c:forEach var="i" begin="1" end= "10" step="2">
			${i}
		</c:forEach>


	</form>


</body>
</html>