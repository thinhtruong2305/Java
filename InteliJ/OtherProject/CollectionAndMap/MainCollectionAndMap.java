import Code.Vehicle;
import Model.Employee;
import Model.MyArray;
import Model.Salary;
import Model.Student;

import java.util.*;

public class MainCollectionAndMap {
    public static void main(String[] args) {
        int id = 0 ;
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsCopy = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nguyễn Văn B",18,300.00));
        students.add(new Student("Nguyễn Văn A",19,800.00));
        students.add(new Student("Nguyễn Văn C",18,400.00));
        students.add(new Student("Nguyễn Văn A",20,500.00));

//        System.out.println(students);
//        System.out.println("Tông số học sinh: " + students.size());
//        System.out.println("Học sinh thứ " + 4 +":" + students.get(3));
//        System.out.println("Học sinh đầu tiên: " + students.get(0));
//        System.out.println("Học sinh cuối cùng: " + students.get(students.size() - 1));

//        students.add(0, new Student("Nguyễn Văn C", 25, 500.00));
//        System.out.println("Thêm một student ở đầu danh sách");
//        System.out.println(students);

//        students.add(new Student("Nguyễn Văn D", 26, 800.00));
//        System.out.println("Thêm một student ở cuối danh sách");
//        System.out.println(students);

//        Collections.reverse(students);
//        System.out.println("Đảo ngược bằng Collections");
//        System.out.println(students);

//        MyArray.reverseWithFor(students);
//        System.out.println("Đảo ngược bẳng vòng for");
//        System.out.println(students);

//        System.out.println("Tìm kiếm student bằng id");
//        System.out.print("Nhập id: ");
//        id = scanner.nextInt(); scanner.nextLine();
//        Utility.MyArray.findById(students, id);

//        System.out.println("Tìm kiếm student bằng name");
//        System.out.print("Nhập name: ");
//        String name = scanner.nextLine();
//        MyArray.findByName(students, name);

//        System.out.println("In danh sách học sinh trùng tên");
//        Utility.MyArray.findDulicateByNameWithFor(students);

//        System.out.println("Xóa tên bằng id");
//        System.out.print("Nhập id: ");
//        id = scanner.nextInt();
//        MyArray.removeNameById(students, id);

//        System.out.println("Xóa student");
//        MyArray.removeById(students, 5);

//        System.out.println("Copy student");
//        studentsCopy.addAll(students);
//        System.out.println(studentsCopy);

        Stack<Student> studentStack = new Stack<>();
        Queue<Student> studentQueue = new LinkedList<>();
        List<Student> studentsInterview = new ArrayList<>();
        studentsInterview.add(new Student("Nguyễn Văn Nam",16,300.00));
        studentsInterview.add(new Student("Nguyễn Văn Huyền",19,800.00));
        studentsInterview.add(new Student("Trần Văn Nam",18,400.00));
        studentsInterview.add(new Student("Nguyễn Văn A",20,500.00));

//        MyArray.addIntoStack(studentStack, studentsInterview);
//        MyArray.addIntoQueue(studentQueue, studentsInterview);
//        System.out.println("Stack");
//        MyArray.checkStack(studentStack);
//        System.out.println("Queue");
//        MyArray.checkQueue(studentQueue);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Nguyễn Văn A", 1));
        studentSet.add(new Student("Nguyễn Văn B", 1));
        studentSet.add(new Student("Nguyễn Văn C", 2));
        studentSet.add(new Student("Nguyễn Văn D", 3));

//        studentSet.forEach(x -> System.out.println(x));

//        System.out.println("Tìm kiếm student bằng id");
//        System.out.print("Nhập id: ");
//        id = scanner.nextInt(); scanner.nextLine();
//        MyArray.findById(studentSet, id);

//        System.out.println("Tìm kiếm student bằng name");
//        System.out.print("Nhập name: ");
//        String name = scanner.nextLine();
//        MyArray.findByName(studentSet, name);

//        System.out.println("In danh sách học sinh trùng tên");
//        MyArray.findDulicateByNameWithCollectors(studentSet);

//        System.out.println("Sắp xếp");

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Nguyễn Văn A");
        studentMap.put(2, "Nguyễn Văn A");
        studentMap.put(3, "Nguyễn Văn D");

        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());
        Set<Map.Entry<Integer, String>> studentMapSet = studentMap.entrySet();

        System.out.println("Sắp xếp");
        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(new Vehicle<Integer>("A8", "Red", "Audi", 1));
        vehicles.add(new Vehicle<Float>("C300", "Black", "Mercedes", 2.0f));
        vehicles.add(new Vehicle<Double>("Camry", "Blue", "Toyota", 3.0));
//        Collections.sort(students, Comparator.comparing(Student::getAge));
//        students.sort((h1, h2) -> /*h1.getName().compareTo(h2.getName())*/ Integer.compare(h1.getAge(), h2.getAge()));
//        System.out.println(students);
//        vehicles.stream().sorted();
//        System.out.println(vehicles);

        System.out.println("Generic");
        System.out.println(vehicles);
        vehicles.iterator().next().myPrint(19, 56);
        Integer[] arrayInt = {1,4,6,2,32};
        Long[] arrayLong = {12193819l,487680L,6L,2L,32L};
        Float[] arrayFloat = {1F,4F,6f,2.0f,32f};
        Double[] arrayDouble = {1d,4D,6.0,2.0,32.00};
        Model.MyArray<?> array = new MyArray<Float>(arrayFloat);
        for (Object x: array.getArray()) {
            System.out.println(x);
        }
        List<Employee<Salary<?>>> employees = new ArrayList<>();
        employees.add(new Employee<>(1, "Nguyễn Văn I", new Salary<>(7, 300000)));
        employees.add(new Employee<>(2, "Nguyễn Văn G", new Salary<>(8, 300000f)));
        employees.add(new Employee<>(3, "Nguyễn Văn H", new Salary<>(9, 300000d)));
        employees.forEach(x -> {
            System.out.println("Name: " + x.getName() + ", month: " + x.getSalary().getMonth() + ", money: " + x.getSalary().getMoney());
        });
        employees.sort((e1, e2) -> Integer.compare(e1.getSalary().getMonth(), e2.getSalary().getMonth()));
        System.out.println("month: " + employees.get(employees.size() - 1).getSalary().getMonth() + ", money: " + employees.get(employees.size() - 1).getSalary().getMoney());
    }
}
