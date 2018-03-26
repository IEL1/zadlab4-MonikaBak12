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
public class Prostopadłościan {
     public double powierzchnia;
    public int a,b,c;
    public double objętość;  

    public Prostopadłościan(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Powierzchnia(){
        this.powierzchnia = 2*(a*b+a*c+b*c);
    }
    public void Objętość(){
        this.objętość = a*b*c;
    }    
    public void WyswietlDane(){
        this.Powierzchnia();
        this.Objętość();
        System.out.println("PROSTOPADŁOŚCIAN");
        System.out.println("Bok1: " + this.a);
        System.out.println("Bok2: " + this.b);
        System.out.println("Bok3: " + this.c);
        System.out.println("Powierzchnia: " + this.powierzchnia );
        System.out.println("Objętość: " + this.objętość );
    } 
}
