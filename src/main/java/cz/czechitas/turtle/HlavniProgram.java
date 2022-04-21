package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setPenWidth(2);

    }

    private void nakresliKolecko(Turtle zofka, Color barvaCary, double polomer) {
        zofka.setPenColor(barvaCary);
        double polomerA = Math.pow(polomer, 2);        //Pythagorova veta
        double delkaStrany = (polomerA + polomerA);  //Pythagorova veta
        for (int i = 0; i < 45; i++) {    //i < 360/uhel
            zofka.move(delkaStrany);
            zofka.turnRight(8);   //kolecko bude 45uhelnik
        }


    }
     /*
    private void nakresliKolecko(Turtle zofka, Color barvaCary, double delkaStrany) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 360; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(1);
        }     */                    //druha varianta nakresleni kolecka


    private void nakresliObdelnik(Turtle zofka, Color barvaCary, double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle zofka, Color barvaCary, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStrany);
            zofka.turnRight(120);
        }
    }

    private void nakresliCtverec(Turtle zofka, Color barvaCary, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(barvaCary);
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

}
