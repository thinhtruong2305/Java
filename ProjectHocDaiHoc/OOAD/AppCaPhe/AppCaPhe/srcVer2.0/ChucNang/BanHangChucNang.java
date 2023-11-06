package ChucNang;

import java.util.*;
import Object.*;

public class BanHangChucNang {
	Scanner sc = new Scanner(System.in);
	private DatDoUongChucNang datDoUongChucNang;
	private ChonDoUongChucNang chonDoUongChucNang;
	
	public BanHangChucNang() {
		this.setChonDoUongChucNang(new ChonDoUongChucNang());
		this.setDatDoUongChucNang(new DatDoUongChucNang());
	}

	public DatDoUongChucNang getDatDoUongChucNang() {
		return datDoUongChucNang;
	}
	public void setDatDoUongChucNang(DatDoUongChucNang datDoUongChucNang) {
		this.datDoUongChucNang = datDoUongChucNang;
	}
	public ChonDoUongChucNang getChonDoUongChucNang() {
		return chonDoUongChucNang;
	}
	public void setChonDoUongChucNang(ChonDoUongChucNang chonDoUongChucNang) {
		this.chonDoUongChucNang = chonDoUongChucNang;
	}
	
	//Chọn đồ uống và tự động tính số tiền
	public void chonDoUong() {
		boolean nhapTiep = false;
		do {
			ChonDoUong chonDoUong = new ChonDoUong();
			nhapTiep = false;
			this.getChonDoUongChucNang().chonDoUong(chonDoUong);
			this.getChonDoUongChucNang().tongSoTienChonDoUong(chonDoUong);
			System.out.println("Tiếp tục chọn đồ uống không? (Y/N)");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("Y"))
				nhapTiep = true;
		}while(nhapTiep);
		ChonDoUong.setCount(0);
		this.hienThiHoaDonChonDoUong();
	}
	
	//đặt đồ uống và có chọn đồ uống
	public void datDoUong() {
		this.getDatDoUongChucNang().datDoUong();
		System.out.println("\nChọn đồ uống\n");
		this.chonDoUong();
		this.hienThiHoaDonDatDoUong();
	}
	
	//Hiển thị danh sách đồ uống đã chọn và xóa
	public void hienThiHoaDonChonDoUong() {
		this.getChonDoUongChucNang().xemDanhSachChonDoUong();
		this.getChonDoUongChucNang().xoaChonDoUong();
	}
	
	//Hiển thị danh sách đã đặt vào xóa
	public void hienThiHoaDonDatDoUong() {
		this.getDatDoUongChucNang().hienThiDatDoUong();
		this.getChonDoUongChucNang().xemDanhSachChonDoUong();
		this.getChonDoUongChucNang().xoaChonDoUong();
		this.getDatDoUongChucNang().xoaDatDoUong();
	}
}
