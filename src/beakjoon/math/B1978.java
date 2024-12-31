package beakjoon.math;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1978
// TODO: 에라토스테네스의 체로 다시 풀어보기
public class B1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;
            if (arr[i] == 1) {
                isPrime = false;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
