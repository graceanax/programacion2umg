/******************************************************************************
Archivo: Main.java

Autor: Ana Pérez

Carné: 090-25-20576

Fecha: 23/07/2026

Curso: Programación II Seccion 1

Descripcion:
Muestra en consola el poligono segun el numero de lados

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        Poligono p = new Poligono();

        // prueba 1
        p.setLados(2);

        // prueba 2
        p.setLados(3);

        // prueba 3
        p.setLados(7);

        // prueba 4
        p.setLados(15);
    }

}