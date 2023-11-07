package DoiTuong.BaiTap;

import java.util.Scanner;

public class MainQLPH {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		DanhSachPhongHoc dSPH = new DanhSachPhongHoc();
		int luaChon=0;
		// TODO Auto-generated method stub
		
		do {try {
			menu();
			System.out.print("Nhập lựa chọn: ");
			luaChon=nhap.nextInt();
			switch(luaChon) {
			case 1: dSPH.themPhong();break;
			case 2: dSPH.inPhong();break;
			default: System.out.print("Nhập lại số vì không nằm trong chương trình");
			nhap.nextLine();break;
			}	
		}catch(Exception e) {
			   System.out.println("Lỗi rồi bạn ơi");
			   nhap.nextLine();
		   }
		}while(luaChon<3);
	}
	static protected void menu() {
		System.out.println("1.Thêm Phòng");
		System.out.println("2.In Phòng");
		System.out.println("3.Dừng");
	}

}
