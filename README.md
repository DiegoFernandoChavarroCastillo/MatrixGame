# MatrixGame

[![Estado](https://img.shields.io/badge/estado-en%20desarrollo-yellow)]()
[![Licencia](https://img.shields.io/badge/licencia-MIT-blue)]()
[![Versión](https://img.shields.io/badge/versión-1.0.0-green)]()

## 📌 Descripción
MatrixGame es un simulador concurrente desarrollado en Java que recrea el enfrentamiento entre Neo y los Agentes dentro de la Matrix. Este proyecto está diseñado específicamente para demostrar y practicar conceptos avanzados de **programación concurrente**, **hilos (Threads)** y **sincronización** de recursos compartidos.

El juego simula un tablero donde Neo debe navegar evitando a los agentes para alcanzar el teléfono y escapar, mientras que los agentes lo persiguen de forma autónoma, todo ejecutándose simultáneamente.

## 🚀 Características Principales
- ✅ **Concurrencia Real:** Cada entidad móvil (Neo, Agentes) se ejecuta en su propio hilo independiente (`Thread`).
- ✅ **Sincronización de Tablero:** Gestión de recursos compartidos para evitar condiciones de carrera en el movimiento.
- ✅ **IA de Persecución:** Los agentes cuentan con lógica para rastrear y moverse hacia la posición de Neo.
- ✅ **Simulación en Tiempo Real:** El estado del juego se actualiza y visualiza dinámicamente en la consola.

## 🖼️ Vista Previa / Demostración
```text
Neo entro en la Matrix...
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . A . . . 
. . . . N . . . . . 
. . . . . . # . . . 
. . . . . . . T . . 
. . . # . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```
*Representación visual del tablero en consola.*

---

## 📦 Instalación

### Prerrequisitos
- **Java SDK 11** o superior.
- Algún IDE (IntelliJ IDEA, Eclipse, VS Code) o terminal con `javac`.

### Pasos de instalación
```bash
# 1. Clonar repositorio
git clone https://github.com/tuusuario/MatrixGame.git

# 2. Entrar al directorio
cd MatrixGame

# 3. Compilar el proyecto
javac -d bin src/**/*.java src/Main.java

# 4. Iniciar aplicación
java -cp bin Main
```

## 🛠️ Uso
Para ejecutar el juego, simplemente inicia la clase principal `Main`. Neo intentará moverse por el tablero mientras el Agente lo busca.

### Comandos comunes
```bash
# Compilar
javac -d bin src/**/*.java src/Main.java

# Ejecutar
java -cp bin Main
```

## 🏗️ Estructura del Proyecto
```text
├── src/
│   ├── board/         # Lógica del tablero y casillas
│   │   ├── Tablero.java
│   │   └── Casilla.java
│   ├── entities/      # Definición de hilos y entidades (Neo, Agent, etc)
│   │   ├── Neo.java
│   │   ├── Agent.java
│   │   ├── Entity.java
│   │   └── Status.java
│   └── Main.java       # Punto de entrada del programa
├── bin/               # Archivos compilados (.class)
└── README.md          # Documentación
```

## 🧪 Ejecutar Tests
Actualmente, las pruebas se realizan mediante la ejecución de la clase `Main` y la observación del comportamiento de los hilos en la consola.

## 🤝 Contribuir
1. Fork el proyecto.
2. Crear rama: `git checkout -b feature/nueva-funcionalidad`.
3. Commit cambios: `git commit -m 'Agrega nueva funcionalidad'`.
4. Push: `git push origin feature/nueva-funcionalidad`.
5. Abrir Pull Request.

## 📄 Licencia
Este proyecto está bajo la licencia MIT. Ver el archivo LICENSE para más detalles.

## 👥 Autores
- **Diego Chavarro** - [@DiegoFernandoChavarroCastillo](https://github.com/DiegoFernandoChavarroCastillo)

## 🙏 Agradecimientos
- A la saga *The Matrix* por la inspiración temática.
- Documentación de Java sobre `Thread` y `Concurrency`.

## 📞 Contacto
Email: chavarrodiegofernando3@gmail.com

