/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.Product;

/**
 *
 * @author PC-Yassine
 */
public interface ProductInterface {
    public void addProduct(Product p);
    public Product getProductById(int id);
    public void updateProduct(Product p);
    public void deleteProduct(int id);
    public List<Product> showAll();
    public List<Product> getProductByUserId(int userId);
    public List<Product> getMyProductsByName(int i ,String name);
    public List<Product> getProductByName(String name);
}
