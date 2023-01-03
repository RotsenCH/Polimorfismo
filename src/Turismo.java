public class Turismo extends Vehiculo{
    private int numPuertas;

    public Turismo(String marca, String modelo, double precioAlquiler, int numPuertas){
        super(marca, modelo, precioAlquiler);
        setPuertas(numPuertas);
    }

    public void setPuertas(int numPuertas){
        this.numPuertas = numPuertas;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("\t" + "Puertas: " + numPuertas);
    }
}
