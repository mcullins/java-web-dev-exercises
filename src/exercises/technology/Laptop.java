package exercises.technology;

public class Laptop extends Computer {

    private int weight;

    public Laptop(String model, String year, String color, int weight){
        super(model, year, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String measureWeight(){
       return "The weight of this device is: " + this.weight;
    }
}
