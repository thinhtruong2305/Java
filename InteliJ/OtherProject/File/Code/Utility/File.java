package Code.Utility;

import Code.Vehicle;

import java.io.*;

public class File {
    public static boolean isFileExists(String path){
        java.io.File file = new java.io.File(path);
        if(file.exists()){
            System.out.println("File is exists!");
            return true;
        }
        else{
            System.out.println("File is not exists !");
            return false;
        }
    }
    public static void checkFileOrFolder(String path){
        java.io.File file = new java.io.File(path);
        System.out.println(file.isDirectory()?"Path is folder":"Path is file");
    }
    public static void getAllFile(String path){
        java.io.File file = new java.io.File(path);
        for (String fileName: file.list()) {
            System.out.println(fileName);
        }
    }
    public static void createFile(String path, String name, String extension) {
        java.io.File file = new java.io.File(path + "\\" + name + "." + extension);
        try {
            if(file.createNewFile()){
                System.out.println("Create success !");
            }
            else{
                System.out.println("Create fail !");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void deleteFile(String path){
        java.io.File file = new java.io.File(path);
        if(isFileExists(path)){
            if(file.delete()){
                System.out.println("Delete Success");
            }else{
                System.out.println("Delete Fail");
            }
        }
    }
    public static void writeFileOutputStream(String path, String content, boolean append) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path, append);
            fileOutputStream.write(content.getBytes());
            System.out.println("Write file success");
        }catch (Exception e){
            System.out.println("Write file fail");
            System.out.println(e.getMessage());
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void readFileInputStream(String path){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            //Read 1KB
            byte[] b = new byte[1024];

            //Convert 1KB to length of String
            int length = fileInputStream.read(b);
            System.out.println(length);
            while (length > -1){
                String content = new String(b, 0, length);
                System.out.println(content);
                length = fileInputStream.read(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void writeObjectFile(String path, Object object, boolean append){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path, append));
            objectOutputStream.writeObject(object);
            System.out.println("Write object success");
        } catch (IOException e) {
            System.out.println("Write object fail");
            throw new RuntimeException(e);
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void readObjectFile(String path){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
            Object o = objectInputStream.readObject();
            Vehicle vehicle = (Vehicle) o;
            System.out.println(vehicle.toString());
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
