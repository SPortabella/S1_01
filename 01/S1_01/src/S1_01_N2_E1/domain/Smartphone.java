package S1_01_N2_E1.domain;

public class Smartphone extends Phone implements Watch,Camera{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

}
