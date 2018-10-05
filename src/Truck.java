public class Truck extends Car {
    double loadWeight;

    Truck(String name, double tankCapacity, double combustion, boolean ac, double loadWeight) {
        super(name, tankCapacity, combustion, ac);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    public double getCombustion() {
        double combustionAc = combustion;


        if (isAc()) {
            combustionAc = combustion + 1.6;
        }
        return loadWeight / 100 * 0.5 + combustionAc;

    }

    String showInfo() {
        return super.showInfo() + "ładowność " + getLoadWeight();
    }


}
