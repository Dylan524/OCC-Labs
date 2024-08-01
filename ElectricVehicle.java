public class ElectricVehicle extends Vehicle {
        private double kilometersPerKilowattHour;
        private double maxKilowattsInBattery;
        private double currentKilowattsInBattery;

        public ElectricVehicle(String make, String model, String color, double kilometersPerKilowattHour, double maxKilowattsInBattery) {
            super(make, model, color);
            this.kilometersPerKilowattHour = kilometersPerKilowattHour;
            this.maxKilowattsInBattery = maxKilowattsInBattery;
            this.currentKilowattsInBattery = 0;
        }

        public double getKilometersPerKilowattHour() {
            return kilometersPerKilowattHour;
        }

        public double getMaxKilowattsInBattery() {
            return maxKilowattsInBattery;
        }

        public double getCurrentKilowattsInBattery() {
            return currentKilowattsInBattery;
        }

        public void charge(double kilowattsToCharge) {
            this.currentKilowattsInBattery += kilowattsToCharge;
            if (this.currentKilowattsInBattery > this.maxKilowattsInBattery) {
                this.currentKilowattsInBattery = this.maxKilowattsInBattery;
            }
        }

        @Override
        public boolean drive(double kilometers) {
            double requiredKilowatts = kilometers / this.kilometersPerKilowattHour;
            if (this.currentKilowattsInBattery >= requiredKilowatts) {
                this.currentKilowattsInBattery -= requiredKilowatts;
                super.drive(kilometers);
                return true;
            } else {
                super.drive((int)(this.currentKilowattsInBattery * this.kilometersPerKilowattHour));
                this.currentKilowattsInBattery = 0;
                return false;
            }
        }
    }


