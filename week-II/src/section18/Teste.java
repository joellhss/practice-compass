package section18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Teste {
    public static void main(String[] args) {
        int[] testes = {1, 2, 3, 4, 5};

        for(int teste:testes){
            System.out.println(teste);
        }

        Arrays.fill(testes, 100);
        System.out.println(Arrays.toString(testes));

        List<String> daysOfTheWeek = new ArrayList<String>(Arrays.asList(
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        ));

        AtomicReference<String> diaMaior = new AtomicReference<>("");

        daysOfTheWeek.forEach(day -> {
            if(day.length() > diaMaior.get().length()) {
                diaMaior.set(day);
            }
        });

        System.out.println("O nome do dia que é maior é:" + diaMaior);

        for(int i = (daysOfTheWeek.size() - 1); i >= 0; i--) {
            System.out.println(daysOfTheWeek.get(i));
        }

    }
}
