package Model.Utility;

import java.util.Arrays;

public class MyMath{
    private static final double PI = 3.14;
    public static int max(int a, int b){
        return (a >= b) ? a : b;
    }
    public static int min(int a, int b){
        return (a <= b) ? a : b;
    }
    public static int sum(int ...a){
        int result = 0;
        if(a.length < 0)
            return 0;
        for(int x: a) {
            result += x;
        }
        return result;
    }
    public static double sum(int a){
        //Thay đổi số PI
        //PI = 3.15;
        return a + PI;
    }
}
