/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import mercatodesktop.Model.Like;

/**
 *
 * @author PC-Yassine
 */
public interface LikeInterface {
    public void addLike(Like t);
    public void deleteLike(Like t);
    public int countLikeByCommentId(int commentId);
    public int countLikeByPostId(int PostId);
    
}
