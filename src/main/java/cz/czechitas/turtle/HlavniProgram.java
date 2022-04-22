package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setPenWidth(5);

        Turtle jana;
        jana = new Turtle();
        jana.setPenWidth(5);

        Turtle pepa;
        pepa = new Turtle();
        pepa.setPenWidth(5);


        nakresliZmrzlinu(zofka, 500, 150);
        nakresliSnehulaka(jana, 200, 200);
        nakresliMasinku(pepa, 800, 200);

    }

    private void nakresliMasinku(Turtle turtle, double X, double Y) {
        turtle.setLocation(X, Y);
        nakresliKolecko(turtle, Color.black, 40);
        nakresliObdelnik(turtle, Color.orange, 100, 80);
        turtle.turnLeft(90);
        nakresliObdelnik(turtle, Color.orange, 120, 70);
        turtle.setLocation(X - 40, Y + 40);
        nakresliKolecko(turtle, Color.black, 20);
        turtle.setLocation(X - 90, Y + 40);
        nakresliKolecko(turtle, Color.black, 20);
        turtle.setLocation(X - 120, Y - 50);
        turtle.turnLeft(120);
        nakresliRovnostrannyTrojuhelnik(turtle, Color.orange, 90);
    }

    private void nakresliSnehulaka(Turtle turtle, double X, double Y) {
        turtle.setLocation(X, Y);
        nakresliKolecko(turtle, Color.blue, 40);
        turtle.setLocation(X + 10, Y - 70);
        nakresliKolecko(turtle, Color.blue, 30);
        turtle.setLocation(X + 20, Y - 120);
        nakresliKolecko(turtle, Color.blue, 20);
        turtle.setLocation(X - 10, Y - 65);
        nakresliKolecko(turtle, Color.blue, 10);
        turtle.setLocation(X + 70, Y - 65);
        nakresliKolecko(turtle, Color.blue, 10);
    }

    private void nakresliZmrzlinu(Turtle turtle, double X, double Y) {
        turtle.setLocation(X, Y);
        turtle.turnRight(180);
        nakresliKolecko(turtle, Color.red, 60);
        turtle.setLocation(X, Y + 20);
        nakresliRovnostrannyTrojuhelnik(turtle, Color.black, 120);
        turtle.setLocation(X, Y);
    }


    private void nakresliKolecko(Turtle turtle, Color barvaCary, double polomer) {
        turtle.setPenColor(barvaCary);
        double obvod = (2 * (Math.PI) * polomer);
        for (int i = 0; i < 45; i++) {    //i < 360/uhel
            turtle.move(obvod / 45);
            turtle.turnRight(8);   //kolecko bude 45uhelnik
        }

    }


    private void nakresliObdelnik(Turtle turtle, Color barvaCary, double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            turtle.setPenColor(barvaCary);
            turtle.move(delkaStranyA);
            turtle.turnRight(90);
            turtle.move(delkaStranyB);
            turtle.turnRight(90);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, Color barvaCary, double delkaStrany) {
        turtle.turnRight(30);
        for (int i = 0; i < 3; i++) {
            turtle.setPenColor(barvaCary);
            turtle.move(delkaStrany);
            turtle.turnRight(120);
        }
    }

    private void nakresliCtverec(Turtle turtle, Color barvaCary, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            turtle.setPenColor(barvaCary);
            turtle.move(delkaStrany);
            turtle.turnRight(90);
        }
    }

}
