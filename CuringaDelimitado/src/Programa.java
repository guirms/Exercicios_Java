import java.util.ArrayList;
import java.util.List;

import Entidades.Circulo;
import Entidades.Forma;
import Entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {

		List<Forma> listaForma = new ArrayList<>();

		listaForma.add(new Circulo(1.0));
		listaForma.add(new Retangulo(1.0, 2.0));

		List<Circulo> circulo = new ArrayList<>();
		circulo.add(new Circulo(1.0));
		
		System.out.println(areaTotal(circulo));

	}

	public static double areaTotal(List<? extends Forma> lista) {
		double soma = 0.0;
		for (Forma f : lista) {
			soma += f.area();
		}
		return soma;
	}

}
