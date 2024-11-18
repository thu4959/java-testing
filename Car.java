public class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("A car is made.");

    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("number is " + num + ",the gasoline amount is" + gas);

    }

    public void show() {
        System.out.println("Number is- " + num);
        System.out.println("The gasoline amount is-" + gas);
    }
}

class Sample9 {
    public static void main(String[] args) {
        Car[] cars;
        cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }

        cars[0].setCar(1234, 10.5);
        cars[1].setCar(2345, 20.5);
        cars[2].setCar(3456, 40.5);

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}
