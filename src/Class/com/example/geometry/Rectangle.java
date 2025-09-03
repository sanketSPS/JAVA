package com.example.geometry;

public class Rectangle {
    double height;
    double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double area(){
        return 2*(weight*height);
    }
}
