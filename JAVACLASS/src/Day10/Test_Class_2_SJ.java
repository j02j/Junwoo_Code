package Day10;

public class Test_Class_2_SJ {
//    -class MobilePhone : 전화걸기, 전화받기, 무선 기지국 연결, 배터리 충전하기
//    -class MusicPhone : 전화걸기, 전화받기, 무선기지국 연결, 배터리 충전하기, 음악다운받기, 음악재생하기
//    MobilePhone을 상속하는 MusicPhone에 관하여, 모든 Music 메소드를 출력하라.
    public static void main(String[] args) {
        MusicPhone_SJ mp = new MusicPhone_SJ();
        mp.calling("010-0000-0000");
        mp.getACall("010-0000-0000");
        mp.connectToWirelessBaseStation();
        mp.chargeBattery(76);
        mp.downloadMusic();
        mp.playMusic();
    }
}

class MobilePhone_SJ {
    protected String phoneNumber;
    protected int batteryPercent;
    public void calling (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("Call " + phoneNumber + ".");
    }

    public void getACall (String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("Get a call from " + phoneNumber + ".");
    }

    public void connectToWirelessBaseStation () {
        System.out.println("Connect to wireless base station.");
    }

    public void chargeBattery(int batteryPercent) {
        this.batteryPercent = batteryPercent;
        System.out.println("This phone has " + batteryPercent + "% battery left.");
    }

}

class MusicPhone_SJ extends MobilePhone_SJ {
    public void downloadMusic() {
        System.out.println("Download music.");
    }

    public void playMusic() {
        System.out.println("Play music.");
    }
}