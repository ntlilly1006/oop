package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai7 {
    private Scanner scan = new Scanner(System.in);
    private int N;
    
    public Bai7() {
        N = 0;
    }
    
    public Bai7(int N) {
        this.N = N;
    }
    
    public void setN() {
        System.out.print("N = ");
        N = scan.nextInt();
    }
    
    public void setN(int N) {
        this.N = N;
    }
    
    public int getN() {
        return N;
    }
    
    public long caua() {
        long s = 0;
        System.out.println("\nCac so tu nhien <= " + N + ":");
        for (int i = 0; i <= N; i++) {
            s += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTong: " + s);
        return s;
    }
    
    public long caub() {
        long s = 0;
        System.out.println("\nCac so tu nhien chan <= " + N + ":");
        for (int i = 0; i <= N; i+=2) {
            s += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTong: " + s);
        return s;
    }
    
    public long cauc() {
        long s = 0;
        System.out.println("\nCac so tu nhien le <= " + N + ":");
        for (int i = 1; i <= N; i+=2) {
            s += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTong: " + s);
        return s;
    }
    
    public long caud() {
        long s = 0;
        System.out.println("\nCac so tu nhien chan <= " + N + ":");
        for (int i = 0; i <= N; i++) {
            if (isPrime())
            s += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTong: " + s);
        return s;
    }
    
}
