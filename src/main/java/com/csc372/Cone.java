package com.csc372;

public class Cone extends Shape {
    private double radius;
    private double height;
    
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double surface_area() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
    
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
    
    public String toString() {
        return "Cone: Surface Area = " + surface_area() + ", Volume = " + volume();
    }
}
