package traffic;

public abstract class Machine implements Run {
    private String name;
    private int weight;
    private int maxSpeed;
    private int amountOfPassengers;

    public Machine(String name, int weight, int maxSpeed, int amountOfPassengers) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.amountOfPassengers = amountOfPassengers;
    }

    public Machine(String name, int weight, int maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public void showName(){ System.out.println(name); }
    public int getMaxSpeed() {return maxSpeed;}
    public int getWeight() {return weight;}
    public void move(int id) { System.out.println(name + " №" + id + " Go!"); }

    public int getAmountOfPassengers() {return amountOfPassengers;}
}
