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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Predator
 */
public class ConductController implements Initializable {

    
    @FXML
    ImageView backBtn;
    @FXML
    ImageView homeBtn;
          
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void goHome() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Portal.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }    
    
}
