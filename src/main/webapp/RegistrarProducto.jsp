<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Producto</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #c5dec9;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 400px;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1 {
        text-align: center;
        color: #333;
    }
    table {
        width: 100%;
    }
    table tr td {
        padding: 10px;
    }
    input[type="text"] {
        width: calc(100% - 20px); /* Ajuste para compensar el padding */
        padding: 8px;
        font-size: 16px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Registrar Producto</h1>
        <form action="ListadoProductos.jsp" method="POST">
            <table align="center">
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" name="nombre" required></td>
                </tr>
                <tr>
                    <td>Precio Compra:</td>
                    <td><input type="text" name="precioCompra" required></td>
                </tr>
                <tr>
                    <td>Precio Venta:</td>
                    <td><input type="text" name="precioVenta" required></td>
                </tr>
                <tr>
                    <td>Estado:</td>
                    <td><input type="text" name="estado" required></td>
                </tr>
                <tr>
                    <td>Descripción:</td>
                    <td><input type="text" name="descripcion" required></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center">
                        <input type="submit" value="Registrar">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
