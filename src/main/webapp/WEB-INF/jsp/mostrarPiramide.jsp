<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 12/12/2024
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pirámide</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.css">
</head>
<body>
    <div>
        <h2>Pirámide de Gatos</h2>
        <a href="index.jsp">Volver</a>
        <%
            int height = (int) request.getAttribute("altura");

            for (int i = 1; i <= height; i++) {
                out.println("<div class='cat-row'>");
                for (int j = 1; j <= i; j++) {
                    out.println("<img src='../imagen/gato.jpg' alt='Gato' width='50' height='50'>");
                }
                out.println("</div>");
            }
        %>
    </div>
</body>
</html>
