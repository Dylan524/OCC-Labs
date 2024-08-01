public class InternalCombustionEngineVehicle extends Vehicle {
    private double kilometersPerLiter;
    private double maxLitersInTank;
    private double currentLitersInTank;

    public InternalCombustionEngineVehicle(String make, String model, String color, double kilometersPerLiter, double maxLitersInTank) {
        super(make, model, color);
        this.kilometersPerLiter = kilometersPerLiter;
        this.maxLitersInTank = maxLitersInTank;
        this.currentLitersInTank = 0;
    }

    public double getKilometersPerLiter() {
        return kilometersPerLiter;
    }

    public double getMaxLitersInTank() {
        return maxLitersInTank;
    }

    public double getCurrentLitersInTank() {
        return currentLitersInTank;
    }

    public void addGas(double litersOfGas) {
        this.currentLitersInTank += litersOfGas;
        if (this.currentLitersInTank > this.maxLitersInTank) {
            this.currentLitersInTank = this.maxLitersInTank;
        }
    }

    @Override
    public boolean drive(double kilometers) {
        double requiredLiters = kilometers / this.kilometersPerLiter;
        if (this.currentLitersInTank >= requiredLiters) {
            this.currentLitersInTank -= requiredLiters;
            super.drive(kilometers);
            return true;
        } else {
            super.drive((int)(this.currentLitersInTank * this.kilometersPerLiter));
            this.currentLitersInTank = 0;
            return false;
        }
    }
}
