import java.awt.BorderLayout;

//Poceli smo s GUIem, moj prvi zadatak.
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;


public class MyPanel {
	static String out="";

	public static void main(String[] args) {
		
		MyFrame displayFrame=new MyFrame();
		MyPanel.MyFrame.MyFrame1 outDisplayFrame;
		JButton yesButton=new JButton("YES");
		JButton noButton=new JButton("NO");
		MyFrame listener=new MyFrame();
		yesButton.setToolTipText("Punoljetni ste");
		noButton.setToolTipText("Niste punoljetni");
		JButton okButton=new JButton("Ok");
		
	
		
		JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(displayFrame, BorderLayout.CENTER);
        content.add(yesButton, BorderLayout.WEST);
        content.add(noButton,BorderLayout.EAST);
        yesButton.addActionListener(new ActionListener() {
        
        

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Punoljetni ste!");
			out="Punoljetni ste";
			JOptionPane.showMessageDialog(null,out);
			
		}
    	   
       });
        noButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Niste punoljetni!");
			out="Niste punoljetni";
			JOptionPane.showMessageDialog(null, out);
			}
		});
		
		JFrame window = new JFrame("Pitanje");
        window.setContentPane(content);
        window.setSize(380,150);
        window.setLocation(100,100);
        window.setVisible(true);
	    
		
	}
		
		private static class MyFrame extends JPanel{
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				g.drawString("Da li imate vise od 18 godina?", 20, 30);
			}
			private class MyFrame1 extends MyFrame{
				public void paintComponent(Graphics g){
					super.paintComponent(g);
					g.drawString(out,20,30);
				}
			}
				
			}
		
}
			
		
	
