<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Productos</h1>
<h2 align="center">
<a  href="RegistrarCliente.jsp" style="text-decoration:none">Registrar Cliente</a>
</h2>
<table align="center" border="2">
<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>Pv</td>
<td>Pc</td>
<td>Est.</td>
<td>Des</td>

</tr>
<%
List<TBL_PRODUCTOSCL2> listadoproducto=(List<TBL_PRODUCTOSCL2>)request.getAttribute("listadoproductos");
if(listadocliente!=null){
	
for(TBL_PRODUCTOSCL2 lis:listadoproducto){
%>
<tr>
<td>
<%=lis.getIDPRODUCTOCL2()%>
</td>
<td>
<%=lis.getNOMBRECL2()%>
</td>
<td>
<%=lis.getPRECIOVENTACL2() %>
</td>
<td>
<%=lis.gePRECIOCOMPCL2() %>
</td>
<td>
<%=lis.getESTADOCL2() %>
</td>
<td>
<%=lis.getDESCRIPCL2() %>
</td>
</tr>
<%
      }
}   
%>
</table>
</body>
</html>