package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author eduardo
 */
@WebServlet(name = "BuscaUsuarioServlet", urlPatterns = {"/BuscaUsuarioServlet"})
public class BuscaUsuarioServlet extends HttpServlet {

    List<Usuario> usuarios;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Usuario usuario = new Usuario();

        usuario.setEmail(req.getParameter("email"));
        usuario.setSenha(req.getParameter("senha"));

        UsuarioDAO dao = new UsuarioDAO();

        usuarios = dao.buscar(usuario);

        PrintWriter out = resp.getWriter();

        if (!usuarios.isEmpty()) {
            out.println("Bem-vindo!");
        } else {
            out.println("Cadastro inexistente.");
        }

    }

}
