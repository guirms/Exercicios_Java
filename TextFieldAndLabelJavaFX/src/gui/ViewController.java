package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
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
		double num1 = Double.parseDouble(txtNumero1.getText());
		double num2 = Double.parseDouble(txtNumero2.getText());
		double soma = num1 + num2;
		labelResultado.setText(String.format("%.2f", soma));
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumero1);
		Constraints.setTextFieldDouble(txtNumero2);
		Constraints.setTextFieldMaxLength(txtNumero1, 10);
		Constraints.setTextFieldMaxLength(txtNumero2, 10);		
	}

}
