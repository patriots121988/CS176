public class rectangle implements shape, Comparable, Moveable {

    private double TLcoordX;
    private double TLcoordY;
    private double length;
    private double width;
    private Object rectangle;

    public rectangle(double TLcoordX, double TLcoordY, double length, double width) {
        this.TLcoordX = TLcoordX;
        this.TLcoordY = TLcoordY;
        this.length = length;
        this.width = width;
    }

    public double getTLcoordX() {
        return TLcoordX;
    }

    public void setTLcoordX(double TLcoordX) {
        this.TLcoordX = TLcoordX;
    }

    public double getTLcoordY() {
        return TLcoordY;
    }

    public void setTLcoordY(double TLcoordY) {
        this.TLcoordY = TLcoordY;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void move(double deltaX, double deltaY){
        TLcoordX = TLcoordX + deltaX;
        TLcoordY = TLcoordY + deltaY;
        System.out.println("New X coordinate: "+ TLcoordX);
        System.out.println("New Y coordinate: "+ TLcoordY);
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }
    public String toString(){
        return "area of rectangle = "+ getArea();
    }

    @Override
    public int compareTo(Object o) {
        rectangle rectangle1 = (rectangle) o;
        if(rectangle1.getArea() < ((rectangle) o).getArea()){
            return 1;
        } else{
            return -1;
        }
    }
}
