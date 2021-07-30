/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.User;

/**
 *
 * @author PC-Yassine
 */
public interface UserInterface {
    public void addUser(User u) ; 
    public void deleteUser(User u);
    public void modifyUser(User u);
    public List<User> ShowAll();
    public User getUserById(int userId);
    public List<User> getUserByRole(String role);
    public List<User> getUserBySport(String sport);
}
