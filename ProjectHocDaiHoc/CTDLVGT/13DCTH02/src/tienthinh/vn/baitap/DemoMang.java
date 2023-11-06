package tienthinh.vn.baitap;

public class DemoMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tong=0;
// khai báo có khởi tạo
		int[] a=new int[]{1,2,3,4};
		int b[]= {1,2,3,4,5};
// khai báo không có khởi tạo
		int[] c;
		int d[]=new int[4];
		for(int i=0;i<a.length;i++) {
			System.out.print("mang a"+a[i]);
		}
		for(int x:b) {
			System.out.println("mang b"+x);
		}
	    for(int y:a) {
	    	if(y%2==0) {
	    		tong+=y;//tong = tong + a[y]
	    	}
	    }
	    System.out.print("tong"+tong);
	}

}
