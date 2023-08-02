package Day3;

import java.util.Scanner;

public class HomeWork_Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        과제
//        1. 조건문을 활용해서 입력한 수만큼 값을 반복해서 출력할 것
//        2. 어떤 수를 3,4,7로 나누었을 때 나누어 떨어지는 수에 특정한 동물의 이름을 부여할 것 (고양이, 강아지, 앵무새)
//        3. 동시에 나누어 떨어지는 숫자가 있다면, 동물 이름이 연속으로 나열되도록 할
//        (단, 3과 7의 배수인 경우에는 3에 부여된 동물의 이름만 나열되도록 한다.)
//        4. 하단에 출력된 동물의 이름을 count 해서 횟수를 나열할 것.

        System.out.print("Type an integer: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println(i + "\t");

            if (i % 3 == 0) {
                System.out.print("고양이 ");
            }
            if (i % 4 == 0) {
                System.out.print("강아지 ");
            }
            else if (i % 7 == 0) {
                System.out.print("앵무새 ");
            }
        }




    }
}
