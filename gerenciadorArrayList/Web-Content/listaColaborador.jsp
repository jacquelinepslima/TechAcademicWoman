<%@ page import = "java.util.List, model.Colaborador" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

		<c:if test= "${not empty nomeColaborador}">
			Colaborador ${ nomeColaborador } Cadastrado com Sucesso!
		</c:if> 
		
		<br><br>


		Lista de Colaboradores: <br/>
	
	<!-- JSTL -->	
		<ul>
		<c:forEach items="${listaColaboradores}" var="colaborador">
			<li>${colaborador.nomeColaborador} - <fmt:formatDate value="${colaborador.dataNascimento}" pattern="dd/MM/yyyy" /> 
			<a href = "/gerenciador/mostraColaborador?id=${colaborador.idColaborador}"> Alterar </a>
			<a href = "/gerenciador/removeColaborador?id=${colaborador.idColaborador}"> Remover </a>
			</li>
		</c:forEach>
		</ul>
		
	<!-- JSP com Scriplets -->		
	<!-- <ul> -->
	<%-- List<Colaborador> listaColaboradores = (List<Colaborador>) request.getAttribute("listaColaboradores");
	<%-- for (Colaborador colaborador : listaColaboradores) --%>
	<%-- <li><%= colaborador.getNomeColaborador() %></li> --%>
	<%-- <% } %> --%>
		

</body>
</html>