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
	 * Cambia la canción
	 * @param cambiar Si es true avanza a la siguiente (NEXT) si es false va a la anterior (FALSE)
	 */
	public void cambiarCancion(boolean cambiar);
	/**
	 * Guarda en la lista de favoritos
	 * @param cancion: Object La canción que se quiere guardar
	 * @param posicion: int Posición en la que se guardará la canción en la lista de favoritos
	 */
	public void guardarFavorito(Object cancion, int posicion);
	/**
	 * Reproduce la cancion de la lista de favoritos que está en la posición i
	 * @param pos: posición en la lista de favoritos de la canción que se quiere reproducir
	 * @return Object con la canción a reproducir
	 */
	public Object irAcancionFavorita(int pos);
	/**
	 * Cambia el estado del ipod a encendido o a apagado
	 * @return: true si está encendido, false si está apagado
	 */
	public boolean estadoEncendido();
	
	/**
	 * Cambia el estado del ipod de bloqueado o no
	 * @return true si está bloqueado, false si NO está bloqueado
	 */
	public boolean estadoBloqueo();
	
}
