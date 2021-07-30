/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.Cart;

/**
 *
 * @author PC-Yassine
 */
public interface CartInterface {
    public void addProduct(Cart c);
    public void deletProduct(Cart c);
    public void deleteAll();
    public List<Cart> getByUser(int userId);
}
