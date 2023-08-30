package section9;

public class MotorBike {
    private int speed;

    public MotorBike() {
        this(5);
    }
    public MotorBike(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike Started!");
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        if(speed >= 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int howMuch) {
        if(howMuch > 0) {
            setSpeed(this.speed + howMuch);
        }
    }

    public void decreaseSpeed(int howMuch) {
        if(howMuch > 0) {
            setSpeed(this.speed - howMuch);
        }
    }
}
