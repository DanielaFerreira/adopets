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

//        UsuarioDAO dao = new UsuarioDAO();
//
//        List<Usuario> usuarios;
//
//        usuarios = dao.buscar3(request.getParameter("email"));
//
//        System.out.println(request.getParameter("email"));
//
//        System.out.println(usuarios);
//
//        PrintWriter out = response.getWriter();
//
//        if (!usuarios.isEmpty()) {
//            response.sendRedirect("../adopets/usuario_comum/visao_geral.jsp");
//        } else {
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Adopets</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<script language = 'JavaScript'>");
//            out.println("    alert('Cadastro inexistente'); window.location.href='../adopets/entrada/login.html';");
//            out.println(" </script>");
//            out.println("</body>");
//            out.println("</html>");
//            out.close();
//        }
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