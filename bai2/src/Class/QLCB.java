package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_236;
	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_236 = new ArrayList<CanBo>(10);
	}
	// ham them can bo
	public void themCanBo(CanBo cb) {
		dscb_236.add(cb);
	}
	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		CanBo cb_236;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();

			cb_236 = new CanBo();

			switch (chon) {
			case 1:
				cb_236 = new KySu();
				break;
			case 2:
				cb_236 = new NhanVien();
				break;
			case 3:
				cb_236 = new CongNhan();
				break;

			default:
				cb_236 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_236.nhapThongTin(sc);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_236);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb : dscb_236) {
			if (hoTen.equals(cb.getHoTen())) {
				cb.hienThiThongTin();
			}
		}
	}
}
