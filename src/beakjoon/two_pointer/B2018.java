package beakjoon.two_pointer;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2018
public class B2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1~n까지의 수에서 n만으로 결과를 완성했을 때를 미리 카운트
        int count = 1;

        // 투포인터를 사용할 때 실제 배열을 생성하고 포인터를 가리킬 필요 없이 포인터에 값을 그대로 담아도 된다.
        int sp = 1;
        int ep = 1;

        // 1~n까지 연속된 수의 합을 추적하므로 초기값은 1
        int sum = 1;
        while (ep < n) {
            if (sum == n) {
                count++;
                ep++;
                sum += ep;
            } else if (sum < n) {
                ep++;
                sum += ep;
            } else {
                sum -= sp;
                sp++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
