public class NonSubscribers extends Passenger {
    private boolean discountCoupon;


    public NonSubscribers(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }
    public NonSubscribers(String name, String ID, Car reservedCar, boolean discountCoupon) {
        super(name, ID, reservedCar);
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribers(String name, String ID, Car reservedCar, double tripCost, boolean discountCoupon) {
        super(name, ID, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reservedCar(Car c) {
        try {
            if(c.getMaximumCapacity()==0) {
                throw new Exception("Sorry "+getName()+" The Maximum capacity is 0");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        super.setReservedCar(c);
        if(discountCoupon) {
            double tripCost = c.getFixedRute().getPrice() * 10 / 100;
            c.setMaximumCapacity(c.getMaximumCapacity()-1);
            setTripCost(c.getFixedRute().getPrice() - tripCost);
        }
        else {
            c.setMaximumCapacity(c.getMaximumCapacity()-1);
            setTripCost(c.getFixedRute().getPrice());
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("has a discount Coupon: " + (discountCoupon?"Yes, ":"No, "));
        System.out.println("Trip Cost: "+getTripCost());
    }

    @Override
    public String toString() {
        return "NonSubscriber Passenger: "+" has a discount Coupon: " + (discountCoupon?"Yes, ":"No, ") + super.toString()
                +"\nTrip Cost: "+getTripCost();
    }
}
