package HienThi;

import java.util.*;
import ChucNang.ChonDoUongChucNang;
import Object.*;

public class BanHangHienThi {
	Scanner sc = new Scanner(System.in);
	DoUongHienThi doUongHienThi = new DoUongHienThi();
	private ChonDoUongChucNang chonDoUongChucNang;
	
	public BanHangHienThi() {
		this.setChonDoUongChucNang(new ChonDoUongChucNang());
	}
	
	public ChonDoUongChucNang getChonDoUongChucNang() {
		return chonDoUongChucNang;
	}
	public void setChonDoUongChucNang(ChonDoUongChucNang chonDoUongChucNang) {
		this.chonDoUongChucNang = chonDoUongChucNang;
	}
	
	public int menu() {
		System.out.println("\n1. Chọn đồ uống");
		System.out.println("2. Đặt đồ uống");
		System.out.print("Nhập lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	
	
	public void chonDoUong() {
		HoaDon hoaDon = new HoaDon();
		this.xuLyChonDoUong(hoaDon.getIdHoaDon());
	}
	
	public void xuLyChonDoUong(int idHoaDon) {
		boolean nhapTiep = false;
		do {
			ChonDoUong chonDoUong = new ChonDoUong(this.doUongHienThi.nhapTenDoUong(), this.nhapSoLuong());
			this.phanLoaiDoUongDeChon(idHoaDon, chonDoUong);
			nhapTiep = this.nhapTiep();
			this.getChonDoUongChucNang().xemDanhSachChonDoUong(idHoaDon);
		}while(nhapTiep);
	}
	
	public void phanLoaiDoUongDeChon(int idHoaDon, ChonDoUong chonDoUong) {
		if(this.getChonDoUongChucNang().kiemTraLoai(this.getChonDoUongChucNang().layLoaiDoUong(chonDoUong))) {
			this.doUongHienThi.xemDoUongTheoLoai(LoaiDoUong.TOPPING);
			ChonDoUong chonTopping = this.kiemTraKhongChonDoUong(this.doUongHienThi.nhapTenDoUong());
			this.getChonDoUongChucNang().chonDoUong(idHoaDon, chonDoUong, chonTopping);
		}else {
			this.getChonDoUongChucNang().chonDoUong(idHoaDon, chonDoUong);
		}
	}
	
	public ChonDoUong kiemTraKhongChonDoUong(String tenDoUong) {
		if(!tenDoUong.equals(""))
			return new ChonDoUong(tenDoUong, this.nhapSoLuong());
		return new ChonDoUong(null, 0);
	}
	
	public void xuLy() {
		
	}
	
	
	
	public int nhapSoLuong() {
		System.out.print("Nhập số lượng: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public boolean nhapTiep() {
		System.out.println("Bạn có muốn tiếp tục (Y/N)");
		if(sc.nextLine().equalsIgnoreCase("Y"))
			return true;
		return false;
	}
}
