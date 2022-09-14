package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai1 {
    private Scanner scan = new Scanner(System.in);
    private int a, b;
    
    public Bai1() {
        System.out.print("a = ");
        a = scan.nextInt();
        System.out.print("b = ");
        b = scan.nextInt();  
    }
    
    public Bai1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void setA() {
        System.out.print("a = ");
        a = scan.nextInt();
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getA() {
        return a;
    }
    
    public void setB() {
        System.out.print("b = ");
        b = scan.nextInt();
    }
    
    public void setB(int a) {
        this.b = b;
    }
    
    public int getB() {
        return b;
    }
    
    public long tong() {
        long sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
    
    public long hieu() {
        long sub = a - b;
        System.out.println(a + " - " + b + " = " + sub);
        return sub;
    } 
    
    public long tich() {
        long mul = a * b;
        System.out.println(a + " * " + b + " = " + mul);
        return mul;
    } 
    
    public double thuong() {
        double div = 0;
        if (b == 0)
            System.out.println(a + " / " + b + " khong ton tai");
        else
        {
            div = a / b;
            System.out.println(a + " / " + b + " = " + div);
        }
        return div;
    } 
}
