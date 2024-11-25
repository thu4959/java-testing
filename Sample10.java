abstract class Vehicle {
    protected int speed;

    public void setSpeed(int s) {
        speed = s;
        System.out.println("Speed is" + speed);
    }

    abstract void show();
}

class Car extends Vehicle {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("Number is" + num + "gasoline amount is" + gas);

    }

    public void show() {
        System.out.println("Number is" + num);
        System.out.println("gasoline amount is" + gas);
        System.out.println("Speed is" + speed);

    }

}

class Plane extends Vehicle {
    private int flight;

    public Plane(int f) {
        flight = f;
        System.out.println("The plane number" + flight + "is made.");

    }

    public void show() {
        System.out.println("the number of plane is" + flight);
        System.out.println("Speed is" + speed);
    }
}

class Sample10 {
    public static void main(String[] args) {
        Vehicle[] vc;
        vc = new Vehicle[2];

        vc[0] = new Car(1234, 20.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        for (int i = 0; i < vc.length; i++) {
            vc[i].show();
        }
    }
}