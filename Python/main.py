#!/usr/bin/python3

from ImprimeLetra import ImprimeLetra

# Creo 2 objetos que impriman letras distintas y se pausen en tiempos distintos
hilo1 = ImprimeLetra("A", 1, 1)
hilo2 = ImprimeLetra("B", 2, 2)

# Inicia la ejecución de cada hilo
hilo1.start()
hilo2.start()

# Le indica al main (proceso principal) que espere a que los hijos finalicen
hilo1.join()
hilo2.join()