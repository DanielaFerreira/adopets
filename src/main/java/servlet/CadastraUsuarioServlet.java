/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UsuarioDAO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
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
@WebServlet(name = "CadastraUsuarioServlet", urlPatterns = {"/CadastraUsuarioServlet"})
public class CadastraUsuarioServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        System.out.println("Email confirmado.");
                
//        Usuario usuario = new Usuario();
//
//        usuario.setEmail(req.getParameter("email"));
//        usuario.setNome(req.getParameter("nome"));
//        usuario.setSenha(req.getParameter("senha"));
//
//        UsuarioDAO dao = new UsuarioDAO();
//        dao.inserir(usuario);

        
       // System.out.println("Cadastro realizado!");
        
    }
    
}


