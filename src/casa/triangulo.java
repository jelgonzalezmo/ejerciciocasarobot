/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
/**
 *
 * @author Estudiante
 */
public class triangulo {
    
     private City ciudad;
        private Robot robot3;
        private Thing balon;

        public triangulo() {
            this.ciudad = new City();
            this.robot3 = new Robot(ciudad, 5, 5, Direction.WEST);
            for (int i =0;i<7;i++){
          this.balon = new Thing(ciudad, 5, 5);
}        }

 public void techo(){
Tomarobjeto();
girarizquierda();
for (int i =0;i<4;i++){
 avanzar();
 }
}
 
public void avanzar(){
this.robot3.move();
this.robot3.turnLeft();
this.robot3.move();
this.robot3.putThing();
}

public void girarderechaymoverse(){
this.robot3.turnLeft();
 for (int i =0;i<4;i++){
 this.robot3.move();
 this.robot3.putThing();
 }
}

public void Devolverse(){
   girarizquierda();
    for (int i =0;i<4;i++){
this.robot3.move();
        }
    this.robot3.turnLeft();
    this.robot3.move();
     }

public void Tomarobjeto(){
    for (int i =0;i<7;i++){
this.robot3.pickThing();}
}

public void dejarobjeto(){
this.robot3.putThing();
this.robot3.turnLeft();
}

public void girarizquierda(){
    for (int i=0;i<2;i++){
this.robot3.turnLeft();
}}}