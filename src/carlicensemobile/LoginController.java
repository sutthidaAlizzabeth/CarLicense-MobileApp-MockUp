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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class LoginController implements Initializable {

    @FXML
    TextField personId;
    @FXML
    PasswordField password;
    @FXML
    Button loginBtn;
    @FXML
    Text msg;
    
    String exId = "1101500764377";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void goLogin() throws IOException{
        String id = personId.getText();
        String pwd = password.getText();
        if(id.equals(exId) && pwd.equals("123")){
            Parent page = FXMLLoader.load(getClass().getResource("Portal.fxml"));
            Scene scene = new Scene(page);
            Stage stage = (Stage) loginBtn.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
            msg.setVisible(false);
        }else{
            msg.setVisible(true);
        }
    }
    
}
