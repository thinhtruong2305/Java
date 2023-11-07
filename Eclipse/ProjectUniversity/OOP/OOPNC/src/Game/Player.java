package Game;

import java.util.Scanner;

public class Player {
	private int so;
	Scanner sc;
	public Player() {
		
	}
	public Player(int so) {
		this.so=so;
	}
	public void setSo(int so) {
		this.so=so;
	}
	public int getSo() {
		return this.so;
	}
	
	protected void doanSo(int nguoiChoiSo) {
		sc=new Scanner(System.in);
			System.out.print("Mời Người Chơi "+nguoiChoiSo+" Đoán Số: ");
			int soDuDoan=sc.nextInt();
			setSo(soDuDoan);
	}
}
