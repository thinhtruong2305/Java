package on.tap.cuoiki;

public class TimKiemNhiPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[]= {1,2,3,4,5,6,7,8};
System.out.println(timKiemNhiPhan(5,b));
	}
public static boolean timKiemNhiPhan(int x,int[] a) {
	int l=0;
	int r=a.length-1;
	int mid=0;
	boolean timThay=false;
	while(l<=r) {
		mid=(r+l)/2;
	if(a[mid]==x) {
		timThay=true;
	}else if(a[mid]<x) {
		r=mid-1;
	}else{
		l=mid+1;
	}
	}
	return timThay;
}

}
