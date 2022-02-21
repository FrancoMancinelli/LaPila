package main;

import models.laPila;

public class mainapp {

	public static void main(String[] args)  throws Exception {
		
		laPila<String> pila = new laPila<String>();
		
		//Pruebo m�todo estaVacia
		System.out.println("Vacia = " + pila.estaVacia());
		
		//Pruebo los m�todos add y addAt
		//A su vez imprimo la pila para ver sus cambios
		pila.add("A");
		System.out.println(pila);
		pila.add("B");
		System.out.println(pila);
		pila.add("C");
		System.out.println(pila);
		pila.add("D");
		System.out.println(pila);
		pila.addAt("E", 2);
		System.out.println(pila);
		
		//Pruebo m�todo getCima
		System.out.println("Cima = " + pila.getCima());
		System.out.println(pila);

		//Pruebo m�todo verCima
		System.out.println("Cima = " + pila.verCima());
		System.out.println(pila);

		//Pruebo m�todo size
		System.out.println("Size = " + pila.size());

		//Pruebo m�todo estaVacia
		System.out.println("Vacia = " + pila.estaVacia());

		//Pruebo m�todo existe
		System.out.println("Existe = " + pila.existe("E"));


	}

}
