package vn.edu.giadinh;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a;
    try (Scanner cs = new Scanner(System.in)) {
		System.out.print("nhập một số : ");
		a = cs.nextInt();
	}
    if(a>0) {
    System.out.print("kết quả: " +Math.sqrt(a));
    }
    else {
      System.out.print("Nhập số lớn hơn 0");
   }
  }
}