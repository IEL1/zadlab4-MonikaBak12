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
public class Kwadrat {
     public int a;
    public int pole;
    public int obwód;

    public Kwadrat(int a) {
        this.a = a;
    }
    public void Pole(){
        this.pole = this.a*this.a;
    }
    public void Obwod(){
        this.obwód = this.a*4;
    }
    public void WyswietlDane(){
        this.Pole();
        this.Obwod();
        System.out.println("KWADRAT");
        System.out.println("Bok: " + this.a);
        System.out.println("Pole: " + this.pole );
        System.out.println("Obwód: " + this.obwód );
    }
    
}
