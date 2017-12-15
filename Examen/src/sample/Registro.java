package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Registro {
    @FXML
    TextField txt_nombre;
    @FXML
    TextField txt_ape;
    @FXML
    TextField txt_cedu;
    @FXML
    TextField txt_tele;
    @FXML
    TextField txt_coclu;
    @FXML
    Button btn_enviar;

    public void nombre(ActionEvent actionEvent) {
    }

    public void ape(ActionEvent actionEvent) {
    }

    public void cedu(ActionEvent actionEvent) {
    }

    public void tele(ActionEvent actionEvent) {
    }

    public void conclu(ActionEvent actionEvent) {
    }

    public void enviar(ActionEvent actionEvent) {
        String nom = new String(txt_nombre.getText());
        String ape = new String(txt_ape.getText());
        String cedu = new String(txt_cedu.getText());
        String tele = new String(txt_tele.getText());
        String coclu = new String(txt_coclu.getText());

        Stage stage = (Stage) btn_enviar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("factura.fxml"));

        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.showAndWait();
            Platform.exit();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
