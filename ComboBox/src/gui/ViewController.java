package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entidades.Pessoas;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Pessoas> comboBoxPessoa;

	@FXML
	private ObservableList<Pessoas> obsLista;
	
	@FXML
	private void onComboBoxPessoaAction() {
		Pessoas pessoa = comboBoxPessoa.getSelectionModel().getSelectedItem();
		System.out.println(pessoa);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Pessoas> lista = new ArrayList<>();
		lista.add(new Pessoas(1, "João", "joao@hotmail.com"));
		lista.add(new Pessoas(2, "Maria", "maria@hotmail.com"));
		lista.add(new Pessoas(3, "Pedro", "pedro@hotmail.com"));

		obsLista = FXCollections.observableArrayList(lista);
		comboBoxPessoa.setItems(obsLista);

		Callback<ListView<Pessoas>, ListCell<Pessoas>> factory = lv -> new ListCell<Pessoas>() {
			@Override
			protected void updateItem(Pessoas item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getNome());
			}
		};
		comboBoxPessoa.setCellFactory(factory);
		comboBoxPessoa.setButtonCell(factory.call(null));
	}

}
