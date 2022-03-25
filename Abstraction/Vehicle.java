abstract class Vehicle {
    public abstract void currentSpeed();
    public abstract void vehicleName();

    public void startDriving() {
        System.out.println("Vehicle is now operating.");
    };
}

class SportsCar extends Vehicle {
    int speed;
    String name;

    public SportsCar(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void currentSpeed() {
        System.out.println("Current speed is: " + speed);
    }

    public void vehicleName() {
        System.out.println("This vehicle is: " + name);
    }

    public void whatVehicleType() {
        System.out.println("I'm a sports car");
    }
}

class Runner2 {
    public static void main(String[] args) {
        SportsCar porsche911 = new SportsCar(250, "Porsche 911");
        porsche911.currentSpeed();
        porsche911.vehicleName();
        porsche911.whatVehicleType();
    }
}