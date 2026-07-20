// Ana Pérez
public class Main {    
    public static void main(String[] args) {
        long fecha = 22081999L;
        int anio = (int) (fecha%10000);
        int mes = (int) ((fecha/10000)%100);
        int day = (int) (fecha/1000000);

        MyDate d = new MyDate();

        d.setYear(anio);
        d.setMonth(mes);
        d.setDay(day);

        System.out.println(d.getDay() + "-" + d.getMonth() + "-" + d.getYear());
    }
}