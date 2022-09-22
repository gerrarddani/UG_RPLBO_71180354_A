public class Bus {
    private static int capacity;
    private String name;
    private Driver driver;
    private int CAPACITY;
    private Passenger passenger;
    private int usedCapacity;
    private double fares;
    private double profit;
    private String ROUTE;
    private String route;
    private String cancelolder;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public Driver getDriver(){
        return driver;
    }
    public void  setDriver(Driver driver){
        Driver driver1 = this.driver;
    }
    public static int getCapacity(){
        return capacity;
    }
    private static void setCapacity(int capacity){
        capacity=capacity;
    }
    public double getFares(){
        return fares;
    }
    public double getProfit(){
        return profit;
    }
    public String getRoute(){
        return route;
    }
    private static void setProfit(double profit){
        profit = profit;
    }
    public Passenger checkPassengerBalance(Passenger passenger){
        return passenger;
    }
    public void topUPBalance(double profit, Passenger passenger){
    this.profit = profit;
    this.passenger =passenger;
    }
    private void  takePassenger(Passenger passenger){
        return;
    }
    public void dropPassenger(Passenger passenger){
        return;
    }
    public void proceedOrder(String name, Passenger passenger){
        return;
    }
    public String cancelOlder(Passenger passenger){
        return cancelolder;
    }
}

