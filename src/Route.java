public class Route {

//   * Route Class has: start pick up address, destination address, and trip price .
    private String startPickUpAddress;
    private String destinationAddress;
    private double price;

    public Route(String startPickUpAddress, String destinationAddress, double price) {
        this.startPickUpAddress = startPickUpAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public String getStartPickUpAddress() {
        return startPickUpAddress;
    }

    public void setStartPickUpAddress(String startPickUpAddress) {
        this.startPickUpAddress = startPickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Start address: "+startPickUpAddress + " ,Destination address: " + destinationAddress + ", Cost " + price;
    }
}
