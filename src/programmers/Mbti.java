package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Mbti{
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = { 0, 0, 0, 0 };

        for (int i = 0; i < survey.length; i++) {
            // 비동의인 경우 R타입
            if (survey[i].equals("RT")) {
                score[0] -= choices[i] - 4;
            }
            // 비동의인 경우 T타입
            if (survey[i].equals("TR")) {
                score[0] += choices[i] - 4;
            }
            // 비동의인 경우 C타입
            if (survey[i].equals("CF")) {
                score[1] -= choices[i] - 4;
            }
            // 비동의인 경우 F타입
            if (survey[i].equals("FC")) {
                score[1] += choices[i] - 4;
            }
            // 비동의인 경우 J타입
            if (survey[i].equals("JM")) {
                score[2] -= choices[i] - 4;
            }
            // 비동의인 경우 M타입
            if (survey[i].equals("MJ")) {
                score[2] += choices[i] - 4;
            }
            // 비동의인 경우 A타입
            if (survey[i].equals("AN")) {
                score[3] -= choices[i] - 4;
            }
            // 비동의인 경우 N타입
            if (survey[i].equals("NA")) {
                score[3] += choices[i] - 4;
            }
        }

        // 동일한 점수인 경우(score의 점수가 0인 경우) 알파벳 순으로 결과를 판별하기 위해
        // if-else문에서 결과가 되는 알파벳이 등장하는 순서가 중요
        if (score[0] >= 0) {
            answer += "R";
        } else {
            answer += "T";
        }
        if (score[1] >= 0) {
            answer += "C";
        } else {
            answer += "F";
        }
        if (score[2] >= 0) {
            answer += "J";
        } else {
            answer += "M";
        }
        if (score[3] >= 0) {
            answer += "A";
        } else {
            answer += "N";
        }
        return answer;
    }
}