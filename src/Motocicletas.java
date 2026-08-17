public class Motocicletas extends Vehiculos{
    private int cilindraje;

    public Motocicletas(String placa, String modelo, String marca, double precioBase, int año, int cilindraje) {
        super(placa, marca, modelo, precioBase, año);
        if(cilindraje>0)this.cilindraje = cilindraje;
        else{System.out.println("El cilindraje debe ser mayor a 0");}
    }

    public double calcularPrecioFinal(){
        double precioFinal = getPrecioBase() + (getPrecioBase() * 0.03);
        if (cilindraje > 500) {            //se le suma el 2% si es de mas de 500cc
            precioFinal += getPrecioBase() * 0.02;
        }
        return precioFinal;
    }

    public String mostrarFicha() {
        return super.mostrarFicha() + " tipo : Motocicleta , Cilindraje : "+cilindraje +"cc";
    }
}
