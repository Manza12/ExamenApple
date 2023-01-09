package fr.albi.imt.oop.geometry;

import java.util.ArrayList;
import java.util.List;

public class Circle extends AbstractGeometry {
    public static float RESOLUTION = 1000;
    public float x; 
    public float y; 
    public float radius; 
    
    public Circle(float x,float y,float radius){
        this.x=x; 
        this.y=y;
        this.radius=radius;

    }

    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        float step = 2f/ RESOLUTION / 2f;
        for (float i = x-radius ; i < x+radius ; i += step) {
            float plusy = (float) Math.sqrt(radius*radius - Math.pow(i-x, 2)) + y;
            float minusy = -(float) Math.sqrt(radius*radius - Math.pow(i-x, 2)) + y;
            Point pluspoint = new Point(i, plusy);
            Point minuspoint = new Point(i, minusy);
            points.add(pluspoint);
            points.add(minuspoint); 

        }
        return points; 
    }
    
}
