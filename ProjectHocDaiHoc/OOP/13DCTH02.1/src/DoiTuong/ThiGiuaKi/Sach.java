package DoiTuong.ThiGiuaKi;


public abstract class Sach {
     //thuộc tính 
	 private int maSach,soLuong;
	 private double donGia;
	 private String ngayNhap;
	 private String nhaXuatBan;
	 //phương thức
     protected Sach() {
		 
	 }
     protected Sach(int maSach,int soLuong,double donGia,String nhaXuatBan,String ngayNhap) {
    	 this.maSach=maSach;
    	 this.soLuong=soLuong;
    	 this.donGia=donGia;
    	 this.nhaXuatBan=nhaXuatBan;
    	 this.ngayNhap=ngayNhap;
     }
     //thành tiền
	 protected abstract double thanhTien();
	 //xuất
	 public void xuat() {
		 System.out.println("Mã sách: "+getMaSach());
		 System.out.println("Số lượng: "+getSoLuong());
		 System.out.println("Đơn giá: "+getDonGia());
		 System.out.println("Nhà xuất bản: "+getNhaXuatBan());
		 System.out.println("Ngày nhập: "+getNgayNhap());
	 }
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public double getSoLuong() {
		return(double) soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
}
