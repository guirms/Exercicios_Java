package Programa;

import Entidades.Conta;
import Entidades.ContaNegocios;
import Entidades.ContaPoupan�a;

public class Programa {

	public static void main(String[] args) {

		Conta c1 = new Conta(1001, "Jo�o", 100.00);
		c1.saque(20.00);
		System.out.println(c1.getSaldo());

		ContaPoupan�a cp1 = new ContaPoupan�a(1001, "Alex", 100.00, 0.0);
		cp1.saque(20.00);
		System.out.println(cp1.getSaldo());

		// UPCASTING
		Conta c2 = new ContaPoupan�a(1002, "Jo�o", 100.00, 0.0);
		c2.saque(20.00);
		System.out.println(c2.getSaldo());

		Conta c3 = new ContaNegocios(1003, "Maria", 100.00, 0.0);
		c3.saque(20.00);
		System.out.println(c3.getSaldo());

	}

}
