package Day14;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("입력하세요 : ");
        String str = sc.nextLine();

        try {
            while (true) {
                if (str == "입력") {
                    System.out.println("입력했습니다.");
                }
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.print("***Error!!***");
            return;
        }
    }
}