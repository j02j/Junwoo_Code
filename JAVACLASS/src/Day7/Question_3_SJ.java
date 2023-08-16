package Day7;
/*
문제 - 9. 다음을 만족하는 클래스 Rectangle을 작성하시오.
        · 사각형의 가로와 세로로 객체를 생성하는 생성자
        · 면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
        · 다음과 같이 클래스 Rectangle 이용
        Rectangle rc = new Rectangle(3.82, 8.65);
        System.out.println("면적: " + rc.getArea());
        System.out.println("둘레: " + rc.getCircumference());
 */

public class Question_3_SJ {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        System.out.println("Area: " + rc.getArea(3.82, 8.65));
        System.out.println("Circumference: " + rc.getCircumference(3.82, 8.65));

    }
}

class Rectangle {

    double width;
    double length;

    public double getArea(double width, double length) {
        this.width = width;
        this.length = length;
        double area = width * length;
        return area;
    }

    public double getCircumference(double width, double length) {
        this.width = width;
        this.length = length;
        double circumference = (2 * width + 2 * length);
        return circumference;
    }
}