package traffic;

public abstract class Vehicle {
    public abstract void move(int id);
}

interface runnable{
    void showName();
    int getMaxSpeed();
    int weight();
    void move();
}

