package Day9;

public class Man_SJ {
    String name;

    public void tellYourName() {System.out.println("My name is " + name);
    }
}

class BusinessMan_SJ extends Man_SJ{
    String company;
    String position;

    public void tellYourInfo() {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYourName();
    }
}