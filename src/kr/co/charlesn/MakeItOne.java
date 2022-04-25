package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 어떤 수를 1이 될때까지
// 1을 뺀다 또는 K로 나눈다(단, K로 나누어 떨어지면)
// 최소 횟수는?
public class MakeItOne {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] input = line.split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 0;

        while(N != 1) {
            if(N % K == 0) {
                N /= K;
            } else {
                N--;
            }
            count++;
        }
        System.out.println(count);
    }
}
