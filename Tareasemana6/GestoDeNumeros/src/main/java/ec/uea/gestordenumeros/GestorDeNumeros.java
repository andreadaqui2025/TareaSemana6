package ec.uea.gestordenumeros;

import java.util.Scanner;

// Esta es la clase principal: donde corre el programa
public class GestorDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Para leer datos que escribe el usuario

        // Creamos una lista vacía donde vamos a guardar los números
        Lista principal = new Lista("Lista Principal");

        System.out.println(" GESTOR DE NUMEROS EN JAVA");
        System.out.print("Cuantos numeros vas a ingresar");
        int cantidad = entrada.nextInt();  // Preguntamos cuántos números quiere ingresar

        // Vamos pidiendo número por número al usuario
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Numero " + i + ": ");
            double numero = entrada.nextDouble();
            principal.agregar(numero); // Agregamos el número a la lista
        }

        // Calculamos el promedio de todos los números que ingresó
        double promedio = principal.promedio();

        // Creamos dos nuevas listas vacías para separar los datos
        Lista menores = new Lista("Menores o iguales al promedio");
        Lista mayores = new Lista("Mayores al promedio");

        // Llenamos esas listas según el promedio
        principal.separar(promedio, menores, mayores);

        // Mostramos todo en pantalla
        principal.mostrar();
        System.out.println("\\Promedio: " + promedio);
        menores.mostrar();
        mayores.mostrar();
    }
}
