import java.util.Scanner;
import Class.QLCB;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlcb_236 = new QLCB();
        qlcb_236.nhapDanhSach(sc);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();

        qlcb_236.timKiemCanBo(name);

        sc.close();
    }
}