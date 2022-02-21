package interfaces;

import java.util.EmptyStackException;

public interface IPila<E> {

	/**
	 * Devuelve el elemento que está en la cima y lo
	 * saca de la pila.<br/>
	 * Si la pila está vacía lanza EmptyStackException.
	 * @return Elemento en la cima.
	 * @throws EmptyStackException
	 */
	E getCima() throws Exception; 
	
	/**
	 * Devuelve el elemento que está en la cima pero no
	 * lo saca de la pila.<br/>
	 * Si la pila está vacía lanza EmptyStackException.
	 * @return Elemento en la cima. 
	 * @throws EmptyStackException
	 */
	E verCima() throws EmptyStackException;
	
	/**
	 * Devuelve el tamaño de la pila
	 * @return tamaño de la pila.
	 */
	int size();
	
	/**
	 * Añade un elemento en la cima de la pila
	 * @param elemento a añadir en la pila
	 * @return el tamaño de la pila tras añadir el elemento.
	 * @throws NullElementException si se intenta añadir un null.
	 */
	int add(E elemento) throws Exception;
	
	/**
	 * Añade el elemento en la posición establecida por parámetro.<br/>
	 * Por ejemplo, dada la pila siguiente:<br/>
	 * a<br/>
	 * b<br/>
	 * c<br/>
	 * d<br/>
	 * <br/>
	 * si se llama al método addAt('e',3), la pila quedaría:<br/>
	 * a<br/>
	 * b<br/>
	 * c<br/>
	 * e<br/>
	 * d<br/>
	 * 
	 * @param elemento a añadir
	 * @param posicion índice de la pila donde se añadiría 
	 * teniendo en cuenta que la cima es el índice 0, el elemento 
	 * de debajo es 1, etc.
	 * @return el tamaño de la pila tras añadir el elemento.
	 * @throws NullElementException si se intenta añadir un null.
	 */
	int addAt(E elemento, int posicion) throws Exception;
	
	/**
	 * Comprueba si la pila está vacía
	 * @return true si la pila está vacía, false en caso contrario
	 */
	boolean estaVacia();
	
	/**
	 * Comprueba si un elemento cualquiera existe dentro de
	 * la pila. Si la pila está vacía lanza excepción.
	 * @param elemento a buscar
	 * @return true si existe, false si no.
	 * @throws EmptyStackException
	 */
	boolean existe(E elemento) throws EmptyStackException;
	
	
}