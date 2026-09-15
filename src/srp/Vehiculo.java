package srp;

public class Vehiculo {
    private String marca;
    private int velocidadMax;

    public Vehiculo(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar(){
        System.out.println(marca + " está acelerando");
    }

    public String getMarca() {
        return marca;
    }
    
    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

}
