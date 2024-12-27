package beakjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11720
public class B11720 {
    public static void main(String[] args) throws IOException {
        // scanner 대신 bufferedReader를 사용하면 메오리와 실행시간 단축(데이터가 버퍼를 거쳐서 전달되므로 효흉성 상승)
        // bufferedReader는 엔터만 경계로 인식하므로 readLine을 사용
        // 읽은 데이터는 무조건 String이므로 형변환 필요
        // readLine을 할 때마다 try-catch로 예외처리 도는 throws로 예외를 명시
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] inputNums = bf.readLine().split("");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(inputNums[i]);
        }
        System.out.println(sum);
    }
}
