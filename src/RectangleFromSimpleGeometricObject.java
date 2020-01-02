public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject() {

    }

    public RectangleFromSimpleGeometricObject(double width, double height) {


        this.width = width;
        this.height = height;


    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);

    }

    //get width returns width
    public double getWidth() {
        return width;
    }

    //set width:defines the width
    public void setWidth(double width) {
        this.width = width;
    }
//get height returns height
    public double getHeight(){
        return height;

    }
//set height:defines the new height
    public void setHeight(double height) {
        this.height = height;
    }

//return area
    public double getArea(){
        return width * height;
    }

//returns perimeter
    public double getperimeter(){
        return 2 * (width + height) ;
    }






}
