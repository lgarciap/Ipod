/**
 * 
 */

/**
 * @author flaquitqm
 *
 */
public interface Ipod {
	/**
	 * Cambia el volumen del ipod
	 * @param cambiar Si es True sube volumen, si es False baja
	 */
	public void cambiarVolumen(boolean cambiar);
	/**
	 * Cambia la canci�n
	 * @param cambiar Si es true avanza a la siguiente (NEXT) si es false va a la anterior (FALSE)
	 */
	public void cambiarCancion(boolean cambiar);
	/**
	 * Guarda en la lista de favoritos
	 * @param cancion: Object La canci�n que se quiere guardar
	 * @param posicion: int Posici�n en la que se guardar� la canci�n en la lista de favoritos
	 */
	public void guardarFavorito(Object cancion, int posicion);
	/**
	 * Reproduce la cancion de la lista de favoritos que est� en la posici�n i
	 * @param pos: posici�n en la lista de favoritos de la canci�n que se quiere reproducir
	 * @return Object con la canci�n a reproducir
	 */
	public Object irAcancionFavorita(int pos);
	/**
	 * Cambia el estado del ipod a encendido o a apagado
	 * @return: true si est� encendido, false si est� apagado
	 */
	public boolean estadoEncendido();
	
	/**
	 * Cambia el estado del ipod de bloqueado o no
	 * @return true si est� bloqueado, false si NO est� bloqueado
	 */
	public boolean estadoBloqueo();
	
}
