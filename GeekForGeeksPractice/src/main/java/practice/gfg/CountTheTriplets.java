package practice.gfg;

public class CountTheTriplets {

    public int countWays(int[] arr, int n) {

        int maxValue = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (maxValue < ele) {
                maxValue = ele;
            }
        }

        int freq[] = new int[maxValue + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int count = 0;

        //case 1: all three are zero
        count += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6;

        //case 2: 2 are x and one is 0
        for (int i = 1; i <= maxValue; i++) {
            count += freq[0] * freq[i] * (freq[i] - 1) / 2;
        }

        //case 3: 2 are x and one is 2 * x
        for (int i = 1; 2 * i <= maxValue; i++) {
            count += freq[i] * (freq[i] - 1) / 2 * freq[2 * i];
        }

        //case 3: one is x , another is y and third one  is x + y
        for (int i = 1; i <= maxValue; i++) {
            for(int j = (i + 1);(i + j) <= maxValue;j++) {
                count += (freq[i] * freq[j] * freq[i + j]);
            }
        }

        return count;
    }
}
