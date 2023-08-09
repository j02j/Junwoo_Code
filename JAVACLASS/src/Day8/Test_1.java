package Day8;
//arr 배열의 요소에서 최대값과 최소값을 구하라.

public class Test_1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 50, 3, 60, -3 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("최대값: " + max + ", 최소값: " + min);
    }
}
