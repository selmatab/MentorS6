

import java.awt.Graphics;

import java.awt.Color;



public class Snow extends Geometry{

private Oval[] flakes;

private int windowWidth;

private int count = 0;


public Snow(Color color, int windowWidth) {

super(0, 0, color);

this.flakes = new Oval[900];

this.windowWidth = windowWidth;

count = 0;

generateFlakes(flakes.length);

}


private void generateFlakes(int size) {

for(int i = 0; i < size; i++)

addFlake(generateFlake());

}


private Oval generateFlake() {

int x = (int)(Math.random() * windowWidth);

int y = 0;

int radius = (int) (Math.random() * 7);

return new Oval(x, y,  super.getColor(), radius, radius);

}


private void addFlake(Oval flake) {

if(count == flakes.length)

resize();

flakes[count] = flake;

count++;

}


private void resize() {

Oval[] tmp = new Oval[flakes.length * 2];

for(int i = 0; i < flakes.length; i++)

tmp[i] = flakes[i];

flakes = tmp;

}


public void move(int frame) {

int fallen=0;

for(int i = 0; i < count; i++) {

if(flakes[i].getPositionY() < windowWidth - 300) {

int moveY = (int) (Math.random() * frame);

flakes[i].setPositionY(moveY);

}

else{

fallen++;

}

}

if(fallen >= flakes.length / 2) {

int flakesToAdd = 200;

for(int i = 0; i < flakesToAdd; i++)

addFlake(generateFlake());

}


}


public void draw(Graphics g, int frame) {

move(frame);

System.out.println(count);

for(int i =0; i < count; i++)

flakes[i].draw(g, 0);

}

}