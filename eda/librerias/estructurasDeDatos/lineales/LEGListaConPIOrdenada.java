package librerias.estructurasDeDatos.lineales;
import librerias.estructurasDeDatos.modelos.ListaConPI;
import librerias.estructurasDeDatos.lineales.LEGListaConPI;
/**
 * Write a description of class LEGListaConPIOrdenada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LEGListaConPIOrdenada<E extends Comparable<E>> extends LEGListaConPI<E> implements ListaConPI<E> {
    
    /**
     * Constructor for objects of class LEGListaConPIOrdenada
     */
    public LEGListaConPIOrdenada() {
        super();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void insertar(E e) {
        inicio();
        while(!esFin() && e.compareTo(recuperar()) < 0){
            siguiente();
        }
        super.insertar(e);
        /*
        NodoLEG<E> nuevo = new NodoLEG<E>(e);
        NodoLEG aux = pri;
        for(int i = 0; i<talla;i++){
            if (aux.dato.CompareTo(nuevo.dato)) {
                aux = aux.siguiente;
            }
            else {
                super.insertar(e);
            }
        }
                */
    }
}
