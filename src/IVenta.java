/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Felipe Gaete
 * @version 10/10/2023
 */
public interface IVenta {
    
    double IVA = 0.19;
    double descuentoInfantil =0.05;
    double descuentoDeporte = 0.1 ;
    
    public abstract void totalimpuesto();
    public abstract void calcularDescuento();
    public abstract void totalCompra();
    
}
