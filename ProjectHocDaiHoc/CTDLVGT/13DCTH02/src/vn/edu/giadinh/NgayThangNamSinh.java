package vn.edu.giadinh;

import java.util.Scanner;

public class NgayThangNamSinh {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Năm: ");

			  int year = scanner.nextInt();
			 
			  System.out.print("Tháng: ");

			  int month = scanner.nextInt();

			  int days = 0;

			  switch (month) {

			  case 2:

			  if(year % 4 == 0 && year % 100 != 0){

			  days = 29;

			  }

			  else{

			  days = 28;

			  }

			  break;

			  case 4:

			  case 6:

			  case 9:

			  case 11:

			  days = 30;

			  break;

			  default:

			  days = 31;

			  break;

			  }
			  System.out.printf("Số ngày của tháng %d/%d là %d", month, year, days);
		}
	}

}
