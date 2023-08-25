package Day13;

public class Overriding {
    public static void main(String[] args) {

        //Job 객체 생성
        Job job = new Job();

        //변수 설정
        job.name = "유리";
        job.age = 30;
        job.job = "프로그래머";

        //호출
        job.info();

    }
}

class Woman{ //부모클래스
    public String name;
    public int age;

    //info 메서드
    public void info(){
        System.out.println("여자의 이름은 "+name+", 나이는 "+age+"살입니다.");
    }

}

class Job extends Woman{

    String job;

    @Override
    public void info() {
        super.info();
        System.out.println("여자의 직업은 "+job+"입니다.");
    }
}

