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
public class Reserva {
    
    private String fecha; // ex: 12/12/2012
    private String hora;  // ex: 23:48
    private Mesa mesa;
    private Cliente cliente;
    public enum Motivo{CUMPLEANOS,DESPEDIDA,BIENVENIDA, ANIVERSARIO};
    private Motivo motivo;


    public Reserva(String fecha, String hora, Mesa mesa, Cliente cliente, Motivo motivo) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
        this.motivo = motivo;
        this.setUpMesa();
        
    }
   
    public void setUpMesa(){
        
        if(mesa instanceof MLounge ){
            
            MLounge ml = (MLounge )this.mesa;
            if(this.motivo ==Motivo.ANIVERSARIO){
                 for(ElementosDeConfort e: ml.getElementosDeConfort()){
                     if(e!=null){
                        e.programar("ANIVERSARIO");
                     }
                 }
                 
             }else if(this.motivo ==Motivo.BIENVENIDA){
                 for(ElementosDeConfort e: ml.getElementosDeConfort()){
                     if(e!=null){
                        e.programar("BIENVENIDA");
                     }
                 }
             }else if(this.motivo ==Motivo.CUMPLEANOS){
                 for(ElementosDeConfort e: ml.getElementosDeConfort()){
                     if(e!=null){
                        e.programar("CUMPLEANOS");
                     }
                 }
             }else if(this.motivo ==Motivo.DESPEDIDA){
                 for(ElementosDeConfort e: ml.getElementosDeConfort()){
                     if(e!=null){
                        e.programar("DESPEDIDA");
                     }
                 }
             }       
        } 

    
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Reserva: fecha:" + fecha + " hora:" + hora + " cliente:" + cliente + " motivo:" + motivo + " Mesa :\n" + mesa; 
    }
    

    

}
