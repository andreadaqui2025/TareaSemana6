package ec.uea.gestordenumeros;

// Esta clase es como un bloquecito de la cadena (lista enlazada)
// Guarda un número (dato) y apunta al siguiente nodo (siguiente)
public class Nodo {
    double dato;        // Aquí se guarda el número que queremos almacenar
    Nodo siguiente;     // Y esto apunta al siguiente nodo de la lista

    // Cuando creamos un nuevo nodo, le damos un número
    // y aún no tiene conexión con otro (por eso "siguiente" es null)
    public Nodo(double dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}