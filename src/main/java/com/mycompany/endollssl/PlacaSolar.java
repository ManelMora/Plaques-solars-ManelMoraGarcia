/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endollssl;

/**
 *
 * @author Casa
 */
public class PlacaSolar {
    private int superficietejado;
    private float precio;
    private int potencia;
    
    public PlacaSolar (int superficietejado, float precio, int potencia) {
        this.superficietejado = superficietejado;
        this.precio = precio;
        this.potencia = potencia;   
    }
    
    public int getSuperficietejado() {
        return this.superficietejado;
    }
    public float getPrecio () {
        return this.precio;
    }
    public int getPotencia () {
        return this.potencia;
    }
}
