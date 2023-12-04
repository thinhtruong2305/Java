package Code;

import java.io.*;

public class TestTransient implements Serializable {
    public int i =123, j = 124;

    //Biến transient
    public transient int k = 20;

    //Immute to transient
    public transient static int m = 400;
    public transient final int L = 900;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestTransient input = new TestTransient();
        // serialization
        FileOutputStream fos = new FileOutputStream("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Transient.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
        // de-serialization
        FileInputStream fis = new FileInputStream("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Transient.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestTransient output = (TestTransient) ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.L);
        System.out.println("m = " + output.m);
    }
}
