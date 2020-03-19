package traffic;

public abstract class Machine implements Runnable {
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

    public void showName(){
        System.out.println(name);
    }
    public int getMaxSpeed() {return maxSpeed;}
    public int getWeight() {return weight;}
    public void move() { System.out.println("Go!"); }
    public int getAmountOfPassengers() {return amountOfPassengers;}
}
