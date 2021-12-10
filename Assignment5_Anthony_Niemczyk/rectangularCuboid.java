public class rectangularCuboid extends rectangle implements Comparable {

    public double TLcoordZ;
    public double height;
    public rectangularCuboid(double TLcoordX, double TLcoordY, double TLcoordZ, double length, double width, double height) {
        super(TLcoordX, TLcoordY, length, width);
        this.height = height;
        this.TLcoordZ = TLcoordZ;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getLength()*getWidth()*getHeight();
    }
    public double getArea(){
        return 2*((getLength()*getWidth())+(getLength()*getHeight())+(getWidth()*getHeight()));
    }

    public String toString(){
        return "Volume of cuboid = " + getVolume();
    }
    public int compareTo(Object other){
        if (other instanceof rectangularCuboid){
            rectangularCuboid rc = (rectangularCuboid) other;
            if(this.getVolume() < rc.getVolume()){
                return -1;
            } else if (this.getVolume() > rc.getVolume()){
                return 1;
            }
        }
        return 0;
    }
}
