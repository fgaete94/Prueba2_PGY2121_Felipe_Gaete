/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
  * @author Felipe Gaete
 * @version 10/10/2023
 */
public class Infantil extends Libro {
    
    private int edadMax,edadMin;

    public Infantil() {
    }

    public Infantil(int edadMax, int edadMin, String nombre, String autor, String editorial, int isbn, int año, int precio) {
        super(nombre, autor, editorial, isbn, año, precio);
        this.edadMax = edadMax;
        this.edadMin = edadMin;
    }


    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    @Override
    public String toString() {
        return "Infantil{" + "edadMax=" + edadMax + ", edadMin=" + edadMin + '}';
    }

    @Override
    public void listar() {
        System.out.println("Autor: "+super.getAutor());
        System.out.println("Editorial: "+super.getEditorial());
        System.out.println("Anno: "+super.getAño());
        System.out.println("Edad: de "+this.edadMin+" A "+this.edadMax);
    }
    
    
    
}
