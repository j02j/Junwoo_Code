public class If {
//    if(조건식) {  // 조건식이 true일 때 아래 실행문들 동작, false면 미실행
//        실행문;
//        실행문;
//    }
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");

        int score = 85;

        if (score >= 90) {    //score = 85이므로 score >= 90 조건은 false
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }
        if (score < 90) {     //score = 85이므로 score < 90 조건은 true
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }

        /////////////////////////////////////////////////////////////////
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");


//        if(조건식1) {
//            실행문1;     // 조건식1이 true일 경우 실행
//        }
//        else if(조건식2) {
//            실행문2;    // 조건식 1이 false이고 조건식2가 true일 경우 실행
//        } else{
//            실행문3;    // 조건식 1과 2가 true일 경우 실행
//        }

        int score_ = 83;

        if (score_ >= 90) {
            System.out.println("점수가 100-90 입니다.");
            System.out.println("등급은 A 입니다.");
        }
        else if (score_ >= 80) { // 80 <= score <90
            System.out.println("점수가 80-89 입니다.");
            System.out.println("등급은 B 입니다.");
        }
        else if (score_ >= 70) { // 70 <= score <80
            System.out.println("점수가 70-79 입니다.");
            System.out.println("등급은 C 입니다.");
        } else { // 60 <= score <70)
            System.out.println("점수가 60-69 입니다.");
            System.out.println("등급은 D 입니다.");
        }

        /////////////////////////////////////////////////////////////////
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''");


        int num = (int) (Math.random() * 6) + 1;    // 1 ~ 6에서 임의의 정수를 뽑는 Math.random() 메소드를 사용(해당 메소드는 추후 포스팅에서 다룰 예정)

        if (num == 1) {
            System.out.println("1번이 나왔습니다.");
        }
        else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        }
        else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        }
        else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        }
        else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }

}
