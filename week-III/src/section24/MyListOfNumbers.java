package section24;

import java.util.ArrayList;
import java.util.List;

public class MyListOfNumbers<T extends Number> {
    private List<T> list;

    public MyListOfNumbers() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                '}';
    }
}
