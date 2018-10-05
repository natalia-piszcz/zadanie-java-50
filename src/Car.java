public class Car extends Vehicle {
    private boolean ac;

    public Car(String name, double tankCapacity, double combustion, boolean ac) {
        super(name, tankCapacity, combustion);
        this.ac = ac;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void enableAc() {
        ac = true;
    }

    public void disableAc() {
        ac = false;
    }

    public double getCombustion() {


        if (ac) {
            return combustion + 0.8;
        } else {
            return combustion;
        }
    }


    String showInfo() {
        if (ac) {
            System.out.println("Klima jest włączona");
        } else {
            System.out.println("Klima jest wyłączona");
        }
        return "Nazwa: " + getName() + " Pojemność silnika: " + getTankCapacity() + " Spalanie: " + getCombustion() + " Zasięg: " + mileage();
    }
}
