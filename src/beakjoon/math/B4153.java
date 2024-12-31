package beakjoon.math;

import java.util.Scanner;
import java.util.Arrays;;

// https://www.acmicpc.net/problem/4153
public class B4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] line = new int[3];

        while (true) {
            int max = 0;

            int maxIdx = 0;
            for (int i = 0; i < 3; i++) {
                line[i] = sc.nextInt();

                if (line[i] > max) {
                    max = line[i];
                    maxIdx = i;
                }
            }

            if (line[0] + line[1] + line[2] == 0) {
                break;
            }

            Arrays.sort(line); // Quick sort

            int l = 0;
            int r = 0;

            for (int i = 0; i < 3; i++) {
                if (i == maxIdx) {
                    r = line[i] * line[i];
                } else {
                    l += line[i] * line[i];
                }
            }

            if (l == r) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
