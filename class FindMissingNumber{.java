public class FindNum {
    public static int findNum(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {2,4,8,10,12};
        int n = 6;
        int missingNum = FindNum(array, n);
        System.out.println("The missing number is: " + missingNum);
    }
}
