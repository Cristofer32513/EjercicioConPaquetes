package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Elipse {
	private double areaElipse(double a, double b) {
		return Math.PI * a * b;
	}
	
	private double perimetroElipse(double r, double s) {
		return Math.PI * ((3 * (r + s)) - Math.sqrt(((3 * r) + s) * (r + (3 * s))));
	}
}