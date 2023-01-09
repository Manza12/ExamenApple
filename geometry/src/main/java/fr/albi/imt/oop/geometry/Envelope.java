package fr.albi.imt.oop.geometry;

public class Envelope {
    public float minX; 
    public float minY; 
    public float maxX; 
    public float maxY; 

    public Envelope (float minX,float minY,float maxX, float maxY){
        this.minX = minX; 
        this.minY = minY; 
        this.maxX = maxX; 
        this.maxY = maxY; 
    }
}
