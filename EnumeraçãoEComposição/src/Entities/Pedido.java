package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import EntitiesEnum.StatusPedido;

public class Pedido {

	private Date horaAtual;
	private StatusPedido status;

	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	List<ItemPedido> listaItemPedido = new ArrayList<>();
	Cliente cliente;

	public Pedido() {
	}

	public Pedido(Date horaAtual, StatusPedido status, Cliente cliente) {
		this.horaAtual = horaAtual;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getHoraAtual() {
		return horaAtual;
	}

	public void setHoraAtual(Date horaAtual) {
		this.horaAtual = horaAtual;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getListaPedido() {
		return listaItemPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(ItemPedido pedido) {
		listaItemPedido.add(pedido);
	}

	public void removerItem(ItemPedido pedido) {
		listaItemPedido.remove(pedido);
	}

	public Double total() {
		double soma = 0;
		for (ItemPedido item : listaItemPedido) {
			soma += item.subTotal();
		}
		return soma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nRESUMO: \nMomento do pedido: ");
		sb.append(sdf2.format(horaAtual));
		sb.append("\nStatus: ");
		sb.append(status);
		sb.append("\nCliente: ");
		sb.append(cliente.getnomeCLiente() + " ");
		sb.append("\nItens do pedido:\n");
		for (ItemPedido itens : listaItemPedido) {
			sb.append(itens + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();

	}
}
