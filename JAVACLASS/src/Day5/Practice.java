package Day5;

public class Practice {
    public static void main(String[] arg)    {
        A house1 = new A();
//        A house2 = new B(); //Error!
//        A house3 = new C(); //Error!
        A house4 = new D();

        A house11 = new A();
//        B house22 = new A(); //Error!
//        C house33 = new A(); //Error!
//        D house44 = new A(); //Error!

    }
}

class A{
    public int roomA;
    public int roomB;
    public void clean(){

    }
}

class B{
    public int roomA;
    public int roomB;

    public void clean(){

    }
    public void roomsrv(){

    }
}
class C{
    public int roomA;
    public int roomB;
    public int roomC;

    public void clean(){

    }
}

class D extends  A{
    public void vaccum(){

    }
}