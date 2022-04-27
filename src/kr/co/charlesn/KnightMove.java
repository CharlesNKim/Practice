package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 나이트가 이동할 수 있는 위치
// 가로 두칸, 세로 한칸
// 세로 두칸, 가로 한칸
// 전체 움직일 수 있는 경우의 수는 8가지
// (-2, -1), (-2, 1), (2, -1), (2, 1), (-1, -2), (-1, 2), (1, -2), (1, 2)
public class KnightMove {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split("");
        int[][] moveArr = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};

        int moveCount = 0;
        int[] start = new int[2];
        if (inputArr[0].equals("a")) {
            start[0] = 1;
        } else if(inputArr[0].equals("b")) {
            start[0] = 2;
        } else if (inputArr[0].equals("c")) {
            start[0] = 3;
        } else if (inputArr[0].equals("d")) {
            start[0] = 4;
        } else if (inputArr[0].equals("e")) {
            start[0] = 5;
        } else if (inputArr[0].equals("f")) {
            start[0] = 6;
        } else if (inputArr[0].equals("g")) {
            start[0] = 7;
        } else if (inputArr[0].equals("h")) {
            start[0] = 8;
        }

        for (int i = 0; i < 8; i++) {
            int tmpA = start[0];
            int tmpB = start[1];
            tmpA += moveArr[i][0];
            tmpB += moveArr[i][1];
            if (tmpA > 0 && tmpA < 9 && tmpB > 0 && tmpB < 9) {
                moveCount++;
            }
        }
        System.out.println(moveCount);
    }
}
