package beakjoon.math;

import java.util.Scanner;

// https://www.acmicpc.net/problem/30802
public class B30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long[] size = new long[6];

        // 티셔츠 사이즈별 신청자 수를 입력값으로 초기화
        for (int i = 0; i < 6; i++) {
            size[i] = sc.nextInt();
        }

        long t = sc.nextInt();
        long p = sc.nextInt();

        int tSetCount = 0;

        // 구매해야 하는 티셔츠 묶음 수 카운트
        for (int i = 0; i < 6; i++) {
            // 한 묶음당 티셔츠의 수와 필요한 티셔츠 수가 일치할 떼에는 몫을 그대로 카운트에 더함
            if (size[i] % t > 0) {
                tSetCount += size[i] / t + 1;
            } else {
                tSetCount += size[i] / t;
            }
        }

        long pSetCount = n / p;
        long pSingleCount = n % p;

        System.out.println(tSetCount);
        System.out.println(pSetCount + " " + pSingleCount);

        sc.close();
    }
}
