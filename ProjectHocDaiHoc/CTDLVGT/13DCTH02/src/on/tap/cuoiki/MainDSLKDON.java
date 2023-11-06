package on.tap.cuoiki;
import java.util.Scanner;
public class MainDSLKDON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner nhap=new Scanner(System.in);
      DSLKĐon DSBL=new DSLKĐon();
      BaLo bl=new BaLo();
      boolean n = false;
      do {
    	  bl.nhap();
    	 DSBL.addNode(bl);
    	 System.out.print("Bạn muốn nhập thêm nữa ko nếu (có thì nhấn Y/không thì nhấn N): ");
    	 n=nhap.nextLine().equals("y");
      }while(n);
      DSBL.inDSLKĐon();
	}

}
