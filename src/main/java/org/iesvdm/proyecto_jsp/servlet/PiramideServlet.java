package org.iesvdm.proyecto_jsp.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PiramideServlet", value = "/PiramideServlet")
public class PiramideServlet extends HttpServlet {


    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/piramide.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int altura = Integer.parseInt(request.getParameter("height"));

        if (altura>0){
            request.setAttribute("height", altura);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mostrarPiramide.jsp");
            dispatcher.forward(request, response);
        }else{
            request.setAttribute("error", "La altura debe ser mayor que 0");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/piramide.jsp");
            dispatcher.forward(request, response);
        }

    }
}
