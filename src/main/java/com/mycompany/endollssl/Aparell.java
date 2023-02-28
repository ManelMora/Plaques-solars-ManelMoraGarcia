/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endollssl;

/**
 *
 * @author Casa
 */
public class Aparell {
    private String descripcion;
    private int consumo;
    private boolean interruptor;
    
    public Aparell (String descripcion, int consumo, boolean interruptor) {
        this.consumo = consumo;
        this.descripcion = descripcion;
        this .interruptor = interruptor;
    }
    
    public int getConsumo() {
        return this.consumo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public boolean getInterruptor () {
        return this.interruptor;
    }
}
