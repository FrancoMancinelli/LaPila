package main;

import models.laPila;

public class mainapp {

	public static void main(String[] args)  throws Exception {
		
		laPila<String> pila = new laPila<String>();
		
		//Pruebo método estaVacia
		System.out.println("Vacia = " + pila.estaVacia());
		
		//Pruebo los métodos add y addAt
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
		
		//Pruebo método getCima
		System.out.println("Cima = " + pila.getCima());
		System.out.println(pila);

		//Pruebo método verCima
		System.out.println("Cima = " + pila.verCima());
		System.out.println(pila);

		//Pruebo método size
		System.out.println("Size = " + pila.size());

		//Pruebo método estaVacia
		System.out.println("Vacia = " + pila.estaVacia());

		//Pruebo método existe
		System.out.println("Existe = " + pila.existe("E"));


	}

}
