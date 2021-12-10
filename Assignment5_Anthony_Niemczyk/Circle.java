import java.util.Objects;

public class Circle implements shape,Comparable, Moveable {
    double radius;
    double area;
    double centerCoordX;
    double centerCoordY;
    private Object circle;

    public Circle(double centerCoordX, double centerCoordY, double radius) {
        this.centerCoordX = centerCoordX;
        this.centerCoordY = centerCoordY;
        this.radius = radius;
    }

    public String toString() {
        return "radius of circle = "+ radius;
    }

    public double getCenterCoordX() {
        return centerCoordX;
    }

    public void setCenterCoordX(double centerCoordX) {
        this.centerCoordX = centerCoordX;
    }

    public double getCenterCoordY() {
        return centerCoordY;
    }

    public void setCenterCoordY(double centerCoordY) {
        this.centerCoordY = centerCoordY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle1 = (Circle) o;
        return Double.compare(circle1.area, area) == 0 && Double.compare(circle1.centerCoordX, centerCoordX) == 0 && Double.compare(circle1.centerCoordY, centerCoordY) == 0 && circle.equals(circle1.circle);
    }
    public void move(double deltaX, double deltaY){
        centerCoordX = deltaX;
        centerCoordY = deltaY;
        System.out.println("New X coordinate: "+ centerCoordX);
        System.out.println("new Y coordinate: "+ centerCoordY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, centerCoordX, centerCoordY, circle);
    }

    @Override
    public int compareTo(Object o) {
        Circle circle1 = (Circle) o;
        if(circle1.getRadius() < ((Circle) o).getRadius()){
            return 1;
        }else {
            return -1;
        }
    }
}
