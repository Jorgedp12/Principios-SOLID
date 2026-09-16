package ISP;

public class App {
    public static void main(String[] args) {
        System.out.println("________________________________________");
        Carro car = new Carro();
        car.andarEnTierra();
        System.out.println("________________________________________");
        Avioneta avi = new Avioneta();
        avi.andarEnTierra();
        avi.volar();
        System.out.println("________________________________________");
        VehiculoAnfibio anfi = new VehiculoAnfibio();
        anfi.andarEnTierra();
        anfi.navegar();
        System.out.println("________________________________________");


    }
}
