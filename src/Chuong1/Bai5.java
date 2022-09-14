package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class Bai5 {
    private Scanner scan = new Scanner(System.in);
    private int N;
    
    public Bai5() {
        N = 0;
    }
    
    public Bai5(int N) {
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
    
    public String NZP() {
        String S = "Zero";
        if (N < 0) {
            S = "Negative";
            System.out.println(N + " la so am");
        }
        else if (N > 0) {
            S = "Positive";
            System.out.println(N + " la so duong");
        }
        else
            System.out.println(N + " bang khong");
        return S;
    }
}
