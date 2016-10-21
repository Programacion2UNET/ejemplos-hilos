package ejemplohilosjava;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploHilosJava {

    public static void main(String[] args) {
        //Creo 2 objetos que impriman letras distintas y se pausen en tiempos distintos
        ImprimeLetra objeto1 = new ImprimeLetra('A', 1000);
        ImprimeLetra objeto2 = new ImprimeLetra('B', 2000);

        /*
         * Si ejecutas estas lineas comentadas, observaras como la aplicación no permite
         * ejecutar ambas funciones al mismo timepo
         */
        //objeto1.Imprimir();
        //objeto2.Imprimir();
        
        //Inicia la ejecución de cada hilo
        objeto1.start();
        objeto2.start();
        
        
        /*
         * Le indica al main (proceso principal) que espere a que los hijos finalicen
         * y se captura cualquier error de interrupción para mostrar un mensaje de error
         */
        try {
            objeto1.join();
            objeto2.join();
        } catch (InterruptedException ex) {
            System.out.println("ERROR FATAL");
        }

    }

}
