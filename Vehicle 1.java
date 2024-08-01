class Vehicle1 {
    private String make;
    private String model;
    private String color;
    private int odometer;

    public Vehicle1(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.odometer = 0;
    }

    public boolean drive(int kilometers) {
        this.odometer += kilometers;
        return true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
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
}



