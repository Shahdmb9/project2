public class Car {
    private String code;
    private int maximumCapacity;
    private final Route fixedRute;

    public Car(Route fixedRute){
        this.fixedRute=fixedRute;
    }

    public Car(String code, int maximumCapacity, Route fixedRute) {
        this.code = code;
        this.maximumCapacity = maximumCapacity;
        this.fixedRute = fixedRute;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public Route getFixedRute() {
        return fixedRute;
    }


    @Override
    public String toString() {
            return "Car Code: " + code + ", Car Maximum Capacity: " + maximumCapacity+" Route: " + fixedRute;
    }
}
