Instrucciones de uso del simulador de veh�culo a control remoto.
---------------------------------------------------------------------------------------------------------------------


	Sobre el simulador:
	------------------------------------------------------------------------------------------------------------------
		Este simulador fue desarrollo en Java jdk1.8.0_05 con el IDE NetBeans 7.4.


	Hecho por:
	------------------------------------------------------------------------------------------------------------------
		Johnnatan Brausin Rodr�guez
		Ingeniero de sistemas 
		C.C. 1014212930

		
	Forma de ejecuci�n:
	------------------------------------------------------------------------------------------------------------------
		-	Se debe abrir el proyecto con el IDE NetBeans 7.4.
		-	Dar clic en la opci�n de ejecutar proyecto u oprimir la tecla F6.

		
	Usando el simulador:
	------------------------------------------------------------------------------------------------------------------
		-	Se Define la superficie por donde se desplazara el veh�culo (Matriz).
				o	Cantidad de filas. (Valor num�rico mayor a cero).
				o	Cantidad de columnas. (Valor num�rico mayor a cero).
		-	El veh�culo es ubicado en la parte Sur Oeste de la matriz en la posici�n (0,0).
		
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
				o	El veh�culo puede moverse en 4 direcciones: Norte (N), Sur(S), Este (E), Oeste(O). Y en cada direcci�n puede avanzar/desplazar un n�mero determinado de pasos usando los siguientes formatos de comandos:
						-	Para 1 comando:  <Desplazamiento>,<Direcci�n> 
								�	ejemplo 3,N
						-	Para m�s de un comando: <Desplazamiento>,<Direcci�n>;<Desplazamiento>,<Direcci�n>;�;<Desplazamiento>,<Direcci�n>
								�	Ejemplos:
										o	3,N;2,S
										o	3,S;6,E;5,O
										o	2,O;5,E;7,N;4,O;
										o	7,E;6,N;4,E;3,S;8,O;���;6,S
										o	Al finalizar la ejecuci�n de cada comando se informara al usuario la posici�n final del veh�culo, si el comando ejecutado hace que el veh�culo salga de los l�mites de la superficie se detiene el avance y se informa que �Se ha detenido el avance por salir de los l�mites�.
		-	Para finalizar la ejecuci�n del simulador escriba la palabra: salir.
		

Gracias por usar este simulador.