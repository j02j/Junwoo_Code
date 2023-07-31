package Day3;

import java.util.Scanner;

public class For {
    //    for(int i=0 ; i<10 ; i++) {
    //        //조건이 참일 경우 for문 내부 실행
    //    }

    public static void main(String[] args) {
        //일반 for문
        for(int i=0 ; i<10 ; i++) {
            System.out.println("i는: "+i);
        }


        // 다중 for문
        for(int i=1;i<11;i++) {
            for(int j=1;j<11;j++) {
                System.out.print(i + " * " + j +  " = " + (i*j) + "\t"); //실행할 구문
            }
            System.out.println();
        }


        //for문으로 삼각형 그리기
        Scanner sc = new Scanner(System.in);
        System.out.println("삼각형의 높이를 입력해주세요.  : ");
        int height = sc.nextInt();

        //직각 삼각형
        for(int i=1;i<=height;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //이등변삼각형
        for(int i=1;i<=height;i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
