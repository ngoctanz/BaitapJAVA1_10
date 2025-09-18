import java.util.Scanner;
import Class.QuanLySach;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLySach qls_236 = new QuanLySach();

        qls_236.nhapDanhSachTL(sc);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai = sc.nextLine();
        qls_236.timLoaiTL(loai);

        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL = sc.nextLine();
        qls_236.timMaTL(maTL);

        sc.close();
    }
}