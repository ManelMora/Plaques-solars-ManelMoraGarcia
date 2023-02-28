/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endollssl;

/**
 *
 * @author Casa
 */
public class Casa {
    private String nif;
    private String nom;
    private boolean interruptor;
    private int superficie;
    private int numeroplaca;
    
    public Casa (String nif, String nom, boolean interruptor, int superficie, int numeroplaca){
        this.nom = nom;
        this.nif = nif;
        this.interruptor = interruptor;
        this.superficie = superficie;
        this.numeroplaca = numeroplaca;
    }
    
    public String getNom() {
        return this.nom;
        }
    public String getNif() {
        return this.nif;
    }
    public int getSuperficie() {
        return this.superficie;
    }
    
    public boolean getInterruptor() {
        return this.interruptor;
    }
    public int getNumeroplaca() {
        return this.numeroplaca;
    }
}
