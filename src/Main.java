import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo("Mercedes","E",55));
        listaVehiculos.add(new Autobus("Marca","A", 100, 20));
        listaVehiculos.add(new Turismo("Marca", "B",2,3));
        listaVehiculos.add(new Turismo("Marca", "C",2,3));
        listaVehiculos.add(new Turismo("Marca", "D",2,3));
        listaVehiculos.add(new Turismo("Marca", "E",2,3));
        listaVehiculos.add(new Turismo("Marca", "F",2,3));
        listaVehiculos.add(new Vehiculo("Audi", "A3", 30));
        imprimirLista((ArrayList)listaVehiculos);

        boolean pausa = false;

        try{
            while (!pausa){
                int opcion = menuPrincipal();
                String marca, modelo;
                double precioAlquieler;
                int numPlazas, numPuertas;

                switch(opcion){
                    case 1:{
                        System.out.print("Ingresa la marca: ");
                        marca = sc.next();
                        System.out.print("Ingresa el modelo: ");
                        modelo = sc.next();
                        System.out.print("Ingresa el precio de alquiler: ");
                        precioAlquieler = sc.nextDouble();
                        listaVehiculos.add(new Vehiculo(marca,modelo,precioAlquieler));
                    }break;

                    case 2:{
                        System.out.print("Ingresa la marca: ");
                        marca = sc.next();
                        System.out.print("Ingresa el modelo: ");
                        modelo = sc.next();
                        System.out.print("Ingresa el precio de alquiler: ");
                        precioAlquieler = sc.nextDouble();
                        System.out.print("Ingresa el numéro de Plazas");
                        numPlazas = sc.nextInt();

                        listaVehiculos.add(new Autobus(marca, modelo, precioAlquieler, numPlazas));
                    }break;

                    case 3:{
                        System.out.print("Ingresa la marca: ");
                        marca = sc.next();
                        System.out.print("Ingresa el modelo: ");
                        modelo = sc.next();
                        System.out.print("Ingresa el precio de alquiler: ");
                        precioAlquieler = sc.nextDouble();
                        System.out.print("Ingresa el numéro de Puertas: ");
                        numPuertas = sc.nextInt();
                    }break;

                    case 4:{
                        System.out.print("Saliendo....");
                        pausa = true;
                    }break;

                }
            }
        } catch (Exception ex) {
            System.out.println("\n\tTipo de dato ingresado incorrectamente!!!" + ex.getLocalizedMessage());
        } finally {
            System.out.println("Programa Finalizado...");
        }
    }

    private static void imprimirLista(ArrayList lista){
        for (int i = 0; i < lista.size(); i++){
            Vehiculo v = (Vehiculo)lista.get(i);

            v.imprimirAtributos();

            System.out.println("");
        }
    }

    private static int menuPrincipal(){
        int opPrincipal = 0;//Variable para el menu
        System.out.println("\t\t\t\t\t\t*** MENU ***");
        System.out.println("\t\t1. Ingresar Vehiculo");
        System.out.println("\t\t2. Ingresar Autobus");
        System.out.println("\t\t3. Ingresar Turismo");
        System.out.println("\t\t4. Salir");
        System.out.print("\t\t\tOpcion?: ");
        opPrincipal = sc.nextInt();
        while((opPrincipal < 1) || (opPrincipal > 4)){
            System.out.print("\t\tIngrese una opcion entre 1-4: ");
            opPrincipal = sc.nextInt();
        }
        return opPrincipal;
    }
}