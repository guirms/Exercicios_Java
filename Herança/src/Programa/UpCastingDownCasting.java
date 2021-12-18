package Programa;

import Entidades.Conta;
import Entidades.ContaNegocios;

public class UpCastingDownCasting {

	public static void main(String[] args) {

		Conta conta = new Conta(1001, "João", 0.0);
		ContaNegocios contaNegocios = new ContaNegocios(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Conta conta1 = contaNegocios;
		Conta conta2 = new ContaNegocios(1002, "Maria", 0.0, 500.0);

		// DOWNCASTING
		if (conta2 instanceof ContaNegocios) { //se conta2 esta contido em ContaNegocios
			ContaNegocios contaNegocios1 = (ContaNegocios) conta2;	
		}

	}

}
