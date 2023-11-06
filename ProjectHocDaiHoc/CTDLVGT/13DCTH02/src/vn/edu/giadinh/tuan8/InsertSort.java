package vn.edu.giadinh.tuan8;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {2,34,5,35,75,56,45};
   int n=a.length;
   for(int i=1;i<n;i++) {
	  int t=a[i];
	  int j=i-1;
	  while(t<a[j]&&j>=0) {
		  a[j+1]=a[j];
		  j--;
	  }
	  a[j+1]=t;
	  }
   for(int x:a) {
	   System.out.print(x+"  ");
   }
	

  }
}
