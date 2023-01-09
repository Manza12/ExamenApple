package fr.albi.imt.oop.geometry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Controleur {
    public List <Geometry> geometries;
    public Controleur (){
        this.geometries = new ArrayList<Geometry>(); 
    }
    @PostMapping(value ="/circle")
    public Circle addCircle(float x,float y,float radius){
        Circle circle = new Circle(x,y,radius);
        this.geometries.add(circle);
        return circle;
    }
    @PostMapping(value ="/polygon")
    public Polygon addPolygon(@RequestBody Polygon polygon){
        this.geometries.add(polygon);
        return polygon;
    }
    @GetMapping(value ="/geometries")
    public List<Geometry> getGeometries(){
        return this.geometries;
    }
}
