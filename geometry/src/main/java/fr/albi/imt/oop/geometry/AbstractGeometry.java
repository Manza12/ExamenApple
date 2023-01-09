package fr.albi.imt.oop.geometry;

import java.util.List;

public abstract class AbstractGeometry implements Geometry {
    public List <Point> points; 
    
    public Envelope getEnvelope(){
        float maxX=points.get(0).x;
        float maxY=points.get(0).y;
        float minX=points.get(0).x; 
        float minY=points.get(0).y;
        for(Point point : points){
            maxX=Math.max(maxX, point.x);
            maxY=Math.max(maxY, point.y);
            minX=Math.min(minX, point.x);
            minY=Math.min(minY, point.y);

        }
        return new Envelope(minX,minY,maxX,maxY); 
    }
    public List<Point> getPoints(){
        return this.points; 

    }
}

