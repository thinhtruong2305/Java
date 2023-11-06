package vn.edu.giadinh.tuan7;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Double> danhSachSoThuc = new ArrayList<Double>();
      Scanner nhap = new Scanner(System.in);
     while(true) {
    	 System.out.print("Nhập vào một số thực: ");
    	 double soNhapVao = Double.parseDouble(nhap.nextLine());
    	 danhSachSoThuc.add(soNhapVao);
    	 System.out.println("Có Muốn Nhập Nữa Hay Không Y/N");
    	 System.out.println("Y là nhập / N là không");
    	 if(nhap.nextLine().equals("N")) {
    		 break;
    	 }
     }
     double sum=0.0;
     for(Double x: danhSachSoThuc) {
    	 sum +=x;
    	
     }
     System.out.println("tổng của bạn là: "+sum);
	}

}
