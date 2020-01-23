package exercises.technology;

public class Computer extends AbstractEntity {

    private String model;
    private String year;
    private String color;
    private int battLife = 100;

    public Computer(String model, String year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public Computer(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getBattLife() {
        return battLife;
    }

    public void sendEmail(String message){
        if(battLife>=10) {
            System.out.println(message);
            battLife = battLife - 10;
        } else {
            System.out.println("Not enough battlife");
        }
    }
}
