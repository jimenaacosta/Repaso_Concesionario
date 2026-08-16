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
        return 0;
    }
}
