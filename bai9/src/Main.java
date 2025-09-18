import java.util.Scanner;
import Class.QuanLy;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql_236 = new QuanLy();

        ql_236.nhapDanhSach(sc);

        System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
        ql_236.hienThiDanhSachTraCuoiThang();

        sc.close();
    }
}