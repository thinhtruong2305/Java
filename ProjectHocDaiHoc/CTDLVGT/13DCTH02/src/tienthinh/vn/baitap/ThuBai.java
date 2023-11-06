package tienthinh.vn.baitap;

import java.util.Scanner;

public class ThuBai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner c = new Scanner(System.in);
		   int a,b;
		   Double x = null;
		   System.out.println("Nhập số đầu: ");
		   a=c.nextInt();
		   System.out.println("Nhập số thứ hai: ");
		   b=c.nextInt();
		   if(a == 0) {
			   if(b == 0) {
				   System.out.println("Phương Trình Vô Số Nghiệm");
			   }else {
				   System.out.println("Phương Trình Vô Nghiệm");
		     }
		   }else {
			   x=(double) ((-a)/b);
		   }
		  System.out.println("Kết quả là: "+x);  
	}

}
