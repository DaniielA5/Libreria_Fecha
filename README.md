# 📆 LibreFecha - Librería para manejo de fechas en Java

#### 📌 Descripción

*LibreFecha* es una librería en Java que facilita el trabajo con fechas, ofreciendo funciones útiles como:
- Conversión entre cadenas de texto y fechas.
- Cálculo de la diferencia de días entre dos fechas.
- Verificación de si una fecha es anterior a otra.
- Obtención del día de la semana.
- Cálculo de edad y tiempo vivido.

Su objetivo es simplificar tareas comunes al trabajar con fechas usando la API moderna de java.time.

---

## 📦 Contenido de la librería

El archivo principal es Ffecha.java, que contiene todos los métodos estáticos para trabajar con fechas en formato "dd/MM/yyyy".

### 📚 Clases y métodos

#### Ffecha
- LocalDate StringaDate(String fecha)  
  Convierte una cadena en formato dd/MM/yyyy a un objeto LocalDate.

- String LocalaString(LocalDate fecha)  
  Convierte un objeto LocalDate a una cadena en formato dd/MM/yyyy.

- long diferenciaDias(String fecha1, String fecha2)  
  Calcula la cantidad de días entre dos fechas.

- boolean esAnterior(String fecha1, String fecha2)  
  Determina si la primera fecha es anterior a la segunda.

- String obtenerDiaSemana(String fecha)  
  Devuelve el día de la semana (en inglés) de una fecha dada.

- int Edad(String fNacimiento)  
  Calcula la edad actual a partir de una fecha de nacimiento.

- String tiempoVivido(String fNacimiento)  
  Devuelve una cadena indicando cuántos años, meses y días han pasado desde la fecha de nacimiento.

---

## 🛠 Instrucciones para importar el .jar en otro proyecto

1. Se Copia el archivo JavaLibrary_Fechas.jar en el directorio de nuestro nuevo proyecto.
2. En tu IDE (como NetBeans o VS Code), añadi el .jar como una biblioteca:
   - *NetBeans:* Clic derecho en el proyecto → Properties → Libraries → Add JAR/Folder → Selecciona JavaLibrary_Fechas.jar.
3. ¡Listo! Ya puedes usar import LibreFecha.*; en tus clases.

---

## 🖼 Capturas del JFrame usando la librería 

Frame principal 

![Viendvenidos](.unolibreria.png)



## 🎥 Enlace al video demostrativo

[👉 Ver video en YouTube](https://youtu.be/0aBRv0EtIEo?si=yk-Jha3zowlDMmFB)

---

## 📄 Documentación Técnica (JavaDoc)

La documentación completa generada con JavaDoc se encuentra en la carpeta [/Docs javadoc]().

Para abrirla:
1. Abre el archivo index.html con tu navegador.
2. Navega por los métodos, clases y descripciones detalladas.

---

## 👥 Autores

- Tu Nombre :Daniel Alexis Juarez Ramirez

- Nombre del compañero (Francisco Elias Antonio Bautista)

---

## ✅ Requisitos

- Java 8 o superior
- IDE compatible con .jar (NetBeans, IntelliJ, VS Code, BlueJ)

---

¡Gracias por usar LibreFecha! 🕒
