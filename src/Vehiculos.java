/* Clase abstracta que representa la entidad base para la gestión de vehículos.
 *                              Principios de POO aplicados:
 * - Abstracción: Define los atributos generales y la plantilla del comportamiento (metodo abstracto calcularPrecioFinal) que deben cumplir las subclases
 * - Encapsulamiento: Utiliza modificadores de acceso (protected/private) y métodos
 *   getters y setters con validaciones para proteger los atributos de estados inválidos
 * */
public abstract class Vehiculos {

    // atributos que van a heredar las otras clases
    protected String placa;
    protected String modelo;
    protected String marca;
    protected double precioBase;
    protected int año;

    // constructor
    public Vehiculos(String placa, String modelo, String marca, double precioBase, int año) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("error: La placa no puede estar vacia");
        }

        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("error: El modelo no puede estar vacio");
        }

        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("error: La marca no puede estar vacia");
        }

        if (precioBase > 0) {
            this.precioBase = precioBase;
        } else {
            System.out.println("error: El precio base debe ser mayor a 0");
        }

        if (año >= 1990 && año <= 2026) {
            this.año = año;
        } else {
            System.out.println("error: El año no puede ser menor a 1990 ni mayor a 2026");
        }
    }

    // metodo de mostrar ficha
    public String mostrarFicha() {
        return "Placa: " + placa + " / Marca: " + marca + " / Modelo: " + modelo + " / Año: " + año;
    }

    // getters y setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("error: La placa está vacia");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("wrror: El modelo está vacio");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("error: La marca está vacia");
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase > 0) {
            this.precioBase = precioBase;
        } else {
            System.out.println("error: El precio debe ser mayor a 0");
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año >= 1990 && año <= 2026) {
            this.año = año;
        } else {
            System.out.println("error: El año no puede ser menor a 1990 ni mayor a 2026");
        }
    }
        // metodo abstracto de calcular los precios que van a usar las otras clases
    public abstract double calcularPrecioFinal();
}