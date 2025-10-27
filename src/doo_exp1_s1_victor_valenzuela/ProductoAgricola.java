/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doo_exp1_s1_victor_valenzuela;

/**
 *
 * @author Victor Valenzuela
 */
public class ProductoAgricola {
    // Atributos de la clase
    private String id;
    private String nombre;
    private String tipo; 
    private int stock;
    private double precio;
    private boolean disponible;
    
    // Constructor vacio
    public ProductoAgricola(){
    }
    
    //Constructor con todos los atributos
    public ProductoAgricola(String id, String nombre, String tipo, int stock, double precio, boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.precio = precio;
        this.disponible = disponible;
        
    }
    
    //metodos get de los atriburos accesadores
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getStock(){
        return stock;
    }
    public double getPrecio(){
        return precio;
    }
    public boolean getDisponible(){
        return disponible;
    }
    
    //metodos seter de los atributos de la classe, Mutadoros
    
    public void setId(String id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
            this.tipo = tipo;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setDisponible(boolean disponible){
        this.disponible =disponible;
    }

    @Override
    public String toString() {
        return "ProductoAgricola{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", stock=" + stock + ", precio=" + precio + ", disponible=" + disponible + '}';
    }

   
}
