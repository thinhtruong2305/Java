package Util.Static;

import Model.Database.Plan;
import Model.Database.User;

import java.util.Scanner;

public class ObjectStorage {
    private static boolean isLogin = false;
    private static User user;
    private static Plan plan;
    private static Scanner scanner = new Scanner(System.in);

    public static boolean isLogin() {
        return isLogin;
    }

    public static void setIsLogin(boolean isLogin) {
        ObjectStorage.isLogin = isLogin;
    }

    public static User getUser() {
        return user;
    }

    public static Plan getPlan() {
        return plan;
    }

    public static void setPlan(Plan plan) {
        ObjectStorage.plan = plan;
    }

    public static void setUser(User user) {
        ObjectStorage.user = user;
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
