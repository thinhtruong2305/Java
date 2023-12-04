package Controller;


import Model.Database.User;
import Service.Implement.UserService;
import Service.Interface.IUserService;
import Util.Static.ObjectStorage;

import java.util.Optional;

public class UserController{
    private IUserService userService;

    public UserController() {
        userService = new UserService();
    }

    public boolean login(String userName, String password){
        Optional<User> result = userService.findByUserNamePassword(userName, password);
        if(result.isPresent()){
            ObjectStorage.setUser(result.get());
            System.out.println("Đăng nhập thành công");
            return true;
        }else{
            System.out.println("Đăng nhập thất bại");
            return false;
        }
    }
    public boolean register(User user){
        Optional<User> result = userService.createUser(user);
        if(result.isPresent()){
            System.out.println("Đăng kí thành công");
            System.out.println(result.get().getUserName() + " " + result.get().getUserID());
            return true;
        }else{
            System.out.println("Đăng kí thất bại");
            return false;
        }
    }
    public void logout(){
        System.out.println("Chào tạm biệt");
    }
}
