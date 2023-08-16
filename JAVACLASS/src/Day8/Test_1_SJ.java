package Day8;
//arr 배열의 요소에서 최대값과 최소값을 구하라.
public class Test_1_SJ {
    public static void main(String[] args) {
        MaximumAndMinimum mam = new MaximumAndMinimum();
        int max = mam.Maximum();
        int min = mam.Minimum();

        System.out.println(max);
        System.out.println(min);

    }
}

class MaximumAndMinimum{
    int[] array = {12, 30, 25, 11, 50};

    //Maximum
    public int Maximum() {
        int i;
        int max = array[0];
        for(i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public int Minimum() {
        int i;
        int min = array[0];
        for(i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }



}