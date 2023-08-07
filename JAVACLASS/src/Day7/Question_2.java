package Day7;
/*문제 2-1 -   다음을 만족하는 클래스 Account를 작성하시오.
        · 다음의 2 개의 필드를 선언
            private String owner;
            private long balance;
        · 위 모든 필드에 대한 getter와 setter의 구현
        · 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
문제 2-2 - 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오.
        · 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
            public long deposit(long amount)
        · 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
            public long withdraw(long amount)
        · Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
문제 2-3 - 위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
        · 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
        · 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
 */
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Account player = new Account(); // 생성자

        System.out.print("사용자 성함을 입력하세요 :");
        String owner = sc.next();
        player.setOwner(owner);
        System.out.print("사용자의 잔액은 얼만큼 있는지 적으세요. :");
        long balance = sc.nextLong();
        player.setBalance(balance);
        player.show();

        System.out.println("얼만큼 저축 하시겠습니까?");
        int amo = sc.nextInt();
        player.deposit(amo);
        player.show();

        System.out.println("얼마를 인출 하시겠습니까?");
        amo = sc.nextInt();
        player.withdraw(amo);
        player.show();
    }
}

class Account {
    private String owner;
    private long balance;

    Account() { // default 생성자
    }

    Account(String owner) {
        this.owner = owner;
    }

    Account(long balance) {
        this.balance = balance;
    }

    Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    void setBalance(long balance) {
        this.balance = balance;
    }

    long getBalance() {
        return this.balance;
    }

    public long deposit(long amount) {
        // 인자인 금액을 저축하는 기능
        System.out.println(amount + "만큼 입금 합니다.");
        return this.balance += amount; //저장
    }

    public long withdraw(long amount) {
        // 입력한 금액만큼 인출한 기능
        Scanner sc = new Scanner(System.in);
        long money = amount; // 새로운 money 변수를 선언
        System.out.println("현재 고객님은 " + this.balance + "원 까지 인출할 수 있습니다.");
        if (this.balance < amount) {  // 현재 값이 입력 값보다 적다면
            System.out.println("잔액이 부족하여 인출하실 수 없습니다.");
            System.out.println("가진 금액을 모두 출금 하시겠습니까? y/n");
            String se[] = {"y", "n"};
            String sel = sc.next();
            if (sel.equals(se[0])) {
                money = this.balance; // 현재 돈을 money값에 대입
            }
        }
        System.out.println(money + "만큼 인출 합니다.");
        return this.balance -= money; // money값
    }

    void show() {
        System.out.println(this.owner + "님은 현재 " + this.balance + "원을 가지고 있습니다.");
    }
}