/*** Clase abstracta que representa la entidad base para la gestión de vehículos.
 *                              Principios de POO aplicados:
 * - Abstracción: Define los atributos generales y la plantilla del comportamiento (metodo abstracto calcularPrecioFinal) que deben cumplir las subclases.
 * - Encapsulamiento: Utiliza modificadores de acceso (protected/private) y métodos
 *   getters y setters con validaciones para proteger los atributos de estados inválidos.*/

public abstract class Vehiculos {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected double precioBase;
    protected int año;

    public Vehiculos(String placa, String modelo, String marca, double precioBase, int año) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.precioBase = precioBase;
        this.año = año;

        if (precioBase <= 0)  {
            System.out.println("Error: El precio base deb ser mayor a 0.");
            this.precioBase = 1;
        } else {
            this.precioBase = precioBase;
        }

        if(año <1900) {
            System.out.println("Error: El año del vehiculo no es valido.");
            this.año = año;
        }
    }


    public abstract double calcularPrecioFinal();

    public String mostrarFicha() {
        return  String.format("Placa: %s | Modelo: %s | Marca: %s | Año: %d | Precio Base: $%.2f", placa, modelo, marca, año, precioBase);
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if(precioBase <= 0 ) {
            System.out.println("Error: No se puede asignario un precio base negativo o cero.");
        } else {
            this.precioBase = precioBase;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if(año <1900) {
            System.out.println("Erros: El año " + año + "no es valido. ");
        } else {
            this.año = año;
        }

    }
}
