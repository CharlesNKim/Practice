package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// NxM 입력
// 각 행의 가장 작은 수 중 가장 큰 수
public class NumberCardGame {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        String numStr = br.readLine();
        int n = Integer.parseInt(numStr.split(" ")[0]);
        int m = Integer.parseInt(numStr.split(" ")[1]);

        ArrayList<Integer>[] arrayList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] nums = line.split(" ");
            arrayList[i] = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arrayList[i].add(Integer.parseInt(nums[j]));
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            Collections.sort(arrayList[i]);
            int tmp = arrayList[i].get(0);
            if (max < tmp) {
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
