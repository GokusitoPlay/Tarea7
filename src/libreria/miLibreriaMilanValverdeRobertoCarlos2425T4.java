/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 * Clase que representa una librería con un libro en stock, su precio y saldo disponible.
 * Permite comprar libros y administrar el saldo de la librería.
 * 
 * @author Leonor
 */
public class miLibreriaMilanValverdeRobertoCarlos2425T4 {
    private String nom;      // Nombre del libro
    private int cantidad;    // Cantidad de libros disponibles
    private double precio;   // Precio unitario del libro
    private double saldo;    // Saldo de la cuenta de la librería

    /**
     * Constructor vacío de la clase.
     */
    public miLibreriaMilanValverdeRobertoCarlos2425T4() {}

    /**
     * Constructor que inicializa los valores de la librería.
     * 
     * @param nom Nombre del libro.
     * @param cantidad Cantidad de ejemplares disponibles.
     * @param precio Precio por unidad del libro.
     * @param saldo Saldo disponible en la cuenta de la librería.
     */
    public miLibreriaMilanValverdeRobertoCarlos2425T4(String nom, int cantidad, double precio, double saldo) {
        this.nom = nom;
        this.cantidad = cantidad;
        this.precio = precio;
        this.saldo = saldo;
    }

    /**
     * Obtiene el nombre del libro.
     * 
     * @return Nombre del libro.
     */
    public String obtenerNombre() {
        return nom;
    }

    /**
     * Obtiene el precio del libro.
     * 
     * @return Precio del libro.
     */
    public double obtenerPrecio() {
        return precio;
    }

    /**
     * Obtiene la cantidad de ejemplares disponibles en stock.
     * 
     * @return Cantidad de libros en stock.
     */
    public int obtenerStock() {
        return cantidad;
    }

    /**
     * Obtiene el saldo actual de la librería.
     * 
     * @return Saldo disponible.
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * Aumenta el saldo de la cuenta de la librería.
     * 
     * @param saldomas Monto a agregar al saldo.
     * @throws Exception Si el monto es negativo.
     */
    public void aumentarSaldo(double saldomas) throws Exception {
        if (saldomas < 0) {
            throw new Exception("No se puede sacar dinero de la cuenta de la librería");
        }
        saldo += saldomas;
    }

    /**
     * Compra un número determinado de libros, actualizando el stock y el saldo.
     * 
     * @param canti Cantidad de libros a comprar.
     * @throws Exception Si la cantidad es negativa, si no hay suficiente saldo o stock.
     */
    public void comprarLibro(int canti) throws Exception {
        if (canti <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa de libros");
        }
        if (canti > cantidad) {
            throw new Exception("No hay suficiente stock disponible");
        }
        double costoTotal = precio * canti; // Calcular el costo total de la compra
        if (saldo < costoTotal) {
            throw new Exception("No hay suficiente saldo para comprar los libros");
        }
        cantidad -= canti;
        saldo -= costoTotal; // Restar el costo total de los libros comprados
    }

    // Métodos Getter y Setter

    /**
     * Obtiene el nombre del libro.
     * 
     * @return Nombre del libro.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Establece el nombre del libro.
     * 
     * @param nom Nuevo nombre del libro.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtiene la cantidad de libros disponibles.
     * 
     * @return Cantidad de libros en stock.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de libros en stock.
     * 
     * @param cantidad Nueva cantidad de libros disponibles.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio del libro.
     * 
     * @return Precio unitario del libro.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del libro.
     * 
     * @param precio Nuevo precio unitario del libro.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el saldo de la librería.
     * 
     * @return Saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la librería.
     * 
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
