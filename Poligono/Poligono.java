/******************************************************************************
Archivo: Poligono.java

Autor: Ana Pérez

Carné: 090-25-20576

Fecha: 23/07/2026

Curso: Programación II Seccion 1

Descripcion:
Detecta el poligono de acuerdo al numero de sus lados

*******************************************************************************/

public class Poligono {
    private int lados;

    public Poligono () {
        lados = 3;
    }

    public int getLados () {
        return lados;
    }

    public boolean setLados (int lados) {
        boolean correcto = false;

        if (lados>=3 && lados <=10) {
            this.lados = lados;
            correcto = true;
        }

        switch (lados) {
            case 3:
                System.out.println("Lados= "+lados+"\nPoligono= Triangulo");
                break;

            case 4:
                System.out.println("Lados= "+lados+"\nPoligono= cuadrado o rectangulo");
                break;

            case 5:
                System.out.println("Lados= "+lados+"\nPoligono= pentagono");
                break;

            case 6:
                System.out.println("Lados= "+lados+"\nPoligono= hexagono");
                break;

            case 7:
                System.out.println("Lados= "+lados+"\nPoligono= heptagono");
                break;

            case 8:
                System.out.println("Lados= "+lados+"\nPoligono= octagono");
                break;

            case 9:
                System.out.println("Lados= "+lados+"\nPoligono= eneagono");
                break;

            case 10:
                System.out.println("Lados= "+lados+"\nPoligono= decagono");
                break;

            default:
                System.out.println("Lados= "+lados+"\nAviso: No es una figura geometrica");
                break;
        }

        return correcto;
    }

}