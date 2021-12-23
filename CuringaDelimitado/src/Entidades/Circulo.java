package Entidades;

public class Circulo implements Forma {
	
	private Double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * (Math.pow(raio, 2));
	}
	
}
