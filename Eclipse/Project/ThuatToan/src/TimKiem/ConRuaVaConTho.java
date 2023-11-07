package TimKiem;

import java.util.ArrayList;
import java.util.Random;

public class ConRuaVaConTho {
	static ArrayList<Integer> arrNumber = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tìm kiếm: 10s 11s 12s trung bình 11s quyết định: 10s
		//tìm kiếm con rùa và thỏ: 11s 14s 9s trung bình: 11.3s quyết định: 9s
		Random random = new Random();
		addArrName();
		System.out.println(thuatToanTimKiemConRuaVaConTho(random.nextInt(100000000)));
	}
	
	public static void addArrName() {
		for(int i = 0; i <= 100000000; i++) {
			arrNumber.add(i);
		}
	}
	
	public static int thuatToanTimKiemConRuaVaConTho(int x) {
		int tho = 0;
		for(int rua = 0; rua < arrNumber.size(); rua++) {
			//Xét giá trị của thỏ
			//Nếu thỏ bằng 0 thì thỏ = thỏ + rùa
			if(tho == 0) {tho += rua;}
			//Ngược lại thì thỏ = thỏ + 2
			else {tho += 2;}
			
			//Tra tìm giá trị phù hợp
			//vì thỏ đi trước rùa 2 đơn vị nên phải ràng buộc đích cho thỏ
			if(tho < arrNumber.size()) {
				if(arrNumber.get(rua) == x) {return arrNumber.get(rua);}
				if(arrNumber.get(tho) == x) {return arrNumber.get(tho);}
			}else {tho = 0;}
		}
		return 0;
	}
	
	public static int thuatToanTimKiem(int x) {
		for(int y : arrNumber) {
			if(y == x)
				return arrNumber.get(y);
		}
		return 0;
	}
}
