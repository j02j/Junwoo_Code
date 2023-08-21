package Day11;

public class GameEx_SJ {
    public static void main(String[] args){
        Marine m = new Marine();
        m.setX("marine", 10);
        m.setY("marine", 20);
        m.move("Marine", 20, 10);
        m.stop("marine");
        m.stimPack();


    }
}
class Unit{
    String unit;
    int x;
    int y;
    void move(String unit, int x, int y) {
        this.unit = unit;
        this.x = x;
        this.y = y;
        System.out.println(unit + " moved " + x + " to x-axis and " + y + " move to y-axis.");
    }
    void stop(String unit) {
        this.unit = unit;
        System.out.println("stop " + unit);

        }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(String unit, int x) {
        this.x = x;
        this.unit = unit;
        System.out.println("initial x position of " + unit + ": " + x);
    }
    public void setY(String unit, int y) {
        this.y = y;
        this.unit = unit;
        System.out.println("initial y position of " + unit + ": " + y);
    }
}
class Marine extends Unit{ //보병
    void stimPack()  {
        System.out.println(unit + " use stim pack.");
    }            {/*스팀팩을 사용한다.*/}
}

class Tank{ //탱크
    int x, y; //현재 위치
    void move(int x , int y)    {/*지정된 위치로 이동*/}
    void stop()                   {/*현재 위치에 정지*/}
    void changeMode()           {/*공격모드를 변환한다.*/}
}

class Trooper{ //수송선
    int x, y; //현재위치
    void move(int x, int y)     {/*지정된 위치로 이동한다.*/}
    void stop()                 {/*현재 위치에 정지한다.*/}
    void load()                 {/*선택한 대상을 태운다*/}
    void unload()               {/*선택된 대상을 내린다.*/}
}

//<출력내용>
//    Marine 위치 : 10 , 20
//    Marine 위치  이동 : 20 , 10
//    Marine 현재 위치에서 정지
//    Marine 은 스팀팩을 사용합니다
//
//    Tank 위치 : 100 , 200
//    Tank 위치  이동 : 50 , 250
//    Tank 현재 위치에서 정지
//    Tank가 공격모드를 전환합니다
//
//    Dropship 위치 : 1000 , 2000
//    Dropship 위치  이동 : 900 , 1500
//    Dropship 현재 위치에서 정지
//    Dropship, Marine의 위치 (20 , 10) 에서  Marine을 태웠습니다
//    Dropship, Tank의 위치 (50 , 250) 에서  Tank 병을 내렸습니다