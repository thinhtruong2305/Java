package Object;

import java.text.SimpleDateFormat;
import java.util.*;

public class HoaDon {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idHoaDon;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private Mon mon;
	private String chiTiet;
	private double tongTien;
	private Date ngayLapHoaDon;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public HoaDon() {
		this.idHoaDon = ++count;
		this.setNgayLapHoaDon();
	}
	public HoaDon(KhachHang khachHang, NhanVien nhanVien, Mon mon, String chiTiet, double tongTien) {
		this.idHoaDon = ++count;
		this.setNgayLapHoaDon();
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.mon = mon;
		this.chiTiet = chiTiet;
		this.tongTien = tongTien;
	}

	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		HoaDon.count = count;
	}
	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon() {
		this.ngayLapHoaDon = new Date(System.currentTimeMillis());
		df.format(ngayLapHoaDon);
	}
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public Mon getMon() {
		return mon;
	}
	public void setMon(Mon mon) {
		this.mon = mon;
	}
	public String getChiTiet() {
		return chiTiet;
	}
	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	
	@Override
	public String toString() {
		return "HoaDon [idHoaDon=" + idHoaDon + ", chiTiet=" + chiTiet + ", tongTien=" + tongTien + 
				", ngayLapHoaDon=" + ngayLapHoaDon + idHoaDon + "\nkhachHang=" + khachHang.toString() + "\nnhanVien=" + nhanVien.toString() + 
				"\nmon=" + mon.toString() + "]";
	}
	
	//hiển thị
	public void display() {
		System.out.println(this.toString());
	}
	
	//nhập thông tin
	public void input(KhachHang khachHang, NhanVien nhanVien, Mon mon) {
		this.setKhachHang(khachHang);
		this.setNhanVien(nhanVien);
		this.setMon(mon);
		this.setTongTien(mon.getGiaTien());
		System.out.print("Nhập chi tiết: ");
		this.setChiTiet(sc.nextLine());
	}
}
