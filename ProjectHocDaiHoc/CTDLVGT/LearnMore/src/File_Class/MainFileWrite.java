package File_Class;

import java.io.FileWriter;

public class MainFileWrite {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("   Đầu lòng hai ả tố nga \n Thúy Kiều là chị, em là Thúy Vân \n   Mai cốt cách tuyết tinh thần \n Mỗi người một vẻ, mười phân vẹn mười");
			writer.append("\n\t\t(Nguyễn du - Truyện Kiều)");
			writer.close();
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	}
}
