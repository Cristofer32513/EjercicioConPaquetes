package edu.tecjerez.topicos.geometria;

public class Punto {
	//metodo para calcular la distancia entre dos puntos
	
	int coordeadaX;
	int coordeadaY;
	PuntoPrueba pp=new PuntoPrueba();
	
	public double distanciaEntreDosPuntos(Punto punto1, Punto punto2){
				
		return Math.sqrt(Math.pow(punto2.coordeadaX-punto1.coordeadaX, 2)+
				Math.pow(punto2.coordeadaY-punto1.coordeadaY, 2));
	}
}


class PuntoPrueba{
	double x=new Punto().distanciaEntreDosPuntos(new Punto(), new Punto());
}
