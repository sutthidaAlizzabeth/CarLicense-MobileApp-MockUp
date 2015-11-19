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
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alizzabeth
 */
public class BookingController implements Initializable {
    
    //--Main--
    @FXML
    ImageView homeBtn;
    //--------
    
    //--Booking.fxml--
    @FXML
    ImageView backToPortalBtn;
    @FXML
    GridPane reserveBtn;
    @FXML
    GridPane editBookBtn;
    @FXML
    GridPane cancelBookBtn;
    //!--Booking.fxml--
    
    //--BookingReserv1--
    @FXML
    ImageView backToBookingBtn;
    @FXML
    Button processReserveBtn;
    //!--BookingReserv1--
    
    //--BookingEdit1--
    @FXML
    Button processEditReserveBtn;
    //!--BookingEdit1--
    
    //--BookingCancle--
    @FXML
    Button confirmCancelBtn;
    @FXML
    Button notCancelBtn;
    //!--BookingCancle--
    
    @FXML
    Button confirmReserve;
    @FXML
    Button notConfirmReserve;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void goHome() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Portal.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage)homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goReserve() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("BookingReserv1.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage)homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goBooking() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Booking.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goBookingEdit() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("BookingEdit1.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goCancel() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("BookingCancle.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void processReserve() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservConfirm.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //goHome();
    }

    public void processEditReserve() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservConfirm.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //goHome();
    }
    
    @FXML
    public void calcelConfirm() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Portal.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notCancelBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void calcelNotConfirm() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Booking.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notCancelBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void reserveConfirm() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("Booking.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notCancelBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void reserveNotConfirm() throws IOException{
        Parent page = FXMLLoader.load(getClass().getResource("BookingReserv1.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notCancelBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
