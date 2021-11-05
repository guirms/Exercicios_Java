package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos {

	private Date dataFabricação;
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutosUsados() {
		super();
	}

	public ProdutosUsados(String nome, Double preco, Date dataFabricação) {
		super(nome, preco);
		this.dataFabricação = dataFabricação;
	}

	public Date getDataFabricação() {
		return dataFabricação;
	}

	public void setDataFabricação(Date dataFabricação) {
		this.dataFabricação = dataFabricação;
	}
	
	@Override
	public String etiqueta() {
		return nome + " (usado) " + " $" + String.format("%.2f", preco) + " (Data de fabricação: " + sdf1.format(dataFabricação) + ")";
	}
}
