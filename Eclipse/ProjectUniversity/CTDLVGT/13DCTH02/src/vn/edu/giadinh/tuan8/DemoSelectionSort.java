package vn.edu.giadinh.tuan8;

public class DemoSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {64,25,12,22,11};
      //chọn thằng lớn nhất/nhỏ nhất
      
      //xuất phát từ đầu mảng//cuối mảng
      
      //duyệt = lặp
      
      //đi từ đầu mảng
      for(int i=0;i < a.length - 1;i++) {
    	  int minIndex=i;
    	  for(int j=i+1;j<a.length;j++) {
    		  if(a[j] < a[minIndex]) {
    			  minIndex=j;
    		  }
    	  }
    	  int tam=a[i];
    	  a[i]=a[minIndex];
    	  a[minIndex]=tam;
      }
      System.out.println("Mảng Đã Được Sắp Xếp: ");
      for(int x:a) {
    	  System.out.print(x+"   ");
      }
	}

}
