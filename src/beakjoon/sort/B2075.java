package beakjoon.sort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class B2075 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] nums = new long[n];

		PriorityQueue<Long> pq = new PriorityQueue<>();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				long number = sc.nextLong();
				if (pq.size() < n) {
					pq.offer(number);
				}
				if (pq.peek() < number) {
					pq.poll();
					pq.offer(number);
				}
			}
		}
		pq.forEach(System.out::println);
		System.out.print(pq.stream().min(Long::compareTo).get());
	}
}
