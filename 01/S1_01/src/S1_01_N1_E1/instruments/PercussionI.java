package S1_01_N1_E1.instruments;

public class PercussionI extends Instrument{

    public PercussionI(String name, Double price) {
        super(name, price);
    }
    static { System.out.println("Bloc estàtic d'inicialització a la classe percusió");

    }
    {
        System.out.println("Bloc d'inicialització a la classe percusió");
    }
    @Override
    public String playInstrument() {
        return "Està sonant un instrument de percussió";
    }

    public static String percussion = "Està sonant un instrument de percussió";

}
