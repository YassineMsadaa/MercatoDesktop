/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.Model;

import java.sql.Date;

/**
 *
 * @author PC-Yassine
 */
public class Reclamation {
    private int recId;
    private String title;
    private String body;
    private String subject;
    private int userId;
    private Date date;
    private String problemeStatus;

    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProblemeStatus() {
        return problemeStatus;
    }

    public void setProblemeStatus(String problemeStatus) {
        this.problemeStatus = problemeStatus;
    }

    @Override
    public String toString() {
        return "Reclamation{" + "recId=" + recId + ", title=" + title + ", body=" + body + ", subject=" + subject + ", userId=" + userId + ", date=" + date + ", problemeStatus=" + problemeStatus + '}';
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
        final Reclamation other = (Reclamation) obj;
        if (this.recId != other.recId) {
            return false;
        }
        return true;
    }
    
    
}
