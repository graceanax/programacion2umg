// Ana Pérez

public class MyDate {
    private int day;
    private int month;
    private int year; 

    public MyDate() {
        day = 1;
        month = 1;
        year = 1900;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean setDay(int day) {
        boolean correcto = false;

        if (day >= 1) {
            if (month == 2 && day <= 29) {
                correcto = true;
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
                correcto = true;
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
                correcto = true;
            }
        }

        if (correcto) {
            this.day = day;
        } else {
            this.day = 1;

            if (day < 1) {
                System.out.println("Error: El día " + day + " es menor que 1, se agregó el día 1 por defecto.");
            } else {
                System.out.println("Error: El día " + day + " es incorrecto para el mes " + month + ", se agregó el día 1 por defecto.");
            }
        }

        return correcto;
    }

    public boolean setMonth(int month) {
        boolean correcto = false;

        if(month >= 1 && month <= 12) {
            this.month = month;
            correcto=true;
        } else {
            System.out.println("Error: El mes "+ month + " no es válido, se agregó uno por defecto");
        }
        
        return correcto;
    }

    public boolean setYear(int year) {
        boolean correcto = false;

        if(year >= 1900 && year <= 2100) {
            this.year = year;
            correcto=true;
        } else {
            System.out.println("Error: El año "+ year + " sale del rango, se agregó uno por defecto");
        }
        
        return correcto;
    }

}