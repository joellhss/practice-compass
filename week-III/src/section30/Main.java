package section30;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new CopyOnWriteArrayList<>();
        values.add(5);
        values.add(6);
        values.add(8);
        values.add(12);

        System.out.println(values);

        IncrementClass incrment = new IncrementClass();
        incrment.inncrementI();
        incrment.inncrementI();
        incrment.inncrementI();
        System.out.println(incrment.getI());

        ConcurrentMap<Character, LongAdder> accurances = new ConcurrentHashMap<>();

        String str = "kjbadsfl defbladsjf hjbdfljADLF";
        char[] strTochar = str.toCharArray();
        for(char character:strTochar) {
            accurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
        }

    }
}
