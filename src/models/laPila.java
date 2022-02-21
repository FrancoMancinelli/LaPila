package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.List;

import exceptions.NullElementException;
import interfaces.IPila;

public class laPila<E> implements IPila<String>{

	// ~~~ ATRIBUTOS
	private List<E> miPila;
	
	// ~~~ CONSTRUCTOR
	public laPila() {
		super();
		this.miPila = new ArrayList<E>();
	}
	
	/**
	 * Devuelve el elemento que est� en la cima y lo
	 * saca de la pila.<br/>
	 * Si la pila est� vac�a lanza EmptyStackException.
	 * @return Elemento en la cima.
	 * @throws EmptyStackException
	 */
	@Override
	public String getCima() throws Exception {
		if(!miPila.isEmpty()) {
			return (String) miPila.remove(miPila.size()-1);
		} else {
			throw new Exception(new EmptyStackException());
		}
	}

	/**
	 * Devuelve el elemento que est� en la cima pero no
	 * lo saca de la pila.<br/>
	 * Si la pila est� vac�a lanza EmptyStackException.
	 * @return Elemento en la cima. 
	 * @throws EmptyStackException
	 */
	@Override
	public String verCima() throws EmptyStackException {
		return (String) miPila.get(miPila.size()-1);
	}

	/**
	 * Devuelve el tama�o de la pila
	 * @return tama�o de la pila.
	 */
	@Override
	public int size() {
		return miPila.size();
	}

	/**
	 * A�ade un elemento en la cima de la pila
	 * @param elemento a a�adir en la pila
	 * @return el tama�o de la pila tras a�adir el elemento.
	 * @throws NullElementException si se intenta a�adir un null.
	 */
	@Override
	public int add(String elemento) throws Exception {
		ArrayList<E> aux = new ArrayList<E>();
		aux.add((E) elemento);
		
		for(int i = 0; 0 != miPila.size(); i=0) {
			aux.add(miPila.get(i));
			miPila.remove(i);
		}
		
		if (elemento != null) {
			miPila.addAll(aux);
			return miPila.size();
		} else {
			throw new Exception(new NullElementException("ERR0R >>> No puedes meter un null <<< ERR0R"));
		}
	}

	/**
	 * A�ade el elemento en la posici�n establecida por par�metro.<br/>
	 * Por ejemplo, dada la pila siguiente:<br/>
	 * a<br/>
	 * b<br/>
	 * c<br/>
	 * d<br/>
	 * <br/>
	 * si se llama al m�todo addAt('e',3), la pila quedar�a:<br/>
	 * a<br/>
	 * b<br/>
	 * c<br/>
	 * e<br/>
	 * d<br/>
	 * 
	 * @param elemento a a�adir
	 * @param posicion �ndice de la pila donde se a�adir�a 
	 * teniendo en cuenta que la cima es el �ndice 0, el elemento 
	 * de debajo es 1, etc.
	 * @return el tama�o de la pila tras a�adir el elemento.
	 * @throws NullElementException si se intenta a�adir un null.
	 */
	@Override
	public int addAt(String elemento, int posicion) throws Exception {
		ArrayList<E> aux = new ArrayList<E>();

		for(int i = 0; i < posicion-1; i++) {
			aux.add(miPila.get(i));
			miPila.remove(i);
		}
		
		aux.add((E) elemento);
		
		for(int i = 0; 0 != miPila.size(); i=0) {
			aux.add(miPila.get(i));
			miPila.remove(i);
		}
		
		if (elemento != null) {
			miPila.addAll(aux);
			return miPila.size();
		} else {
			throw new Exception(new NullElementException("ERR0R >>> No puedes meter un null <<< ERR0R"));
		}
	}
	
	/**
	 * Comprueba si la pila est� vac�a
	 * @return true si la pila est� vac�a, false en caso contrario
	 */
	@Override
	public boolean estaVacia() {
		if(miPila.size() != 0)
			return false;
		else
			return true;
	}
	
	/**
	 * Comprueba si un elemento cualquiera existe dentro de
	 * la pila. Si la pila est� vac�a lanza excepci�n.
	 * @param elemento a buscar
	 * @return true si existe, false si no.
	 * @throws EmptyStackException
	 */
	@Override
	public boolean existe(String elemento) throws EmptyStackException {
		if(!miPila.isEmpty()) {
			if(miPila.contains(elemento)) 
				return true;
			else
				return false;
		} else {
			throw new EmptyStackException();
		}
	}

	@Override
	public String toString() {
		return "laPila = " + miPila;
	}
}
