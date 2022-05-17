package kr.co.charlesn;

import java.io.BufferedReader;

public class Sugar {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int count = 0;

        while (n > 0) {
            if(n % 5 == 0) {
                n -= 5;
                count++;
            } else if (n % 3 == 0) {
                n -= 3;
                count++;
            } else if (n > 5) {
                n -= 5;
                count++;
            } else {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
