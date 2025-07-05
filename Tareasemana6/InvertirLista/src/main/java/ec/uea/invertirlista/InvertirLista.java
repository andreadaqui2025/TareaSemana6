package ec.uea.invertirlista;

/* Invertir una lista  enlazada:
Implementar un método dentro de la lista enlazada  que permita invertir 
los datos ue permita invertir los datos almacenados en una lista enlazada, 
 es decir que el primer elemento pase a ser el último y el 
último pase a ser el primero, que el segundo sea el penúltimo y el penúltimo pase a ser el
segundo  sucesivamente.*/
import java.util.Scanner;

// Esta clase es la que ejecuta el programa principal
public class InvertirLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();

        System.out.println("Vamos a crear una lista y luego la invertimos ");
        System.out.print("Cuantos numeros vas a meter ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Numero " + i + ": ");
            double num = sc.nextDouble();
            lista.agregar(num);  // Guardamos el número en la lista
        }

        System.out.println("\n Lista original:");
        lista.mostrar();

        lista.invertir();  // Aquí se invierte toda la lista

        System.out.println("\n Lista invertida:");
        lista.mostrar();
    }
}
