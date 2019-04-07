/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UserTempDAO;
import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserTemp;
import model.Usuario;

/**
 *
 * @author eduardo
 */
@WebServlet(name = "CadastraUsuarioServlet", urlPatterns = {"/CadastraUsuarioServlet"})
public class CadastraUsuarioServlet extends HttpServlet {

    UserTemp userTemp;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        UserTemp userTemp = new UserTemp();

        UserTempDAO dao = new UserTempDAO();

        String email = String.valueOf(dao.buscarEmail(req.getParameter("codigo"))).replace("[","").replace("]","");
        String nome = String.valueOf(dao.buscarNome(req.getParameter("codigo"))).replace("[","").replace("]","");
        String senha = String.valueOf(dao.buscarSenha(req.getParameter("codigo"))).replace("[","").replace("]","");
        
        userTemp.setEmail(email);
        userTemp.setNome(nome);
        userTemp.setSenha(senha);

        Usuario usuario = new Usuario();

        usuario.setEmail(userTemp.getEmail());
        usuario.setNome(userTemp.getNome());
        usuario.setSenha(userTemp.getSenha());

        UsuarioDAO dao2 = new UsuarioDAO();
        dao2.inserir(usuario);
        System.out.println("Usuário cadastrado!");

        out.println("Você foi cadastrado com sucesso!");

    }

}
