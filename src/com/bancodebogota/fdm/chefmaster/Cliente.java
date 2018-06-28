/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.chefmaster;

/**
 *
 * @author jpramirez
 */
public class Cliente {
    
    private String nombre ;
    private Reserva[] reservas;
    private boolean VIP;
    private int indice;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
        reservas = new Reserva[100];
    }
    
    
    public void agregarReserva(Reserva r){
        this.reservas[indice] = r;
    }    

    public boolean isVIP() {
        return indice == 5;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " Cliente : Nombre:" + nombre + " isVIP" + isVIP();
    }


    
    
    
}
