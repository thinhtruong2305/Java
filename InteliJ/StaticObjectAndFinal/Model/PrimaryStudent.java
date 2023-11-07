package Model;

public final class PrimaryStudent extends Student{
    private static int counter = 0;

    public PrimaryStudent() {
        super();
        counter++;
    }
    public PrimaryStudent(String name, int age, double fee) {
        super(name, age, fee);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

//    public final void study(){
//        System.out.println("Primary Student is studying");
//    }
}
