import java.util.Scanner;
import Class.QuanLy;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql_236 = new QuanLy();
        ql_236.nhapDanhSach(sc);

        System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
        ql_236.hienThiDanhSach();

        sc.close();
    }
}