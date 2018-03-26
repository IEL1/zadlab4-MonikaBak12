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
public class Koło {
    public int promień;
    public float obwód;
    public float pole;

    public Koło(int promień) {
        this.promień = promień;
    }      
    public void Obwód(){
        this.obwód = (float) (2*Math.PI*this.promień);
    }
    public void Pole(){
        this.pole = (float) (Math.PI*(this.promień*this.promień));
    }
    public void WyświetlDane(){
        this.Pole();
        this.Obwód();
        System.out.println("KOŁO");
        System.out.println("Promień: " + this.promień);
        System.out.println("Pole: " + this.pole );
        System.out.println("Obwód: " + this.obwód );
    }

    void WyswietlDane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
