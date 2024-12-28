package beakjoon.prefix_sum;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11659
public class B11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] sumArray = new int[n + 1];

        // 합 배열 생성
        // 인덱스 넘치는거 방지하기 위해 합 배열의 0번 인덱스 값을 0으로 하고 한 칸식 밀어주기
        for (int i = 1; i <= n; i++) {
            sumArray[i] = sumArray[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sumArray[end] - sumArray[start - 1]);
        }
        sc.close();
    }
}
