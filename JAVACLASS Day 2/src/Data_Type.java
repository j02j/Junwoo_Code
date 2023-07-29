public class Data_Type {
//    -	정수 자료형 : byte, short, int, long
//    -	실수 자료형 : float, double
//    -	문자 자료형 : char
//    -	논리 자료형 : Boolean


    public static void main(String[] args) {
        byte val1 = 1;
        short val2 = 1004;
        int val3 = 12345;
        long val4 = 10;

        float val5 = 3.14f;
        double val61 = 3.141592d;

        char val7 = 'A';

        boolean val8 = true;

        int val3_add = 300;
        char val7_add = 'A' + 1 ; //'B'

        System.out.println(val3+val3_add); //int + int

        System.out.println(val7_add);
        System.out.println(val7+val7_add); //char + char => Q. 왜 숫자로 나올까요? A. char은 아스키코드값을 가져오기 때문.
        //Why? 변수가 아닌 상수 또는 리터럴 간의 연산은 프로그램 실행 중 변하는 값이 아니기 때문에, 소스코드를 컴파일 시 컴파일러가 먼저 계산하고 리터럴간의 연산을 실행.



    }
}
