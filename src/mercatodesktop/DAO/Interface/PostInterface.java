/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.Post;

/**
 *
 * @author PC-Yassine
 */
public interface PostInterface {
    public void addPost();
    public Post getpostbyid(Post post);
    public void updatePost(Post post);
    public void deletePost(Post post);
    public List<Post> showAll();
    public List<Post> getPostByUserId(int userId);
    
}
