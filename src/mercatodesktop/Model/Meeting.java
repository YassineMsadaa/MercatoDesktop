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
public class Meeting {
    
    private int meetingId;
    private int userIdManager;
    private int userIdSportsman;
    private String title;
    private String body;
    private Date date;
    private Date creationDate;
    private String Confirmation;

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public int getUserIdManager() {
        return userIdManager;
    }

    public void setUserIdManager(int userIdManager) {
        this.userIdManager = userIdManager;
    }

    public int getUserIdSportsman() {
        return userIdSportsman;
    }

    public void setUserIdSportsman(int userIdSportsman) {
        this.userIdSportsman = userIdSportsman;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getConfirmation() {
        return Confirmation;
    }

    public void setConfirmation(String Confirmation) {
        this.Confirmation = Confirmation;
    }

    @Override
    public String toString() {
        return "Meeting{" + "meetingId=" + meetingId + ", userIdManager=" + userIdManager + ", userIdSportsman=" + userIdSportsman + ", title=" + title + ", body=" + body + ", date=" + date + ", creationDate=" + creationDate + ", Confirmation=" + Confirmation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Meeting other = (Meeting) obj;
        if (this.meetingId != other.meetingId) {
            return false;
        }
        return true;
    }

    public Meeting() {
    }
    
    public Meeting(int meetingId, int userIdManager, int userIdSportsman, String title, String body, Date date, Date creationDate, String Confirmation) {
        this.meetingId = meetingId;
        this.userIdManager = userIdManager;
        this.userIdSportsman = userIdSportsman;
        this.title = title;
        this.body = body;
        this.date = date;
        this.creationDate = creationDate;
        this.Confirmation = Confirmation;
    }
    
    
}
