package Xu;

import java.util.Scanner;

public class Cal {
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Cal cal = new Cal();
        System.out.println("请输入一个数");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("请输入另一个数");
        int b = in.nextInt();
        int c = Cal.add(a,b);
        int d = Cal.subtract(a,b);
        System.out.println("加法的结果为" + c);
        System.out.println("减法的结果为" + c);
    }
}
