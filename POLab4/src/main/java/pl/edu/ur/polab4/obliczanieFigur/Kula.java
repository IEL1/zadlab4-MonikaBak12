/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Monika
 */
public class Kula {
     public int promień;
     public float powierzchnia;
     public float objętość;
     
     
    public Kula(int promień) {
        this.promień = promień;
    }    
   
    public void powierzchnia(){
        this.powierzchnia = (float) (4*Math.PI*Math.pow(this.promień,2));
    } 
    public void objetosc(){
        this.objętość = (float) ((4/3)*(Math.PI*Math.pow(this.promień,3)));
    }
    public void WyswietlDane(){
        this.objetosc();
        this.powierzchnia();
        System.out.println("KULA");
        System.out.println("Promień: " + this.promień);
        System.out.println("Powierzchnia kuli: " + this.powierzchnia );
        System.out.println("Objętość kuli: " + this.objętość );
    }
}
