package S1_01_N2_E1;

import S1_01_N2_E1.domain.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("IPHONE", "12");
        System.out.println(smartphone.soundAlarm());
        System.out.println(smartphone.takePhotography());
        System.out.println(smartphone.callPhone("931234567"));

    }
}