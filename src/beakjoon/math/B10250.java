package beakjoon.math;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10250
public class B10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int floor = n % h;
            int num = n / h;

            int result = 0;

            // 층수를 결정할 때 나머지가 0인 경우 꼭대기 층으로 처리하는 과정이 따로 필요
            // 이 때 방 번호를 결정할 때에도 꼭대기 층에서는 몫에 1을 더하지 않음
            if (floor == 0) {
                result = h * 100 + num;
            } else {
                result = floor * 100 + num + 1;
            }

            System.out.println(result);
        }

        sc.close();
    }
}
