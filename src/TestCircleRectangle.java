public class TestCircleRectangle {

    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The Area is " + circle.getArea());

RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The Area is " + rectangle.getArea());
        System.out.println("The Perimeter is " + rectangle.getperimeter());




    }
}
