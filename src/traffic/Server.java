package traffic;

import java.util.Arrays;

public class Server {
    private int[] countVehicles; // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int commonCountVehicles; // загальна кількість ТЗ, що виїхали в місто
    private int limitVehicle; // обмеження на кількість ТЗ, що одночасно виїхали в місто
    private Run[] vehicles = null; // масив, що зберігає ТЗ будь-якого виду

    Server(int size){ // конструктор класу, параметр size – кількість видів ТЗ
        countVehicles = new int[size];
    }

    public void setLimitVehicle(int limitVehicle) {
        this.limitVehicle = limitVehicle;
    }

    public int getLimitVehicle(){ // повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
        return limitVehicle;
    }

    public int getCurrentCountVehicle(){ // повертає загальну кількість ТЗ, що виїхали в місто
        return commonCountVehicles;
    }

    public int[] getCountVehicles() {
        return countVehicles;
    }

    public void addTransport(int typeVehicle, Run vehicle){ // додає ТЗ до віртуальної бази
        if (vehicles == null){
            vehicles = new Run[this.getLimitVehicle()];
        }

        countVehicles[typeVehicle]++;
        vehicles[commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles].move(countVehicles[typeVehicle]);
        commonCountVehicles+=1;
    }
}
