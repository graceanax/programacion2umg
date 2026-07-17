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

        if(day < 1) {
            System.out.println("Error: El día "+ day + " es un número negativo, se agregó uno por defecto");
            return false;
        } 
        if (month == 2 && day <= 29) {
            this.day = day;
            return true;
        }

        if((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
            this.day = day;
            return true;
        } 

        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
            this.day = day;
            return true;
        } 
        System.out.println("Error: El día "+ day + " es incorrecto para el mes "+ month +", se agregó uno por defecto");
        return false;
        
    }

    public boolean setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
            return true;
        }
        System.out.println("Error: El mes "+ month + " no es válido, se agregó uno por defecto");
        return false;
    }

    public boolean setYear(int year) {
        if(year >= 1900 && year <= 2100) {
            this.year = year;
            return true;
        }
        System.out.println("Error: El año "+ year + " sale del rango, se agregó uno por defecto");
        return false;
    }

}