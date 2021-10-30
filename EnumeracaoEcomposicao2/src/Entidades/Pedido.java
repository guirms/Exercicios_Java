package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import EntidadesEnum.Status;

public class Pedido {

	private Date momentoAtual;
	private Status status;

	List<ItemPedido> listaPedidos = new ArrayList<>();
	Cliente cliente;

	public Pedido(Date momentoAtual, Status status, Cliente cliente) {
		this.momentoAtual = momentoAtual;
		this.status = status;
		this.cliente = cliente;
	}

	public Pedido() {
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getMomentoAtual() {
		return momentoAtual;
	}

	public void setMomentoAtual(Date momentoAtual) {
		this.momentoAtual = momentoAtual;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<ItemPedido> getListaPedidos() {
		return listaPedidos;
	}

	public void adicionarItem(ItemPedido pedido) {
		listaPedidos.add(pedido);
	}

	public void removerItem(ItemPedido pedido) {
		listaPedidos.remove(pedido);
	}

	public double total() {
		double soma = 0;
		for (ItemPedido lista : listaPedidos) {
			soma += lista.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nResumo pedido:");
		sb.append("\nStatus do pedido: " + status);
		sb.append("\nCliente: " + cliente);
		sb.append("\nItens pedido:\n");
		for (ItemPedido item : listaPedidos) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $" + String.format("%.2f", total()));
		return sb.toString();
	}

}
