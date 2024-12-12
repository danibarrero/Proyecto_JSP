<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 12/12/2024
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inicio Sesión</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.css">
</head>
<body>
<div>
    <h2>Iniciar Sesión</h2>
    <form method="post" action="LoginServlet">
        <div>
            <label for="name">Usuario</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div>
            <label for="password" >Contraseña</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit">Ingresar</button>
        <div>
            <%
                String error = (String) request.getAttribute("error");
                if (error != null && !error.isEmpty()) {
                    out.print(error);
                }
            %>
        </div>
    </form>
</div>
</body>
</html>
