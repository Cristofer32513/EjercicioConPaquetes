package edu.tecjerez.topicos.figuras;

public class Triangulo {
	//Metodo que calcule el area de un triangulo a atravez de la formula de Heron
	
	public double area(double a, double b, double c){
		double s=(a+b+c)/2;
		
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		return area;
	}
}