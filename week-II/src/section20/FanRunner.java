package section20;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
