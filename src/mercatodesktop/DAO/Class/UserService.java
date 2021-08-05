/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.DAO.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercatodesktop.Config.DataBase;
import mercatodesktop.DAO.Interface.UserInterface;
import mercatodesktop.Model.User;

/**
 *
 * @author PC-Yassine
 */
public class UserService implements UserInterface{


   private Connection db = DataBase.getInstance().getConnection();

    @Override
    public void addUser(User u) {
        try {
            String req = "INSERT INTO user (username,roles,email,password,name,lastName,birthDate,birthPlace,gender,profile_pic,sponsorship,balance,sport,jobStatus,healthStatus,resume,height,weight,sportPosition,sponsorshipDate,spEndDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = db.prepareStatement(req);
            pst.setString(1, u.getUsername());
            pst.setString(2, u.getRoles());
            pst.setString(3, u.getEmail());
            pst.setString(4, u.getPassword());
            pst.setString(5, u.getName());
            pst.setString(6, u.getLastName());
            pst.setDate(7, u.getBirthDate());
            pst.setString(8, u.getBirthPlace());
            pst.setString(9, u.getGender());
            pst.setString(10, u.getProfile_pic());
            pst.setString(11, u.getSponsorship());
            pst.setInt(12, u.getBalance());
            pst.setString(13, u.getSport());
            pst.setString(14, u.getJobStatus());
            pst.setString(15, u.getHealthStatus());
            pst.setString(16, u.getResume());
            pst.setInt(17, u.getHeight());
            pst.setInt(18, u.getWeight());
            pst.setString(19, u.getSportPosition());
            pst.setDate(20, u.getSponsorshipDate());
            pst.setDate(21, u.getSpEndDate());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void deleteUser(User u) {
        try {
            String requete = "DELETE FROM user WHERE id=?";
            PreparedStatement pst = db.prepareStatement(requete);
            pst.setInt(1, u.getId());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void modifyUser(User u) {
    
        try {
            String req = "UPDATE user SET username= ?,roles= ?,email= ?,password= ?,name= ?,lastName= ?,birthDate= ?,birthPlace= ?,gender= ?,profile_pic= ?,sponsorship= ?,balance= ?,sport= ?,jobStatus= ?,healthStatus= ?,resume= ?,height= ?,weight= ?,sportPosition= ?,sponsorshipDate= ?,spEndDate= ? WHERE id=?";
            PreparedStatement pst = db.prepareStatement(req);
            pst.setInt(22, u.getId());
            pst.setString(1, u.getUsername());
            pst.setString(2, u.getRoles());
            pst.setString(3, u.getEmail());
            pst.setString(4, u.getPassword());
            pst.setString(5, u.getName());
            pst.setString(6, u.getLastName());
            pst.setDate(7, u.getBirthDate());
            pst.setString(8, u.getBirthPlace());
            pst.setString(9, u.getGender());
            pst.setString(10, u.getProfile_pic());
            pst.setString(11, u.getSponsorship());
            pst.setInt(12, u.getBalance());
            pst.setString(13, u.getSport());
            pst.setString(14, u.getJobStatus());
            pst.setString(15, u.getHealthStatus());
            pst.setString(16, u.getResume());
            pst.setInt(17, u.getHeight());
            pst.setInt(18, u.getWeight());
            pst.setString(19, u.getSportPosition());
            pst.setDate(20, u.getSponsorshipDate());
            pst.setDate(21, u.getSpEndDate());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM user";
            PreparedStatement pst = db.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new User());
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public User getUserById(int userId) {
        User u= new User();
        String Sql = "SELECT * FROM user where id = '" + userId + "'";
        try{
            Statement st = db.createStatement();
            ResultSet result = st.executeQuery(Sql);
            while (result.next()) {

                u.setId(result.getInt("id"));
                u.setUsername(result.getString("username"));
                u.setRoles(result.getString("roles"));
                u.setEmail(result.getString("email"));
                u.setPassword(result.getString("password"));
                u.setName(result.getString("name"));
                u.setLastName(result.getString("lastName"));
                u.setBirthDate(result.getDate("birthDate"));
                u.setBirthPlace(result.getString("birthPlace"));
                u.setGender(result.getString("gender"));
                u.setProfile_pic(result.getString("profile_pic"));
                u.setSponsorship(result.getString("sponsorship"));
                u.setBalance(result.getInt("balance"));
                u.setSport(result.getString("sport"));
                u.setJobStatus(result.getString("jobStatus"));
                u.setHealthStatus(result.getString("healthStatus"));
                u.setResume(result.getString("resume"));
                u.setSponsorship(result.getString("sponsorship"));
                u.setHeight(result.getInt("height"));
                u.setWeight(result.getInt("weight"));
                u.setSportPosition(result.getString("sportPosition"));
                u.setSponsorshipDate(result.getDate("sponsorshipDate"));
                u.setSpEndDate(result.getDate("spEndDate"));
            }
  
        }catch(SQLException ex) {

        }
        
        return u;
    }

    @Override
    public List<User> getUserByRole(String role) {
        List<User> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM user WHERE role="+ role;
            PreparedStatement pst = db.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new User());
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public List<User> getUserBySport(String sport) {
        List<User> list = new ArrayList<>();

        try {
            String requete = "SELECT * FROM user WHERE sport="+ sport;
            PreparedStatement pst = db.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new User());
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return list;
    }
    
}
