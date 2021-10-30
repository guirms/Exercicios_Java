package Entidades;

public class ItemPedido {
	
	private Integer quantidadePedido;
	private Double precoPedido;
	
	Produto produto;

	public ItemPedido() {
	}

	public ItemPedido(Integer quantidadePedido, Double precoPedido, Produto produto) {
		this.quantidadePedido = quantidadePedido;
		this.precoPedido = precoPedido;
		this.produto = produto;
	}

	public Integer getQuantidadePedido() {
		return quantidadePedido;
	}

	public void setQuantidadePedido(Integer quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}

	public Double getPrecoPedido() {
		return precoPedido;
	}

	public void setPrecoPedido(Double precoPedido) {
		this.precoPedido = precoPedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return quantidadePedido * precoPedido;
	}

	@Override
	public String toString() {
		return produto.getNomeProduto()
			   + ", $"
			   + precoPedido
			   + ", quantidade: "
			   + quantidadePedido
			   + ", Subtotal: $"
			   + subTotal();
	}
	
}
