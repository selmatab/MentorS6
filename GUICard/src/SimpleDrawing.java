// Tema je cestitka za praznike, radili smo u grupama(po 4 osobe)

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;




public class SimpleDrawing extends JPanel implements ActionListener {
	private static final String EXIT_ON_CLOSE = null;
	int frame = 0;
//	static Snow snow;
	 protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        drawFrame(g, frame++);
	      
	    }
	 
	  public void drawFrame(Graphics g, int frameNumber) {
		  Graphics2D g2d = (Graphics2D)g;
		  g.setColor(Color.WHITE);
		  Font bF = new Font("Verdana", Font.BOLD, 30);
		  g2d.setFont(bF);
		  g2d.drawString("HAPPY HOLIDAY FROM BITCAMP", 150, 150);
		  
		  
	     Snow snijeg = new Snow(Color.white, 10000);
	     snijeg.draw(g2d, frameNumber);
	      
	       Geometry[] figura = new Geometry[20];
	       	 figura[0] = new Oval(50, 50, Color.YELLOW.darker(), 100, 100);
			 figura[1] = new Oval(375, 210, Color.WHITE, 90, 90);
			 figura[2] = new Oval(350, 280, Color.WHITE, 150, 150);
			 figura[3] = new Oval(330, 360,Color.WHITE, 200,200);
			 figura[4] = new Rectangle(388, 170, Color.BLACK, 65,60);
			 figura[5] = new Rectangle (360,225, Color.BLACK, 120,10 );
			 figura[6] = new Line (360, 350,Color.black,260, 310);
			 figura[7] = new Line (480, 350,Color.black,580, 310);
			 figura[8] = new Oval (400, 245,Color.black,8, 8);
			 figura[9] = new Oval (430, 245,Color.black,8, 8);
			 figura[10] = new Oval (415, 260,Color.ORANGE,10, 10);
			 figura[11] = new Arc (407, 275, Color.RED, 30, 9,7, 7);
			 figura[12] = new Oval (420, 350,Color.black,10, 10);
			 figura[13] = new Oval (420, 380,Color.black,10, 10);
			 figura[14] = new Oval (420, 410,Color.black,10, 10);
			 
			 
			 figura[0].draw(g, 5);
			 figura[1].draw(g, 5);
	     	 figura[2].draw(g, 5);
	     	 figura[3].draw(g, 5);
	     	 figura[4].draw(g,  5);
	     	 figura[5].draw(g, 5);
	     	 figura[6].draw(g, frame);
	     	 figura[7].draw(g, frame);
	     	 figura[8].draw(g,  5);
	     	 figura[9].draw(g,  5);
	     	figura[10].draw(g,  5);
	    	figura[11].draw(g,  5);
	    	figura[12].draw(g,  5);
	    	figura[13].draw(g,  5);
	    	figura[14].draw(g,  5);
	       
	    }
	 
	  public void actionPerformed(ActionEvent evt) {
	        repaint();
	    }
	 

	public static void main(String[] args){
	
		
		
		 JFrame window = new JFrame("Happy Holidays");
		 
		 SimpleDrawing drawArea = new SimpleDrawing();
		 
		 drawArea.setBackground(Color.BLUE.darker());
	     window.setContentPane(drawArea);
	     
	     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	     double screenWidth = screenSize.getWidth();
	     double screenHeight = screenSize.getHeight();
	     int windowHeight = 800;
	     int windowWidth = 600;
	     
	     int positionHeight = (int) (screenHeight - windowHeight) / 2; 
	     int positionWidth = (int) (screenWidth - windowWidth) / 2; 
	     
	     window.setSize(windowHeight, windowWidth);
	     window.setLocation(positionWidth, positionHeight);
	     
	     window.setResizable(false);
	     
	     Timer frameTimer = new Timer(60,drawArea);
//	     snow = new Snow(Color.WHITE, windowHeight);
	     
	     
	     
	     window.setVisible(true);
	     frameTimer.start();
	}

	
}