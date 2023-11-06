package HienThi;

import java.util.*;
import ChucNang.DoUongChucNang;
import Object.*;

public class DoUongHienThi {
	Scanner sc = new Scanner(System.in);
	private DoUongChucNang doUongChucNang;
	
	public DoUongHienThi() {
		this.setDoUongChucNang(new DoUongChucNang());
	}

	public DoUongChucNang getDoUongChucNang() {
		return doUongChucNang;
	}
	public void setDoUongChucNang(DoUongChucNang doUongChucNang) {
		this.doUongChucNang = doUongChucNang;
	}
	
	public int menu() {
		this.getDoUongChucNang().xemDanhSachDoUong();
		System.out.println("\n1. Thêm đồ uống");
		System.out.println("2. Xóa đồ uống");
		System.out.println("3. Cập nhật đồ uống");
		System.out.println("4. Tìm đồ uống");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public int hienThiLoaiDoUong() {
		System.out.println("1. Cà phê");
		System.out.println("2. Sinh tố");
		System.out.println("3. Đá xay");
		System.out.println("4. Hồng trà");
		System.out.println("5. Trà sữa");
		System.out.println("6. Topping");
		System.out.print("Nhập lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void themDoUong() {
		this.getDoUongChucNang().nhapDoUong(this.nhapTenDoUong(), this.nhapGiaTien(), this.chonLoaiDoUong());
	}
	
	public void xoaDoUong() {
		String str = "Không tìm thấy";
		DoUong doUong = this.getDoUongChucNang().searchDoUong(this.nhapTenDoUong());
		if(doUong != null) {
			doUong.inputNull();
			str = "";
		}
		System.out.println(str);
	}
	
	public void capNhatDoUong() {
		String str = "Không tìm thấy";
		DoUong doUong = this.getDoUongChucNang().searchDoUong(this.nhapTenDoUong());
		if(doUong != null) {
			this.getDoUongChucNang().nhapDoUong(this.nhapTenDoUong(), this.nhapGiaTien(), this.chonLoaiDoUong());
			str = "";
		}
		System.out.println(str);
	}
	
	public void timDoUong() {
		String str = "Không tìm thấy";
		DoUong doUong = this.getDoUongChucNang().searchDoUong(this.nhapTenDoUong());
		if(doUong != null) {
			System.out.printf("\n%-3s %-30s %-15s %s","ID","TÊN","LOẠI","GIÁ");
			doUong.display();
			str = "";
		}
		System.out.println(str);
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		//Hiển thị menu và chọn khi chọn xong thì trả một int cho luaChon
		int luaChon = this.menu();
		do {
			switch(luaChon) {
			case 1: this.themDoUong();break;
			case 2: this.xoaDoUong();break;
			case 3: this.capNhatDoUong();break;
			case 4: this.timDoUong();break;
			}
		}while(luaChon < 5);
	}
	
	public String nhapTenDoUong() {
		System.out.print("Nhập tên đồ uống: ");
		return sc.nextLine();
	}
	
	public double nhapGiaTien() {
		System.out.print("Nhập giá tiền: ");
		return Double.parseDouble(sc.nextLine());
	}
	
	public LoaiDoUong chonLoaiDoUong() {
		//Hiển thị menu và chọn khi chọn xong thì trả một int cho luaChon
		int luaChon = this.hienThiLoaiDoUong();
		if(luaChon == 1)
			return LoaiDoUong.CÀPHÊ;
		if(luaChon == 2)
			return LoaiDoUong.SINHTỐ;
		if(luaChon == 3)
			return LoaiDoUong.ĐÁXAY;
		if(luaChon == 4)
			return LoaiDoUong.HỒNGTRÀ;
		if(luaChon == 5)
			return LoaiDoUong.TRÀSỮA;
		if(luaChon == 6)
			return LoaiDoUong.TOPPING;
		return null;
	}
	
	public void xemDoUongTheoLoai(LoaiDoUong loaiDoUong) {
		this.getDoUongChucNang().xemDanhSachTheoLoaiDoUong(loaiDoUong);
	}
}
