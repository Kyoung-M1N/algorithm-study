package beakjoon.prefix_sum;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10986
public class B10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 합배열과 결과 변수를 long으로 선언해야함(구간 합의 결과가 int보다 클 수 있음)
        long[] sumArray = new long[n + 1];
        long[] remainder = new long[m];
        long result = 0;

        // 연속된 구간 합의 나머지가 0인 경우 : 
        // 1. 합 배열로 구한 구간 합과의 나머지가 0인 경우 -> (s[j] - s[i-1]) % m = 0
        // 2. 합 배열의 원소의 나머지가 같아서 구간합을 구하기 위해 빼면 0이 되는 경우 -> (s[j] % m) - (s[i-1] % m) = 0
        // 위의 두 가지를 만족하는 경우의 수를 구하기 위해 합 배열의 원소들에 나머지 연산을 한 결과와 나머지가 같은 구간을 선택하여 구간 합을 구하는 경우를 찾기

        // 합 배열의 원소에 나머지 연산을 하고 1번 케이스의 경우의 수를 구하기
        for (int i = 1; i <= n; i++) {
            sumArray[i] = sumArray[i - 1] + sc.nextInt();
            long remain = sumArray[i] % m;
            if (remain == 0) {
                result++;
            }
            remainder[(int)remain]++;
        }
        // 나머지가 같은 것들을 카운트한 배열을 이용하여 나머지가 같은 조합을 카운트
        for (int i = 0; i < m; i++) {
            result += (remainder[i] * (remainder[i] - 1)) / 2;
        }

        System.out.println(result);

        sc.close();
    }
}
