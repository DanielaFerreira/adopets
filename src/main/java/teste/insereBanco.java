/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.AdminDAO;
import model.Admin;

/**
 *
 * @author eddunic
 */
public class insereBanco {
    
    //teste beans com hibernate
    public static void main(String[] args) {
	
	Admin a = new Admin();
	a.setNome("Eduardinho");	
	a.setEmail("aa");
	AdminDAO b = new AdminDAO();
	b.inserir(a);
    
    }
    
}
