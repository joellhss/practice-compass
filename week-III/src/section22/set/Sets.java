package section22.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);

        System.out.println(conjunto);

        conjunto.add(50);
        conjunto.add(7);

        System.out.println(conjunto);

        Set<Integer> conjuntoLs = new LinkedHashSet<>(conjunto);

        conjuntoLs.add(27);

        System.out.println(conjuntoLs);

        Set<Integer> conjuntoTs = new TreeSet<>(conjunto);

        conjuntoTs.add(27);

        System.out.println(conjuntoTs);


    }
}
