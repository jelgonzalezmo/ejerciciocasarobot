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
public class rectangulo {

    

        private City ciudad;
        private Robot robot3;
        private Thing balon;

        public rectangulo() {
            this.ciudad = new City();
            this.robot3 = new Robot(ciudad, 5, 5, Direction.WEST);
            for (int i =0;i<16;i++){
          this.balon = new Thing(ciudad, 5, 5);
}        }

        public void hacerrectangulo() {
            Tomar();
            for (int i = 0; i < 4; i++) {
                advance1();
                advanceleft();
            }
        }

        public void advance1() {
            for (int i = 0; i < 4; i++) {
                this.robot3.move();
                this.robot3.putThing();
            }
        }

        public void advanceleft() {
            this.robot3.turnLeft();
        }

        public void Tomar() {
            for(int i=0;i<16;i++) {
                this.robot3.pickThing();
            }
        }

        public void dejar() {
            this.robot3.putThing();
            this.robot3.turnLeft();
        }

        public void advanceRight() {
            for (int i = 0; i < 3; i++) {
                this.robot3.turnLeft();
            }
        }
    }

