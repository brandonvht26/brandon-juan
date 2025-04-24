public class Carro {
    public String marca;
    public double precio;
    public String modelo;
    public String placa;

    public Carro(String marca, double precio, String modelo, String placa){
        this.marca=marca;
        this.precio=precio;
        this.modelo=modelo;
        this.placa=placa;
    }
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("Placa" + placa);
        System.out.println("Precio: " + precio);

        System.out.println("--------------------");
    }

   public void frenar(){
       System.out.println("\n*FRENAR*\n\nEl carro" + marca +" "+ modelo " a frenado con exito\n");
    }
}
