package section18;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Student {
    private String name;
    private List<Double> marks;

    public Student(String name) {
        this.name = name;
        marks = new ArrayList<>();
    }
    public Student(String name, Double... mark) {
        this.name = name;
        marks = new ArrayList<>(Arrays.asList(mark));
    }

    public void addNewMark(Double mark) {
        marks.add(mark);
        System.out.println("Nota adicionada.");
    }

    public void removeMarkAtIndex(int index) {
        if (index >= 0 && index < marks.size()) {
            marks.remove(index);
            System.out.println("Nota removida.");
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public Double getTotalSumOfMarks() {
        AtomicReference<Double> sum = new AtomicReference<>(0d);
        marks.forEach(mark -> {
            sum.updateAndGet(v -> v + mark);
        });
        return sum.get();
    }

    public Double getMaximumMark() {
        return Collections.max(marks);
    }
    public Double getMinimumMark() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMark() {
        String sum = Double.toString(this.getTotalSumOfMarks());
        String size = Integer.toString(this.getNumberOfMarks());

        BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(size), 2, RoundingMode.CEILING);
        return average;
    }

    public List<Double> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
