package tienthinh.vn.baitap;

import java.util.Scanner;

public class BaiTapTuanHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
    int luachon;
    do { thucdon();
    luachon=s .nextInt();
    	switch(luachon) {
    	case 0: System.out.println("kết thúc chương trình");
    	break;
    	case 1: GiaiPTBacNhat();
    	break;
    	}
    }
    while(luachon!=0);
	}
   static void thucdon() {
	   System.out.println("+***Xin Chào Mừng Các Bạn***+");
	   System.out.println("| 1.    Giải PT Bậc Nhất    |");
	   System.out.println("| 2.    Giải PT Bậc Hai     |");
	   System.out.println("| 3.    Tính Tiền Điện      |");
	   System.out.println("+***************************+");
	   System.out.println("Xin hãy chọn cách tính: ");
	  
   }
   static void GiaiPTBacNhat() {
	   Scanner c = new Scanner(System.in);
	   int a,b;
	   Double x = null;
	   System.out.println("Nhập số đầu: ");
	   a=c.nextInt();
	   System.out.println("Nhập số thứ hai: ");
	   b=c.nextInt();
	   if(a ==0) {
		   if(b ==0) {
			   System.out.println("Phương Trình Vô Số Nghiệm");
		   }else {
			   System.out.println("Phương Trình Vô Nghiệm");
	     }
	   }else {
		   x=(double)((-a)/b);
	   }
	  System.out.println("Kết quả là: "+x);  
   }
  static void GiaiPTBacHai() {
	  int a,b,c;
	  double delta,X1,X2,X;
	  Scanner d = new Scanner (System.in);
	  System.out.println("Nhập số a: ");
	   a = d.nextInt();
	  System.out.println("Nhập số b: ");
	   b = d.nextInt();
	  System.out.println("Nhập số c: ");
	   c = d.nextInt();
	   delta = Math.pow(b, 2) - 4*a*c;
  }
}