public class Vehicle {
    private String make;
    private String color;
    private String model;
    private double odometer;

    public Vehicle(String make, String color, String model) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.odometer = 0.0;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean drive(double kilometers) {
        this.odometer += kilometers;
        return true;
    }


}
