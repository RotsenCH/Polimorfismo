public class Autobus extends Vehiculo{
    private int numPlazas;
    public Autobus(String marca, String modelo, double precioALquiler, int numPlazas){
        super(marca, modelo, precioALquiler);
        setPlazas(numPlazas);
    }

    public void setPlazas(int numPlazas){
        this.numPlazas = numPlazas;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("\t" + "Plazas: " + numPlazas);
    }
}
