package beakjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1546
public class B1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] scores = new int[n];

        String[] scoresStr = bf.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(scoresStr[i]);
        }

        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }
        // 소수점 표현을 위해 100.0으로 연산을 진행(실수형 데이터가 연산과정에 있어야 결과도 실수로 나옴)
        // 나누기 전에 sum * 100.0을 먼저 해야 나누기 결과에서 몫이 안 나오고 실수형이 나옴
        double result = (sum * 100.0 / max) / n;
        System.out.println(result);
    }
}
