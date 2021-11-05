package Entidades;

public class ProdutosImportados extends Produtos {

	private Double taxaAlfandega;

	public ProdutosImportados() {
		super();
	}

	public ProdutosImportados(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
		
	public double precoTotal() {
		return preco + taxaAlfandega;
	}
	
	@Override
	public String etiqueta() {
		return nome + " $" + precoTotal() + " (Taxa alfândega: $" + String.format("%.2f", taxaAlfandega) + ")";
	}
}
