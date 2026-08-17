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
        System.out.println("Inventario Automoviles");
        for (Vehiculos v : inventario) {
            System.out.println(v.mostrarFicha());
            System.out.println(String.format("Precio final: $%,.0f", v.calcularPrecioFinal()));
            System.out.println("  ");
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

        //se agregan dos automoviles
        agregarVehiculo(inventario, new Automovil("QQU982", "3", "Tesla",  120900000, 2025, 4, "Elelectrico"));
        agregarVehiculo(inventario, new Automovil("BKT754", "3", "Mazda",  87000000,  2020, 4, "Gasolina"));
        //se agregan dos camiones
        agregarVehiculo(inventario,new CamionCarga("CKT234", "T800", "KIA", 170000000, 2024, 12.0));
        agregarVehiculo(inventario, new CamionCarga("MAA738", "LHR", "Forland", 88990000, 2023, 5.5) );
        //se agregan dos motocicletas
        agregarVehiculo(inventario, new Motocicletas("NXM18F", "MT-09", "Yamaha", 45000000, 2024, 890));
        agregarVehiculo(inventario, new Motocicletas("SUB45H", "Gixxer 250", "Suzuki", 14500000, 2023, 249));

        listarInventario(inventario);


        double total = calcularValorTotalInventario(inventario);
        System.out.println(String.format("Valor total de inventario: $%,.0f \n", total));
        System.out.println("  ");


        System.out.println("--Buscar vehiculo por placa: ");
        Vehiculos encontrado = buscarPorPlaca(inventario, "QQU982");
        if(encontrado != null) {
            System.out.println(encontrado.mostrarFicha());
            System.out.println(String.format("Precio Final: $%,.0f", encontrado.calcularPrecioFinal()));
            System.out.println("  ");
        } else {
            System.out.println("Vehiculo no encontrado.");
        }

        System.out.println("--Prueba de validacion");
        try {
            Vehiculos vehiculosInvalido = new Automovil("AXY753", "X", "ferrari", 0, 1500, 8, "Hibrido");
            agregarVehiculo(inventario, vehiculosInvalido);
        }catch (Exception e) {
            System.out.println("Error de validacion, objeto invalidos.");
        }
    }

}