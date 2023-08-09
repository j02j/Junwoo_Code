package Day5;

// 과제 2
// 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
//· 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
//· 메소드 getVolume()은 원통의 부피를 반환
//· Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
//· 다음은 원을 나타내는 클래스 Circle
public class HomeWork_Day5_2{
    public static void main(String[] args) {
        //Circle circle = new Circle(2.8);
        Cylinder cylinder = new Cylinder(5.6, new Circle(2.8));

        //circle.getArea();
        cylinder.getVolume();

        System.out.println(cylinder.getVolume());
    }
}


class Circle {
    public double radius; // 필드(==인스턴스)변수 선언
    public double PI = 3.141592; // 원주율
    // 생성자 구현
    public Circle(double radius) {
        this.radius = radius;
    }

    // 기능 구현
    public double getArea() {
        return radius * radius * PI;
        // 원의 면적을 구하는 공식 반지름*반지름*파이
    }
}

class Cylinder{
    public double height;

    Circle circle ;

    public Cylinder(double height, Circle circle) {
        this.height = height;
        this.circle = circle;
    }
    public double getVolume() {
        return height * circle.getArea();
    }
}





// 과제 3
//· 다음과 같은 객체 생성이 가능하도록 생성자를 구현하시오.
//ㆍ Cylinder cd = new Cylinder(new Circle(2.8), 5.6);

//public class HomeWork_Day5_2 {
//    //정답지
//    public void main(String[] args) {
//        // 반지름이 2.8 , 높이가 5.6의 원통의 부피를 출력
//        Circle cp = new Circle(2.8); // 반지름 2.8
//        Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
//        // Circle 생성자의 2.8, Cylinder 5.6
//        double height = 5.6; // radius 2.8 height 5.6
//
//        // 부피 구하는 법 : 원의 면적 * 높이 . >> 면적은 반지름+반지름+파이
//        System.out.println("부피 : "+(cp.getArea()*height));
//        System.out.println(cd.Volum()); // 동일한 결과
//    }
//}
//
//class Cylinder {
//    Circle cir;
//    double height;
//    public Cylinder(Circle cir,double height) {
//        this.cir=cir;
//        this.height=height;
//    } // 생성자 구현
//
//    public double Volum() {
//        return cir.getArea()*height; // 반지름과 높이를 곱함..
//    }
//
//}