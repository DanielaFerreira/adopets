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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author eddunic
 */
public class CadastrarUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	PrintWriter out = response.getWriter();

	UserTempDAO dao = new UserTempDAO();

	if (String.valueOf(dao.buscarCodigo(request.getParameter("codigo"))).replace("[", "").replace("]", "").equals(request.getParameter("codigo"))) {
	    String email = String.valueOf(dao.buscarEmail(request.getParameter("codigo"))).replace("[", "").replace("]", "");
	    String nome = String.valueOf(dao.buscarNome(request.getParameter("codigo"))).replace("[", "").replace("]", "");
	    String senha = String.valueOf(dao.buscarSenha(request.getParameter("codigo"))).replace("[", "").replace("]", "");

	    Usuario usuario = new Usuario();

	    usuario.setEmail(email);
	    usuario.setNome(nome);
	    usuario.setSenha(senha);

	    UsuarioDAO dao2 = new UsuarioDAO();
	    dao2.inserir(usuario);
	    System.out.println("Usuário cadastrado!");

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Adopets</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<script language = 'JavaScript'>");
	    out.println("    alert('Você foi cadastrado com sucesso!'); window.location.href='../adopets/entrada/login.html';");
	    out.println(" </script>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();

	    UserTempDAO.excluir(email);
	} else {
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Adopets</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<script language = 'JavaScript'>");
	    out.println("    alert('Digite um código válido'); window.location.href='../adopets/entrada/confirmacaoConta.html';");
	    out.println(" </script>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}

    }

}
