package beakjoon.two_pointer;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1253
public class B1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        // 가장 큰 수부터 좋은 수인지 차례대로 계산해보기
        for (int i = n - 1; i >= 0; i--) {
            // arr의 입력 값에 음수가 올 수 있으므로 ep는 i보다 작은 값만 순회해서는 안됨
            // sp는 항상 처음부터, ep는 항상 끝부터 순회하고 sp나 ep가 i와 같은 경우를 예외처리 해야함
            int sp = 0;
            int ep = n - 1;

            while (sp < ep) {
                if (arr[sp] + arr[ep] == arr[i]) {
                    if (sp != i && ep != i) {
                        count++;
                        break; // 현재 계산 과정에서 좋은 수라고 판별이 되면 반복문을 탈출하여 중복 카운트 방지
                    } else if (sp == i) {
                        sp++;
                    } else if (ep == i) {
                        ep--;
                    }
                } else if (arr[sp] + arr[ep] > arr[i]) {
                    ep--;
                } else {
                    sp++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
