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
public class CUBO {
    //Inicio de la clase cubo
        int alto;
        int ancho;
        int profundidad;
        
        public CUBO ()
        {
            System.out.println("NO SE ENCONTRARON DATOS");
        }
        
        public CUBO (int alto, int ancho,int profundidad)
        {
            this.alto=alto;
            this.ancho=ancho;
            this.profundidad=profundidad;
        }
        
        //funcion volumen
        
        public int Volumen()
        {
            int volumen = this.alto * this.ancho * this.profundidad;
            
            return volumen;
        }
}
