package vn.edu.giadinh.tuan7;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> nganXepSoNguyen = new Stack<Integer>();
        //đã có ngăn xếp
        //thao tác tay
        //push, pop ,peek
        nganXepSoNguyen.push(123);
        nganXepSoNguyen.push(234);
        nganXepSoNguyen.push(345);
        System.out.println(nganXepSoNguyen);
        System.out.println(nganXepSoNguyen.pop());
        System.out.println(nganXepSoNguyen);
        System.out.println(nganXepSoNguyen.peek());
        System.out.println(nganXepSoNguyen);
	}

}
