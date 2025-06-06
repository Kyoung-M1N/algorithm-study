package beakjoon.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/12891
public class B12891 {
    // scanner쓰면 672ms인데 bufferedReader쓰면 492ms
    // 입력값 길어지면 br을 쓰자...
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String[] pwStr = br.readLine().split("");

        int[] leastCount = new int[4];

        st = new StringTokenizer(br.readLine());
        // 조건이 담긴 배열
        for (int i = 0; i < 4; i++) {
            leastCount[i]=Integer.parseInt(st.nextToken());
        }

        int count = 0;

        int[] countArr = { 0, 0, 0, 0 };

        // 맨 처음 결과로 결과 배열 초기화
        for (int i = 0; i < p; i++) {
            if (pwStr[i].equals("A")) {
                countArr[0]++;
            } else if (pwStr[i].equals("C")) {
                countArr[1]++;
            } else if (pwStr[i].equals("G")) {
                countArr[2]++;
            } else {
                countArr[3]++;
            }
        }

        // 첫 슬라이딩 윈도우 초기화 후 검사
        if (compare(leastCount, countArr)) {
            count++;
        }

        for (int ep = p; ep < s; ep++) {
            int sp = ep - p;

            // 슬라이딩 윈도우 이동에 따라 추가되는 ep의 값을 판별하여 카운트 추가
            if (pwStr[ep].equals("A")) {
                countArr[0]++;
            } else if (pwStr[ep].equals("C")) {
                countArr[1]++;
            } else if (pwStr[ep].equals("G")) {
                countArr[2]++;
            } else {
                countArr[3]++;
            }

            // 슬라이딩 윈도우 이동에 따라 빠지는 sp의 값을 판별하여 카운드에서 빼기
            if (pwStr[sp].equals("A")) {
                countArr[0]--;
            } else if (pwStr[sp].equals("C")) {
                countArr[1]--;
            } else if (pwStr[sp].equals("G")) {
                countArr[2]--;
            } else {
                countArr[3]--;
            }

            if (compare(leastCount, countArr)) {
                count++;
            }
        }

        System.out.println(count);
    }
    
    public static boolean compare(int[] leastCount, int[] countArr) {
        for (int i = 0; i < 4; i++) {
            if (leastCount[i] > countArr[i]) {
                return false;
            }
        }
        return true;
    }
}
