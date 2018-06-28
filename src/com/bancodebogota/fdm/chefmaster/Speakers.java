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
public class Speakers extends ElementosDeConfort{

    @Override
    public String programar(String playlist) {
        System.out.println("Play List del los Spleakers " + playlist);//To change body of generated methods, choose Tools | Templates.
        return playlist;
    }
    
}
