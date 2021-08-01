 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.Model;

import java.util.Date;

/**
 *
 * @author PC-Yassine
 */
public class Post {
    private int postid;
    private String title;
    private String body;
    private String image;
    private int userId;
    private Date creationDate ; 
    private Date modifDate ; 

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titre) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifDate() {
        return modifDate;
    }

    public void setModifDate(Date modifDate) {
        this.modifDate = modifDate;
    }

    @Override
    public String toString() {
        return "Post{" + "postid=" + postid + ", title=" + title + ", body=" + body + ", image=" + image + ", userId=" + userId + ", creationDate=" + creationDate + ", modifDate=" + modifDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        if (this.postid != other.postid) {
            return false;
        }
        return true;
    }

    public Post() {
    }

    public Post(int postid, String title, String body, String image, int userId, Date creationDate, Date modifDate) {
        this.postid = postid;
        this.title = title;
        this.body = body;
        this.image = image;
        this.userId = userId;
        this.creationDate = creationDate;
        this.modifDate = modifDate;
    }
    
    
}
