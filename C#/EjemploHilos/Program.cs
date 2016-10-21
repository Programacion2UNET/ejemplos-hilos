using System;
using System.Threading;

namespace EjemploHilos
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			//Creo 2 objetos que impriman letras distintas y se pausen en tiempos distintos
			ImprimeLetra objeto1 = new ImprimeLetra('A', 1000);
			ImprimeLetra objeto2 = new ImprimeLetra('B', 2000);
			
			/*
			 * Si ejecutas estas lineas comentadas, observaras como la aplicación no permite
			 * ejecutar ambas funciones al mismo timepo
			 */
			//objeto1.Imprimir();
			//objeto2.Imprimir();

			//Se crean instancias del objeto de Hilo para ejecutarlos posteriormente
			Thread hilo1 = new Thread(new ThreadStart(objeto1.Imprimir));
			Thread hilo2 = new Thread(new ThreadStart(objeto2.Imprimir));

			//Inicia la ejecución de cada hilo
			hilo1.Start ();
			hilo2.Start();

			//Le indica al main (proceso principal) que espere a que los hijos finalicen
			hilo1.Join ();
			hilo2.Join ();
		}
	}
}
