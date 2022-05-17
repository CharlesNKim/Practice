package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class BigNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigDecimal x = new BigDecimal(input[0]);
        BigDecimal y = new BigDecimal(input[1]);


        System.out.println(x.add(y));

    }
}
