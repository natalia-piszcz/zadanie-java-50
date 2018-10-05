public class Vehicle {
    private String name;
    private double tankCapacity;
    double combustion;


    public Vehicle (String name, double tankCapacity, double combustion){
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.combustion = combustion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    public double mileage (){
        return getTankCapacity() / getCombustion() * 100;
    }
}
