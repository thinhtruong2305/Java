package Model;

import Model.Interface.IStudy;

public class Student extends Person implements IStudy {
    private static String college = "Đại học bách khoa";
    private static int counter = 1;
    public static double moneyGroup = 0.0;
    private double fee;
    private final int id = 0;

    public Student(){
        //this.id = counter;
        counter++;
    }
    public Student(String name, int age, double fee) {
        super(name, age);
        this.fee = fee;
        //this.id = counter;
        counter++;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getCounter() {
        return counter - 1;
    }

    @Override
    public void doHomework() {
        System.out.println("Student do homework");
    }

    @Override
    public void copyHomework() {
        System.out.println("Student copy homework");
    }

    @Override
    public void rollUp() {
        System.out.println("Student roll up");
    }

    public final void study(){
        System.out.println("Student is studying");
    }

    public void rechargeMoneyGroup(double money){
        moneyGroup += money;
        System.out.println("Tiền quỹ lớp: " + Student.moneyGroup);
    }

    public void useMoney(double money, String reason) {
        moneyGroup -= money;
        System.out.println("Tiền dùng: " + money +", Lí do: " + reason);
        System.out.println("Tiền quỹ còn lại: " + moneyGroup);
    }

    @Override
    public String toString() {
        return "Student{" + "name= " + getName() + ",age = " + getAge() + ", class= " + college + ", fee= " + fee + ", id= " + id + '}';
    }
}
