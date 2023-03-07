
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoLarhzialeNaid2223 miVehiculoLarhzialeNaid2223;
        int stockActual;
        
        miVehiculoLarhzialeNaid2223 = new VehiculoLarhzialeNaid2223("Seat",18000,100);
        operativaVehiculosLarhzialeNaid2223(miVehiculoLarhzialeNaid2223, 50); 
        stockActual = miVehiculoLarhzialeNaid2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosLarhzialeNaid2223(VehiculoLarhzialeNaid2223 miVehiculoLarhzialeNaid2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoLarhzialeNaid2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoLarhzialeNaid2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
