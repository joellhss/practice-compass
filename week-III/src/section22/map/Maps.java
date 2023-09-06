package section22.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> mapa = Map.of("A", 3, "Z", 4, "J", 8);
        System.out.println(mapa);
        System.out.println(mapa.containsKey("Z"));
        System.out.println(mapa.isEmpty());
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        mapa.put("D", 4);
        System.out.println(mapa.size());

        Map<String, Integer> mapaHm = new HashMap<>(mapa);
        mapaHm.put("L", 7);
        mapaHm.put("T", 250);
        System.out.println(mapaHm);
        System.out.println(mapaHm.get("R"));

        Map<String, Integer> mapaLm = new LinkedHashMap<>(mapaHm);
        System.out.println(mapaLm);

        Map<String, Integer> mapaTm = new TreeMap<>(mapaHm);
        System.out.println(mapaTm);


    }
}
