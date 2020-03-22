package traffic;

public class Car implements Run {
    @Override
    public void showName() {}

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    public void move(int id){
        System.out.println("Car №" + id + " left");
    }
}
