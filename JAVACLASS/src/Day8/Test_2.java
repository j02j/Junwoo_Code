package Day8;
/*
char[] 배열을 전달받아 출력하는 printWord() 메서드와
배열 속의 공백(' ') 문자를 ',' 로 대체하는 replace()메서드를 작성하라.
 */
import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요: ");

        String str = sc.nextLine();
        char[] arr = new char[str.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        Word.showInfo(arr);

        sc.close();

    }
}

class Word {
    static void printWord(char[] arr) {
        System.out.println(arr);
    }

    static void replace(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                arr[i] = ',';
            }
        }

        System.out.println(arr);
    }

    static void showInfo(char[] arr) {
        System.out.print("변경전: ");
        printWord(arr);
        System.out.print("변경후: ");
        replace(arr);
    }
}