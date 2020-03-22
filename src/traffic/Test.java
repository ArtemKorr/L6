package traffic;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int SIZE = 7;
        Server server = new Server(SIZE);
        int limit = 15;
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
                case 4:
                    TractorCrawler tractorCrawler = new TractorCrawler("TractorCrawler",300,120, "Crawler");
                    server.addTransport(amount, tractorCrawler);
                    break;
                case 5:
                    TractorWheeled tractorWheeled = new TractorWheeled("TractorWheeled", 250, 140, "Wheeled");
                    server.addTransport(amount, tractorWheeled);
                    break;
                case 6:
                    Bus bus = new Bus("Bus", 170, 135, 25);
                    server.addTransport(amount, bus);
                    break;
            }
        }
        System.out.println(Arrays.toString(server.getCountVehicles()));
    }
}
