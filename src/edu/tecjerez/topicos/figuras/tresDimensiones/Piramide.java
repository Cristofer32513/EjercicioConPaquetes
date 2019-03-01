package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Piramide {
	public double areaPiramide(double perimetroBase, double altura, double base) {
		double areaLateral = perimetroBase * altura;
		double areaBase = base * 2;
		return areaLateral + (2 * areaBase);
	}
	
	public double volumenPiramide(double base, double altura) {
		return (Math.pow(base, 2) * altura) / 3;		
	}
}