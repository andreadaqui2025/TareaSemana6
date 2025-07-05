package ec.uea.tareasemana3;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String[] telefonos;

    public Estudiante(int id, String nombre, String apellido, String direccion, String[] telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public void mostrarDatos() {
        System.out.println("===== DATOS DEL ESTUDIANTE =====");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.print("Teléfonos: ");
        for (String tel : telefonos) {
            System.out.print(tel + " ");
        }
        System.out.println("\n===============================");
    }
}