package Day11;

public class GameEx {
    public static void main(String[] args){

    }
}

class Marine_SJ{ //보병
    int x, y; //현재 위치
    void move(int x, int y)     {/*지정된 위치로 이동*/}
    void stop()                 {/*현재 위치에 정지*/}
    void stimPack()             {/*스팀팩을 사용한다.*/}
}

class Tank_SJ{ //탱크
    int x, y; //현재 위치
    void move(int x , int y)    {/*지정된 위치로 이동*/}
    void stop()                   {/*현재 위치에 정지*/}
    void changeMode()           {/*공격모드를 변환한다.*/}
}

class Trooper_SJ{ //수송선
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