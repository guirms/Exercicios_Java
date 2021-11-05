package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos {

	private Date dataFabrica��o;
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutosUsados() {
		super();
	}

	public ProdutosUsados(String nome, Double preco, Date dataFabrica��o) {
		super(nome, preco);
		this.dataFabrica��o = dataFabrica��o;
	}

	public Date getDataFabrica��o() {
		return dataFabrica��o;
	}

	public void setDataFabrica��o(Date dataFabrica��o) {
		this.dataFabrica��o = dataFabrica��o;
	}
	
	@Override
	public String etiqueta() {
		return nome + " (usado) " + " $" + String.format("%.2f", preco) + " (Data de fabrica��o: " + sdf1.format(dataFabrica��o) + ")";
	}
}
