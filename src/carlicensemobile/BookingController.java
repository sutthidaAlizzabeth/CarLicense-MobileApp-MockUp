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
import javafx.scene.control.MenuButton;
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
    GridPane reserveTrainBtn;
    @FXML
    GridPane reserveTestBtn;
    @FXML
    GridPane editBookBtn;
    @FXML
    GridPane cancelBookBtn;
    //!--Booking.fxml--

    //--BookingReserv--
    @FXML
    ImageView backToBookingBtn;
    @FXML
    Button processReserveBtn;
    @FXML
    MenuButton province;
    @FXML
    MenuButton Office;
    @FXML
    MenuButton Month;
    @FXML
    MenuButton Date;
    @FXML
    MenuButton Year;
    //!--BookingReserv--

    //--BookingEdit--
    @FXML
    Button processEditReserveBtn;
    //!--BookingEdit--

    //--BookingCancle--
    @FXML
    Button confirmCancelBtn;
    @FXML
    Button notCancelBtn;
    //!--BookingCancle--
    
    //--BookingReservConfirm--
    @FXML
    Button confirmReserve;
    @FXML
    Button notConfirmReserve;
    //!--BookingReservConfirm--
    
    //--BookingReservConfirmResult BookingCancleResult--
    @FXML
    Button goToPortal;
    //--BookingReservConfirmResult BookingCancleResult--
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

    public void goHome() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Portal.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goReserveTest() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTest.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goReserveTrain() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTrain.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goBooking() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Booking.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goBookingEdit() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingEdit.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goCancel() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTrainConfirm.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void processReserveTrain() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTrainConfirm.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //goHome();
    }
    
    public void processReserveTest() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTestConfirm.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //goHome();
    }

    public void processEditReserve() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservEditConfirm.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) homeBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //goHome();
    }

    @FXML
    public void calcelConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingCancleResult.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notCancelBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void calcelNotConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Booking.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notCancelBtn.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void reserveTrainConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTrainConfirmResult.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notConfirmReserve.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void reserveTestConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTestConfirmResult.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notConfirmReserve.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void reserveEditConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservEditConfirmResult.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notConfirmReserve.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void reserveTrainNotConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTrain.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notConfirmReserve.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void reserveTestNotConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingReservTest.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notConfirmReserve.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void reserveEditNotConfirm() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("BookingEdit.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) notConfirmReserve.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    public void goToPortal() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Portal.fxml"));
        Scene scene = new Scene(page);
        Stage stage = (Stage) goToPortal.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void setY2558() {
        Year.setText("2558");
    }

    public void setY2559() {
        Year.setText("2559");
    }

    public void setD9() {
        Date.setText("9");
    }

    public void setD11() {
        Date.setText("11");
    }

    public void setD15() {
        Date.setText("15");
    }

    public void setD23() {
        Date.setText("23");
    }

    public void setD28() {
        Date.setText("28");
    }

    public void setMeenakom() {
        Month.setText("มีนาคม");
    }

    public void setKarakkadakom() {
        Month.setText("กรกฎาคม");
    }

    public void setTurakom() {
        Month.setText("ตุลาคม");
    }

    public void setThanwakom() {
        Month.setText("ธันวาคม");
    }

    public void setP2() {
        Office.setText("สำนักงานขนส่งเขตพื้นที่ 2");
    }

    public void setP5() {
        Office.setText("สำนักงานขนส่งเขตพื้นที่ 5");
    }

    public void setP9() {
        Office.setText("สำนักงานขนส่งเขตพื้นที่ 9");
    }

    public void setBangkok() {
        province.setText("กรุงเทพมหานคร");
    }

    public void setKrabi() {
        province.setText("กระบี่");
    }

    public void setKarnjanaburi() {
        province.setText("กาญจนบุรี");
    }

    public void setKarasin() {
        province.setText("กาฬสินธุ์");
    }

    public void setKampanpet() {
        province.setText("กำแพงเพชร");
    }

    public void setKornkan() {
        province.setText("ขอนแก่น");
    }

    public void setChantaburi() {
        province.setText("จันทบุรี");
    }

    public void setChachengsal() {
        province.setText("ฉะเชิงเทรา");
    }

    public void setChonburi() {
        province.setText("ชลบุรี");
    }

    public void setChainart() {
        province.setText("ชัยนาท");
    }

    public void setChaipoom() {
        province.setText("ชัยภูมิ");
    }

    public void setChumporn() {
        province.setText("ชุมพร");
    }

    public void setChengrai() {
        province.setText("เชียงราย");
    }

    public void setChengmai() {
        province.setText("เชียงใหม่");
    }

    public void setTrung() {
        province.setText("ตรัง");
    }

    public void setTrad() {
        province.setText("ตราด");
    }

    public void setTark() {
        province.setText("ตาก");
    }

    public void setNakornnayok() {
        province.setText("นครนายก");
    }

    public void setNakornpatum() {
        province.setText("นครปฐม");
    }

    public void setNakornpanum() {
        province.setText("นครพนม");
    }

    public void setNakornrakchasrima() {
        province.setText("นครราชสีมา");
    }

    public void setNakornsritammarad() {
        province.setText("นครศรีธรรมราช");
    }

    public void setNakornsawan() {
        province.setText("นตรสวรรค์");
    }

    public void setNonthaburi() {
        province.setText("นนทบุรี");
    }

    public void setNarathiwad() {
        province.setText("นราธิวาส");
    }

    public void setNan() {
        province.setText("น่าน");
    }

    public void setBungkarp() {
        province.setText("บึงกาฬ");
    }

    public void setBurirum() {
        province.setText("บุรีรัมย์");
    }

    public void setPratumthani() {
        province.setText("ปธุมธานี");
    }

    public void setPrajurbkririkun() {
        province.setText("ประจวบตีรีขันธ์");
    }

    public void setPrajeanburi() {
        province.setText("ปราจีนบุรี");
    }

    public void setPatthani() {
        province.setText("ปัตตานี");
    }

    public void setAyutya() {
        province.setText("พระนครศรีอยุธยา");
    }

    public void setPangnga() {
        province.setText("พังงา");
    }

    public void setPattharung() {
        province.setText("พัทลุง");
    }

    public void setPijit() {
        province.setText("พิจิตร");
    }

    public void setPitsanurok() {
        province.setText("พิษณุโลก");
    }

    public void setPetburi() {
        province.setText("เพชรบุรี");
    }

    public void setPetboon() {
        province.setText("เพชรบูรณ์");
    }

    public void setPrae() {
        province.setText("แพร่");
    }

    public void setPrayal() {
        province.setText("พะเยา");
    }

    public void setPhuget() {
        province.setText("ภูเก็ต");
    }

    public void setMahasarakarm() {
        province.setText("มหาสารคาม");
    }

    public void setMookdaharn() {
        province.setText("มุกดาหาร");
    }

    public void setMaehongsorn() {
        province.setText("แม่ฮ่องสอน");
    }

    public void setYara() {
        province.setText("ยะลา");
    }

    public void setYasothorn() {
        province.setText("ยโสธร");
    }

    public void setRoied() {
        province.setText("ร้อยเอ็ด");
    }

    public void setRanong() {
        province.setText("ระนอง");
    }

    public void setRayong() {
        province.setText("ระยอง");
    }

    public void setRadburi() {
        province.setText("ราชบุรี");
    }

    public void setRopburi() {
        province.setText("ลพบุรี");
    }

    public void setRampang() {
        province.setText("ลำปาง");
    }

    public void setRampoon() {
        province.setText("ลำพูน");
    }

    public void setRei() {
        province.setText("เลย");
    }

    public void setSrisakerd() {
        province.setText("ศรีสะเกษ");
    }

    public void setSakonnakorn() {
        province.setText("สกลนคร");
    }

    public void setSongkra() {
        province.setText("สงขลา");
    }

    public void setSatoon() {
        province.setText("สตูล");
    }

    public void setSamudprakarn() {
        province.setText("สมุทรปราการ");
    }

    public void setSamudsongkram() {
        province.setText("สมุทรสงคราม");
    }

    public void setSamudsakorn() {
        province.setText("สมุทรสาคร");
    }

    public void setSrakaew() {
        province.setText("สระแก้ว");
    }

    public void setSraburi() {
        province.setText("สระบุรี");
    }

    public void setSingburi() {
        province.setText("สิงห์บุรี");
    }

    public void setSukothai() {
        province.setText("สุโขทัย");
    }

    public void setSuphanburi() {
        province.setText("สุพรรณบุรี");
    }

    public void setSuradthani() {
        province.setText("สุราษฎ์ธานี");
    }

    public void setSurin() {
        province.setText("สุรินทร์");
    }

    public void setNongcry() {
        province.setText("หนองคาย");
    }

    public void setNongbuarumpu() {
        province.setText("หนองบัวลำภู");
    }

    public void setAngtong() {
        province.setText("อ่างทอง");
    }

    public void setAudornthani() {
        province.setText("อุดรธานี");
    }

    public void setAuthaithanee() {
        province.setText("อุทัยธานี");
    }

    public void setAutharadit() {
        province.setText("อุตรดิตถ์");
    }

    public void setAubonradchathani() {
        province.setText("อุบลราชธานี");
    }

    public void setAumnadcharoen() {
        province.setText("อำนาจเจริญ");
    }
}
