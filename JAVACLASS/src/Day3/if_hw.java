package Day3;

public class if_hw {
    public static void main(String[] args) {
        System.out.println("'''''''''''''''''''''''''''''''''''''");

        int score = 85;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }

        System.out.println("''''''''''''''''''''''''''''''''''''''''");

        int score_ = 83;

        if (score_ >= 90) {
            System.out.println("점수가 90-100 입니다.");
            System.out.println("등급은 A 입니다.");
        }
        else if (score_ >= 80) {
            System.out.println("점수가 80-89 입니다.");
            System.out.println("등급은 B 입니다.");
        }
        else if (score_ >= 70) {
            System.out.println("점수가 70-79 입니다.");
            System.out.println("등급은 C 입니다.");
        }
        else {
            System.out.println("점수가 60-69 입니다.");
            System.out.println("등급은 D 입니다.");
        }

        System.out.println("''''''''''''''''''''''''''''''''''''''''''''");

        int num = (int) (Math.random() * 6) + 1;

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
        }
        else {
            System.out.println("6번이 나왔습니다.");
        }
    }

}
