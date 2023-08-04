package Day5;

public class Class {
    //class 클래스명{ }

    public static void main(String[] args) {

        //생성자가 없는 경우
        //Student student1 = new Student();

        //생성자가 있는 경우
        Student student2 = new Student("홍길동", 18, 100, 90, 80);

        Student student = new Student("전지현", 18, 100, 90, 80);
        student.printScore(); //인스턴스 메소드 호출
    }
}

class Student{
    //필드(Field)
    String name; //이름
    int age; //나이
    int korean_scroe; //국어성적
    int math_score; //수학성적
    int english_score; //영어성적

    //생성자(Constructor)
    Student(String name, int age, int kor_score, int mat_score, int eng_score){
        this.name = name;
        this.age = age;
        this.korean_scroe = kor_score;
        this.math_score = mat_score;
        this.english_score = eng_score;
    }

    //메소드(Method)
    public void printScore() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("국어성적 : " + korean_scroe);
        System.out.println("수학성적 : " + math_score);
        System.out.println("영어성적 : " + english_score);
    }
}