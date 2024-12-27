package beakjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/28702
public class B28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nextNum = 0;

        // 그냥 약간 노가다인 문제 같다
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            if (!input.contains("Fizz") && !input.contains("Buzz")) {
                nextNum = Integer.parseInt(input) + (3 - i);
                break;
            }
        }

        if ((nextNum % 3 == 0) && (nextNum % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if (nextNum % 3 == 0) {
            System.out.println("Fizz");
        } else if (nextNum % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(nextNum);
        }

        sc.close();
    }
}
