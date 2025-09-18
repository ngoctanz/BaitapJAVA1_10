import java.util.Scanner;
import Class.QuanLy;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql_236 = new QuanLy();

        ql_236.nhapDanhSach(sc);

        System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
        ql_236.timKiem(8000000);

        sc.close();
    }
}