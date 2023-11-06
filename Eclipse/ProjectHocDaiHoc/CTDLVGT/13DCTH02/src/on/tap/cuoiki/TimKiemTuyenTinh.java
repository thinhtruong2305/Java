package on.tap.cuoiki;

public class TimKiemTuyenTinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,2,3,4,5,6,7,8};
System.out.println(timX(9,a));
	}
public static boolean timX(int x,int a[]) {
	int n=a.length;
	boolean timThay=false;
	for(int i=0;i<n;i++) {
		if(x==a[i]) {
			System.out.println("đã tìm thấy");
			timThay=true;
		}

	}
	return timThay;	
}
}
