import java.util.Scanner;
import Class.PhanSo;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhanSo ps1_236=new PhanSo();
        PhanSo ps2_236=new PhanSo();
        PhanSo psTong_236 =new PhanSo();

        // nhap phan so
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_236.nhapPS(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_236.nhapPS(sc);

        // tinh tong 2 phan so
        psTong_236=ps1_236.congPS(ps2_236);

        // hien thi phan so
        System.out.println("\nPhan so thu nhat la:");
        ps1_236.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_236.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_236.hienThiPS();

        sc.close();
    }
}