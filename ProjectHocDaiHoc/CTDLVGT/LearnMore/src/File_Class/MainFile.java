package File_Class;

import java.io.File;

public class MainFile {
	public static void main(String[] args) {
		File file = new File("Ten_anime.txt");
		//File file1 = new File("C:/Users/admin/Documents/note/Ten_anime1.txt");
		
		if(file.exists()) {
			System.out.println("This file exists :0");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}else {
			System.out.println("This file doesn't exists :(");
		}
	}
}
