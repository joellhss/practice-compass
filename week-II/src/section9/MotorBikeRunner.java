package section9;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike honda = new MotorBike(100);
        MotorBike ducati = new MotorBike(100);
        MotorBike yamaha = new MotorBike();

        ducati.start();
        honda.start();

//        System.out.println(honda.getSpeed());
//        System.out.println(ducati.getSpeed());

        ducati.increaseSpeed(-100);
        ducati.decreaseSpeed(-100);
        ducati.decreaseSpeed(201);

        ducati.increaseSpeed(50);
        ducati.decreaseSpeed(25);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(yamaha.getSpeed());
    }
}
