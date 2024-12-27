package beakjoon.string;

import java.util.Scanner;

// https://www.acmicpc.net/problem/31403
public class B31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String str = "";
        str += a;
        str += b;

        System.out.println(a + b - c);
        // 10*a + b - c는 문제 의도와 달라서 안되는거 같다.
        System.out.println(Integer.parseInt(str) - c);

        sc.close();
    }
}
