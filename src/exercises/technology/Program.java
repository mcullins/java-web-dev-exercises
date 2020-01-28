package exercises.technology;

public class Program {
    public static void main(String[] args){
        Laptop dell = new Laptop("Dell", "2018", "Silver", 3);
        SmartPhone samsung = new SmartPhone("Samsung", "2019", "Black", "Large");

        dell.sendEmail("Hello There!");
        System.out.println(dell.getBattLife());
        dell.measureWeight();

        samsung.sendEmail("Hello World!");
        samsung.sendEmail("Goodbye World!");
        System.out.println(samsung.getBattLife());
        System.out.println(samsung.ring());

    }
}
