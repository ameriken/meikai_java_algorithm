package basic;

import java.util.Scanner;

public class IndexOfTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("テキスト:");
        String s1 = stdIn.next();

        System.out.println("パターン:");
        String s2 = stdIn.next();

        int idx1 = s1.indexOf(s2);
        int idx2 = s1.lastIndexOf(s2);

        if(idx1 == -1)
            System.out.println("テキスト中にパターンは存在しません。");
        else {
            int len1 = 0;
            for(int i = 0; i < idx1; i++) {
                len1 += s1.substring(i, i+1).getBytes().length;
                System.out.println(s1.substring(i, i+1).getBytes().length);
                System.out.println(s1.substring(i, i+1).getBytes());
            }
            len1 += s2.length();
            System.out.println(len1);

            int len2 = 0;
            for(int i = 0; i < idx2; i++) {
                len2 += s1.substring(i, i + 1).getBytes().length;
            }
            len2 += s2.length();
            System.out.println(len2);

            System.out.println("テキスト：" + s1);
            System.out.printf(String.format("パターン：%%%ds¥n", len1), s2);
            System.out.println("テキスト：" + s1);
            System.out.printf(String.format("パターン：%%%ds¥n", len2), s2);
        }
    }
}
