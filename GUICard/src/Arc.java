

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Arc extends Geometry{

	private int endX;
	private int endY;
	private double startAngle;
	private double endAngle;
	
	public Arc(int positionX, int positionY, Color color, int endX, int endY, double startAngle, double endAngle) {
		super(positionX, positionY, color);
		this.endX = endX;
		this.endY = endY;
	}

	public int getWidth() {
		return endX;
	}

	public void setWidth(int width) {
		this.endX = width;
	}

	public int getHeight() {
		return endY;
	}

	public void setHeight(int height) {
		this.endY = height;
	}

	public double getStartAngle() {
		return startAngle;
	}

	public void setStartAngle(double startAngle) {
		this.startAngle = startAngle;
	}

	public double getEndAngle() {
		return endAngle;
	}

	public void setEndAngle(double endAngle) {
		this.endAngle = endAngle;
	}

	public void draw(Graphics g, int frame){
		g.setColor(super.getColor());
		g.fillOval(getPositionX(), getPositionY(), this.endX, this.endY);
		
		

	}
	
	public void move(int frame) {
		setPositionX(getPositionX() + frame);
		setPositionY(getPositionY() + frame);
	}
	
}