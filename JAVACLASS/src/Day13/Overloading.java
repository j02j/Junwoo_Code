package Day13;

public class Overloading {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.Meow();
        cat.Meow("Haku");
        cat.Meow("Nagi", 5);
        cat.Meow("Poki", 7, 3);
    }
}

class Cat {
    public void Meow(){
        System.out.print("Meow");
    }

    public void Meow(String name){
        System.out.print(name + "said Meow.");
    }

    public void Meow(String name, int num){
        System.out.print(name + "said Meow for "+ num + "times.");
    }

    public void Meow(String name, int num, int age){
        System.out.print("An " + age + "-year-old cat," + name + "said Meow for "+ num + "times.");
    }

}