package DoiTuong.Tuan3Lab7;

public class Vuong extends ChuNhat {
   public Vuong(double canh) {
	   super(canh, canh);
   }
   public Vuong() {
	   
   }
   public void xuat() {
	   System.out.println("Cạnh:"+this.getDai());
	   System.out.println("Chu vi: "+this.getChuVi()+"Diện tích: "+this.getDienTich());
   }
}
