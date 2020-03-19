package traffic;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int SIZE = 4;// кількість видів ТЗ
        Server server = new Server(SIZE);
        int limit = 10;
        server.setLimitVehicle(limit);

        while (server.getCurrentCountVehicle() < server.getLimitVehicle()){
            int amount = (int) (Math.random()*SIZE);
            switch (amount) {
                case 0:
                    Bicycle bicycle = new Bicycle();
                    server.addTransport(amount, bicycle);
                    break;
                case 1:
                    Car car = new Car();
                    server.addTransport(amount, car);
                    break;
                case 2:
                    RollerSkates rollerSkates = new RollerSkates();
                    server.addTransport(amount, rollerSkates);
                    break;
                case 3:
                    Jumpers jumpers = new Jumpers();
                    server.addTransport(amount, jumpers);
                    break;
            }
        }
        System.out.println(Arrays.toString(server.getCountVehicles()));
    }
}
