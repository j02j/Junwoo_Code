package Day7;
/*
1. 다음을 만족하는 클래스 SalaryMan을 작성하시오.
·          필드 salary는 월 급여액를 저장하며, int형으로 초기 값으로 1000000 저장
·          메소드 getAnnualGross()는 연봉을 반환하는 메소드로 월급에 보너스 500%로 계산
·          기본 생성자에서 필드 salary의 초기 값을 사용하며, 정수형 인자인 생성자에서 인자가 월 급여액으로 지정
·          다음과 같이 객체를 생성하여 메소드 getAnnualGrass()를 호출하여 출력
       System.out.println(new SalaryMan().getAnnualGross());
	        System.out.println(new SalaryMan(2_000_000).getAnnualGross());
*/
public class Question_1 {
    public static void main(String[] args) {

        SalaryMan user = new SalaryMan();
        user.salary = 1500000;
        // 연봉 1800만 * 보너스 750만  // 최저도 못받는 인생인데 보너스가 쎄네
        System.out.println(user.getAnnualGross());
        System.out.println();
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2000000).getAnnualGross());


    }
}
class SalaryMan {
    int salary;
    //월 급여 액 저장 초기값 1,000,000 저장
    SalaryMan(){
        this.salary = 1000000;
    }
    SalaryMan(int salary){ // 생성자에서 인자 월 급여액을 지정하기 위한 재정의
        this.salary=salary;
    }
    public int getAnnualGross() { // 연봉.. 연봉은 월 * 12 인데
        // 보너스 500%를 수령해야 하니까 5.0을 곱해야하지만 int 정수형이므로 5만 곱하고

        return (this.salary*12)+(this.salary*5); // 연봉 + 500% 보너스 수령
        // 연봉 리턴
    }
}
