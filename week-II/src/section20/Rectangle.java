package section20;

public class Rectangle {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double area() {
        return length * width;
    }

    public Double perimeter() {
        return 2 * (width + length);
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Width: %f, Length: %f, Area: %f, Perimeter: %f", width, length, area(), perimeter());
    }
}
