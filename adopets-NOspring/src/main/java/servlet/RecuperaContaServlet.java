/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 *
 * @author eddunic
 */
public class RecuperaContaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	String email1 = request.getParameter("email");

	HtmlEmail email = new HtmlEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	try {
	    email.addTo(email1);
	    email.setFrom("adopets.foundation@gmail.com", "Adopets");
	} catch (EmailException ex) {
	    Logger.getLogger(RecuperaContaServlet.class.getName()).log(Level.SEVERE, null, ex);
	}
	email.setSubject("Recuperação de conta");

	Random gerador = new Random();
	String senhaAleatoria = String.valueOf(gerador.nextInt());

	try {
	    email.setHtmlMsg("Olá, sua nova senha para seu email " + email1 + " é: " + senhaAleatoria);
	    email.setTextMsg("Seu servidor de e-mail não suporta mensagem HTML.");
	} catch (EmailException ex) {
	    Logger.getLogger(RecuperaContaServlet.class.getName()).log(Level.SEVERE, null, ex);
	}
	email.setSSL(true);
	email.setAuthentication("adopets.foundation@gmail.com", "stephoda");

	try {
	    email.send();
	} catch (EmailException ex) {
	    Logger.getLogger(RecuperaContaServlet.class.getName()).log(Level.SEVERE, null, ex);
	}

	System.out.println("Email enviado!");

	Usuario u = new Usuario();
	u.setSenha(senhaAleatoria);
	UsuarioDAO dao = new UsuarioDAO();
	dao.updateSenha(email1, senhaAleatoria);
	
	PrintWriter out = response.getWriter();

	out.println("<html>");
	out.println("<head>");
	out.println("<title>Adopets</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<script language = 'JavaScript'>");
	out.println("    alert('Sua nova senha foi enviada para seu email!'); window.location.href='../adopets/entrada/login.html';");
	out.println(" </script>");
	out.println("</body>");
	out.println("</html>");
	out.close();

    }

}
