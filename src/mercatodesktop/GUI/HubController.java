/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercatodesktop.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import mercatodesktop.DAO.Class.UserService;
import mercatodesktop.GUI.LoginController;
import mercatodesktop.Model.User;

/**
 * FXML Controller class
 *
 * @author PC-Yassine
 */
public class HubController implements Initializable {

    @FXML
    private Pane paneNewsFeed;
    @FXML
    private Pane paneProfils;
    @FXML
    private Pane paneMeeting;
    @FXML
    private Pane paneMarketplace;
    @FXML
    private Pane MyProfileMenu;
    @FXML
    private Button buttonMyProfil;
    @FXML
    private ImageView PhotoMyProfil;
    @FXML
    private Text nameLastNameMyProfile;
    @FXML
    private Text emailMyProfil;
    @FXML
    private Text balanceMyProfil;
    @FXML
    private Text sponsorshipMyProfile;
    @FXML
    private Button btnBalance;
    @FXML
    private Button btnSponsorship;
    @FXML
    private Pane viewmenu;
    @FXML
    private Text view1;
    @FXML
    private Text view2;
    @FXML
    private Text view3;
    @FXML
    private Text view4;
    @FXML
    private Button bview1;
    @FXML
    private Button bview2;
    @FXML
    private Button bview3;
    @FXML
    private Button bview4;
    @FXML
    private Button buttonViews;
    @FXML
    private Pane dropDownMenuProfile;
    @FXML
    private Text userNameDDM;
    @FXML
    private ImageView photoProfileDDM;
    @FXML
    private ImageView home;
    @FXML
    private ImageView viewnotif;
    @FXML
    private Pane PaneReclamation;
    public static int loggedUserId;
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        User u;
        u = new User();
        UserService us = new UserService();
        u = us.getUserById(LoginController.LoggedUserId);
        System.out.println(u.toString());
        if ( u.getSponsorship().equals("Premium") ){
            paneMarketplace.setVisible(true);
            viewnotif.setVisible(true);
            viewmenu.setVisible(true);
            
        }
        nameLastNameMyProfile.setText(u.getName() + " " + u.getLastName());
        userNameDDM.setText(u.getUsername());
        sponsorshipMyProfile.setText(u.getSponsorship());
        emailMyProfil.setText(u.getEmail());
        balanceMyProfil.setText(String.valueOf(u.getBalance()));
        
        
        
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Animations @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        
        TranslateTransition openview;
        openview = new TranslateTransition(new Duration(450), viewmenu);
        TranslateTransition closeview;
        closeview = new TranslateTransition(new Duration(450), viewmenu);

        viewnotif.setOnMouseClicked((MouseEvent event61) -> {
            openview.setToY(viewmenu.getHeight());
            openview.play();
        });

        viewmenu.setOnMouseExited((MouseEvent event61) -> {

            closeview.setToY(-(viewmenu.getHeight()));
            closeview.play();

        });
        viewnotif.setOnMouseEntered((MouseEvent event5) -> {
            TranslateTransition transTransition = TranslateTransitionBuilder.create()
                    .duration(new Duration(140))
                    .node(viewnotif)
                    .toY(-3)
                    .interpolator(Interpolator.LINEAR)
                    .cycleCount(1).
                    onFinished(e -> {
                        TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                .duration(new Duration(140))
                                .node(viewnotif)
                                .toY(3)
                                .interpolator(Interpolator.LINEAR)
                                .cycleCount(1)
                                .build();
                        transTransition2.play();
                    })
                    .build();
            transTransition.play();
        });

        TranslateTransition openNavi = new TranslateTransition(new Duration(450), MyProfileMenu);
        TranslateTransition closeNavi = new TranslateTransition(new Duration(450), MyProfileMenu);

        dropDownMenuProfile.setOnMouseClicked((MouseEvent event60) -> {
            openNavi.setToY(MyProfileMenu.getHeight());
            openNavi.play();
        });

        MyProfileMenu.setOnMouseExited((MouseEvent event60) -> {

            closeNavi.setToY(-(MyProfileMenu.getHeight()));
            closeNavi.play();

        });
        dropDownMenuProfile.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(dropDownMenuProfile)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(dropDownMenuProfile)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                }
        );

        home.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(home)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(home)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                });
        paneMarketplace.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(paneMarketplace)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(paneMarketplace)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                });
        paneMeeting.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(paneMeeting)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(paneMeeting)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                });
        paneProfils.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(paneProfils)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(paneProfils)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                });
        paneNewsFeed.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(paneNewsFeed)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(paneNewsFeed)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                });
        PaneReclamation.setOnMouseEntered(
                (MouseEvent event4) -> {
                    TranslateTransition transTransition = TranslateTransitionBuilder.create()
                            .duration(new Duration(140))
                            .node(PaneReclamation)
                            .toY(-3)
                            .interpolator(Interpolator.LINEAR)
                            .cycleCount(1).
                            onFinished(e -> {
                                TranslateTransition transTransition2 = TranslateTransitionBuilder.create()
                                        .duration(new Duration(140))
                                        .node(PaneReclamation)
                                        .toY(3)
                                        .interpolator(Interpolator.LINEAR)
                                        .cycleCount(1)
                                        .build();
                                transTransition2.play();
                            })
                            .build();
                    transTransition.play();
                });
        
        
        
    }    
    
}
