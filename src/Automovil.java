/*** Clase concreta que representa un automóvil dentro del sistema del concesionario.
 *                      Principios de POO aplicados:
 * - HERENCIA: Extiende de la superclase Vehiculos, reutilizando sus atributos y métodos.
 * - POLIMORFISMO: Sobrescribe (@Override) el métodotodo abstracto calcularPrecioFinal() para implementar la regla de negocio específica de los automóviles (descuento por combustible).
 * - ENCAPSULAMIENTO: Mantiene sus atributos propios como privados y controlados.
 */

public class Automovil extends Vehiculos {

    private int numeroPuertas;
    private String tipoCombustible;


    public Automovil(String placa, String modelo, String marca, double precioBase, int año, int i, String electrico) {
        super(placa, modelo, marca, precioBase, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
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
    @Override
    public double calcularPrecioFinal() {
        if (tipoCombustible != null && tipoCombustible.equalsIgnoreCase("Electrico")){
            return precioBase * 0.90;
        }
        return precioBase;
    }
}
