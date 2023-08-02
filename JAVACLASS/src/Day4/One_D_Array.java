package Day4;

public class One_D_Array {
    public static void main(String[] args){
        //길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];

        //길이가 7인 double형 1차원 배열의 생성
        double[] ar2 = new double[7];

        //배열의 참조변수와 인스턴스 생성 분리
        float[] ar3;
        ar3 = new float[9];

        //배열의 인스턴스 변수 접근
        System.out.println("배열 ar1 길이 : " + ar1.length);
        System.out.println("배열 ar2 길이 : " + ar2.length);
        System.out.println("배열 ar3 길이 : " + ar3.length);

///////////////////////////////////////////////////////////////////////

        String[] ar = new String[7];
        ar[0] = new String("Java");
        ar[1] = new String("System");
        ar[2] = new String("Compiler");
        ar[3] = new String("Park");
        ar[4] = new String("Tree");
        ar[5] = new String("Dinner");
        ar[6] = new String("Brunch Cafe");

        int cnum = 0;

        for(int i = 0; i < ar.length; i++)
            cnum += ar[i].length();

        System.out.println("총 문자의 수 : " + cnum);

///////////////////////////////////////////////////////////////////////

        int[] arr = {1,2,3,4,5,6,7};
        int sum = sumofAry(arr);
        System.out.println(sum);
    }

    static int sumofAry(int[] ar){
        int sum = 0;
        for(int i = 0; i<ar.length; i++)
            sum += ar[i];
        return sum;
    }

}

