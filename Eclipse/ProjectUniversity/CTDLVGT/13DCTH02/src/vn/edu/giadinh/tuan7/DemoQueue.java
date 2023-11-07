package vn.edu.giadinh.tuan7;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<Integer> hangDoiSoNguyen = new LinkedList<Integer>();
      
      hangDoiSoNguyen.add(5);
      hangDoiSoNguyen.add(100);
      hangDoiSoNguyen.add(100000);
      hangDoiSoNguyen.add(186566);
      hangDoiSoNguyen.add(148519);
      hangDoiSoNguyen.add(259465);
      hangDoiSoNguyen.add(146584);
      
      System.out.println(hangDoiSoNguyen.poll());
      
      System.out.println(hangDoiSoNguyen);
      
      System.out.println(hangDoiSoNguyen.peek());
      
      System.out.println(hangDoiSoNguyen);
	}

}
