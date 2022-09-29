<%-- 
    Document   : mostrarAutos
    Created on : 24 sep. 2022, 13:06:47
    Author     : emidz
--%>



<%@page import="java.util.List"%>
<%@page import="entity.Auto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Autos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    </head>
    <body>
        <h1></h1>
        </br>
        <table class="table">
            <thead>

                <tr>  
                    <th scope="col">#</th>
                    <th scope="col">Patente</th>
                    <th scope="col">Marca</th>
                    <th scope="col">Modelo</th>
                    <th scope="col">Color</th>
                    <th scope="col">Tipo de Motor</th>
                </tr>

            </thead>
            <tbody>

                <%
                    List<Auto> lista = (List) request.getSession().getAttribute("lista");
                    int cont = 1;
                    for (Auto a : lista) {%>
                <tr>
                    <th scope="row"><%=cont%></th>
                    <td><%=a.getPatente()%></td>
                    <td><%=a.getMarca()%></td>
                    <td><%=a.getModelo()%></td>
                    <td><%=a.getColor()%></td>
                    <td><%=a.getTipoMotor()%></td>

                    <% cont++;%>
                </tr>
                <%}%>

            </tbody>
        </table>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>
