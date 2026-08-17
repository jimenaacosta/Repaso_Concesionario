/**Clase concreta que preresenta un camion de carga del concesionario
 *                      Princiios de  POO aplicados:
 * -HERENCIA: Reutiliza la estructura general de la superclase Vehiculos.
 * -POLIMORFISMO: Redefine el metodo calcularPrecioFinal()para plicar recargos adicionales basados en la capacidad de tonelaje
 * -ENCAPSULAMIENTO: Protege el atributo propio capacidadToneladas mediante visibilidad privada.*/

public class CamionCarga extends Vehiculos {
    private double capacidadToneladas;

    public CamionCarga (String placa, String modelo, String marca, double precioBase, int año, double caacidadToneladas) {
        super(placa, modelo, marca, precioBase, año);
        this.capacidadToneladas = caacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public boolean setCapacidadToneladas(double capacidadToneladas) {
        if(capacidadToneladas > 0) {
            this.capacidadToneladas = capacidadToneladas;
            return true;
        }
        System.out.println("Error: La capacidad debe ser mayor a 0.");
        return false;
    }

    @Override
    public double calcularPrecioFinal() {
        if(capacidadToneladas > 10.0) {
            return precioBase * 1.05;
        }
        return precioBase;
    }
}
