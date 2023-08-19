//package Day8;
//
////다음 코드의 실행 결과를 예측하세요.
//
//public class Test_3 {
//    public static void main(String[] args) {
//        new Sklass(); new Sklass(); Sklass s = new Sklass();
//        new Oklass(); new Oklass(); Oklass o = new Oklass();
//        System.out.printf("s.i = %d, o.i = %d",s.i,o.i);
//
//        //Since Sklass has static variable, it will be 3 cause it will go to the main method and pass it three times.
//        //However, Oklass has non-static variable, so it will not pass the main method. The program will run only in that class so it will be 1.
//    }
//}
//class Sklass {
//    static  int i=0;
//    Sklass() {
//        i++;
//    }
//}
//
//class Oklass {
//    int i = 0;
//
//    Oklass() {
//        i++;
//    }
//}
