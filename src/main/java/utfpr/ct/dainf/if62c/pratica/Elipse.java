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
public class Elipse {
    private double eixoX;
    private double eixoY;
    
    public Elipse(){
        eixoX = eixoY = 0;
    }
    
    public Elipse(double eixoX, double eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }
    
    public double getEixoX() {
        return eixoX;
    }

    public void setEixoX(double base) {
        this.eixoX = eixoX;
    }

    public double getEixoY() {
        return eixoY;
    }

    public void setEixoY(double altura) {
        this.eixoY = eixoY;
    }
    
    public double getArea() {
        return (Math.PI*(eixoX/2)*(eixoY/2));
    }
    
    public double getPerimetro() {
        return (Math.PI*(3*(eixoX/2 + eixoY/2)) - Math.sqrt((3*eixoX/2 + eixoY/2)*(eixoX/2 + 3*eixoY/2)));
    }
}
