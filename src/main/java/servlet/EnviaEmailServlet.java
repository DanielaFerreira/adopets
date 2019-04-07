package servlet;

import dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import org.apache.commons.mail.EmailException;
import util.CommonsMail;

/**
 *
 * @author eduardo
 */
@WebServlet(name = "EnviaEmailServlet", urlPatterns = {"/EnviaEmailServlet"})
public class EnviaEmailServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        List<Usuario> usuarios;

        if (req.getParameter("email") != null && req.getParameter("nome") != null && req.getParameter("senha") != null) {
            Usuario usuario = new Usuario();

            usuario.setEmail(req.getParameter("email"));

            UsuarioDAO dao = new UsuarioDAO();

            usuarios = dao.buscar2(usuario);

            if (!usuarios.isEmpty()) {
                out.println("Conta já existente.");

            } else {

                try {
                    CommonsMail.enviarEmail(req.getParameter("email"));

                    out.println("Enviamos um email de confirmação de conta para você!");
                } catch (EmailException ex) {
                    Logger.getLogger(EnviaEmailServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
        } else {
            out.println("Volte e complete o formulário.");
        }
        
    }

}
