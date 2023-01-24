package S1_01_N1_E1.instruments;

public class StringI extends Instrument {

    public StringI(String name,
                   Double price) {
        super(name, price);
    }

    public String playInstrument() {
        return "Està sonant un instrument de corda";
    }
}
