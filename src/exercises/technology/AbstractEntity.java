package exercises.technology;

public abstract class AbstractEntity {
    private int id = 1;

    public AbstractEntity(){
        this.id = id;
        id++;
    }

    public int getId() {
        return id;
    }
}
