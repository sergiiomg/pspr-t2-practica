# Simulación de Sidrería

Este proyecto modela una sidrería usando hilos en Java. Un camarero sirve culines en una barra compartida y varios clientes los consumen. Todo se gestiona mediante sincronización para evitar accesos concurrentes indebidos.

## Componentes
- **Sidreria**: Clase principal. Crea la barra, lee parámetros, inicia los hilos y muestra el resultado final.
- **Camarero**: Hilo productor. Sirve culines en la barra hasta un máximo de 15, con pausas aleatorias.
- **Cliente**: Hilo consumidor. Bebe culines si hay disponibles y abandona si pasa más de 1 segundo sin recibir uno.

## Argumentos
El programa acepta tres parámetros:
1. Culines que servirá el camarero.
2. Culines que intentará beber cada cliente.
3. Número de clientes.

Si los parámetros son inválidos, se usan: `20`, `10`, `2`.

## Funcionamiento
Los hilos comparten una barra (`ArrayList<Integer>`). Se emplean mecanismos de sincronización (`wait/notifyAll`) para coordinar al camarero y los clientes siguiendo el patrón Productor-Consumidor.

Al finalizar todos los hilos, el programa indica cuántos culines quedaron sin beber.
