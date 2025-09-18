import java.util.Scanner;
import Class.KhuPho;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhuPho qlkp_236 = new KhuPho();

        qlkp_236.nhapDanhSach(sc);

        System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
        qlkp_236.timKiemThongTin();
    }

}