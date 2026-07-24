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
        int lados = 0;

        if(args.length > 0) {
            lados = Integer.parseInt(args[0]);
            Poligono p = new Poligono();
            p.setLados(lados);
        } else {
            System.out.println("Error: no se ingreso un parametro correcto\n");
        }

        
    }

}