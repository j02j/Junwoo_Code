package Day3;

public class Break_and_Continue_hw {
    public static void main(String[] args) {

        System.out.println("반복문 시작");

        for (int index = 1; index <= 5; index++) {
            System.out.println(index);
        }

        System.out.println("반복문 종료");

        //break문
        System.out.println("반복문 시작");

        for (int index = 1; index<=5; index++) {
            if (index == 3) {
                break;
            }
            System.out.println(index);
        }

        System.out.println("반복문 종료");

        //continue문
        System.out.println("반복문 시작");

        for(int index = 1; index <=5; index++) {
            if (index == 3) {
                continue;
            }
            System.out.println(index);
        }

        System.out.println("반복문 종료");
    }
}
