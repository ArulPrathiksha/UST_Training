package Object_as_Method_Parameter;

/*Create a class Rectangle with attributes length and width.
Write a method compareArea(Rectangle r) that compares the area of the current rectangle with another rectangle passed as a parameter. */

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public void compareArea(Rectangle r) {
        System.out.println("Length 1 : " + length + " ; Width 1 : " + width);
        System.out.println("Length 2 : " + r.length + " ; Width 2 : " + r.width);
        double area1 = this.area(length, width);
        double area2 = r.area(r.length, r.width);
        System.out.println("Area 1 = " + area1 + "\nArea 2 = " + area2);
        if (area1 == area2) {
            System.out.println("Area is Equal");
        } else {
            System.out.println("Area is not equal");
        }
    }

}

public class CompareRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        Rectangle r = new Rectangle(20.1, 10);
        rect.compareArea(r);
    }
}
