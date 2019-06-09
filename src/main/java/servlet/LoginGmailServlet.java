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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	Usuario u;
	UsuarioDAO dao = new UsuarioDAO();

	String resposta = dao.loginGmail(request.getParameter("email"));
	if (resposta != null) {
	    u = dao.buscarPeloEmail(resposta);
	    if (u != null) {
		request.getSession().setAttribute("usuario", u);
		response.sendRedirect("../adopets/usuario_comum/visao_geral.jsp");
	    }
	}

    }

}
