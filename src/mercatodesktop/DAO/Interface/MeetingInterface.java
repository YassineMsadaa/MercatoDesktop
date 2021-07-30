/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Interface;

import java.util.List;
import mercatodesktop.Model.Meeting;

/**
 *
 * @author PC-Yassine
 */
public interface MeetingInterface {
    public void createMeeting(Meeting m);
    public Meeting getMeetingById(int id);
    public void updateMeeting(Meeting m);
    public void deleteMeeting(Meeting m);
    public List<Meeting> getAll();
    public List<Meeting> getMeetingByManagerId(int mId);
    public List<Meeting> getMeetingBySportsmanId(int sId);
        
}
