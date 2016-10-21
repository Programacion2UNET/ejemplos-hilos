package ejemplohilosjava;

/**
 * Clase utilizada para ser ejecutada en hilos, por esta razón hereda de Thread
 */
public class ImprimeLetra extends Thread {

    protected char letra; //Letra a imprimir
    protected int tiempoEspera; //Tiempo de espera para volver a imprimir

    public ImprimeLetra(char paramLetra, int paramTiempo) {
        this.letra = paramLetra;
        this.tiempoEspera = paramTiempo;
    }

    /**
     * Esta es la función que se ejecutará en paralelo, consiste en imprimir una
     * letra (el atributo letra) y luego espera tiempoEspera segundos
     */
    @Override
    public void run() {
        while (true) {
            System.out.println(this.letra);

            try {
                Thread.sleep(this.tiempoEspera);
            } catch (InterruptedException ie) {
                System.out.println("ERROR FATAL");
            }
        }
    }
}
