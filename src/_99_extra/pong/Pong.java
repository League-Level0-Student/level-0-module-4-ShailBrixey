package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	ellipse(400,300,20,20);
    	fill(0,0,255);
    	stroke(255,0,0);
    	int speed = 5;
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}