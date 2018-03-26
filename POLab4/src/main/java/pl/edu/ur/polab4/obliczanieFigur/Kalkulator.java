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
public class Kalkulator {
    public static void main(String[] args) {
        Kwadrat Kwadrat1 = new Kwadrat(4);
        Kwadrat1.WyswietlDane();
        
        Prostokąt Prostokat = new Prostokąt(3,7);
        Prostokat.WyswietlDane();
        
        Koło Kolo1 = new Koło(3);
        Kolo1.WyswietlDane();
        
        Kula Kula1 = new Kula(3);
        Kula1.WyswietlDane();
        
        Stożek Stożek1 = new Stożek(1,3);
        Stożek1.WyswietlDane();
        
        Sześcian Sześcian1 = new Sześcian(3);
        Sześcian1.WyswietlDane();
        
        Prostopadłościan Prostopadłościan = new Prostopadłościan(1,3,5);
        Prostopadłościan.WyswietlDane();
    }
}
