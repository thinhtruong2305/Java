package File_Class;

import java.io.*;

public class MainReadObject {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream oStream = new ObjectInputStream(new FileInputStream("thinh.txt"))) {
			int oCount = 0;
			try {
			    while (true) {
			        System.out.println(oStream.readObject());
			        oCount++;
			    }
			} catch (EOFException e) {
			    System.out.println("Total read " + oCount + " objects");
			}
		}

	}
}
