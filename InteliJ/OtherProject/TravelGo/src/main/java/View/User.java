package View;

import Controller.UserController;
import Util.Static.ObjectStorage;

public class User {
    private static UserController userController = new UserController();
    public static void formDangNhap(){
        String userName = null;
        String password = null;
        System.out.println("\t\tChào mừng bạn đến với TravelGo");
        do{
            System.out.print("Nhập tên đăng nhập: ");
            userName = ObjectStorage.getScanner().nextLine();
            System.out.print("Nhập tên mật khẩu: ");
            password = ObjectStorage.getScanner().nextLine();
        }while (!userController.login(userName, password));
        ObjectStorage.setIsLogin(true);
    }
    public static void formDangKi(){
        System.out.println("\t\tChào mừng bạn đến với TravelGo");
        System.out.print("Nhập tên đăng nhập: ");
        String userName = ObjectStorage.getScanner().nextLine();
        System.out.print("Nhập tên mật khẩu: ");
        String password = ObjectStorage.getScanner().nextLine();
        System.out.print("Nhập tên số điện thoại: ");
        String phoneNumber = ObjectStorage.getScanner().nextLine();
        System.out.print("Nhập tên email: ");
        String email = ObjectStorage.getScanner().nextLine();
        userController.register(new Model.Database.User(userName, password, phoneNumber, email));
    }
}
