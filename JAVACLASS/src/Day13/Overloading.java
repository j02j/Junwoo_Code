package Day13;

public class Overloading {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.Meow();
        cat.Meow("Haku");
        cat.Meow(5, "Nagi");
        cat.Meow("Poki", 7, 3);
    }
}

class Cat {
    public void Meow(){
        System.out.println("Meow");
    }

    public void Meow(String name){
        System.out.println(name + " said Meow.");
    }

    public void Meow(int num, String name){
        System.out.println(name + " said Meow for "+ num + " times.");
    }

    public void Meow(String name, int num, int age){
        System.out.println("An " + age + "-year-old cat," + name + " said Meow for "+ num + " times.");
    }

}