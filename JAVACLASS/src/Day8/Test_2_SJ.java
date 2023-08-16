package Day8;
/*
char[] 배열을 전달받아 출력하는 printWord() 메서드와
배열 속의 공백(' ') 문자를 ',' 로 대체하는 replace()메서드를 작성하라.
 */

public class Test_2_SJ {
    public static void main(String[] args) {
        test1 t = new test1();
        char e = test1.printWord();
        System.out.println(e);

        test2 te = new test2();
        String Array = test2.replace();
        System.out.println(Array);


    }
}

class test1 {
    public static char printWord(){
        char[] array = {'a', 'b', 'c', 'd'};
        int i;
        for(i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        return ' ';
    }
}

class test2{
    public static String replace(){
        String[] arr = {"apple", " ", "pear"};
        int i;
        for(i = 0; i < arr.length; i++) {
            if(arr[i] == " "){
                arr[i] = ",";
            }
            System.out.print(arr[i] + "\t");
        }
        return " ";
    }
}