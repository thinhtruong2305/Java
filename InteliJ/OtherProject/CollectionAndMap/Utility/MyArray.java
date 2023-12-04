package Utility;

import Model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class MyArray {
    public static void reverseWithFor(List list){
        for(int i = 0, j = list.size() - 1; i < j; i++){
            Object tempStudent = list.remove(j);
            list.add(i, tempStudent);
        }
    }
    public static void findById(List<Student> students, int id){
        students.forEach(x -> {
            if(x.getId() == id)
                System.out.println(x.toString());
        });
    }
    public static void findByName(List<Student> students, String name){
        students.forEach(x -> {
            if(x.getName().equalsIgnoreCase(name))
                System.out.println(x.toString());
        });
    }
    public static void findById(Set<Student> students, int id){
        students.forEach(x -> {
            if(x.getId() == id)
                System.out.println(x.toString());
        });
    }
    public static void findByName(Set<Student> students, String name){
        students.forEach(x -> {
            if(x.getName().equalsIgnoreCase(name))
                System.out.println(x.toString());
        });
    }
    public static void findDulicateByNameWithCollectors(Set<Student> students){
        Map<String, List<Student>> studentMap = students.stream().collect(Collectors.groupingBy(Student::getName));
        studentMap.forEach((k,v) -> {
            if(v.size() > 1){
                System.out.println(k + "{");
                v.forEach(x ->{
                    System.out.println(x);
                });
                System.out.println("}");
            }
        });
    }
    public static void findDulicateByNameWithFor(List<Student> students){
        Map<String, List<Student>> studentMap = new HashMap<>();
        students.forEach(x -> {
            List<Student> studentsTemp = new ArrayList<>();
            students.forEach(y -> {
                if(x.getName() == y.getName()){
                    studentsTemp.add(y);
                }
            });
            studentMap.put(x.getName(), studentsTemp);
        });
        studentMap.forEach((k,v) -> {
            if(v.size() > 1){
                System.out.println(k + "{");
                v.forEach(x ->{
                    System.out.println(x);
                });
                System.out.println("}");
            }
        });
    }
    public static void removeNameById(List<Student> students,int id){
        students.forEach(x ->{
            if(x.getId() == id){
                x.setName("");
            }
            System.out.println(x);
        });
    }
    public static void removeById(List<Student> students, int id){
        //students.removeIf(x -> x.getId() == id);
        for (Student student: students) {
            if(student.getId() == id){
                students.remove(student);break;
            }
        }
        System.out.println(students);
    }

    public static void addIntoStack(Stack<Student> studentStack, List<Student> studentList) {
        studentList.forEach(x -> {
            studentStack.push(x);
        });
    }
    public static void checkStack(Stack<Student> studentStack) {
        ListIterator<Student> iterator = studentStack.listIterator(studentStack.size());
        while (iterator.hasPrevious()){
            Student student = iterator.previous();
            System.out.println(student);
        }
    }
    public static void addIntoQueue(Queue<Student> studentQueue, List<Student> studentList){
        studentList.forEach(x -> {
            studentQueue.add(x);
        });
    }
    public static void checkQueue(Queue<Student> studentQueue) {
        Iterator<Student> iterator = studentQueue.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
