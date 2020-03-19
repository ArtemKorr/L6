package traffic;

public abstract class Tractor extends Machine{
    private String type;

    public Tractor(String name, int weight, int maxSpeed, int amountOfPassengers, String type) {
        super(name, weight, maxSpeed, amountOfPassengers);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
