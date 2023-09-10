package section30;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementClass {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    public void inncrementI() {
        i.getAndIncrement();
    }

    public int getI() {
        return i.get();
    }
    public void inncrementJ() {
        j.getAndIncrement();
    }

    public int getJ() {
        return j.get();
    }


}
