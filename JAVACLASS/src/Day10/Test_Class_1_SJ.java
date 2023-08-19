package Day10;

public class Test_Class_1_SJ {
    //1. A objA = new objA(); 에 의해 생성되는 객체 objA의 멤버들을 모두 나열하라.
    //2. B objB = new objB(): 에 의해 생성되는 객체 objB의 멤버들을 모두 나열하라.
    //3. C objC = new objC(); 에 의해 생성되는 객체 objC의 멤버들을 모두 나열하라.
    //4. 클래스 D를 다음과 같이 작성하였을 때, 오류가 발생하는 라인을 모두 찾고 이유를 설명하라.
    /*
    class D extends C {
        public void f() {
            a = 1; // (1)
            set(10); // (2)
            b = 20; // (3)
            d = 30; // (4)
        }
    }
    */
    //(3) 이유:
}

class A_SJ {
    private int a;
    public void set(int a) { this.a = a; }
}

class B_SJ extends A_SJ {
    protected int b, c;
}

class C_SJ extends B_SJ {
    public int d, e;
}

class D_SJ extends C_SJ {
    public void f() {
        //a = 1; // (1)
        set(10); // (2)
        b = 20; // (3)
        d = 30; // (4)
    }
}