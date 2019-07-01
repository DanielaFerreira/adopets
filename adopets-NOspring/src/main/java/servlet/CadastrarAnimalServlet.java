/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.AnimalDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Animal;

/**
 *
 * @author eddunic
 */
public class CadastrarAnimalServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Animal animal = new Animal();

        animal.setNome(request.getParameter("nome"));
        animal.setTipo(request.getParameter("tipo"));
        animal.setRaça(request.getParameter("raca"));
        animal.setDataNasc(request.getParameter("dataNasc"));
        animal.setSexo(request.getParameter("sexo"));
        animal.setNecessidade(request.getParameter("necessidade"));
        //animal.setTempoEspera(request.getParameter("tempoEspera")); //é o sistema que faz 
        animal.setFoto(request.getParameter("foto").getBytes());
        //animal.setSituacao(request.getParameter("situacao"));//é o sit. que faz
        
        animal.setTamanho(request.getParameter("tamanho"));
        animal.setDescricao(request.getParameter("descricao"));

        AnimalDAO dao = new AnimalDAO();
        dao.inserir(animal);

    }

}