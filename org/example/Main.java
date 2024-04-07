package point.java;
import java.io.Console;

import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(10,10);
        System.out.printf("Point coords: x:%s : y:%s%n", point.getX(), point.getY());
    
        Circle circle = new Circle(point, 10.2);
        Point circleCenter = circle.getCenter();
        System.out.printf("Circle center: {X: %s, Y: %s}", 
        circleCenter.getX(),
        circleCenter.getY()
        )
        ColoredCircle cc = new ColoredCircle(point,10.2, Color.black);
        Paint coloredCircleCenter = cc.get.Center();
        System.out.printf (
            "Colored circle center: {X: %s, Y: %s} colore: %s%n,
            coloredcircleCenter.getX(),
            coloredcirclecenter.getY(),
        cc.getColor()
        };
}
