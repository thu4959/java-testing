interface iVehicle {

    void show();
}

class Car implements iVehicle {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("A car is produced with number " + num + ", and gasoline amount is " + gas);

    }

    public void show() {
        System.out.println("The Car number is" + num);
        System.out.println("The gasoline amount of The Car is" + gas);

    }

}

class Plane implements iVehicle {
    private int flight;

    public Plane(int f) {
        flight = f;
        System.out.println("The plane number " + flight + " is produced.");

    }

    public void show() {
        System.out.println("the number of plane is " + flight);

    }
}

class Sample12 {
    public static void main(String[] args) {
        iVehicle[] ivc;
        ivc = new iVehicle[2];

        ivc[0] = new Car(1234, 20.5);
        ivc[1] = new Plane(232);

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();

        }
    }
}