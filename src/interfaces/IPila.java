package interfaces;

import java.util.EmptyStackException;

public interface IPila<E> {

	/**
	 * Devuelve el elemento que est� en la cima y lo
	 * saca de la pila.<br/>
	 * Si la pila est� vac�a lanza EmptyStackException.
	 * @return Elemento en la cima.
	 * @throws EmptyStackException
	 */
	E getCima() throws Exception; 
	
	/**
	 * Devuelve el elemento que est� en la cima pero no
	 * lo saca de la pila.<br/>
	 * Si la pila est� vac�a lanza EmptyStackException.
	 * @return Elemento en la cima. 
	 * @throws EmptyStackException
	 */
	E verCima() throws EmptyStackException;
	
	/**
	 * Devuelve el tama�o de la pila
	 * @return tama�o de la pila.
	 */
	int size();
	
	/**
	 * A�ade un elemento en la cima de la pila
	 * @param elemento a a�adir en la pila
	 * @return el tama�o de la pila tras a�adir el elemento.
	 * @throws NullElementException si se intenta a�adir un null.
	 */
	int add(E elemento) throws Exception;
	
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
	int addAt(E elemento, int posicion) throws Exception;
	
	/**
	 * Comprueba si la pila est� vac�a
	 * @return true si la pila est� vac�a, false en caso contrario
	 */
	boolean estaVacia();
	
	/**
	 * Comprueba si un elemento cualquiera existe dentro de
	 * la pila. Si la pila est� vac�a lanza excepci�n.
	 * @param elemento a buscar
	 * @return true si existe, false si no.
	 * @throws EmptyStackException
	 */
	boolean existe(E elemento) throws EmptyStackException;
	
	
}