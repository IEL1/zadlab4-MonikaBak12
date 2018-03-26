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
public class Stożek {
     public float powierzchnia;
    private float powBoczna;
    private float powPodstawy;
    private float s;
    public float objętość;
    public int promień;
    public int h;    

    public Stożek(int promień, int h) {
        this.promień = promień;
        this.h = h;
    }
    
    public void objetosc(){
        this.objętość = (float)((Math.PI*(this.promień*this.promień)*this.h)/3);
    }
    public void powierzchnia(){
        this.s = (float) Math.sqrt((this.promień*this.promień)+(this.h*this.h));
        this.powBoczna = (float) (Math.PI*this.promień*this.s);
        this.powPodstawy = (float) (Math.PI*this.promień*this.promień);
        this.powierzchnia = (float) (this.powBoczna+this.powPodstawy);
    }
    public void WyswietlDane(){
        this.objętość();
        this.powierzchnia();
        System.out.println("STOŻEK");
        System.out.println("Promien: " + this.promień);
        System.out.println("Wysokość: " + this.h );
        System.out.println("Tworząca: " + this.s);
        System.out.println("Objętość: " + this.objętość);
        System.out.println("Powierzchnia: " + this.powierzchnia);
    }

    private void objętość() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
