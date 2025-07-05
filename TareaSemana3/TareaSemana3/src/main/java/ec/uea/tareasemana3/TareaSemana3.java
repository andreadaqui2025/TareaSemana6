
package ec.uea.tareasemana3;

public class TareaSemana3 {

    public static void main(String[] args) {
        String[] telefonos = {"0986258571", "3016789", "0989345033"};

        Estudiante estudiantes = new Estudiante(1721297255, "Andrea", "Daqui", "Ibarra", telefonos);
        estudiantes.mostrarDatos();
    }
}