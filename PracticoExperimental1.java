package ec.uea.practicoexperimental1;

import java.util.Scanner;

// Clase principal del programa con menú interactivo
public class PracticoExperimental1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer datos del teclado
        Agenda agenda = new Agenda(); // Crear una nueva agenda
        int opcion;

        // Ciclo que muestra el menú hasta que el usuario elige salir
        do {
            System.out.println("\n Agenda Telefonica");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el salto de línea

            // Menú de opciones
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine(); // Leer nombre
                    System.out.print(" Telefono: ");
                    String telefono = scanner.nextLine(); // Leer teléfono
                    agenda.agregar(nombre, telefono); // Agregar contacto a la agenda
                    break;
                case 2:
                    agenda.mostrarTodos(); // Mostrar todos los contactos
                    break;
                case 3:
                    System.out.println(" Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida."); // Opción no válida
            }
        } while (opcion != 3); // Repetir mientras no elija salir
    }
}