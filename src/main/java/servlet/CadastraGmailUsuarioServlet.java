package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UsuarioDAO;
import model.Usuario;

/**
 *
 * @author eduardo
 */
public class CadastraGmailUsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email"); 
        System.out.println(email);

//
//        Usuario usuario = new Usuario();
//
//        String email = String.valueOf(dao.buscarEmail(request.getParameter("codigo"))).replace("[", "").replace("]", "");
//
//        userTemp.setEmail(email);
//        userTemp.setNome(nome);
//        userTemp.setSenha(senha);
//
//        usuario.setEmail(userTemp.getEmail());
//        usuario.setNome(userTemp.getNome());
//        usuario.setSenha(userTemp.getSenha());
//
//        UsuarioDAO dao2 = new UsuarioDAO();
//        dao2.inserir(usuario);
//        System.out.println("Usuário cadastrado!");
//
//        out.println("Você foi cadastrado com sucesso!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
