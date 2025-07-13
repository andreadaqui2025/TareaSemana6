package ec.uea.invertirlista;

// Esta clase maneja todo lo de la lista: agregar, mostrar, invertir...
public class Lista {
    Nodo head;  // Inicio de la lista

    // Agrega un número al final de la lista
    public void agregar(double dato) {
        Nodo nuevo = new Nodo(dato);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Muestra los datos de la lista
    public void mostrar() {
        Nodo actual = head;
        if (actual == null) {
            System.out.println("Lista vacía.");
            return;
        }
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Invierte la lista: el primero pasa a último y así
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = head;
        Nodo siguiente;

        // Vamos moviendo los punteros para dar la vuelta
        while (actual != null) {
            siguiente = actual.siguiente;    // Guardamos el siguiente
            actual.siguiente = anterior;     // Invertimos la conexión
            anterior = actual;               // Avanzamos el puntero
            actual = siguiente;
        }

        head = anterior;  // Ahora la cabeza es el que era el último
    }
}
