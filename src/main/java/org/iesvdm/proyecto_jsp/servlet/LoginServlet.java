package org.iesvdm.proyecto_jsp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.iesvdm.proyecto_jsp.dao.UsuarioDAO;
import org.iesvdm.proyecto_jsp.dao.UsuarioDAOlmpl;
import org.iesvdm.proyecto_jsp.model.Usuario;

import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    private UsuarioDAO usuarioDAO = new UsuarioDAOlmpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/formulario.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Optional<Usuario> usuario = usuarioDAO.findByName(name);

        if (usuario.isPresent() && usuario.get().getPassword().equals(password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/controlAcceso.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("error", "Usuario o contraseña incorrectos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/formulario.jsp");
            dispatcher.forward(request, response);
        }

    }
}
