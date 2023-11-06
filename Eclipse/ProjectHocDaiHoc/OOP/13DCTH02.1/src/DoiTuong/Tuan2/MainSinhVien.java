package DoiTuong.Tuan2;

public class MainSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SinhVien sv1 = new SinhVien();
      //sv1.hoTen="Tý"
      //sv1.diem=15//giống lập trình hướng thủ tục//bất hợp lý
      sv1.setHoTen("Tài ngu");
      sv1.setDiem(10);
      System.out.println("Tên : "+sv1.getHoTen()+" "+"Điểm : "+sv1.getDiem());
	}

}
