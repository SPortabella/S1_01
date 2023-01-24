package S1_01_N1_E1;

import S1_01_N1_E1.instruments.Instrument;
import S1_01_N1_E1.instruments.PercussionI;
import S1_01_N1_E1.instruments.WindI;

public class Main {

    public static void main(String[] args) {
        Instrument instrument = new WindI("Flauta", 5.0);
        System.out.println(instrument.playInstrument());

        //Crida al mètode estàtic.
        System.out.println(PercussionI.percussion);
        //Executa el bloc estàtic
        Instrument instrument1 = new PercussionI("Tambor", 10.0);
        //Executa bloc d'inicialització
        System.out.println(instrument1.playInstrument());

    }


}