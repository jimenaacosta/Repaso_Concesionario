public abstract class Vehiculos {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected double precioBase;
    protected int año;

    public Vehiculos(String placa, String marca, String modelo, int año, double precioBase)  {
        if(placa != null )this.placa = placa;
        else{System.out.println("la placa no puede estar vacia");}

        if(modelo != null)this.modelo = modelo;
        else{System.out.println("El modelo no puede estar vacio");}

        if(marca != null)this.marca = marca;
        else{System.out.println("La marca no puede estar vacia");}

        if(precioBase>0)this.precioBase = precioBase;
        else{System.out.println("El precio no puede ser menor a 0");}

        if(1990 < año && año< 2027) this.año = año;
        else{System.out.println("El año no puede ser menor a 1990 ni mayo a 2026");}
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null){
            this.placa = placa;
        }else{
            System.out.println("la placa esta vacia");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("el modelo esta vacio");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) this.marca = marca;
        else{
            System.out.println("la marca esta vacia");
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if(precioBase>0) this.precioBase = precioBase;
        else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if(1990<año && año<2027) this.año = año;
        else{
            System.out.println("el año no puede ser menor a 1990 ni mayor a 2026");
        }
    }

    public abstract double calcularPrecioFinal();

    public String mostrarFicha() {
        return "Placa = " +placa +" Marca = " +marca +" Modelo = "+ modelo+ " Año = "+año ;
    }
}
