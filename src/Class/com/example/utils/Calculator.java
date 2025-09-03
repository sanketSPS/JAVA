package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir=new Circle(5);
        Rectangle rect=new Rectangle(3,4);

        double areaCir=Math.PI* Math.pow(cir.raduis,2);
//        System.out.println("Area of Abstract.Circle:"+areaCir);
//        System.out.println("Area of Rectangle:"+rect.area());

        System.out.printf("Area of the circle is: %f, Area of the rectangle is: %f",
                areaCir, rect.area());
    }
}
