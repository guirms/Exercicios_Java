package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button botaoTeste;
	
	@FXML
	public void onBotaoTesteAction() {
		Alerts.showAlert("Titulo de alerta", "Alerta", "Olá", AlertType.INFORMATION);
	}

}
