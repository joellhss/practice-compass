package section25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(Arrays.asList("Cat", "Bat", "Dog"));
        List<Integer> values = new ArrayList<>(Arrays.asList(101, 2, 99, 74, 6, 15, 8, 13, 3, 101, 2, 6));

        animals.forEach(System.out::println);

        System.out.println("______________");
        animals.stream()
                .filter(animal -> animal.endsWith("at"))
                .forEach(System.out::println);

        System.out.println("______________");
        values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);

        System.out.println("______________");
        Integer sum = values.stream().reduce(0, Integer::sum); // Somar/concatenar todos os elementos
        System.out.println(sum);

        System.out.println("______________");
        values.stream()
                .sorted() // Organiza os elementos em ordem crescente
                .forEach(System.out::println);

        System.out.println("______________");
        values.stream().distinct().forEach(System.out::println);

        System.out.println("______________");
        List<Integer> valuesSquared = values.stream()
                .distinct() // Elimina valores repetidos
                .map(e -> e * e) // Mapeia todos os elementos rodando alguma operação
                .collect(Collectors.toList()); // Para adicionar os elementos no novo array
        System.out.println(valuesSquared);

        Optional<Integer> max = values.stream().max(Integer::compareTo);
        System.out.println(max);

        Optional<Integer> min = values.stream().min(Integer::compareTo);
        System.out.println(min.get());


    }
}
