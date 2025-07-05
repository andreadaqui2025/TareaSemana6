package ec.uea.gestordenumeros;

// Esta clase es la que se encarga de manejar toda la lista de números
// Aquí agregamos datos, calculamos el promedio, separamos, y mostramos todo
public class Lista {
    Nodo head;         // Este es el primer nodo de la lista (la cabecera)
    String nombre;     // Solo es el nombre para mostrar la lista en pantalla

    // Al crear la lista, empezamos con la cabeza vacía (sin nodos)
    public Lista(String nombre) {
        this.head = null;
        this.nombre = nombre;
    }

    // Este método agrega un número al final de la lista
    public void agregar(double dato) {
        Nodo nuevo = new Nodo(dato); // Creamos un nodo con el número que nos dieron

        if (head == null) {
            // Si no hay nodos todavía, este nuevo será el primero
            head = nuevo;
        } else {
            // Si ya hay nodos, buscamos el último
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            // Y le conectamos el nuevo nodo al final
            actual.siguiente = nuevo;
        }
    }

    // Calcula el promedio de todos los números que hay en la lista
    public double promedio() {
        double suma = 0;
        int cantidad = 0;
        Nodo actual = head;

        // Vamos sumando todos los datos y contando cuántos hay
        while (actual != null) {
            suma += actual.dato;
            cantidad++;
            actual = actual.siguiente;
        }

        // Si la lista está vacía, devolvemos 0 para evitar dividir por cero
        return (cantidad == 0) ? 0 : suma / cantidad;
    }

    // Separa los datos en dos listas nuevas: menores o iguales, y mayores al promedio
    public void separar(double promedio, Lista menores, Lista mayores) {
        Nodo actual = head;

        while (actual != null) {
            if (actual.dato <= promedio) {
                // Si es menor o igual al promedio, lo metemos en la lista de "menores"
                menores.agregar(actual.dato);
            } else {
                // Si es mayor, lo metemos en la lista de "mayores"
                mayores.agregar(actual.dato);
            }
            actual = actual.siguiente; // Seguimos con el siguiente nodo
        }
    }

    // Muestra todos los datos de la lista en la consola
    public void mostrar() {
        System.out.println("\n📋 " + nombre + ":");

        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " -> "); // Mostramos cada dato
            actual = actual.siguiente;
        }

        // Cuando terminamos de recorrer, mostramos "null" para indicar el fin
        System.out.println("null");
    }
}
