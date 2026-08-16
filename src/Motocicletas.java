public class Motocicletas extends Vehiculos{
    private int cilindraje;

    public Motocicletas(int cilindraje,String placa, String marca, String modelo, int año, double precioBase) {
        super(placa, marca, modelo, año, precioBase);
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
        return super.mostrarFicha() + "tipo : Motocicleta , Cilindraje : "+cilindraje;
    }
}
