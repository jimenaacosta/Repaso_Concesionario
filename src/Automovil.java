public class Automovil extends Vehiculos {

    private int numeroPuertas;
    private String tipoCombustible;


    public Automovil(String placa, String modelo, String marca, int año, double precioBase) {
        super(placa, modelo, marca,año, precioBase);
        if(!setNumeroPuertas(numeroPuertas) || !setTipoCombustible(tipoCombustible)){
            throw new IllegalArgumentException("Parametros invalido para Automovil.");
        }
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean setNumeroPuertas (int numeroPuertas) {
        if(numeroPuertas >= 2 && numeroPuertas <= 5) {
            this.numeroPuertas = numeroPuertas;
            return true;
        }
        System.out.println("Error: El numero de puertas debe estar entre 2 y 5.");
        return false;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public boolean setTipoCombustible(String tipoCombustible) {
        if(tipoCombustible != null && (tipoCombustible.equalsIgnoreCase("Gasolina") || tipoCombustible.equalsIgnoreCase("Disel") || tipoCombustible.equalsIgnoreCase("Electrico"))) {
            this.tipoCombustible = tipoCombustible;
            return true;
        }
        System.out.println("Error: El combustible debe ser Gasolina, Disel o Electrico.");
        return false;
    }
}
