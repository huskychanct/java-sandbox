public class Car {
    private final int top_speed;

    protected Car(int speed) {
        this.top_speed = speed;
    }

    public void driveFast() {
        System.out.println("I am going " + top_speed);
    }

    public static void main(String[] args) {
        Lambo lambo_1 = new Lambo();
        Truck truck_1 = new Truck();
        lambo_1.driveFast();
        truck_1.driveFast();
    }
}

class Lambo extends Car {
    public Lambo() {
        super(200);
    }
}

class Truck extends Car {
    public Truck() {
        super(100);
    }
}

