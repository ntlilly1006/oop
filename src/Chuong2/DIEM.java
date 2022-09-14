/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong2;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class DIEM {
    private Scanner scan = new Scanner(System.in);
    private float x;
    private float y;
    
    public DIEM() {
        x = 0;
        y = 0;
    }
    
    public DIEM(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void input(){
        x = scan.nextFloat();
        y = scan.nextFloat();
    }
    
    
}
