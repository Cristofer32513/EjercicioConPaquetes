package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Rombo {
	double areaRombo(double D, double d) {
		return (D * d) / 2;
	}
	
	double perimetroRombo(double D, double d) {
		double L2 = Math.pow(D / 2, 2) + Math.pow(d / 2, 2);
		return 4 * Math.sqrt(L2);
	}
}