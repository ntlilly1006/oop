package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai4 {
    private Scanner scan = new Scanner(System.in);
    private int N;
    
    public Bai4() {
        N = 0;
    }
    
    public Bai4(int N) {
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
    
    public String parity() {
        String S = null;
        if (N % 2 == 0) {
            S = "Even";
            System.out.println(N + " la so chan");
        }
        else if (N % 2 == 1) {
            S = "Odd";
            System.out.println(N + " la so le");
        }
        else
            System.out.println(N + " khong la so nguyen");
        return S;
    }
}
