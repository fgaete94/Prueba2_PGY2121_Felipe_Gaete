/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Gaete
 * @version 10/10/2023
 */
public class Main {
    
    public static void main(String[] args) {
        
        Infantil infa= new Infantil(10, 5, "Papelucho", "Gabriela Mistral", "tu futuro", 22145856, 2000, 8790);
        Deporte dep = new Deporte("Futbol", "Mundial  ", "Pedro Carcuro", "tu mundo", 55478569, 2005, 14990);
        Coleccion list = new Coleccion();
        
        list.agregarLibro(infa);
        list.agregarLibro(dep);

        
        
        list.totalimpuesto();
        System.out.println("-------------");
        list.calcularDescuento();
        System.out.println("-------------");
        list.listarLibros();
        System.out.println("---------------");
        list.librosCategoria("Infantil");
        System.out.println("---------------");
        list.librosCategoria("Deporte");
        System.out.println("********************");
        list.totalCompra();
    }
    
}
