package section22.list;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> animals = List.of("Cat", "Dog", "Bat", "Fish"); // Lista imutável
        List<String> animalsAl = new ArrayList<>(animals);
        List<String> animalsLl = new LinkedList<>(animals);
        List<String> animalsV = new Vector<>(animals); // Funciona da mesma maneira que o array list e é thread-safe

        System.out.println(animalsAl);

         animalsAl.removeIf(animal -> animal.endsWith("at"));

//        Iterator<String> iterator = animalsAl.iterator();
//        while(iterator.hasNext()) {
//            if(iterator.next().endsWith("at")) {
//                iterator.remove();
//            }
//        }

        System.out.println(animalsAl);

        List<Integer> values = List.of(102, 103, 101, 104, 105, 106, 100);
        List<Integer> valuesAl = new ArrayList<>(values);

        System.out.println(valuesAl.contains(101));

        valuesAl.remove(Integer.valueOf(101));

        System.out.println(valuesAl);

        Collections.sort(valuesAl);

        System.out.println(valuesAl);

    }
}
