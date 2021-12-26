package Entidades;

import java.util.function.Consumer;

public class ConsumerTeste implements Consumer<Produtos>{

	@Override
	public void accept(Produtos p) {
		p.setPreco(p.getPreco() * 1.1);	
	}

}
