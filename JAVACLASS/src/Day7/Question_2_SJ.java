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
public class Question_2{


}

class Account {
    public static void main(String[] args) {
        public long deposit(long amount);
        public long withdraw(long amount);
    }

    //field
    private String owner;

    //getter
    public String getOwner{
        return owner;
    }
    //setter
    public void setOwner(String Owner){
        this.owner = Owner;
    }

    //field
    private long balance;

    //getter
    public long getBalance{
        return balance;
    }

    //setter
    public void setBalance(String Balance){
        this.balance = Balance;
    }


}