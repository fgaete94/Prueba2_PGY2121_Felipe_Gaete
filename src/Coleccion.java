
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Gaete
 * @version 10/10/2023
 */
public class Coleccion implements IVenta {
    
    private ArrayList <Libro> listalibros;

    public Coleccion() {
        listalibros= new ArrayList<> ();
    }
    
    /// metodo para agregar libros a la lista
    public boolean agregarLibro(Libro lib){
        if(listalibros.contains(lib.getNombre()) && listalibros.contains(lib.getAutor())){
            System.out.println("Libro ya agregado");
            return false;
        }else{
            return listalibros.add(lib);
        }
        
    }
/// metodo para calcular el total de impuestos de una lista
    @Override
    public void totalimpuesto() {
        int totI=0;
        for (Libro lib : listalibros) {
            totI=totI+lib.getPrecio();
            
        }
        System.out.println("Total de Impuestos de esta Compra: $"+totI*IVenta.IVA);
    }
/// metodo para calcular el total de descuentos de una lista
    @Override
    public void calcularDescuento() {
        int totDi=0, totDd=0;
        for (Libro libr : listalibros) {
            if(libr.getClass().getName().equals("Infantil")){
                totDi=totDi+libr.getPrecio();
            }
            if(libr.getClass().getName().equals("Deporte")){
                totDd=totDd+libr.getPrecio();
            }
            
        }
        if(totDi>0){
            System.out.println("Descuento infantil aplicado, por monto de: $"+totDi* IVenta.descuentoInfantil);
        }
        if(totDd>0){
            System.out.println("Descuento infantil aplicado, por monto de: $"+totDi* IVenta.descuentoDeporte);
        }else{
            System.out.println("sin descuento aplicado");
        }
    }

    /// metodo para calcular el total de una compra
    @Override
    public void totalCompra() {
        int tot=0,totDi=0,totDd=0;
        System.out.println("\t\tBOLETA");
        System.out.println("Libro\t\t\t\tValor");
        for (Libro libro : listalibros) {
            tot=tot+libro.getPrecio();
            System.out.println(libro.getNombre()+"\t\t\t"+libro.getPrecio());
             if(libro.getClass().getName().equals("Infantil")){
                  totDi=totDi+libro.getPrecio();
             }
             if(libro.getClass().getName().equals("Deporte")){
                 totDd=totDd+libro.getPrecio();
             }
            
        }
        System.out.println("--------------------------------------");
        System.out.println("\t\t\tTotal: $"+tot);
        System.out.println("\t\t\tIVA: $"+tot*IVenta.IVA);
        System.out.println("\t\t\tDescuentos: $"+(totDi* IVenta.descuentoInfantil+totDi* IVenta.descuentoDeporte));
        System.out.println("\t\t\tTotal Final: $"+((tot+tot*IVenta.IVA)-(totDi* IVenta.descuentoInfantil+totDi* IVenta.descuentoDeporte)));
        
    }
    // metodo para listar los libros
    public void listarLibros(){
        for (Libro libro : listalibros) {
            libro.listar();
            System.out.println("\n");
        }
    }
    
    //metodos para saber cuantos libros hay de cada categoria.
    public void librosCategoria(String str){
        int cantidad=0;
        for (Libro libro : listalibros) {
            if(libro.getClass().getName().equalsIgnoreCase(str)){
                cantidad=cantidad+1;
                System.out.println("Los libros de la categoria: "+ str);
                libro.listar();
            }             
            
        }
        System.out.println("de la Categoria: "+str+" hay: "+cantidad+ " Libro/s");
    }
    
}
