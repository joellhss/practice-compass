package section22.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class SortByStringLength implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class Queues {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(new SortByStringLength());
        fila.offer("Joel");
        fila.offer("Louise");
        fila.offer("Gabriel");

        System.out.println(fila);
        System.out.println(fila.peek());
    }
}
