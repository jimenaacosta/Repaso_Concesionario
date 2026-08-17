import java.util.ArrayList;

/** Clase rincial que actua como unto de entrega y controlador de la alicacion.
 *                    Princios de POO palicados:
 * -POLIMORFISMO EN COLECCIONES: Utiliza un ArrayList de la super (ArrayList<Vehiculos>) para almacenar y maniular de forma uniforme objetos de subclases distintas (Automovil, CamionCarga, Motocicleta)
 * -ENCAPSULAMIENTO: Demuestra la proteccion del modelo probando asignaciones de datos invalidos*/

public class Main {

    public static void agregarVehiculo(ArrayList<Vehiculos> inventario, Vehiculos v )  {
        if (v != null) {
            inventario.add(v);
        }
    }
    public static void listarInventario(ArrayList<Vehiculos> inventario) {
        System.out.println("=== Inventario Automovil S.A.S. ===");
        for (Vehiculos v : inventario) {
            System.out.println(v.mostrarFicha());
            System.out.println(String.format("Precio final:$%,.0f", v.calcularPrecioFinal()));
        }
    }
    public static double calcularValorTotalInventario(ArrayList<Vehiculos> inventario) {
        double total = 0;
        for(Vehiculos v : inventario) {
            total += v.calcularPrecioFinal();
        }
        return total;
    }
    public static Vehiculos buscarPorPlaca(ArrayList<Vehiculos> inventario, String placa)  {
        for(Vehiculos v : inventario)  {
            if(v. getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayList<Vehiculos>inventario = new ArrayList<>();


        agregarVehiculo(inventario, new Automovil("DAM982", "3", "Chervrolet",  38000000, 2023, 4, "Gasolina"));
        agregarVehiculo(inventario, new Automovil("SOF754", "3", "Mazda",  87000000,  2025, 4, "Electrico"));

        agregarVehiculo(inventario,new CamionCarga("CAT234", "T800", "KIA", 170000000, 2024, 12.0));
        agregarVehiculo(inventario, new CamionCarga("MAA738", "LHR", "Forland", 88990000, 2023, 5.5) );
        listarInventario(inventario);

        double total = calcularValorTotalInventario(inventario);
        System.out.println(String.format("VALOR DEL INVENTARIO: $%.2f \n", total));


        System.out.println("==BUSCAR VEHICULO POR PLACA (DAM982)==");
        Vehiculos encontrado = buscarPorPlaca(inventario, "CAT234");
        if(encontrado != null) {
            System.out.println(String.format("Precio Final: $%.2f", encontrado.calcularPrecioFinal()));
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
        System.out.println("==PRUEBA DE ENCAPSULAMIENTO==");
        try {
            Vehiculos vehiculosInvalido = new Automovil("ERR00", "X", "Ficticio", -5000000, 1500, 4, "Gasolina");
            agregarVehiculo(inventario, vehiculosInvalido);
        }catch (Exception e) {
            System.out.println("Error detectado: El encasulamiento protegido el objeto invalidos.");
        }
    }

}
