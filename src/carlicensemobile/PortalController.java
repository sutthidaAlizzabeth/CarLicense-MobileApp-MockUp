/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlicensemobile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class PortalController implements Initializable {

    @FXML
    GridPane bookBtn;
    @FXML
    GridPane scoreBtn;
    @FXML
    GridPane mapBtn;
    @FXML
    GridPane logoutBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void goBook() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Booking.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) logoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goScore() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("conduct.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) logoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goMap() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Map.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) logoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goLogout() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) logoutBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
