package exercises.technology;

public abstract class AbstractEntity {
    static int value;

    public AbstractEntity(){
        this.value = value;
    }

    public int increment() {
        return ++value;
    }

    public static int getValue() {
        return value;
    }
}
