/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.GUI;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.application.Application;
import static javafx.application.Application.launch;


/**
 *
 * @author PC-Yassine
 */
public class MercatoDesktop extends Application {

    /**
     * @param stage
     * @param args the command line arguments
     */        
        
    @Override
    public void start(Stage stage) throws Exception {
    
        Parent root = FXMLLoader.load(getClass().getResource("/mercatodesktop/GUI/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(new Image("/mercatodesktop/assets/logos/logo-mercato-small2.png"));
        stage.setResizable(false);
        stage.show();

    }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

