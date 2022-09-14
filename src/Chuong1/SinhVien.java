package Chuong1;

import java.util.Scanner;

/**
 *
 * @author Lilly
 */
public class SinhVien {

    private Scanner scan = new Scanner(System.in);
    private String masv;
    private String hotensv;
    private String namsinh;
    private String sdt;
    private String diachi;

    public SinhVien() {
        masv = null;
        hotensv = null;
        namsinh = null;
        sdt = null;
        diachi = null;
    }

    public SinhVien(String masv, String hotensv, String namsinh, String sdt, String diachi) {
        this.masv = masv;
        this.hotensv = hotensv;
        this.namsinh = namsinh;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public void nhap() {
        System.out.print("Ma sinh vien: ");
        masv = scan.nextLine();
        System.out.print("Ho ten sinh vien: ");
        hotensv = scan.nextLine();
        System.out.print("Nam sinh: ");
        namsinh = scan.nextLine();
        System.out.print("So dien thoai: ");
        sdt = scan.nextLine();
        System.out.print("Dia chi: ");
        diachi = scan.nextLine();
    }

    public void xuat() {
        System.out.println("Ma sinh vien: " + masv);
        System.out.println("Ho ten sinh vien: " + hotensv);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("Dia chi: " + diachi);
    }
    
    public void setMasv() {
        System.out.print("Ma sinh vien: ");
        masv = scan.nextLine();
    }
    
    public void setMasv(String masv) {
        this.masv = masv;
    }
    
    public String getMasv() {
        return masv;
    }
    
    public void setHotensv() {
        System.out.print("Ho ten sinh vien: ");
        hotensv = scan.nextLine();
    }
    
    public void setHotensv(String hotensv) {
        this.hotensv = hotensv;
    }
    
    public String getHotensv() {
        return hotensv;
    }

    public void setNamsinh() {
        System.out.print("Nam sinh: ");
        namsinh = scan.nextLine();
    }
    
    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }
    
    public String getNamsinh() {
        return namsinh;
    }
    
    public void setSdt() {
        System.out.print("So dien thoai: ");
        sdt = scan.nextLine();
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String getSdt() {
        return sdt;
    }
    
    public void setDiachi() {
        System.out.print("Dia chi: ");
        diachi = scan.nextLine();
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public String getDiachi() {
        return diachi;
    }
    
    
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        a.nhap();
        a.xuat();
    }
}
