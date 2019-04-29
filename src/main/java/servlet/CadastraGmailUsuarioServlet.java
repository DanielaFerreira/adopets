package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UsuarioDAO;
import java.util.List;
import model.Usuario;

/**
 *
 * @author eduardo
 */
public class CadastraGmailUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        UsuarioDAO dao = new UsuarioDAO();

        List<Usuario> usuarios;

        usuarios = dao.buscar3(request.getParameter("email"));

        if (usuarios.isEmpty()) {
            Usuario usuario = new Usuario();
            usuario.setEmail(request.getParameter("email"));
            usuario.setNome(request.getParameter("nome"));
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
        } else {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Adopets</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<script language = 'JavaScript'>");
            out.println("    alert('Conta já existente, tente outra.'); window.location.href='../adopets/entrada/cadastro.html';");
            out.println(" </script>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }

    }

}
