package Xu;

import java.util.Scanner;

public class Cal {
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static void main(String[] args) {
        Cal cal = new Cal();
        System.out.println("one num");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("another num");
        int b = in.nextInt();
        int c = Cal.add(a,b);
        int d = Cal.subtract(a,b);
        System.out.println("addnum" + c);
        System.out.println("subtractnum" + d);
    }
}
