using System;
using System.Threading;

namespace EjemploHilos
{
	/**
	 * Clase utilizada para ser ejecutada en hilos
	 */
	public class ImprimeLetra
	{
		protected char letra; //Letra a imprimir
		protected int tiempoEspera; //Tiempo de espera para volver a imprimir

		public ImprimeLetra (char paramLetra, int paramTiempo)
		{
			this.letra = paramLetra;
			this.tiempoEspera = paramTiempo;
		}

		/**
		 * Esta es la función que se ejecutará en paralelo, consiste en imprimir una letra
		 * (el atributo letra) y luego espera tiempoEspera segundos
		 **/
		public void Imprimir()
		{
			while(true){
				Console.WriteLine(this.letra);
				Thread.Sleep(this.tiempoEspera);
			}
		}
	}
}

