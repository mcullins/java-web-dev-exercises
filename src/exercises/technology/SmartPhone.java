package exercises.technology;

public class SmartPhone extends Computer {

    private String size;

    public SmartPhone(String model, String year, String color, String size) {
        super(model, year, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String ring(){
        return "Riiiiing!";
    }
}
