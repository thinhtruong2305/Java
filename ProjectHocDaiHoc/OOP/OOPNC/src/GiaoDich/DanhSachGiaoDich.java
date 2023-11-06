package GiaoDich;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class DanhSachGiaoDich {
	private List<GiaoDich> danhSachGiaoDich;
	private static int luaChon = 0;
	Scanner sc = new Scanner(System.in);
	private static boolean nhapTiep = true;
	public DanhSachGiaoDich() {
		setDanhSachGiaoDich(new ArrayList<GiaoDich>());
	}
	
	public void setDanhSachGiaoDich(List<GiaoDich> danhSachGiaoDich) {
		this.danhSachGiaoDich = danhSachGiaoDich;
	}
	public List<GiaoDich> getDanhSachGiaoDich(){
		return this.danhSachGiaoDich;
	}
	
	public void them(GiaoDich giaoDich) {
		danhSachGiaoDich.add(giaoDich);
	}
	public void nhap(){
		GiaoDich giaoDich;
		int maGiaoDich = 0, soLuong = 0;
		double donGia = 0.0, tiGia = 0.0;
		do {
			try {
				nhapTiep = true;
				System.out.print("Nhập mã giao dịch: ");
				maGiaoDich = sc.nextInt();sc.nextLine();
				if(timKiemTheoMaGiaoDich(maGiaoDich)==true) {
					System.out.println("Bạn nhập trùng mã giao dịch rồi xin nhập lại");
				}
				nhapTiep = timKiemTheoMaGiaoDich(maGiaoDich);
			}catch (Exception ex) {
				nhapTiep = true;
				System.out.println("Bạn nhập mã sai xin hãy nhập số");
				sc.nextLine();
			}
		}while(nhapTiep);
		System.out.print("Nhập ngày giao dịch: ");
		String day = sc.nextLine();
		Date ngayGiaoDich = GiaoDich.dinhDangNgay(day);
		do {
			try {
				nhapTiep = true;
				System.out.print("Nhập đơn giá (Đơn giá phải trên 100000 nếu muốn hủy giao dịch bấm 1): ");
				donGia = sc.nextDouble();
				if(donGia <= 100000 && donGia >1) {
					System.out.println("Giao dịch có đơn giá trên 100000 mới được giao dịch");
					nhapTiep = true;
				}else if(donGia == 1){
					System.out.println("Giao dịch đã được xóa, xin bạn cứ nhập thông hết phần thông tin để thoát xin lỗi về bất tiện này");
					nhapTiep = false;
				}else {
					nhapTiep = false;
				}
			}catch(Exception ex) {
				nhapTiep = true;
				System.out.println("Bạn nhập sai xin hãy nhập số");
				sc.nextLine();
			}
		}while(nhapTiep);
		do {
			try {
				nhapTiep = true;
				System.out.print("Nhập số lượng: ");
				soLuong = sc.nextInt();sc.nextLine();
				nhapTiep = false;
			}catch(Exception ex) {
				nhapTiep = true;
				System.out.println("Bạn nhập sai xin hãy nhập số");
				sc.nextLine();
			}
		}while(nhapTiep);
		System.out.print("Nhập giao dịch (1.Giao dịch vàng/2.Giao dịch tiền tệ): ");
		String luaChon = sc.nextLine();
		if(luaChon.equals("1")||luaChon.equalsIgnoreCase("Giao dịch vàng")) {
			System.out.print("Nhập loại vàng: ");
			String loaiVang = sc.nextLine();
			giaoDich = new GiaoDichVang(maGiaoDich,ngayGiaoDich,donGia,soLuong,loaiVang);
		}else {
			System.out.print("Nhập loại tiền tệ (Việt Nam / USD / EURO): ");
			String loaiTienTe = sc.nextLine();
			if(loaiTienTe.equalsIgnoreCase("Việt Nam")) {
				System.out.println("Bạn không cần nhập tỉ giá");
			}else {
				do {
					try {
						nhapTiep = true;
						System.out.print("Nhập tỉ giá: ");
						tiGia = Double.parseDouble(sc.nextLine());
						nhapTiep = false;
					}catch(Exception ex) {
						nhapTiep = true;
						System.out.println("Bạn nhập sai xin hãy nhập số");
					}
				}while(nhapTiep);
			}
			giaoDich = new GiaoDichTienTe(maGiaoDich,ngayGiaoDich,donGia,soLuong,tiGia,loaiTienTe);
		}
		them(giaoDich);
		if(donGia == 1.0 && (luaChon.equals("1") || luaChon.equalsIgnoreCase("Giao dịch vàng"))) {
			xoaTheoMa(maGiaoDich);
			GiaoDichVang.setSoLanGiaoDichVang(GiaoDichVang.getSoLanGiaoDichVang() - 1);
			GiaoDich.setSoLanGiaoDich(GiaoDich.getSoLanGiaoDich() - 1);
		}else if(donGia == 1.0 && (luaChon.equals("2") || luaChon.equalsIgnoreCase("Giao dịch tiền tệ"))) {
			xoaTheoMa(maGiaoDich);
			GiaoDichTienTe.setSoLanGiaoDichTienTe(GiaoDichTienTe.getSoLanGiaoDichTienTe() - 1);
			GiaoDich.setSoLanGiaoDich(GiaoDich.getSoLanGiaoDich() - 1);
		}
	}
	public void trungBinhThanhTien() {
		double trungBinhVang = 0;
		double tongVang = 0;
		double trungBinhTienTe = 0;
		double tongTienTe = 0;
			for (GiaoDich giaoDich : danhSachGiaoDich) {
				if(giaoDich instanceof GiaoDichVang) {
					GiaoDichVang giaoDichVang = (GiaoDichVang)giaoDich;
					tongVang=(trungBinhVang += giaoDichVang.thanhTien())/GiaoDichVang.getSoLanGiaoDichVang();
				}else if(giaoDich instanceof GiaoDichTienTe) {
					GiaoDichTienTe giaoDichTienTe = (GiaoDichTienTe)giaoDich;
					tongTienTe = (trungBinhTienTe += giaoDichTienTe.thanhTien())/GiaoDichTienTe.getSoLanGiaoDichTienTe();
				}
			}
			System.out.println("Trung bình thành tiền vàng: "+GiaoDich.dinhDang(tongVang));
			System.out.println("Trung bình thành tiền tệ: "+GiaoDich.dinhDang(tongTienTe));
	}
	public void tinhTongSoLuongChoTungLoai() {
		int soLuongGiaoDichVang = 0;
		int soLuongGiaoDichTienTe = 0;
		for(GiaoDich giaoDich:danhSachGiaoDich) {
			if(giaoDich instanceof GiaoDichVang) {
				GiaoDichVang giaoDichVang = (GiaoDichVang) giaoDich;
				soLuongGiaoDichVang += giaoDichVang.getSoLuong();
			}else if(giaoDich instanceof GiaoDichTienTe) {
				GiaoDichTienTe giaoDichTienTe = (GiaoDichTienTe) giaoDich;
				soLuongGiaoDichTienTe += giaoDichTienTe.getSoLuong();
			}
		}
		System.out.println("Tổng số lượng giao dịch vàng: "+soLuongGiaoDichVang);
		System.out.println("Tổng số lượng giao dịch tiền tệ: "+soLuongGiaoDichTienTe);
	}
	public void xuat() {
		int soLan = 1;
		if(danhSachGiaoDich.isEmpty() == false) {
			for(GiaoDich giaoDich:danhSachGiaoDich) {
				System.out.println("Giao dịch thứ "+soLan);
				System.out.println(giaoDich.toString());
				soLan++;
				System.out.println("");
			}
		}else {
			System.out.println("Danh sách rỗng");
		}
	}
	public void xuatCacGiaoDichTheoSoTien(double soTien) {
		int soLanVang = 1;
		int soLanTienTe = 1;
		for(GiaoDich giaoDich: danhSachGiaoDich) {
			if(giaoDich instanceof GiaoDichVang) {
				GiaoDichVang giaoDichVang = (GiaoDichVang) giaoDich;
				if(giaoDichVang.thanhTien()== soTien) {
					System.out.println("Giao dịch vàng thứ "+soLanVang);
					System.out.println(giaoDichVang.toString());
					soLanVang++;
				}else {
					System.out.println("Không có giao dịch nào với số tiền "+GiaoDich.dinhDang(soTien));
				}
			}else if(giaoDich instanceof GiaoDichTienTe) {
				GiaoDichTienTe giaoDichTienTe = (GiaoDichTienTe) giaoDich;
				if(giaoDichTienTe.thanhTien()== soTien) {
					System.out.println("Giao dịch tiền tệ thứ "+soLanTienTe);
					System.out.println(giaoDichTienTe.toString());
					soLanTienTe++;
				}else {
					System.out.println("Không có giao dịch nào với số tiền "+GiaoDich.dinhDang(soTien));
				}
			}
		}
	}
	public void xuatSoLanGiaoDichTungLoai() {
			System.out.println("Số lần giao dịch vàng: "+GiaoDichVang.getSoLanGiaoDichVang());
			System.out.println("Số lần giao dịch tiền tệ: "+GiaoDichTienTe.getSoLanGiaoDichTienTe());
	}
	public void xuatGiaoDichLonHon1Ty() {
		int soLanVang = 1;
		int soLanTienTe = 1;
		for(GiaoDich giaoDich: danhSachGiaoDich) {
			if(giaoDich instanceof GiaoDichVang) {
				GiaoDichVang giaoDichVang = (GiaoDichVang) giaoDich;
				if(giaoDichVang.thanhTien() > 1000000000.0) {
					System.out.println("Giao dịch vàng thứ "+soLanVang);
					System.out.println(giaoDichVang.toString());
					soLanVang++;
				}
			}else if(giaoDich instanceof GiaoDichTienTe) {
				GiaoDichTienTe giaoDichTienTe = (GiaoDichTienTe) giaoDich;
				if(giaoDichTienTe.thanhTien() > 1000000000.0) {
					System.out.println("Giao dịch tiền tệ thứ "+soLanTienTe);
					System.out.println(giaoDichTienTe.toString());
					soLanTienTe++;
				}
			}
		}
	}
	public void xuatTongSoLanGiaoDich() {
		System.out.println("Tổng số lần giao dịch: "+GiaoDich.getSoLanGiaoDich());
	}
	public void timTheoMaGiaoDich(int maGiaoDich) {
		for(GiaoDich giaoDich: danhSachGiaoDich) {
			if(giaoDich.getMaGiaoDich() == maGiaoDich) {
				System.out.println(giaoDich.toString());
			}else {
				System.out.println("Không có giao dịch nào có mã giao dịch "+maGiaoDich);
			}
		}
	}
	public void getTimTheoMaGiaoDich(int maGiaoDich) {
		this.timTheoMaGiaoDich(maGiaoDich);
	}
	public void timTheoNgayGiaoDich(Date ngayGiaoDich) {
		int soLan = 1;
		for(GiaoDich giaoDich:danhSachGiaoDich) {
			if(giaoDich.getNgayGiaoDich()== ngayGiaoDich) {
				System.out.println("Giao dịch thứ "+soLan);
				System.out.println(giaoDich.toString());
				soLan++;
			}else {
				System.out.println("Không có giao dịch nào trong ngày "+ngayGiaoDich);
			}
		}
	}
	public boolean timKiemTheoMaGiaoDich(int maGiaoDich) {
		boolean timThay = false;
		for(GiaoDich giaoDich:danhSachGiaoDich) {
			if(giaoDich.getMaGiaoDich() == maGiaoDich)
				timThay = true;
		}
		return timThay;
	}
	public void xoaTheoMa(int maGiaoDich) {
		for(int i = 0; i < this.danhSachGiaoDich.size();i++) {
			if(maGiaoDich == (danhSachGiaoDich.get(i).getMaGiaoDich())) {
				danhSachGiaoDich.remove(i);
				System.out.println("đã xóa giao dịch có mã: "+maGiaoDich);
			}
		}
	}
	public void xoaGiaoDich(int maGiaoDich) {
		if(this.danhSachGiaoDich.isEmpty() == false) {
			for (GiaoDich giaoDich : danhSachGiaoDich) {
				if(giaoDich instanceof GiaoDichVang) {
					GiaoDichVang giaoDichVang = (GiaoDichVang) giaoDich;
					if(giaoDichVang.getMaGiaoDich() == maGiaoDich) {
						xoaTheoMa(maGiaoDich);
						GiaoDichVang.setSoLanGiaoDichVang(GiaoDichVang.getSoLanGiaoDichVang() - 1);
						GiaoDich.setSoLanGiaoDich(GiaoDich.getSoLanGiaoDich() - 1);break;
					}else {
						System.out.println("Không tìm thấy");
					}
				}else if(giaoDich instanceof GiaoDichTienTe) {
					GiaoDichTienTe giaoDichTienTe = (GiaoDichTienTe) giaoDich;
					if(giaoDichTienTe.getMaGiaoDich() == maGiaoDich) {
						xoaTheoMa(maGiaoDich);
						GiaoDichTienTe.setSoLanGiaoDichTienTe(GiaoDichTienTe.getSoLanGiaoDichTienTe()-1);
						GiaoDich.setSoLanGiaoDich(GiaoDich.getSoLanGiaoDich() - 1);break;
					}else {
						System.out.println("Không tìm thấy");
					}
				}
			}
		}else {
			System.out.println("Danh sách bạn rỗng");
		}
	}
	public void chinhSua(int maGiaoDich){
		this.xoaGiaoDich(maGiaoDich);
		this.nhap();
	}
	public void menu() {
		System.out.println("		Chào mừng bạn đến với danh sách giao dịch");
		System.out.println("Các tính năng");
		System.out.println("{ 1. Nhập                                }");
		System.out.println("{ 2. Tính tổng số lượng từng loại        }");
		System.out.println("{ 3. Tính trung bình thành tiền từng loại}");
		System.out.println("{ 4. Xuất tất cả giao dịch               }");
		System.out.println("{ 5. Xuất các giao dịch theo số tiền     }");
		System.out.println("{ 6. Xuất các giao dịch lớn hơn 1 tỷ     }");
		System.out.println("{ 7. Xuất số lần giao dịch từng loại     }");
		System.out.println("{ 8. Xuất tổng số lần giao dịch          }");
		System.out.println("{ 9. Tìm theo mã giao dịch               }");
		System.out.println("{ 10.Tìm theo ngày giao dịch             }");
		System.out.println("{ 11.Xóa theo mã giao dịch               }");
		System.out.println("{ 12.Chỉnh sửa                           }");
		System.out.println("{ 13.Thoát khỏi chương trình             }");
	}
	public void xuLyMenu(){
		do {
			nhapTiep = true;
			menu();
			do {
				try {
					nhapTiep = true;
					System.out.print("Nhập lựa chọn của bạn: ");
					luaChon = sc.nextInt();
					nhapTiep = false;
				}catch(Exception ex) {
					nhapTiep = true;
					System.out.println("Bạn nhập sai xin bạn nhập số");
					sc.nextLine();
				}
			}while(nhapTiep);
			switch(luaChon) {
			case 1: this.nhap();nhapTiep = true;break;
			case 2: this.tinhTongSoLuongChoTungLoai();nhapTiep = true;break;
			case 3: this.trungBinhThanhTien();nhapTiep = true;break;
			case 4: this.xuat();nhapTiep = true;break;
			case 5: 
				double soTien = 0.0;
				do {
					try {
						nhapTiep = true;
						System.out.print("Bạn muốn xuất giao dịch với số tiền: ");
						soTien = sc.nextDouble();
						nhapTiep = false;
					}catch(Exception ex) {
						nhapTiep = true;
						System.out.println("Bạn nhập sai xin bạn nhập số");
						sc.nextLine();
					}
				}while(nhapTiep);
				this.xuatCacGiaoDichTheoSoTien(soTien);nhapTiep = true;break;
			case 6: this.xuatGiaoDichLonHon1Ty();nhapTiep = true;break;
			case 7: this.xuatSoLanGiaoDichTungLoai();nhapTiep = true;break;
			case 8: this.xuatTongSoLanGiaoDich();nhapTiep = true;break;
			case 9: 
				int maGiaoDich = 0;
				do {
					try {
						nhapTiep = true;
						System.out.print("Nhập mã giao dịch bạn muốn tìm: ");
						maGiaoDich = sc.nextInt();
						nhapTiep = false;
					}catch(Exception ex) {
						nhapTiep = true;
						System.out.println("Bạn nhập sai xin hãy nhập số");
						sc.nextLine();
					}
				}while(nhapTiep);
				this.timTheoMaGiaoDich(maGiaoDich);nhapTiep = true;break;
			case 10:
				String day = null;
						sc.nextLine();
						System.out.print("Nhập ngày giao dịch bạn muốn tìm: ");
						day = sc.nextLine();
						Date ngayGiaoDich = GiaoDich.dinhDangNgay(day);
				this.timTheoNgayGiaoDich(ngayGiaoDich);nhapTiep = true;break;
			case 11:
				int maGiaoDich1 = 0;
				do {
					try {
						nhapTiep = true;
						System.out.print("Nhập mã giao dịch bạn muốn xóa: ");
						maGiaoDich1 = sc.nextInt();
						nhapTiep = false;
					}catch(Exception ex) {
						nhapTiep = true;
						System.out.println("Bạn nhập sai xin hãy nhập số");
						sc.nextLine();
					}
				}while(nhapTiep);
				this.xoaGiaoDich(maGiaoDich1);nhapTiep = true; break;
			case 12:
				int maGiaoDich2 = 0;
				do {
					try {
						nhapTiep = true;
						System.out.print("Nhập mã giao dịch bạn muốn chỉnh sửa: ");
						maGiaoDich2 = sc.nextInt();
						nhapTiep = false;
					}catch(Exception ex) {
						nhapTiep = true;
						System.out.println("Bạn nhập sai xin hãy nhập số");
						sc.nextLine();
					}
				}while(nhapTiep);
				this.chinhSua(maGiaoDich2);nhapTiep = true;break;
			default:
				System.out.println("Tạm biệt bạn");
				nhapTiep = false;break;
			}
		}while(nhapTiep);
	}
}