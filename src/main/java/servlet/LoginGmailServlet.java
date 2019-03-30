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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author eduardo
 */
@WebServlet(name = "LoginGmailServlet", urlPatterns = {"/LoginGmailServlet"})
public class LoginGmailServlet extends HttpServlet {
    
    List<Usuario> usuarios;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Usuario usuario = new Usuario();

        usuario.setEmail(req.getParameter("email"));

        UsuarioDAO dao = new UsuarioDAO();

//        usuarios = dao.buscar1(usuario);

        PrintWriter out = resp.getWriter();

        if (!usuarios.isEmpty()) {
            out.println("Bem-vindo!");
        } else {
            out.println("Cadastro inexistente.");
        }

    }

}
