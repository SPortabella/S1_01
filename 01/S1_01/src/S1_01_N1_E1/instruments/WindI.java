package S1_01_N1_E1.instruments;

public class WindI extends Instrument {

    public WindI(String name,
                 Double price) {
        super(name, price);
    }

    @Override
    public String playInstrument() {return "Està sonant un instrument de vent";}

}
