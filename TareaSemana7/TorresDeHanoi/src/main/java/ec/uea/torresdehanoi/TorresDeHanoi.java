package ec.uea.torresdehanoi;

// Este es el programa principal para resolver las Torres de Hanoi con pilas
public class TorresDeHanoi {
    public static void main(String[] args) {
        int discos = 3; // Cambia este número si quieres usar más discos

        // Creamos las tres torres (origen, auxiliar, destino)
        Torre origen = new Torre("Origen");
        Torre auxiliar = new Torre("Auxiliar");
        Torre destino = new Torre("Destino");

        // Metemos los discos en la torre de origen (el más grande al fondo)
        for (int i = discos; i >= 1; i--) {
            origen.apilar(i);
        }

        // Mostramos cómo arrancamos
        System.out.println("Inicio:");
        origen.mostrar();
        auxiliar.mostrar();
        destino.mostrar();
        System.out.println("------");

        // Llamamos a la función para mover todo
        mover(discos, origen, destino, auxiliar);

        // Y mostramos cómo quedó al final
        System.out.println("Fin:");
        origen.mostrar();
        auxiliar.mostrar();
        destino.mostrar();
    }

    // Esta función hace los movimientos, paso a paso
    static void mover(int n, Torre desde, Torre hasta, Torre apoyo) {
        if (n == 1) {
            int disco = desde.desapilar(); // saco el disco de arriba
            hasta.apilar(disco); // lo pongo en la otra torre
            System.out.println("Mover disco " + disco + " de " + desde.nombre + " a " + hasta.nombre);
        } else {
            mover(n - 1, desde, apoyo, hasta);    // muevo los de arriba al apoyo
            mover(1, desde, hasta, apoyo);        // muevo el grande
            mover(n - 1, apoyo, hasta, desde);    // muevo los que quedaron al final
        }
    }
}