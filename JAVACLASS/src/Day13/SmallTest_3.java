package Day13;

public class SmallTest_3 {
/*  대여 가능한 책
    <문제>
    대여가 가능한 책의 목록을 출력하는 프로그램을 작성해주세요.

    Step 1
    이름, 가격, 대여중 여부를 확인 할 수 있게 Book 클래스를 만들어 주세요.

    Book {
        String title;
        int price;
        boolean borrowed;
    }

    Step 2
    적절한 생성자를 작성하고 이를 통해 10권의 샘플 책을 배열에 하나씩 만들어 주세요.

    // 생성자
    Book(String name, int price, boolean borrowed) {
    ...
    }
    // main
    Book[] books = new Book[10];
    books[0] = new Book("나루토", 3500, false);
    ...
    books[9] = new Book("맥심", 14000, false);

    Step 3
    샘플 책들이 잘 만들어 졌는지 확인 할 수 있게 toString() 메소드를 작성해 주세요.

    // System.out.println(books[0].toString());
    [나루토] 3500원, 대여중? false

    Step 4
    Book 클래스에 대여시작(rented)메소드와 반납완료(returned) 메소드를 작성해주세요.

    System.out.println(books[0].toString()); // [나루토] 3500원, 대여중? false
    books[0].rented();
    System.out.println(books[0].toString()); // [나루토] 3500원, 대여중? true
    books[0].returned();
    System.out.println(books[0].toString()); // [나루토] 3500원, 대여중? false

    Step 5
    샘플 책 10권중 임의의 5권을 선택하여 빌려주고, 나머지 대여 가능한 책의 목록을 출력해주세요.

    // 출력 예
        [나루토] 3500원, 대여중? false
        [슬램덩크] 4000원, 대여중? false
        [소년탐정 김전일] 3500원, 대여중? false
        [멘즈헬스] 1500원, 대여중? false
        [막심] 14000원, 대여중? false*/
}
