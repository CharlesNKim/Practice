package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// n x n 행렬, 시작점은 (1, 1)
// U, D, L, R 입력에 따라 좌표계 이동 각 좌표가 0은 되지 않는다(무시)
// 마지막 좌표 출력
public class UpDownLeftRight {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        String map = br.readLine();
        String[] mapArr = map.split(" ");
        int x = 1;
        int y = 1;

        for(int i = 0; i < mapArr.length; i++) {
            if(mapArr[i].equals("U")) {
                if (x != 1) {
                    x =- 1;
                }
            } else if (mapArr[i].equals("D")) {
                if (x != n) {
                    x += 1;
                }
            } else if (mapArr[i].equals("L")) {
                if (y != 1) {
                    y += -1;
                }
            } else if (mapArr[i].equals("R")) {
                if (y != n) {
                    y += 1;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
