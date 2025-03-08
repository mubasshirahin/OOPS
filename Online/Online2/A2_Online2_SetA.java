package Online.Online2;

import org.w3c.dom.css.Rect;

class Circle{
    public double radius;
    public String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}

class Rectangle{
    public double height;
    public double width;
    public String color;

    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }
}

class ShapeMaker{
    public Circle makeCircleOutOfRectangle(Rectangle rec){
        double area = rec.height* rec.width;
        double radius = Math.sqrt(area/3.1416);
        Circle c = new Circle(radius, rec.color);
        return c;
    }
}



public class A2_Online2_SetA {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20,"RED");
        ShapeMaker sm = new ShapeMaker();

        Circle cc = sm.makeCircleOutOfRectangle(rec);

        System.out.println(cc.color);
        System.out.println(cc.radius);
    }
}
