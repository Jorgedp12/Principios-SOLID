package ISP;

public class VehiculoAnfibio implements Terrestre, Acuatico {
    @Override
    public void andarEnTierra(){
        System.out.println("El anfibio anda por la tierra. ");
    }

    @Override 
    public void navegar(){
        System.out.println("El anfibio navega en el agua. ");
    }
}   
