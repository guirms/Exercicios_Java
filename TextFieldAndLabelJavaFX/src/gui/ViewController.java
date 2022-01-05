package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private TextField txtNumero1;

	@FXML
	private TextField txtNumero2;

	@FXML
	private Label labelResultado;

	@FXML
	private Button botaoSoma;

	@FXML
	public void onBotaoSomaAction() {
		Locale.setDefault(Locale.US);
			try {
		double num1 = Double.parseDouble(txtNumero1.getText());
		double num2 = Double.parseDouble(txtNumero2.getText());

		double soma = num1 + num2;
		labelResultado.setText(String.format("%.2f", soma));
		} catch(NumberFormatException nfe) {
			Alerts.showAlert("Erro","Digitação incorreta", nfe.getLocalizedMessage(), AlertType.ERROR);
		}

	}

}
