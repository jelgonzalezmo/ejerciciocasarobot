/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugarfutbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
public class Punto4 {
    private City ciudad1;
    private Robot  robot1;
    private Thing balon1;
    
    int a=3;
    

public Punto4(){
this.ciudad1=new City();
this.robot1=new Robot(ciudad1,0,1,Direction.SOUTH);

for (int i =0;i<a;i++){
this.balon1=new Thing(ciudad1,1,1);}

for (int i =0;i<a;i++){
this.balon1=new Thing(ciudad1,2,1);}

for (int i =0;i<a;i++){
this.balon1=new Thing(ciudad1,3,1);}}


public void moverse(){
this.robot1.move();
//this.robot1.canPickThing();
for(int i=0;i<a;i++){
Tomarobjeto();
girarderechaymoverse();
Devolverse();}
}

public void avanzar(){
this.robot1.move();
}

public void girarderechaymoverse(){
this.robot1.turnLeft();
 for (int i =0;i<a-1;i++){
 this.robot1.move();
 this.robot1.putThing();
 }
}

public void Devolverse(){
   girarizquierda();
    for (int i =0;i<a-1;i++){
this.robot1.move();
        }
    this.robot1.turnLeft();
    this.robot1.move();
     }

public void Tomarobjeto(){
    for (int i =0;i<a-1;i++){
this.robot1.pickThing();}
}

public void dejarobjeto(){
this.robot1.putThing();
this.robot1.turnLeft();
}

public void girarizquierda(){
    for (int i=0;i<2;i++){
this.robot1.turnLeft();
}}
}
