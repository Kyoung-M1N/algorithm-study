package beakjoon.data_strcture;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10828
public class B10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] stack = new int[n];
        int top = 0;

        for (int i = 0; i < n; i++) {
            String commend = sc.nextLine();
            if (commend.equals("pop")) {
                if (top == 0) {
                    System.out.println(-1);
                } else {
                    top--;
                    System.out.println(stack[top]);
                    stack[top] = 0;
                }
            } else if (commend.equals("size")) {
                System.out.println(top);
            } else if (commend.equals("empty")) {
                if (top == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (commend.equals("top")) {
                if (top == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[top - 1]);
                }
            } else { // push
                stack[top] = Integer.parseInt(commend.split(" ")[1]);
                top++;
            }
        }
        sc.close();
    }
}
