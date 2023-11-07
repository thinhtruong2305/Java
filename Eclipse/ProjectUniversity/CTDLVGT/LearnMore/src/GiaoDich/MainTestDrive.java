package GiaoDich;

import java.io.*;


public class MainTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaoDich gd1; 
		FileOutputStream out = null;
		FileInputStream in;
		ObjectInputStream objIn;
		ObjectOutputStream objOut = null;
		try{
			gd1 = new GiaoDichVang(123,"12/05/2001",1000000.0,12,"9999");
			out = new FileOutputStream("thinh.txt");
			objOut = new ObjectOutputStream(out);
			objOut.writeObject(gd1);
			in = new FileInputStream("thinh.txt");
			objIn = new ObjectInputStream(in);
			int data = objIn.read();
			while(data != -1) {
				System.out.println((char)data);
				objIn.read();
			}
			objIn.close();in.close();
		}catch (Exception ex) {
			System.out.println(ex.getStackTrace());
		}finally {
			if(objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
