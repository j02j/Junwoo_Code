package Day13;

public class SmallTest_2 {
/*  연봉 구하기
    어느덧 졸업을 하고 직장인이 된 박컴공(28)씨. 이제는 어엿한 개발 3년차가 되었다. 개발자들의 연봉은 개발 년차에 따라 정해 지는데..

    <문제>
    개발자의 연봉을 구하는 프로그램을 작성해주세요.

    <요구사항>
    -개발자(Developer)는 이름과 경력(년차) 정보를 갖는다.
    -개발자는 경력에 따라 초급(3년 미만)/중급(7년 미만)/고급(7년이상)의 단계로 나뉜다.
    -연봉은 아래의 공식을 따른다
    -연봉 = 단계별 기준연봉 + (100 * 경력)
    -단계별 기준연봉은 초급(2800) / 중급(3500) / 고급(4500) 으로 함.

    Developer{
       String name;
       String career;

       void level(); -함수는 반환형이 바뀌어도 상관이 없다.
       void salary();
    }

    <뼈대코드>
    public class Developer {
        // 1: 필드를 구현하세요.
        // 2: 생성자를 구현하세요.
        // 3: 메소드를 구현하세요.
        public static void main(String[] args) {
            Developer tom = new Developer("Tom", 2);
            Developer john = new Developer("John", 5);
            Developer sally = new Developer("Sally", 9);
            System.out.println(tom.salary());
            System.out.println(john.salary());
            System.out.println(sally.salary());
        }
    }

    <출력 목표>
    -3000
    -4000
    -5400
    */
}
