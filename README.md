🎮 MatrixGame - JUEGO DE CONCURRENCIA EN JAVA

📋 DESCRIPCIÓN DEL PROYECTO
Este proyecto es un juego desarrollado en Java 100% diseñado específicamente para aprender y practicar los conceptos de hilos (Threads) y concurrencia. El juego simula un tablero donde múltiples entidades se mueven simultáneamente, cada una en su propio hilo, utilizando mecanismos de sincronización para coordinar sus acciones.

🎯 OBJETIVO DE APRENDIZAJE
- Comprender el concepto de hilos (Threads) en Java
- Aplicar mecanismos de sincronización (locks, monitores)
- Manejar condiciones de carrera (race conditions)
- Implementar concurrencia en un escenario práctico
- Coordinar múltiples procesos concurrentes

🕹️ MECÁNICA DEL JUEGO

ENTIDADES DEL JUEGO
Símbolo | Entidad  | Comportamiento
--------|----------|---------------
N       | Neo      | Debe llegar al teléfono para ganar
A       | Agente   | Intenta capturar a Neo moviéndose hacia él
T       | Teléfono | Entidad estática, objetivo de Neo
M       | Muro     | Obstáculo que bloquea el movimiento

REGLAS DEL JUEGO
1. Victoria: Neo gana al llegar a la casilla del teléfono (T)
2. Derrota: Neo pierde si un agente (A) llega a su casilla
3. Movimiento: Todas las entidades móviles se mueven simultáneamente
4. Concurrencia: Cada entidad móvil se ejecuta en un hilo independiente

🏗️ ARQUITECTURA TÉCNICA

COMPONENTES PRINCIPALES
📁 MatrixGame
├── 📁 src
│   ├── 📁 entities
│   │   ├── Neo.java           # Hilo controlado por jugador/IA
│   │   ├── Agente.java        # Hilos controlados por IA
│   │   └── Telefono.java      # Entidad estática
│   ├── 📁 board
│   │   ├── Tablero.java       # Matriz N x N compartida
│   │   └── Casilla.java       # Celda individual del tablero
│   ├── 📁 game
│   │   ├── GameController.java # Controlador principal
│   │   └── GameState.java      # Estado del juego
│   ├── 📁 concurrency
│   │   ├── LockManager.java    # Gestor de sincronización
│   │   └── MovementLock.java   # Lock para movimientos
│   └── Main.java               # Punto de entrada

CONCEPTOS DE CONCURRENCIA A IMPLEMENTAR
1. Hilos (Threads): Cada entidad móvil será un hilo
2. Sincronización: Uso de synchronized, ReentrantLock, o Semaphore
3. Comunicación entre hilos: Wait/Notify o Condition objects
4. Sección crítica: El tablero como recurso compartido
5. Deadlock prevention: Estrategias para evitar bloqueos



🛠️ REQUISITOS TÉCNICOS
- Java: JDK 11 o superior
- IDE: IntelliJ IDEA, Eclipse, VS Code o similar
- Build Tool: Maven o Gradlo (opcional)
- Conocimientos Previos: Programación OOP en Java básica

📖 ESTRUCTURA DEL CÓDIGO FUTURO
El código seguirá principios de:
- Encapsulación: Cada entidad maneja su propio estado
- Bajo acoplamiento: Comunicación a través de interfaces definidas
- Alta cohesión: Cada clase tiene responsabilidad única
- Thread safety: Diseño seguro para concurrencia desde el inicio

🎯 OBJETIVOS DE APRENDIZAJE ESPERADOS
Al completar este proyecto, deberías poder:
1. Diseñar sistemas multi-hilo
2. Identificar y resolver problemas de concurrencia
3. Implementar patrones de sincronización
4. Depurar problemas en entornos concurrentes
5. Diseñar algoritmos thread-safe

