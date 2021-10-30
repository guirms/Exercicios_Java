package Entities;

public class ItemPedido {

	private Integer quantidade;
	private Double precoPedido;
	private Produto produto;

	public ItemPedido() {
	}

	public ItemPedido(Integer quantidade, Double precoPedido, Produto produto) {
		this.quantidade = quantidade;
		this.precoPedido = precoPedido;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoPedido() {
		return precoPedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setPrecoPedido(Double precoPedido) {
		this.precoPedido = precoPedido;
	}
	
	public double subTotal() {
		return precoPedido * quantidade;
	}

	@Override
	public String toString() {
		return produto.getNomeProduto()
			   + " ; Quantidade: "
			   + quantidade
			   + " ; Subtotal: "
			   + subTotal(); 
	}
	
	

}
