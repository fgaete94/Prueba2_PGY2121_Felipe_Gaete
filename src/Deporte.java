/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe Gaete
 * @version 10/10/2023
 */
public class Deporte extends Libro {
    
    private String deporte;

    public Deporte() {
    }

    public Deporte(String deporte, String nombre, String autor, String editorial, int isbn, int año, int precio) {
        super(nombre, autor, editorial, isbn, año, precio);
        this.deporte = deporte;
    }




    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Deporte{" + "deporte=" + deporte + '}';
    }

    @Override
    public void listar() {
        System.out.println("Autor: "+super.getAutor());
        System.out.println("Editorial: "+super.getEditorial());
        System.out.println("Anno: "+super.getAño());
        System.out.println("Disciplina: "+this.deporte);
    }
    
    
    
    
}
