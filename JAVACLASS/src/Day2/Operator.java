package Day2;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");

        // ++ : 1 증가의 의미이다, ++값 혹은 값++ 로 사용한다.
        // -- : 1 감소의 의미이다, --값 혹은 값-- 로 사용한다.

        //값 자체를 증가시키거나 감소시킬 때는 어느 위치에 연산을 해도 동일한 결과가 나온다.

        int age = 20;

        System.out.println("현재 나이는? " + age);

        ++age;                                              //21
        System.out.println("++age의 결과는? " + age);        //21

        age++;                                              //21
        System.out.println("age++의 결과는? " + age);        //22

        --age;                                              //21
        System.out.println("--age의 결과는? " + age);        //21

        age--;                                              //21
        System.out.println("age--의 결과는? " + age);        //20


        /////////////////////////////////////////////////////////////////

        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");


        int num1 = 5;
        int num2 = 2;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        //값 % 배수 == 0        <= 어떠한 수의 배수인지를 물어볼 때 사용한다.
        //짝수냐? ==> 값 % 2 == 0 or 값 % 2 != 1
        //홀수냐? ==> 값 % 2 == 1 or 값 % 2 != 0

        //5의 배수냐? ==> 값 % 5 == 0 or 값 % 5 != 1

        /////////////////////////////////////////////////////////////////

        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");

        //&&(그리고, ~면서) : 11순위
        //||(또는, ~거나) : 12순위
        //논리값 && 논리값, 논리값 || 논리값

        //예시)
        //논리값 && 논리값 || 논리값 && 논리값
        //=> (논리값 && 논리값) || (논리값 && 논리값)

        //1 <= 변수 <= 100 이렇게 사용 못함
        //변수 >= 1 && 변수 <= 100
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();

        System.out.println("1부터 100 사이인지 확인 : " + (num >= 1 && num <= 100));

        //5~10 사이의 범위에 해당하지 않은 값이면 true 아니면 false를 리턴
        System.out.println("5부터 10 사이의 값이 아닌지 확인 : " + !(num >=5 && num <= 10));

        //영어 대문자냐?
        //--> 문자변수 >= 'A' && 문자변수 <= 'Z'
        System.out.print("문자 하나 입력 : ");
        char ch = sc.next().charAt(0);
        System.out.println("영어 대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z'));

        // || : 여러 값을 제시하고 그 중에 하나라도 맞는게 있는지 물어볼 때 사용
        // 입력 문자가 대 소문자 상관 없이 'y' 혹은 'Y' 인지 물어볼 때
        // 문자변수 == 'y' || 문자변수 == 'Y'                                        //문자는 && 일 수 없음
        System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");
        char ch2 = sc.next().charAt(0);
        System.out.println("영문자 y 혹은 Y인지 확인 : " + (ch2 == 'y' || ch2 =='Y'));

        // 알파벳 대문자 이거나 소문자인지 확인
        System.out.print("문자 하나 입력 : ");
        char ch3 = sc.next().charAt(0);
        System.out.println("알파벳인지 확인 : " + ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')));


        /////////////////////////////////////////////////////////////////


        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");

        //논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        //논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함
        int numz = 10;
        int result = (false && ++numz > 0)? numz:numz ;

        System.out.println("&& 확인 : " + numz);

        result = (true || ++numz > 0) ? numz:numz;

        System.out.println("|| 확인 : " + numz);

        /////////////////////////////////////////////////////////////////

        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");

        //항목이 3개인 연산자
        //(조건식)?참일때사용할값:거짓일때사용할값;
        //조건식은 반드시 결과가 true 혹은 false가 나오게끔 작성해야 함
        //비교/논리연산자가 주로 사용됨

        Scanner sc1 = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int numm = sc1.nextInt();

        //String result = (num > 0)? "양수다":"양수가 아니다";

        //중첩으로 사용도 가능하다.
        String results = (numm> 0)?"양수다":(numm == 0)?"0이다":"양수가 아니다";
        System.out.println(result);


        //////////////////////////////////////////////////////////////////

        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");

        //다른 연산자와 대입 연산자를 함께 사용하는 연산자를 말함
        //산술 대입 연산자 : +=, -=, *=, /=, %=
        //연산 처리속도가 훨씬 빠르므로 사용 권장함
        /*
         * += : 왼쪽과 오른쪽의 값을 더한 후 값을 왼쪽 공간(변수)에 대입
         * -= : 왼쪽과 오른쪽의 값을 뺀 후 값을 왼쪽 공간(변수)에 대입
         * *= : 왼쪽과 오른쪽의 값을 곱한 후 값을 왼쪽 공간(변수)에 대입
         * /= : 왼쪽과 오른쪽의 값을 나눈 후 값을 왼쪽 공간(변수)에 대입
         * %= : 왼쪽과 오른쪽의 값을 나누고 나머지 값을 왼쪽 공간(변수)에 대입
         * */
        int num0 = 12;
        System.out.println("num : " + num);

        num0 = num0 + 3;
        System.out.println("num : " + num0);

        num0 += 3;        //연산 속도가 더 빠름, 메모리에 직접 연산 수행
        System.out.println("num : " + num0);

        num0 -= 5;        //num = num - 5;
        System.out.println("num : " + num0);

        num0 *= 2;        //num값 2배 증가
        System.out.println("num : "+ num0);

        num0 /= 2;        //num값 2배 감소
        System.out.println("num : " + num0);
    }
}
