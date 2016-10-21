import time
import threading

# Clase utilizada para ser ejecutada en hilos
class ImprimeLetra (threading.Thread):
	def __init__(self, paramLetra, paramTiempo, threadID):
		threading.Thread.__init__(self)
		self.threadID     = threadID 	#Identificador del hilo
		self.name         = paramLetra 	#Nombre del hilo
		self.letra        = paramLetra 	#Letra a imprimir
		self.tiempoEspera = paramTiempo #Tiempo de espera para volver a imprimir

	# Esta es la función que se ejecutará en paralelo, consiste en imprimir una letra
	# (el atributo letra) y luego espera tiempoEspera segundos
	def run(self):
		while (True):
			print(self.letra)
			time.sleep(self.tiempoEspera)
		
