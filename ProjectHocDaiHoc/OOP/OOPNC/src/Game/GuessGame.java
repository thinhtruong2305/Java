package Game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	public GuessGame() {
		p1= new Player();
		p2= new Player();
		p3= new Player();
	}
	protected int random1() {
		int ran = random.nextInt(10)+1;
		return ran;
	}
	protected int random() {
		int max=10;
		int min=0;
		int range= (max-min)+1;
		int ran=(int)(Math.random()*range)+min;
		return ran;
	}
	protected void startGame() {
		System.out.println("		Chào Mừng Bạn Đến Với Trò Chơi");
		System.out.println("");
		random1();
		p1.doanSo(1);
		p2.doanSo(2);
		p3.doanSo(3);
		System.out.println(soSanhKetQua());
		xuat();
	}
	protected String soSanhKetQua() {
		String ketQua=null;
		if(p1.getSo()== random()) {
			ketQua = "Player 1 đã đoán trúng số";
		}else if(p2.getSo()== random()) {
			ketQua = "Player 2 đã đoán trúng số";
		}else if(p3.getSo()== random()) {
			ketQua = "Player 3 đã đoán trúng số";
		}else if(p1.getSo()==random()&& p2.getSo()==random()) {
			ketQua = "Player 1 và Player 2 đã đoán trúng số";
		}else if(p1.getSo()==random()&& p3.getSo()==random()) {
			ketQua = "Player 1 và Player 3 đã đoán trúng số";
		}else if(p2.getSo()==random()&& p3.getSo()==random()) {
			ketQua = "Player 2 và Player 3 đã đoán trúng số";
		}else if((p1.getSo()& p2.getSo()& p3.getSo())==random()) {
			ketQua = "Cả 3 Player đều đoán trúng";
		}else {
			ketQua = "Cả 3 Player đều đoán sai";
		}
		return ketQua;
	}
	protected void xuat() {
		System.out.println("payer 1 đoán số: "+p1.getSo());
		System.out.println("payer 2 đoán số: "+p2.getSo());
		System.out.println("payer 3 đoán số: "+p3.getSo());
		System.out.println("Số ngẫu nhiên là "+random());
	}
}
