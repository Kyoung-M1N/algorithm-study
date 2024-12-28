package beakjoon.prefix_sum;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11660
public class B11660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] sumArray = new int[n + 1][n + 1];
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                // 2차원 배열의 합 배열 구하기 : s(x,y) = s(x,y-1) + s(x-1,y) - s(x-1,y-1) + a(x,y)
                sumArray[x][y] = sumArray[x - 1][y] + sumArray[x][y - 1] - sumArray[x - 1][y - 1] + sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int result = sumArray[x2][y2] - sumArray[x2][y1 - 1] - sumArray[x1 - 1][y2] + sumArray[x1 - 1][y1 - 1];
            System.out.println(result);
        }
        sc.close();
    }
}
