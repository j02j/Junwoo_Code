package Day5;

import java.util.Scanner;

public class HomeWork_Day5_1 {
    public static void main(String[] args) {
//       과제 1
//      주민등록번호 번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//      단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 * 로 저장하는 기능을 함수로 만드세요.

        //정답지
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호(-포함) : ");
        String str = sc.nextLine();

        char[] arr = new char[str.length()];

        make_star(arr, str);

        sc.close();
    }

    public static void make_star(char[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= 8)
                arr[i] = '*';
            else
                arr[i] = str.charAt(i);
            System.out.print(arr[i]);
        }
    }
}
