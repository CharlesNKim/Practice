package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 입력 n
// n시 59분 59초까지 3이 들어가는 횟수 카운트
public class Find3InTime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String st = String.valueOf(i);
                    String sj = String.valueOf(j);
                    String sk = String.valueOf(k);
                    String s = st + sj + sk;
                    if (s.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
