/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.Comment;

/**
 *
 * @author PC-Yassine
 */
public interface CommentInterface {
    public void addComment(Comment t);
    public Comment getCommentById (int commentId);
    public void deleteComment(Comment t);
    public void modifyComment(Comment t);
    public List<Comment> showAll();
    
}
