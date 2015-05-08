
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class Pratica41 {
    public static void main(String[] args) {
        Elipse e = new Elipse(2,1);
        Circulo c = new Circulo(1);
        
        System.out.println("Area da elipse = " + e.getArea());
        System.out.println("Perimetro da elipse = " + e.getPerimetro());
        System.out.println("Area do Circulo = " + c.getArea());
        System.out.println("Perimetro do Circulo = " + c.getPerimetro());
    }
}
