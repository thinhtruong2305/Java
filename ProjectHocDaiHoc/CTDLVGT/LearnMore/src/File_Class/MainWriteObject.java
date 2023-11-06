package File_Class;

import java.io.*;

public class MainWriteObject {
	public static void main(String[] args) throws IOException {
        try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("thinh.txt"))) {
			oStream.writeObject(new Animal("Cat", 1));
			oStream.writeObject(new Animal("Tiger", 90));
			oStream.writeObject(new Animal("Elephant", 1500));
			oStream.writeObject(new Animal("Cow", 700));
		}

        System.out.println("Total 4 objects written to Objects.txt");
    }

}

class Animal implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "";
    int weight = 0;

    public Animal(String n, int w) {
        name = n;
        weight = w;
    }

    public String toString() {
        return (name + "  " + weight + " kg");
    }
}
