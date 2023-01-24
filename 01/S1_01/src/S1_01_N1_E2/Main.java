package S1_01_N1_E2;

public class Main {
    public static void main(String[] args) {

        //Crea una classe "Cotxe" amb els atributs:
        // marca, model i potència.
        // La marca ha de ser estàtic final, el model estàtic i la potència final.
        // Demostra la diferència entre els tres.
        // N’hi ha algun que es pugui inicialitzar al constructor de la classe?

        //La Marca static final li assigno valor en la classe sense instanciar-la. No puc canviar el valor
        //El model li puc assignar valor en la classe sense instanciar-la. Puc anviar el seu valor.

        Car.model = "LEON";
        System.out.println("Marca: " + Car.brand + " model: " + Car.model);

        //Invocar el mètode estàtic
        System.out.println(Car.frenar());

        //Invocar el mètode no estàtic
        //Li dono el valor de la potència al crear la instància
        Car car = new Car(1000.0);
        System.out.println(car.accelerar());

    }
}