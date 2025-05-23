package beakjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11399
public class B11399 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		Arrays.sort(p);

		for (int i = 1; i < n; i++) {
			p[i] += p[i - 1];
		}

		System.out.println(Arrays.stream(p).sum());
	}
}
