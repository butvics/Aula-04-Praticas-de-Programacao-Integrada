<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="br.usjt.OO.Pais" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Países</title>
</head>
<body>
	<%Pais pais = (Pais)request.getAttribute("pais"); %>
	Id: <%=pais.getIdPais() %><br>
	Nome: <%=pais.getNomePais() %><br>
	Populacao: <%=pais.getPopulacaoPais() %><br>
	Area: <%=pais.getAreaPais() %><br>
</body>
</html>