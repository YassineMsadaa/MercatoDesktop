/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.GUI;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mercatodesktop.Config.DataBase;
import mercatodesktop.Model.User;

/**
 * FXML Controller class
 *
 * @author PC-Yassine
 */
public class LoginController implements Initializable {

    @FXML
    private Button bntSignup;
    @FXML
    private TextField Username_login;
    @FXML
    private PasswordField Password_login;
    @FXML
    private Button btnlogin;
    public static int LoggedUserId;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        btnlogin.setOnAction((ActionEvent e) -> {
            try {
                Connection db = DataBase.getInstance().getConnection();
                String Sql = "SELECT * FROM user where username = '" + Username_login.getText() + "' and password = '" + Password_login.getText() + "'";
                Statement st;
                st = db.createStatement();
                ResultSet rs = st.executeQuery(Sql);
                User u = new User();
                while (rs.next()) {
                    u.setId(rs.getInt("id"));
                    LoggedUserId = u.getId();
                    u.setRoles(rs.getString("roles"));
                   
                }
                String role=u.getRoles();
                if ( role.equals("admin")){
                    Stage stage = new Stage();
                    Stage stageprev = (Stage) btnlogin.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("HubAdmin.fxml"));
                    Parent parent = loader.load();
                    Scene scene = new Scene(parent);
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.show();
                    stageprev.close();
                }else if(role.equals("athlete") || role.equals("manager")){
                Stage stage = new Stage();
                    Stage stageprev = (Stage) btnlogin.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Hub.fxml"));
                    Parent parent = loader.load();
                    Scene scene = new Scene(parent);
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.show();
                    stageprev.close();
                }else{
                    System.out.println("check ur password or user name");
                }
            }catch (IOException | SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });    
    
}
}
