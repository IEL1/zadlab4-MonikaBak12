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
public class Prostokąt {
        public int a;
    public int b;
    public int pole;
    public int obwód;

    public Prostokąt(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void Obwod(){
        this.obwód = (this.a*2)+(this.b*2);
    }
    public void Pole(){
        this.pole = this.a*this.b;
    }
    public void WyswietlDane(){
        this.Pole();
        this.Obwod();
        System.out.println("PROSTOKĄT");
        System.out.println("Bok1: " + this.a);
        System.out.println("Bok2: " + this.b);
        System.out.println("Pole: " + this.pole );
        System.out.println("Obwód: " + this.obwód );
    }
    
}
