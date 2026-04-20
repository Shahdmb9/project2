public abstract class Passenger {

    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.reservedCar=null;
    }

    public Passenger(String name, String ID, Car reservedCar) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
    }

    public Passenger(String name, String ID, Car reservedCar, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void reservedCar(Car c);

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Reserved Car: "+(reservedCar!=null?reservedCar:"No cars reserved"));
    }

    public String toString(){

        return "Name: " + name + ", ID: " + ID + " Reserved Car:\n" + reservedCar;
    }


}
