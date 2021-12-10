import java.util.Arrays;

public class shapeTest {
    public static void main(String[] args){
        Circle Circles[] = new Circle[3];

        Circle c1 = new Circle(0, 1, 2);
        Circles[0] = c1;

        Circle c2 = new Circle(3, 2, 4);
        Circles[1] = c2;

        Circle c3 = new Circle(4, 5, 10);
        Circles[2] = c3;

        Arrays.sort(Circles);
        System.out.println(Arrays.toString(Circles));

        rectangle rectangles[] = new rectangle[3];

        rectangle r1 = new rectangle(5, 10, 20, 3);
        rectangles[0] = r1;

        rectangle r2 = new rectangle(4, 8, 5, 2);
        rectangles[1] = r2;

        rectangle r3 = new rectangle(6, 9, 8, 10);
        rectangles[2] = r3;

        Arrays.sort(rectangles);
        System.out.println(Arrays.toString(rectangles));

        c1.move(3, 2);
        r2.move(2, 3);

        rectangularCuboid rc1 = new rectangularCuboid(5, 10, 2, 20, 3, 2);
        rectangularCuboid rc2 = new rectangularCuboid(4, 8, 6, 5, 2, 10);

        if (rc1.compareTo(rc2)== -1){
            System.out.println(rc1);
        }else if (rc1.compareTo(rc2)== 1){
            System.out.println(rc2);
        }
    }
}
