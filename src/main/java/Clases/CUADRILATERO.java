/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Principal
 */
public class CUADRILATERO {
    public static void main (String[] args)
    {
        int lado1=8;
        int lado2=7;
        
        //las areas de distintos cuadrlateros dependen de su 
        //forma por lo cual este programa sera capaz de medir
        //area y perimetro de un cuadrado y un rectangulo
        
        int perimetro= 2*lado1 + 2*lado2;
       
        int area= lado1*lado2;
        
        System.out.println("El perimetro de este cuadrilatero es "+perimetro);
        
        System.out.println("El area de este cuadrlatero es "+area);
    }
}
