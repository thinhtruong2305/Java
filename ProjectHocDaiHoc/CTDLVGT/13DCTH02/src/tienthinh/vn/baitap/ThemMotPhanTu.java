package tienthinh.vn.baitap;

public class ThemMotPhanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a= {3,5,6,7};
   int b=8;
   int n=a.length;
   int[] newa= new int[n+1];
   for(int i=0;i<n;i++) {
	   newa[i]=a[i];
   }
   System.out.println("Mảng cũ");
   for(int x:a) {
	   System.out.print(x);
   }
   newa[n]=b;
   System.out.println("Mảng mới");
   for(int x:newa) {
	   System.out.print(x);
   }
	}

}
