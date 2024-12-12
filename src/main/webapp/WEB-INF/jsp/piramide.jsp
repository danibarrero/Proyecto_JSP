<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 12/12/2024
  Time: 22:54
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
    <form method="post" action="PiramideServlet">
        <div>
            <label for="altura">Altura</label>
            <input type="number" id="altura" name="altura" required>
        </div>
        <button type="submit">Generar</button>
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
