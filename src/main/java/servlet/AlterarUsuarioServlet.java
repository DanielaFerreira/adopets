/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author eddunic
 */
public class AlterarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	String nome = request.getParameter("nome");
	String cpf_cnpj = request.getParameter("cpf_cnpj");
	String email = request.getParameter("email");
	String bairro = request.getParameter("bairro");
	String senha = request.getParameter("senha");
	String telefone = request.getParameter("telefone");
//	byte[] foto = request.getParameter("foto").getBytes();

	Usuario u = new Usuario();
	u = (Usuario) request.getSession().getAttribute("usuario");

	u.setNome(nome);
	u.setCpf_cnpj(cpf_cnpj);
	u.setEmail(email);
	u.setBairro(bairro);
	u.setSenha(senha);
	u.setTelefone(telefone);
//	u.setFoto(foto);

	UsuarioDAO dao = new UsuarioDAO();
	String str = dao.atualizar(u);
//	if (str.equals("")) {
	    response.sendRedirect("../adopets/usuario_comum/visao_geral.jsp");
//	} else {
//	    response.getWriter().println("Errado!");
//	    response.getWriter().println(str);
//	}
    }

}