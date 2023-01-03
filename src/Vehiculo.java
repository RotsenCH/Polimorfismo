public class Vehiculo{
    private String marca, modelo;
    private double precioAlquiler;

    public Vehiculo(String marca, String modelo, double precioALquiler){
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquiler = precioALquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler){
        this.precioAlquiler = precioAlquiler;
    }

    public void imprimirAtributos(){
        System.out.println("Modelo: " + marca + " " + modelo + "\t" + "precio: " + precioAlquiler);
    }
}
