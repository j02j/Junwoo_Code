package Day15;
import java.util.Scanner;

public class BookCafe{
    String name;
    String adress;

    Book[] multipleBooks = new Book[10];

    Drink[] variousDrinks = new Drink[10];

    void addBook(String name, int i){
        Book book = new Book(name);
        multipleBooks[i]=book;
    }
    void deleteBook(String name) {
        for(int i=0; i<10; i++) {
            if (multipleBooks[i].name == name) {
                multipleBooks[i] = null;
            }
        }
    }

    void addDrink(String name, int price, int i) {
        Drink drink = new Drink(name, price);
        variousDrinks[i] = drink;
    }
    void deleteDrink(String name, int price) {
        for(int i = 0; i<10; i++){
            if(variousDrinks[i].name == name && variousDrinks[i].price == price) {
                variousDrinks[i] = null;
            }
        }
    }
    void info(int i) {
        multipleBooks[i].Show();
        
    }
}

class Book{
    String name ;

    Book(String name){
        this.name = name;
    }

    String Show(){
        return "Book is "+ this.name;
    }
}

class Drink{
    String name;
    int price;

    Drink(String name, int price){
        this.name = name;
        this.price = price;
    }

    String Show(){
        return "Drink is " + this.name +", it's " + this.price + "$." ;
    }
}
/*
        <문제>
        북 카페를 이루고있는 구성요소를 클래스로 설계하세요.
        설계를 토대로 소스코드를 작성하세요.
        작성된 소스코드가 요구사항을 충족하도록 프로그램을 만들어 주세요.

        * 구성요소
        - 북 카페
        - 책
        - 음료


        * 요구사항
        '북 카페'는 아래의 정보를 갖는다.
        - 이름
        - 주소
        - 여러권의 책
        - 다양한 음료

        '북 카페'는 아래의 동작을 수행 할 수 있다.
        - 새로운 책을 등록하거나, 등록된 책을 삭제
        - 새로운 음료를 추가하거나, 기존 음료를 삭제
        - 카페의 정보를 요약하여 출력

        '책'은 아래의 정보를 갖는다.
        - 제목

        '책'은 아래의 동작을 수행 할 수 있다.
        - 책 제목을 문자열로 반환

        '음료'는 아래의 정보를 갖는다.
        - 이름
        - 가격

        '음료'는 아래의 동작을 수행 할 수 있다.
        - 음료 정보를 문자열로 반환
*/



/*
<실행결과>
* == 카페 정보 ==
이름: IT 카페
주소: 신림역 3번출구
보유 서적:
  예제  HTML 웹페이지 만들기
  HTML로 배우는 Java
  슬램덩크
  자료구조
판매 음료:
  아메리카노 - 2000원
  라떼 - 2500원
  레몬에이드 - 3000원
  캔맥주 - 3500원



== 책 삭제 ==


== 카페 정보 ==
이름: IT 카페
주소: 신림역 3번출구
보유 서적:
  예제로 배우는 Java
  HTML 웹페이지 만들기
  자료구조
판매 음료:
  아메리카노 - 2000원
  라떼 - 2500원
  레몬에이드 - 3000원
  캔맥주 - 3500원


== 캔맥주 삭제 ==


== 카페 정보 ==
이름: IT 카페
주소: 신림역 3번출구
보유 서적:
  예제로 배우는 Java
  HTML 웹페이지 만들기
  자료구조
판매 음료:
  아메리카노 - 2000원
  라떼 - 2500원
  레몬에이드 - 3000원

*/