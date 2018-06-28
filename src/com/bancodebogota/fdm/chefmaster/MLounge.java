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
public class MLounge extends Mesa{
    
    private ElementosDeConfort [] elementosDeConfort;
    int indice = 0;

    public MLounge(int capacidadMaxima) {
        super(capacidadMaxima);
        elementosDeConfort = new ElementosDeConfort[10];
    }

    public ElementosDeConfort [] getElementosDeConfort() {
        return elementosDeConfort;
    }

    public void setElementosDeConfort(ElementosDeConfort [] elementosDeConfort) {
        this.elementosDeConfort = elementosDeConfort;
    }
    
    public void agregarElemento(ElementosDeConfort elementoDeConfort){
        this.elementosDeConfort[indice] = elementoDeConfort;
    }

    @Override
    public String toString() {
        String s = super.toString();
        for(ElementosDeConfort c: this.elementosDeConfort){
            if(c!=null){
                s+="\n"+c.toString();
            } 
        }
        return s;
    }
    
    
    
    
    
}
