package beakjoon.data_strcture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10845
public class B10845 {
    public static void main(String[] args) throws IOException {
        // scanner를 사용하면 시간초과 발생
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] queue = new int[n];
        int front = 0;
        int rear = 0;

        for (int i = 0; i < n; i++) {
            String commend = br.readLine();
            if (commend.equals("pop")) {
                if (front == rear) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[front]);
                    queue[front] = 0;
                    front++;
                }
            } else if (commend.equals("size")) {
                System.out.println(rear - front);
            } else if (commend.equals("empty")) {
                if (front == rear) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (commend.equals("front")) {
                if (front == rear) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[front]);
                }
            } else if (commend.equals("back")) {
                if (front == rear) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue[rear - 1]);
                }
            } else { // push
                queue[rear] = Integer.parseInt(commend.split(" ")[1]);
                rear++;
            }
        }
    }
}
