package kr.co.charlesn;

import java.io.BufferedReader;
import java.io.IOException;

// n m k 세 수를 받는다
// n은 배열의 크기 m은 더해지는 횟수, k는 연속해서 더할수 있는
// 5 8 3
// 2 4 5 4 6
// 합 구하기
public class FindMaxSum1 {
    public static void main(String[] args) throws IOException {
        FindMaxSum1 main = new FindMaxSum1();
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        String numStr = br.readLine();
        String[] strArray = numStr.split(" ");

        int n = Integer.parseInt(strArray[0]);
        int m = Integer.parseInt(strArray[1]);
        int k = Integer.parseInt(strArray[2]);

        String numStr2 = br.readLine();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i] = Integer.parseInt(numStr2.split(" ")[i]);
        }

        int bigIndex;
        int sameAddCount = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            // find bigger Number in numArray
            int biggerNumber = main.findBiggerNumberExceptInputIndex(numArray);
            bigIndex = main.findBiggerNumberIndex(numArray);
            if (sameAddCount < k) {
                // 가장 큰 수를 더할 수 있음
                sum += biggerNumber;
                sameAddCount++;
            } else {
                // 가장 큰 수 다음으로 큰 수를 더해야 함
                biggerNumber = main.findBiggerNumberExceptInputIndex(numArray, bigIndex);
                sum += biggerNumber;
                sameAddCount = 0;
            }
        }
        System.out.println(sum);
    }

    int findBiggerNumberIndex(int[] numArray) {
        int biggerNumber = numArray[0];
        int biggerIndex = 0;
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > biggerNumber) {
                biggerNumber = numArray[i];
                biggerIndex = i;
            }
        }
        return biggerIndex;
    }

    int findBiggerNumberExceptInputIndex(int[] numArray, int inputIndex) {
        int biggerNumber = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (i == inputIndex) {
                continue;
            }
            if (biggerNumber < numArray[i]) {
                biggerNumber = numArray[i];
            }
        }
        return biggerNumber;
    }

    int findBiggerNumberExceptInputIndex(int[] numArray) {
        int biggerNumber = 0;
        for (int j : numArray) {

            if (biggerNumber < j) {
                biggerNumber = j;
            }
        }
        return biggerNumber;
    }
}
