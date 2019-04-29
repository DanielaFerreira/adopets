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
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        List<Usuario> usuarios;

        Usuario usuario = new Usuario();

        if (!"".equals(request.getParameter("email")) && !"".equals(request.getParameter("senha"))) {

            usuario.setEmail(request.getParameter("email"));
            usuario.setSenha(request.getParameter("senha"));

            UsuarioDAO dao = new UsuarioDAO();

            usuarios = dao.buscar(usuario);

            if (!usuarios.isEmpty()) {
                out.println("Bem-vindo!");
                String pagina = "../adopets/usuario_comum/visao_geral.jsp";
                request.setAttribute("email", request.getParameter("email"));
                response.sendRedirect(pagina);
            } else {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Adopets</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<script language = 'JavaScript'>");
                out.println("    alert('Cadastro inexistente'); window.location.href='../adopets/entrada/login.html';");
                out.println(" </script>");
                out.println("</body>");
                out.println("</html>");
                out.close();
            }
        }
    }

}
