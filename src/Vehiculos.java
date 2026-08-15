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
        this.precioBase = precioBase;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
