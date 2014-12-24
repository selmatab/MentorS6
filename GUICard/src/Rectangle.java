

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rectangle extends Geometry{

	private int width;
	private int height;
	
	public Rectangle(int positionX, int positionY, Color color, int width, int height) {
		super(positionX, positionY, color);
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw(Graphics g, int frame) {
		g.setColor(super.getColor());
		g.fillRect(getPositionX(), getPositionY(), this.width, this.height);

	}

	public void move(int frame) {
		setPositionX(getPositionX() + frame);
		setPositionY(getPositionY() + frame);
	
		
	}

}