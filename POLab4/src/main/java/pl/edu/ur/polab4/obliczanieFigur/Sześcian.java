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
public class Sześcian {
     public int a;
    public double powierzchnia;
    public double objętość;

    public Sześcian(int a) {
        this.a = a;
    }
    public void powierzchnia(){
        this.powierzchnia = Math.pow(a,2)*6;
    }
    public void objętość(){
        this.objętość = Math.pow(a,3);
    }
    public void WyswietlDane(){
        this.powierzchnia();
        this.objętość();
        System.out.println("SZEŚCIAN");
        System.out.println("Bok: " + this.a);
        System.out.println("Powierzchnia: " + this.powierzchnia );
        System.out.println("Objętość: " + this.objętość);
    }
}
