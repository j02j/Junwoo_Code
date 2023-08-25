package Day13;

public class Polymorphism {
    public static void main(String[] args){
        Book b = new Novel("메타버스 소설","출판사(IT)");
        Book c = new SF("메타버스", "SF출판사");

        Book bb = new Novel("소설","소설출판사");
        bb.print();

        Book cc = new SF("메타버스", "SF출판사");
        cc.print();

        if(c instanceof SF){
            c.print();
        }
        if(b instanceof Novel){
            b.print();
        }
    }
}

class Book{
    public String name;
    public String publisher;
    Book(){
        this.name = "";
        this.publisher = "";
    }
    Book(String name, String publisher){
        this.name = name;
        this.publisher = publisher;
    }
    void print(){
        System.out.println("print : Book");
    };
}

class Novel extends Book{
    public String name;
    public String publisher;
    Novel(String name, String publisher){
        super(name, publisher);
    }
    @Override
    void print(){
        System.out.println("print : Novel");
    }
}

class SF extends Book{
    public String name;
    public String publisher;
    SF(String name, String publisher){
        super(name, publisher);
    }
    @Override
    void print(){
        System.out.println("print : SF");
    }
}