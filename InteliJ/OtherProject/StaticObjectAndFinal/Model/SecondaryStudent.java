package Model;

public final class SecondaryStudent extends Student{
    private static int counter = 0;

    public SecondaryStudent() {
        super();
        counter++;
    }

    public SecondaryStudent(String name, int age, double fee) {
        super(name, age, fee);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
//    public final void study(){
//        System.out.println("Secondary Student is studying");
//    }
}
