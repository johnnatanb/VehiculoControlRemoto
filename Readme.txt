Instrucciones de uso del simulador de vehículo a control remoto.
---------------------------------------------------------------------------------------------------------------------


	Sobre el simulador:
	------------------------------------------------------------------------------------------------------------------
		Este simulador fue desarrollo en Java jdk1.8.0_05 con el IDE NetBeans 7.4.


	Hecho por:
	------------------------------------------------------------------------------------------------------------------
		Johnnatan Brausin Rodríguez
		Ingeniero de sistemas 
		C.C. 1014212930

		
	Forma de ejecución:
	------------------------------------------------------------------------------------------------------------------
		-	Se debe abrir el proyecto con el IDE NetBeans 7.4.
		-	Dar clic en la opción de ejecutar proyecto u oprimir la tecla F6.

		
	Usando el simulador:
	------------------------------------------------------------------------------------------------------------------
		-	Se Define la superficie por donde se desplazara el vehículo (Matriz).
				o	Cantidad de filas. (Valor numérico mayor a cero).
				o	Cantidad de columnas. (Valor numérico mayor a cero).
		-	El vehículo es ubicado en la parte Sur Oeste de la matriz en la posición (0,0).
		
											  N
									 ___ ___ ___ ___ ___
									|   |   |   |   |   |
									|___|___|___|___|___|
									|   |   |   |   |   |
								O	|___|___|___|___|___|	E
									|   |   |   |   |   |
									|___|___|___|___|___|
									|   |   |   |   |   |
									|___|___|___|___|___|
								  (0,0)		  S
		
		-	Ingresar comando o serie de comandos de desplazamiento:
				o	El vehículo puede moverse en 4 direcciones: Norte (N), Sur(S), Este (E), Oeste(O). Y en cada dirección puede avanzar/desplazar un número determinado de pasos usando los siguientes formatos de comandos:
						-	Para 1 comando:  <Desplazamiento>,<Dirección> 
								•	ejemplo 3,N
						-	Para más de un comando: <Desplazamiento>,<Dirección>;<Desplazamiento>,<Dirección>;…;<Desplazamiento>,<Dirección>
								•	Ejemplos:
										o	3,N;2,S
										o	3,S;6,E;5,O
										o	2,O;5,E;7,N;4,O;
										o	7,E;6,N;4,E;3,S;8,O;………;6,S
										o	Al finalizar la ejecución de cada comando se informara al usuario la posición final del vehículo, si el comando ejecutado hace que el vehículo salga de los límites de la superficie se detiene el avance y se informa que “Se ha detenido el avance por salir de los límites”.
		-	Para finalizar la ejecución del simulador escriba la palabra: salir.
		

Gracias por usar este simulador.