/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlicensemobile;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class RegistController implements Initializable {
    @FXML
    private Button send;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoLogin(ActionEvent event) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) send.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
