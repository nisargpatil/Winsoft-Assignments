//Maximum sum of path 

//MaxSumPath.java

public class MaxSumPath {
    public static void main(String[] args) {
        int[] array1 = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] array2 = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        int maxSum = MaxSumPath(array1, array2);
        System.out.println("The maximum sum path is: " + maxSum);
    }

    public static int MaxSumPath(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sum1 += arr1[i++];
        }

        while (j < n) {
            sum2 += arr2[j++];
        }

        result += Math.max(sum1, sum2);
        return result;
    }
}

