package ec.uea.torresdehanoi;

import java.util.Stack;

// Esta clase representa una torre en el problema de las Torres de Hanoi
public class Torre {
    // Aquí guardamos los discos, usando una pila para simular el apilar y desapilar
    private Stack<Integer> discos;

    // El nombre de la torre (por ejemplo: "Origen", "Auxiliar" o "Destino")
    public String nombre;

    // Constructor que crea una torre con un nombre y una pila vacía
    public Torre(String nombre) {
        this.nombre = nombre;       // Guardamos el nombre que le pasaron
        this.discos = new Stack<>(); // Creamos la pila vacía para los discos
    }

    // Método para poner un disco encima de la torre (apilar)
    public void apilar(int disco) {
        discos.push(disco); // Usamos push para añadir el disco arriba de la pila
    }

    // Método para sacar el disco que está arriba de la torre (desapilar)
    public int desapilar() {
        return discos.pop(); // Sacamos y devolvemos el disco que está arriba
    }

    // Método para mostrar por consola el contenido de la torre (qué discos tiene)
    public void mostrar() {
        System.out.println(nombre + ": " + discos); // Imprime el nombre y la lista de discos
    }
}
