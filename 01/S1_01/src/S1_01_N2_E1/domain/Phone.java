package S1_01_N2_E1.domain;

public class Phone implements Watch, Camera {

    public String brand;
    public String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String callPhone(String numPhone) {
        return ("Estic trucant al número: " + numPhone);
    }

    @Override
    public String soundAlarm() {
        return "Està sonant l’alarma";

    }

    @Override
    public String takePhotography() {
        return "S’està fent una foto";
    }
}
