// Ana Pérez
public class Main {    
    public static void main(String[] args) {
        MyDate d = new MyDate();
        // prueba 1
        d.setYear(1901);
        d.setMonth(2);
        d.setDay(32);

        System.out.println(d.getDay() + "-" + d.getMonth() + "-" + d.getYear());
    }
}