package traffic;

public class Server {
    private int[] countVehicles;
    private int commonCountVehicles;
    private int limitVehicle;
    private Vehicle[] vehicles = new Vehicle[limitVehicle];

    public Server(int size){
        countVehicles = new int[size];
    }
    public int getLimitVehicle(){
        return limitVehicle;
    }
    public int getCurrentCountVehicle(){
        return commonCountVehicles;
    }
    public void addTransport(int numberVehicles, Vehicle vehicle){
        countVehicles[numberVehicles]++;
        commonCountVehicles++;
        vehicles[commonCountVehicles] = vehicle;
        vehicles.move(countVehicles[numberVehicles]);
    }
}
