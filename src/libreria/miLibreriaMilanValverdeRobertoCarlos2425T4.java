/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;
/**
 *
 * @author leonor
 */
public class miLibreriaMilanValverdeRobertoCarlos2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;

    // Constructor sin argumentos
    public miLibreriaMilanValverdeRobertoCarlos2425T4() {}

    // Constructor con parámetros para inicializar todas las propiedades de la clase
    public miLibreriaMilanValverdeRobertoCarlos2425T4(String nom, int cantidad, double precio, double saldo) {
        this.nom = nom;                 // Nombre del libro
        this.cantidad = cantidad;       // Cantidad de ejemplares que hay en stock
        this.precio = precio;           // Precio unitario del libro
        this.saldo = saldo;             // Saldo en la cuenta de la librería
    }

    // Métodos que devuelve el nombre del libro
    public String obtenerNombre() {
        return nom;
    }

    // Método que devuelve el precio del libro
    public double obtenerPrecio() {
        return precio;
    }

    // Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
    public int obtenerStock() {
        return cantidad;
    }

    // Método para obtener el saldo en la cuenta
    public double obtenerSaldo() {
        return saldo;
    }

    // Método para aumentar el saldo
    public void aumentarSaldo(double saldomas) throws Exception {
        if (saldomas < 0)
            throw new Exception("No se puede sacar dinero de la cuenta de la librería");
        saldo = saldo + saldomas;
    }

    // Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
    public void comprarLibro(int canti) throws Exception {
        if (canti <= 0)
            throw new Exception("No se puede retirar una cantidad negativa de libros");
        cantidad = cantidad - canti;
        if (saldo <= precio) // ❌ Error aquí
            throw new Exception("No hay suficiente saldo para comprar");
        saldo = saldo - precio; // ❌ Esto solo descuenta el precio de un libro, no de todos
    }

    // Métodos Getter y Setter para encapsular los atributos
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
