package kr.co.charlesn;

import java.io.BufferedReader;

public class ConvertYear {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        System.out.println(year - 543);
    }
}
