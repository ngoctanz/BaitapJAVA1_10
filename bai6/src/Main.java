import java.util.Scanner;
import Class.KhachSan;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan ql_236 = new KhachSan();

        ql_236.nhapDanhSach(sc);

        System.out.print("Nhap vao khach tro can tinh tien: ");
        int cmnd = sc.nextInt();

        System.out.println("==> Tong tien la: " + ql_236.tinhTien(cmnd));

        sc.close();
    }
}