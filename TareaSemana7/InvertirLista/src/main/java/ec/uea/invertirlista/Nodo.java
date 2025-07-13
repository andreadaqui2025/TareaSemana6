package ec.uea.invertirlista;

// Este es el bloque de la lista, guarda un número y apunta al siguiente
public class Nodo {
    double dato;
    Nodo siguiente;

    public Nodo(double dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
