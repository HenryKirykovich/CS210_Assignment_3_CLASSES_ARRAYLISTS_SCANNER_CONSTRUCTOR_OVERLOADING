package com.example;

public class Area {
    private int width;
    private int height;
    private Double base;
    private Double radius;

    public Area() {
     System.out.println("You dint put any data");
    }

    public Area(int width, int height) {
        System.out.println(width);
        this.width = width;
        this.height = height;
    }

    public Area(int width, Double base) {
        this.width = width;
        this.base = base;
    }

    public Area(Double radius) {
        this.radius = radius;
        
    }

    public int AreaRectangle() {
        return width * height;
    }

    public double AreaTriangle() {
        return width * base;
    }

    public double AreaCircle() {
        return Math.PI*(radius * radius);
    }

    

}
