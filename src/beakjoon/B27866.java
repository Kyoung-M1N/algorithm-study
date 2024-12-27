package beakjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/27866
public class B27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");

        System.out.println(input[sc.nextInt() - 1]);
        
        sc.close();
    }
}
