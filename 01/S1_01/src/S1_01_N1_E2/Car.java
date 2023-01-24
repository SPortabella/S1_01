package S1_01_N1_E2;

public class Car {
    //marca, model i potència.
    // La marca ha de ser estàtic final, el model estàtic i la potència final.
    static final String brand = "SEAT";
    static String model = "IBIZA";
    final Double power;

    public Car(Double power) {
        this.power = power;
    }

    public static String frenar(){
        return "El vehicle està frenant";
    }

    public String accelerar(){
        return "El vehicle està accelerant";
    }
}
