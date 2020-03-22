package traffic;

public class Bus extends Machine {
    private int amountOfPassengers;

    public Bus(String name, int weight, int maxSpeed, int amountOfPassengers) {
        super(name, weight, maxSpeed, amountOfPassengers);
    }

    @Override
    public int getAmountOfPassengers() {
        return super.getAmountOfPassengers();
    }
}
