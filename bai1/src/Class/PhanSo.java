package Class;

import java.util.Scanner;

public class PhanSo {
	// thuoc tinh
	private int tuSo_249;
	private int mauSo_249;

	// phuong thuc
	// ham khoi tao khong doi so
	public PhanSo() {
		tuSo_249 = 0;
		mauSo_249 = 1;
	}

	// ham khoi tao co doi so
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo_249 = tuSo;
		this.mauSo_249 = mauSo;
	}

	// ham nhap phan so
	public void nhapPS(Scanner sc) {
		int a;
		int b;

		do {
			System.out.print("\tNhap vao tu so: ");
			a = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b = sc.nextInt();

			// kiem tra
			if (b == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_249 = a;
				mauSo_249 = b;
			}
		} while (b == 0);
	}

	// ham hien thi
	public void hienThiPS() {
		if (tuSo_249 * mauSo_249 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_249) + "/" + Math.abs(mauSo_249 ));
		} else {
			System.out.println("\t" + Math.abs(tuSo_249) + "/" + Math.abs(mauSo_249 ));
		}
	}

	// ham cong
	public PhanSo congPS(PhanSo ps2) {
		int a = tuSo_249 * ps2.mauSo_249 + ps2.tuSo_249 * mauSo_249 ;
		int b = mauSo_249 * ps2.mauSo_249 ;

		return new PhanSo(a, b);
	}

	// ham tru
	public PhanSo truPS(PhanSo ps2) {
		int a = tuSo_249 * ps2.mauSo_249 - ps2.tuSo_249 * mauSo_249 ;
		int b = mauSo_249 * ps2.mauSo_249 ;

		return new PhanSo(a, b);
	}

	// ham nhan
	public PhanSo nhanPS(PhanSo ps2) {
		int a = tuSo_249 * ps2.tuSo_249;
		int b = mauSo_249 * ps2.mauSo_249 ;

		return new PhanSo(a, b);
	}

	// ham chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a = tuSo_249 * ps2.mauSo_249 ;
		int b = mauSo_249 * ps2.tuSo_249;

		return new PhanSo(a, b);
	}

	// ham tim uscln
	private int timUSCLN(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}

	// ham kiem tra phan so toi gian hay chua
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo_249, mauSo_249 ) == 1) {
			return true;
		}
		return false;
	}

	// ham toi gian
	public void toiGianPS() {
		int x = timUSCLN(tuSo_249, mauSo_249 );

		tuSo_249 /= x;
		mauSo_249 /= x;
	}
}
