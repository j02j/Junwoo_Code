package Day3;

import java.util.Scanner;

public class While {
    //    int i=0 //변수 선언
    //    while(i<10){ //괄호 안에 조건 넣어주기
    //        i++ //변수 업데이트
    //    }
    public static void main(String[] args) {
        //일반 while문
        int i=0;
        while(i < 10){
            System.out.println("i는: "+i);
            i++;
        }


        //다중 while문
        i=1;
        while(i<11)
        {
            int j=1;
            while(j<11)
            {
                System.out.print(i + " * " + j +  " = " + (i*j) + "\t"); //실행할 구문
                j++;
            }
            i++;
            System.out.println();
        }


        //do-while문
        //    do{
        //        System.out.println("실행"); //실행할 구문
        //    }while(조건); //조건 검사
        i=0;
        do{
            System.out.println("print = " + i);
            i++;
        }while(i<5);


        //응용 : 마름모 그리기
        Scanner sc = new Scanner(System.in);
        System.out.println("마름모의 높이를 입력해주세요.(홀수)  : ");
        int height = sc.nextInt();

        i=0;
        while(i<height) {
            int j=0;
            while(j<height) { //마름모 전체
                //위쪽 부분
                if(i<=height/2) {
                    if(i+j<=height/2-1) { //왼쪽 윗 부분
                        System.out.print(" ");
                    }else if(j-i>=height/2+1) { //오른쪽 윗 부분
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                    //아래쪽 부분
                }else if(i>height/2) {
                    if(i-j>=height/2+1) { //왼쪽 아랫부분
                        System.out.print(" ");
                    }else if(i+j>=height/2*3+1) { //오른쪽 아랫부분
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
                j++;
            }
            System.out.println("");
            i++;
        }

    }


}
