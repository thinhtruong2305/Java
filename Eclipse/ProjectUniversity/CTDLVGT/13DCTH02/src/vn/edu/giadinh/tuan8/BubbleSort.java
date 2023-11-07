package vn.edu.giadinh.tuan8;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,1,6,8,5};
int b[]= {23,4,2,14,6,54,5};
int n=a.length;
int h=b.length;
  //Yêu cầu sv:vẽ
  //2.Viết code/cài đặt/hiện thực bằng java
    for(int i=0;i<h-1;i++) {
    	for(int j=0;j<h-1-i;j++) {
    		if(b[j]<b[j+1]) {
    			int tam =b[j];
    			b[j]=b[j+1];
    			b[j+1]=tam;
    		}
    	}
    }
	for(int i=0;i<n-1;i++) {
		for(int j=n-1;j>i;j--) {
			if(a[j]<a[j-1]) {
				int x=a[j-1];
				a[j-1]=a[j];
				a[j]=x;
			}
		}
	}
	for(int c:a) {
		System.out.println(c+"  ");
	}
    for(int p:b) {
	    System.out.println(p+"  ");
    }
	}
	}


