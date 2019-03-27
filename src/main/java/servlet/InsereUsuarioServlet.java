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
/**
 *
 * @author eduardo
 */
@WebServlet(name = "InsereUsuarioServlet", urlPatterns = {"/InsereUsuarioServlet"})
public class InsereUsuarioServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Usuario usuario = new Usuario();
        
        usuario.setEmail(req.getParameter("email"));
        usuario.setNome(req.getParameter("nome"));
        usuario.setSenha(req.getParameter("senha"));
        
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(usuario);
        
        PrintWriter out = resp.getWriter();
        out.println("Cadastro realizado com sucesso!");
        
    }
    
}
