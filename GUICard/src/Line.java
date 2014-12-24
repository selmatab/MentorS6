

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Line extends Geometry{

	private int endX;
	private int endY;;
	
	public Line(int positionX, int positionY, Color color, int endX, int endY) {
		super(positionX, positionY, color);
		this.endX = endX;
		this.endY = endY;
	}


	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}
	
	public void draw(Graphics g, int frame){
		move(frame);
		g.setColor(super.getColor());
		g.drawLine(getPositionX(), getPositionY(), this.endX, this.endY);
		
		

	}
	
	public void move(int frame) {

		endX=(int)(endX+Math.sin(frame/5)*6);
		endY=(int)(endY+Math.sin(frame/5)*6);
	}
}