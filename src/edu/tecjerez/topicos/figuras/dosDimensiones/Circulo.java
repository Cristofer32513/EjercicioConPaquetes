package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Circulo {
	protected double areaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2); 
	}
	
	protected double perimetroCirculo(double radio) {
		return 2 * Math.PI * radio;
	}
}