package Day3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        과제
//        1. 조건문을 활용해서 입력한 수만큼 값을 반복해서 출력할 것
//        2. 어떤 수를 3,4,7로 나누었을 때 나누어 떨어지는 수에 특정한 동물의 이름을 부여할 것 (고양이, 강아지, 앵무새)
//        3. 동시에 나누어 떨어지는 숫자가 있다면, 동물 이름이 연속으로 나열되도록 할 것
//        (단, 3과 7의 배수인 경우에는 3에 부여된 동물의 이름만 나열되도록 한다.)
//        4. 하단에 출력된 동물의 이름을 count 해서 횟수를 나열할 것.

        int cCount=0, dCount=0, pCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number.  : ");
        int num = sc.nextInt();

        System.out.println("< "+num + " Animal List > ");
        for(int i=1; i<num; i++){
            System.out.print(i + ". ");
            if(i%3==0)
            {
                System.out.print("Cat" + "\t");
                cCount++;
            } else if (i%7==0) {
                System.out.print("Parrot" + "\t");
                pCount++;
            }

            if(i%4==0)
            {
                System.out.print("Dog" + "\t");
                dCount++;
            }
            System.out.println();
        }

        System.out.println("\n" + "<Animal List>");
        System.out.println("\t" + "Cat : " + cCount + "회");
        System.out.println("\t" + "Dog : " + dCount + "회");
        System.out.println("\t" + "Parrot : " + pCount + "회");
    }
}
