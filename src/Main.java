import java.util.ArrayList;

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

        agregarVehiculo(inventario, new Motocicleta("YHT876", "MT7", "Yamaha", 25000000, 2023, 689));

        agregarVehiculo(inventario,new CamionCarga("CAT234", "T800", "KIA", 170000000, 2024, 12.0));

        listarInventario(inventario);

        double total = calcularValorTotalInventario(inventario);
        System.out.println(String.format("VALOR DEL INVENTARIO: $%.2f \n", total));

        System.out.println("BUSCAR VEHICULO POR PLACA (YHT876)");
        Vehiculos encontrado = buscarPorPlaca(inventario, "YHT876");
        if(encontrado != null) {
            System.out.println(String.format("Precio Final: $%.2f", encontrado.calcularPrecioFinal()));
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
    }

}
