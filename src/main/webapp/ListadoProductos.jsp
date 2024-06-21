<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.TBL_PRODUCTOCL2" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Productos</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #c5dec9;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:hover {
            background-color: #f2f2f2;
        }
        a.button {
            display: inline-block;
            padding: 10px 20px;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            border-radius: 5px;
        }
        a.button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Listado de Productos</h1>
        <h2><a href="RegistrarProducto.jsp" class="button">Registrar Producto</a></h2>
        <table border="1">
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Precio Venta</th>
                    <th>Precio Compra</th>
                    <th>Estado</th>
                    <th>Descripción</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="lis" items="${listadoproducto}">
                    <tr>
                        <td>${lis.getIDPRODUCTOCL2()}</td>
                        <td>${lis.getNOMBRECL2()}</td>
                        <td>${lis.getPRECIOVENTACL2()}</td>
                        <td>${lis.getPRECIOCOMPCL2()}</td>
                        <td>${lis.getESTADOCL2()}</td>
                        <td>${lis.getDESCRIPCL2()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
