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
public class Main {
    private static final int TAMANO_ARR = 20;
   
    private Reserva[] reservas;
    private Cliente[] clientes;
    private Mesa[] mesas;
    private ElementosDeConfort[] elementosDeConfort;

    public Main() {
        this.reservas = new Reserva[TAMANO_ARR];
        this.clientes = new Cliente[TAMANO_ARR];
        this.mesas = new Mesa[TAMANO_ARR];
        this.elementosDeConfort = new ElementosDeConfort[TAMANO_ARR];
    }
    
   
    public void crearElementosDeConfort(){
        
        elementosDeConfort[0] = new Speakers();
        elementosDeConfort[1] = new Speakers();
        elementosDeConfort[2] = new Speakers();
        elementosDeConfort[3] = new Speakers();
        elementosDeConfort[4] = new Speakers();
  
        elementosDeConfort[5] = new Television();
        elementosDeConfort[6] = new Television();
        elementosDeConfort[7] = new Television();
        elementosDeConfort[8] = new Television();
        elementosDeConfort[9] = new Television();

    }
 
    
    public void crearMesas(){
        int i = 0;
        MLounge m1 = new MLounge(6);
        MLounge m2 = new MLounge(4);
        MLounge m3 = new MLounge(9);
       
        Mesa m4 = new MGrupal(4);
        Mesa m5 = new MGrupal(4);
        Mesa m6 = new MGrupal(5);
        Mesa m7 = new MPareja(2);
        Mesa m8 = new MPareja(2);
        Mesa m9 = new MIndividual(1);
        Mesa m10 = new MIndividual(1);
        
        mesas[i++]=m1;
        mesas[i++]=m2;
        mesas[i++]=m3;
        mesas[i++]=m4;
        mesas[i++]=m5;
        mesas[i++]=m6;
        mesas[i++]=m7;
        mesas[i++]=m8;
        mesas[i++]=m9;
        mesas[i++]=m10;
        
        
        m1.agregarElemento(elementosDeConfort[0]);
        m1.agregarElemento(elementosDeConfort[1]);
        m1.agregarElemento(elementosDeConfort[2]);
        m1.agregarElemento(elementosDeConfort[5]);
        m1.agregarElemento(elementosDeConfort[6]);
        
        m2.agregarElemento(elementosDeConfort[3]);
        m2.agregarElemento(elementosDeConfort[4]);
        m2.agregarElemento(elementosDeConfort[7]);
        m2.agregarElemento(elementosDeConfort[8]);
        m2.agregarElemento(elementosDeConfort[9]);

        
    }    
    
    public void crearClientes(){
        int ind = 0;
        clientes[ind++] = new Cliente("Paco Perez");
        clientes[ind++] = new Cliente("Marta Mora");
        clientes[ind++] = new Cliente("Alvaro Alvarez");
        clientes[ind++] = new Cliente("Juan Perez");
        clientes[ind++] = new Cliente("Pedro Pablo");
        clientes[ind++] = new Cliente("Ana Lopez");
    
    }
    
    public void crearReservas(){
        int ind = 0;
        reservas[ind++]= new Reserva("27062017", "2000", mesas[1], clientes[1],Reserva.Motivo.CUMPLEANOS );
        reservas[ind++]= new Reserva("27062016", "2000", mesas[1], clientes[1],Reserva.Motivo.BIENVENIDA );
        reservas[ind++]= new Reserva("27062015", "2000", mesas[1], clientes[1],Reserva.Motivo.DESPEDIDA );
        reservas[ind++]= new Reserva("27062018", "2000", mesas[1], clientes[1],Reserva.Motivo.ANIVERSARIO );
        reservas[ind++]= new Reserva("27062518", "1000", mesas[1], clientes[1],Reserva.Motivo.ANIVERSARIO );
         
        reservas[ind++]= new Reserva("27062018", "2000", mesas[2], clientes[1],Reserva.Motivo.CUMPLEANOS );
        reservas[ind++]= new Reserva("27062018", "1800", mesas[2], clientes[2],Reserva.Motivo.BIENVENIDA );
        reservas[ind++]= new Reserva("27062018", "1600", mesas[2], clientes[3],Reserva.Motivo.DESPEDIDA );
        reservas[ind++]= new Reserva("27062018", "1400", mesas[2], clientes[4],Reserva.Motivo.ANIVERSARIO );
        
        reservas[ind++]= new Reserva("27062018", "2000", mesas[3], clientes[1],Reserva.Motivo.CUMPLEANOS );
        reservas[ind++]= new Reserva("27062018", "1800", mesas[4], clientes[2],Reserva.Motivo.BIENVENIDA );
        reservas[ind++]= new Reserva("27062018", "1600", mesas[5], clientes[3],Reserva.Motivo.DESPEDIDA );
        reservas[ind++]= new Reserva("27062018", "1400", mesas[6], clientes[4],Reserva.Motivo.ANIVERSARIO ); 
    }
    
    
    
    public void convertirClientesVIP(){
        
        for(Cliente c:this.clientes){
          int count = 0;
          for(Reserva r:this.reservas){
              if(c.getNombre().equals(r.getCliente().getNombre())){
                  count ++;
                  c.agregarReserva(r);
              }
           }
        }
    
    }
    
    public void imprimir(){
        for(Reserva r : this.reservas){
            if(r!=null){
                System.out.println(r);
                System.out.println("<END RESERVA>");
            }
            
        }
    }
    
    public void crearReservaCliente(){
        
        
    
    }
    
    
    
    
    public static void main(String[] args) {
           
        Main m = new Main();
        m.crearElementosDeConfort();
        m.crearMesas();
        m.crearClientes();
        m.crearReservas();
        m.imprimir();
        m.crearReservaCliente();
        
        
    }
}
