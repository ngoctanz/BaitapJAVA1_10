import java.util.Scanner;
import Class.TuyenSinh;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TuyenSinh dsTuyenSinh_236 = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh_236.nhapDanhSach(sc);

        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh_236.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();

        dsTuyenSinh_236.timKiemThiSinh(soBaoDanh);

        sc.close();
    }
}