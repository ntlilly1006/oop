package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai2 {
    private Scanner scan = new Scanner(System.in);
    private float length, width;
    
    public Bai2() {
        length = 0;
        width = 0;
    }
    
    public Bai2(float length, float width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength() {
        System.out.print("length = ");
        length = scan.nextFloat();
    }
    
    public void setLength(float length) {
        this.length = length;
    }
    
    public float getLength() {
        return length;
    }
    
    public void setWidth() {
        System.out.print("width = ");
        width = scan.nextFloat();  
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    public float getwidth() {
        return width;
    }
    
    public double perimeter() {
        double C = 0;
        if (length > 0 && width > 0) {
            C = (length + width) * 2;
            System.out.println("Chu vi: " + C);
        }
        else
            System.out.println("Khong tao thanh hinh chu nhat");
        return C;
    }
    
    public double area() {
        double S = 0;
        if (length > 0 && width > 0) {
            S = length * width;
            System.out.println("Dien tich: " + S);
        }
        else
            System.out.println("Khong tao thanh hinh chu nhat");
        return S;
    }
}
