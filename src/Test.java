import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 1.8, 5.0, false);
        cars[1] = new Car("Audi", 1.8, 5.0, true);
        cars[2] = new Truck("Audi", 1.8, 5.0, true, 5000);
        cars[3] = new Truck("Audi", 1.8, 5.0, false, 5000);

//        cars[1].showInfo();
//        cars[2].showInfo();
//        cars[3].showInfo();

        System.out.println(cars[0].showInfo());
        System.out.println(cars[1].showInfo());
        System.out.println(cars[2].showInfo());
        System.out.println(cars[3].showInfo());


    }
}
