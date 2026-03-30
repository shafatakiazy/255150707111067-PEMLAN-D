public class Vehicle1 {
    private double load;
    private static double maxLoad = 10000;  // ditambah static

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load += weight;
            return true;
        } else {
            return false;
        }
    }
}
