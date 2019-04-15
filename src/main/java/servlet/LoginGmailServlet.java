/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author eduardo
 */
public class LoginGmailServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UsuarioDAO dao = new UsuarioDAO();

        List<Usuario> usuarios;

        usuarios = dao.buscar3(request.getParameter("email"));

        System.out.println(request.getParameter("email"));
       
        System.out.println(usuarios);

        PrintWriter out = response.getWriter();

        if (!usuarios.isEmpty()) {
//            out.println("Bem-vindo!");
            System.out.println("Conta existente.");
            response.setContentType("text/html");
            String pagina = "http://localhost:8084/adopets/visao_geral.html";
            response.sendRedirect(pagina);
        } else {
//            out.println("Cadastro inexistente.");
            System.out.println("Cadastro inexistente.");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
