/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercatodesktop.DAO.Class.UserService;
import mercatodesktop.Model.User;

/**
 *
 * @author PC-Yassine
 */
public class MercatoDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UserService us = new UserService();
            User u = new User();
            u.setName("yassouna");
            System.out.println(u.toString());
            us.addUser(u);
            
        } catch (IOException ex) {
            Logger.getLogger(MercatoDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
