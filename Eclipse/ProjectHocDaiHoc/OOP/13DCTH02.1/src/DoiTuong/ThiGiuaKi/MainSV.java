package DoiTuong.ThiGiuaKi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<SinhVien> dSSV = new ArrayList<SinhVien>();
        SinhVien sv1 = new SinhVien(1911080060, "Trương Văn Tiến Thịnh", 7, 6);
        SinhVien sv2 = new SinhVien(1911080090, "Phạm Xuân Tùng", 5, 8);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhap họ tên: ");
        String hoTen= sc.nextLine();
        sv3.setHoTen(hoTen);
        System.out.print("Nhập mã số sinh viên: ");
        int maSV = sc.nextInt();
        sv3.setMaSV(maSV);
        System.out.print("Nhập điểm LT: ");
        float diemLT = sc.nextFloat();
        sv3.setDiemLT(diemLT);
        System.out.print("Nhập điểm TH: ");
        float diemTH = sc.nextFloat();
        sv3.setDiemTH(diemTH);
        dSSV.add(sv1);
        dSSV.add(sv2);
        dSSV.add(sv3);
        for (SinhVien sinhVien : dSSV) {
			System.out.println(sinhVien.toString(dSSV));
		}
	}

}
