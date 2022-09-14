package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai3 {
    private Scanner scan = new Scanner(System.in);
    private float radius;
    
    public Bai3() {
        radius = 0;
    }
    
    public Bai3(float radius) {
        this.radius = radius;
    }
    
    public void setRadius() {
        System.out.print("r = ");
        radius = scan.nextFloat();
    }
    
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    public float getRadius() {
        return radius;
    }
    
    public double perimeter() {
        double C = 0;
        if (radius > 0) {
            C = 2*Math.PI*radius;
            System.out.println("Chu vi: " + C);
        }
        else
            System.out.println("Khong tao thanh hinh tron");
        return C;
    }
    
    public double area() {
        double S = 0;
        if (radius > 0) {
            S = Math.PI*Math.pow(radius, 2);
            System.out.println("Dien tich: " + S);
        }
        else
            System.out.println("Khong tao thanh hinh tron");
        return S;
    }
}
