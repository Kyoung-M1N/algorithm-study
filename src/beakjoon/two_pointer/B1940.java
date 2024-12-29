package beakjoon.two_pointer;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1940
public class B1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 선택 정렬처럼 순회하는 방법
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] + arr[j] == m) {
        //             count++;
        //         }
        //     }
        // }
        
        // sort하고 투포인터 사용 -> 반복문의 중첩이 없으므로 더 빠름
        // Arrays.sort()는 O(nlogn)의 시간복잡도를 가진다.
        Arrays.sort(arr);

        int sp = 0;
        int ep = n-1;

        while (sp < ep) {
            if (arr[ep] + arr[sp] == m) {
                count++;
                ep--;
                sp++;
            }
            else if (arr[ep] + arr[sp] > m) {
                ep--;
            }
            else {
                sp++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
