package basic;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());
        Integer c = Integer.parseInt(scanner.next());

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("最大値は"+ max + "です。");

    }
}
