/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;
/**
 *
 * @author leonor
 */
public class Main {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        miLibreriaMilanValverdeRobertoCarlos2425T4 miLibreriaXXX;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual; 
        double ingreso;
        
        miLibreriaXXX = new miLibreriaMilanValverdeRobertoCarlos2425T4("Don Quijote de la Mancha", 10, 45, 120);

        try 
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaXXX.obtenerPrecio();
            saldoActual = miLibreriaXXX.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("Tu saldo actual es de "+saldoActual+"€");
            miLibreriaXXX.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
        
        saldoActual = miLibreriaXXX.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaXXX.obtenerNombre();
        stock = miLibreriaXXX.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades");
        
        try
        {
            ingreso = 30.5;
            miLibreriaXXX.aumentarSaldo(ingreso);
            saldoActual = miLibreriaXXX.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    
    }
        
    public static void compraQuijoteMilanValverdeRobertoCarlos2425T4(
        miLibreriaMilanValverdeRobertoCarlos2425T4 miLibreria, int num) {

        try {
            String x = miLibreria.obtenerNombre();
            double dinero = miLibreria.obtenerPrecio();
            double saldoActual = miLibreria.obtenerSaldo();

            System.out.println("El libro " + x + " vale " + dinero + "€");
            System.out.println("Tu saldo actual es de " + saldoActual + "€");

            miLibreria.comprarLibro(num);
            System.out.println("Compra realizada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error en la compra del libro: " + e.getMessage());
        }
    } 
    
    
    
    public static void añadeIngresoMilanValverdeRobertoCarlos2425T4(
        miLibreriaMilanValverdeRobertoCarlos2425T4 miLibreria, double ingreso) {

        try {
            miLibreria.aumentarSaldo(ingreso);
            System.out.println("Tu saldo actual después de ingresar " + ingreso + " € es de " + miLibreria.obtenerSaldo() + " €");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar saldo: " + e.getMessage());
        }
    }
    
    
    public static void añadeIngresoMilanValverdeRobertoCarlos2425T4(
        miLibreriaMilanValverdeRobertoCarlos2425T4 miLibreria, double ingreso, String concepto) {

        try {
            miLibreria.aumentarSaldo(ingreso);
            System.out.println("Tu saldo actual después de ingresar " + ingreso + " € es de " + miLibreria.obtenerSaldo() + " €");
            System.out.println("Concepto: " + concepto);  // Mostrar el concepto de la transacción
        } catch (Exception e) {
            System.out.println("Fallo al ingresar saldo: " + e.getMessage());
        }
    }

    
}
