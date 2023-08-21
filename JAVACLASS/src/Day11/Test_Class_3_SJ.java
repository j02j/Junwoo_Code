package Day11;

public class Test_Class_3_SJ {

    //    x,y의 한점을 표현하는 Point클래스와 이를 상속 받아 점을 추가한 ColorPoint클래스를 만들어라.
//-class Point : 한점을 구성하는 x,y좌표, 점을 출력하는 메소드
//-class ColorPoint : 한점을 구성하는 x,y좌표, 점을 출력하는 메소드, 점의 색깔, 컬러 점의 좌표 출력하는 메소드
    public static void main(String[] args) {
        Point p = new Point();
        p.xAndy(1, 2);

        ColorPoint cp = new ColorPoint();
        cp.xAndy(4,5);
        cp.colorOfPoint("red");
    }
}

class Point {
    protected int x;
    protected int y;
    public void xAndy (int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("x coordinate: " + x);
        System.out.println("y coordinate: " + y);

        System.out.println("(" + x + " ," + y + ")");
    }
}

class ColorPoint extends Point{
    protected String color;
    protected int z;
    protected int k;

    @Override
    public void xAndy(int x, int y) {
        System.out.println("color x coordinate: " + x);
        System.out.println("color y coordinate: " + y);

        System.out.println("(" + x + ", " + y + ")");
    }

    public void colorOfPoint(String color){
        this.color = color;
        System.out.println("The color of the point is " + color);
    }

    public void coordinateOfColorPoint(int z, int k) {
        this.z = z;
        this.k = k;
        System.out.println("z color point coordinate: " + z);
        System.out.println("k color point coordinate: " + k);
    }

}
