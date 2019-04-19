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

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        UserTempDAO dao = new UserTempDAO();

        if (String.valueOf(dao.buscarCodigo(req.getParameter("codigo"))).replace("[", "").replace("]", "").equals(req.getParameter("codigo"))) {
            String email = String.valueOf(dao.buscarEmail(req.getParameter("codigo"))).replace("[", "").replace("]", "");
            String nome = String.valueOf(dao.buscarNome(req.getParameter("codigo"))).replace("[", "").replace("]", "");
            String senha = String.valueOf(dao.buscarSenha(req.getParameter("codigo"))).replace("[", "").replace("]", "");

            Usuario usuario = new Usuario();

            usuario.setEmail(email);
            usuario.setNome(nome);
            usuario.setSenha(senha);

            UsuarioDAO dao2 = new UsuarioDAO();
            dao2.inserir(usuario);
            System.out.println("Usuário cadastrado!");

            out.println("Você foi cadastrado com sucesso!");

            dao.excluir(email);//com erro - nao ta excluindo
        } else {
            out.println("Digite um código válido.");
        }
    }

}
