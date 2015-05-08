/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Marcos
 */
public class Circulo extends Elipse{
    private double raio;
    
    public Circulo(){
        super();
    }
    
    public Circulo (double raio){
        super(raio, raio);
    }
    
    public double getAreaCirc (){
        return super.getArea();
    }
    
    public double getPerimetroCirc (){
        return (Math.PI*2*raio);        
    }
}
