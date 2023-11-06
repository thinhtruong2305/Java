package DoiTuong.Tuan3Lab7;

import java.util.Scanner;

public class MainHinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner nhap =new Scanner(System.in);
     ChuNhat cn=new ChuNhat();
     double v;
     System.out.println("Nhập chiều dài:");
     cn.setDai(nhap.nextDouble());
     System.out.println("Nhập chiều rộng: ");
     cn.setRong(nhap.nextDouble());
     cn.xuat();
     System.out.println("Nhập cạnh: ");
     v=nhap.nextDouble();
     ChuNhat hv=new Vuong(v);
     hv.xuat();
	}

}
