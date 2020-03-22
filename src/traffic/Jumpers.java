package traffic;

public class Jumpers implements Run {
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
        System.out.println("Jumper №" + id + " left");
    }
}
