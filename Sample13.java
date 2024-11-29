interface iVehicle {

    void vshow();
}

interface iMaterial {

    void mshow();
}

class Car implements iVehicle, iMaterial {
    private int num;
    private double gas;

    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("A car is produced with number " + num + ", and gasoline amount is " + gas);

    }

    public void vshow() {
        System.out.println("The Car number is" + num);
        System.out.println("The gasoline amount of The Car is" + gas);

    }

    public void mshow() {
        System.out.println("the material of the car is iron.");
    }

}

class Sample13 {
    public static void main(String[] args) {
        Car car1 = new Car(1234, 20.5);
        car1.vshow();
        car1.mshow();
    }
}