class Car {
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

class Sample6 {
    public static void main(String[] args) {
        Car car1;
        System.out.println("A car named 1 is made.");
        car1 = new Car();
        car1.setCar(1234, 20.5);

        Car car2;
        System.out.println("A car named 2 is made.");

        car2 = car1;
        System.out.println("car1 is put into car2");

        System.out.println("car1 is showed");
        car1.show();
        System.out.println("car2 is showed");
        car2.show();

    }
}
