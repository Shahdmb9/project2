
void main() {


    Scanner input = new Scanner(System.in);
    System.out.println("===Welcome to the Car renter Company===");

    Route route1 = new Route("King Fahd Road", "King Abdullah Financial District", 120.0);
    Route route2 = new Route("Al Olaya", "King Khalid Airport", 200.0);

    List<Passenger> passengers = new ArrayList<>();
// --- Create Cars ---
    Car car1 = new Car("CAR-001", 3, route1);
    Car car2 = new Car("CAR-002", 2, route2);
    Car fullCar = new Car("CAR-003", 0, route1); // capacity 0 for exception test

    System.out.println("\n=== Cars ===");
    System.out.println(car1);
    System.out.println(car2);

    // --- Test Subscriber ---
    System.out.println("\n=== Subscriber Passenger ===");
    Passenger sub1 = new Subscribers("Sara", "ID-001");
    sub1.reservedCar(car1);
    sub1.displayInfo();
    passengers.add(sub1);
    // Expected trip cost: 120 - (120 * 50/100) = 60.0

    // --- Test NonSubscriber with coupon ---
    System.out.println("\n=== NonSubscriber WITH Coupon ===");
    Passenger nonSub1 = new NonSubscribers("Ahmed", "ID-002", true);
    nonSub1.reservedCar(car2);
    nonSub1.displayInfo();
    passengers.add(nonSub1);
    // Expected trip cost: 200 - (200 * 10/100) = 180.0

    // --- Test NonSubscriber without coupon ---
    System.out.println("\n=== NonSubscriber WITHOUT Coupon ===");
    Passenger nonSub2 = new NonSubscribers("Mona", "ID-003", false);
    nonSub2.reservedCar(car1);
    nonSub2.displayInfo();
    passengers.add(nonSub2);
    // Expected trip cost: 120.0 (full price)

    // --- Test capacity decrement ---
    System.out.println("\n=== Car Capacity After Reservations ===");
    System.out.println("car1 remaining capacity: " + car1.getMaximumCapacity()); // 3-2 = 1
    System.out.println("car2 remaining capacity: " + car2.getMaximumCapacity()); // 2-1 = 1

    // --- Test full car exception ---
    System.out.println("\n=== Full Car Exception Test ===");
    Passenger sub2 = new Subscribers("Khalid", "ID-004");
    sub2.reservedCar(fullCar); // Should print: "Sorry Khalid The Maximum capacity is 0"
    sub2.displayInfo();        // reservedCar should still be null


}



