# Fabrica-de-Interfaces-Graficas-
# 🎨 Fábrica de Interfaces Gráficas - Abstract Factory Pattern

Este proyecto implementa el **patrón Abstract Factory** para manejar diferentes temas de interfaces gráficas en Java. Permite generar botones y barras de navegación estilizados según el modo seleccionado: **Modo Oscuro** o **Modo Claro**.

## 📌 Características
- Implementa el **patrón Abstract Factory**.
- Dos temas disponibles: 🌙 **Modo Oscuro** y ☀️ **Modo Claro**.
- Componentes de UI modulares y escalables.
- Compatible con futuras expansiones (más temas o componentes).

## 🚀 Instalación y Ejecución
### 1️⃣ Clonar el repositorio
```sh
 git clone https://github.com/tu-usuario/fabrica-ui.git
 cd fabrica-ui
```

### 2️⃣ Compilar el código
```sh
javac -d out src/ui/*.java src/Main.java
```

### 3️⃣ Ejecutar el programa
```sh
java -cp out Main
```

## 🏗️ Estructura del Proyecto
```
/mi-proyecto-ui
│── src/
│   ├── ui/
│   │   ├── Button.java
│   │   ├── NavBar.java
│   │   ├── DarkButton.java
│   │   ├── LightButton.java
│   │   ├── DarkNavBar.java
│   │   ├── LightNavBar.java
│   │   ├── UIFactory.java
│   │   ├── DarkUIFactory.java
│   │   ├── LightUIFactory.java
│── Main.java
│── README.md
│── .gitignore
```

## 📜 Uso
Dentro de `Main.java`, puedes cambiar la fábrica utilizada para seleccionar un tema:
```java
UIFactory factory = new DarkUIFactory(); // Para modo oscuro
// UIFactory factory = new LightUIFactory(); // Para modo claro
```
**Ejemplo de salida (Modo Oscuro seleccionado):**
```
Botón estilizado en Modo Oscuro
Barra de navegación en Modo Oscuro
```

## 📌 Tecnologías Usadas
- 🖥️ **Java 8+**
- 🎨 **Patrón de Diseño Abstract Factory**

🚀

