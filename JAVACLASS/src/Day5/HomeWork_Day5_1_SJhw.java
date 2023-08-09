package Day5;

//       과제 1
//      주민등록번호 번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//      단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 * 로 저장하는 기능을 함수로 만드세요.

import java.util.Scanner;
public class HomeWork_Day5_1_SJhw {
    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);

        System.out.print("Please type your social insurance number");
        String nums = Number.nextLine();

        char[] numsArray = new char[nums.length()];



    }

    public static int sin(String nums, char[] numsArray) {
        for (int i = 0; i < nums.length(); i++) {
            if (i >= 8) {
                System.out.print("*");
            }
            else {
                System.out.print(nums);
            }
            return (numsArray[i]);
        }
    }
}
