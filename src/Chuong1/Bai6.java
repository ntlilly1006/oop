package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai6 {
    private Scanner scan = new Scanner(System.in);
    private int N;
    
    public Bai6() {
        N = 0;
    }
    
    public Bai6(int N) {
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
    
    public boolean isPrime() {
        if (N < 2) {
            System.out.println(N + " khong la so nguyen to");
            return false;
        }
        
        for (int i = 2; i < Math.sqrt(N); i++)
            if (N % i == 0) {
                System.out.println(N + " khong la so nguyen to");
                return false;
            }
        
        System.out.println(N + " la so nguyen to");
        return true;
    }
}
