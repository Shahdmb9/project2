public class Subscribers extends Passenger {


    public Subscribers(String name, String ID) {
        super(name, ID);
    }

    public Subscribers(String name, String ID, Car reservedCar) {
        super(name, ID, reservedCar);
    }


    public Subscribers(String name, String ID, Car reservedCar, double tripCost) {
        super(name, ID, reservedCar, tripCost);
    }

    @Override
    public void reservedCar(Car c) {
        try {
            if(c.getMaximumCapacity()==0){
                throw new Exception("Sorry "+getName()+" The Maximum capacity is 0");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        super.setReservedCar(c);
        double tripCost=c.getFixedRute().getPrice()*50/100;
        c.setMaximumCapacity(c.getMaximumCapacity()-1);
        super.setTripCost(c.getFixedRute().getPrice()-tripCost);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Trip Cost: "+super.getTripCost());
    }

    public String toString() {
        return "Subscriber Passenger: " + super.toString();
    }
}
