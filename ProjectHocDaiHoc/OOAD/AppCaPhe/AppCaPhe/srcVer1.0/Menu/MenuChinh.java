package Menu;

import java.util.Scanner;

public class MenuChinh {
	Scanner sc = new Scanner(System.in);
	
	//Hàm tạo có hàm xử lý để khi dùng chỉ cần tạo đối tượng là chạy
	public MenuChinh() {
		this.xuLy();
	}
	
	public void menuChinh() {
		System.out.println("1. Quản lí tài khoản");
		System.out.println("2. Quản lí nhân viên");
		System.out.println("3. Quản lí món");
		System.out.println("4. Quản lí khách hàng");
		System.out.println("5. Quản lí hóa đơn(chọn một món)");
		System.out.println("6. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuChinh();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: new MenuQuanLiTaiKhoan();break;
			case 2: new MenuQuanLiNhanVien();break;
			case 3: new MenuQuanLiMon();break;
			case 4: new MenuQuanLiKhachHang();break;
			case 5: new MenuQuanLiHoaDon();break;
			default: System.out.println("Bye");break;
			}
		}while(luaChon != 6 && luaChon < 6);
	}
}
