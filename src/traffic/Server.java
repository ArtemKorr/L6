package traffic;

public class Server {
    private int[] countVehicles; // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int commonCountVehicles = 0;// загальна кількість ТЗ, що виїхали в місто
    private int limitVehicle;// обмеження на кількість ТЗ, що одночасно виїхали в місто
    private Vehicle[] vehicles = new Vehicle[limitVehicle];// масив, що зберігає ТЗ будь-якого виду


    public int[] getCountVehicles() {
        return countVehicles;
    }
    public void setLimitVehicle(int limitVehicle) {
        this.limitVehicle = limitVehicle;
    }
    public Server(int size){// конструктор класу, параметр size – кількість видів ТЗ
        countVehicles = new int[size];
    }
    public int getLimitVehicle(){// повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
        return limitVehicle;
    }
    public int getCurrentCountVehicle(){// повертає загальну кількість ТЗ, що виїхали в місто
        return commonCountVehicles;
    }
    public void addTransport(int numberVehicles, Vehicle vehicle){// додає ТЗ до віртуальної бази
        countVehicles[numberVehicles]++;
        commonCountVehicles++;
        vehicles[commonCountVehicles] = vehicle;
        //vehicles.move(countVehicles[numberVehicles]);
    }
}
