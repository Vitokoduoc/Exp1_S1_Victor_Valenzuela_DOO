/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doo_exp1_s1_victor_valenzuela;

import java.util.ArrayList;

/**
 *
 * @author Victor Valenzuela
 */
public class main {
    public static void main(String[] args) {
        
        ArrayList<ProductoAgricola> productos = new ArrayList<>();
        
        ProductoAgricola manzana = new ProductoAgricola("a-001", "Manzana", "fruta", 200, 1500, true);
        ProductoAgricola apio = new ProductoAgricola("a-002","Apio", "Verdura", 150, 1000, true);
        ProductoAgricola almendra = new ProductoAgricola();
        
        almendra.setId("a-003");
        almendra.setNombre("almendra");
        almendra.setTipo("Fruto_Seco");
        almendra.setStock(1500);
        almendra.setPrecio(7000);
        almendra.setDisponible(true);
        
        productos.add(almendra);
        productos.add(apio);
        productos.add(manzana);
        
         System.out.println("==== Inventario de Productos Agricolas ====");
         
         //System.out.println(productos.toString());

        for (ProductoAgricola producto : productos) {
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Stock: " + producto.getStock() + " kg");
            System.out.println("Precio: $" + producto.getPrecio() + " por kilo");
            System.out.println("Disponible para exportacion: " + producto.getDisponible());
            System.out.println("-------------------------------------------");
        }

        // Mostrar cantidad total de productos
        System.out.println("Cantidad total de productos: " + productos.size());
        System.out.println("===========================================");
        
        
    }
    
}
