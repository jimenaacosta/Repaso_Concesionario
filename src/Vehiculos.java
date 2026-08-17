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

<<<<<<< HEAD
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
=======
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
>>>>>>> 9f59791ad5b98264ce576c800b01b192afa4823e
    }


    public abstract double calcularPrecioFinal();

    public String mostrarFicha() {
        return  String.format("Placa: %s | Modelo: %s | Marca: %s | Año: %d | Precio Base: $%.2f", placa, modelo, marca, año, precioBase);
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
<<<<<<< HEAD
        if(precioBase <= 0 ) {
            System.out.println("Error: No se puede asignario un precio base negativo o cero.");
        } else {
            this.precioBase = precioBase;
=======
        if(precioBase>0) this.precioBase = precioBase;
        else {
            System.out.println("El precio debe ser mayor a 0");
>>>>>>> 9f59791ad5b98264ce576c800b01b192afa4823e
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
<<<<<<< HEAD
        if(año <1900) {
            System.out.println("Erros: El año " + año + "no es valido. ");
        } else {
            this.año = año;
        }

=======
        if(1990<año && año<2027) this.año = año;
        else{
            System.out.println("el año no puede ser menor a 1990 ni mayor a 2026");
        }
    }

    public abstract double calcularPrecioFinal();

    public String mostrarFicha() {
        return "Placa = " +placa +" Marca = " +marca +" Modelo = "+ modelo+ " Año = "+año ;
>>>>>>> 9f59791ad5b98264ce576c800b01b192afa4823e
    }
}
