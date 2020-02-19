package Graphique;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  public void paintComponent(Graphics g){
	  g.setColor(Color.BLACK);
	    int x1 = this.getWidth()/2;
	    int y1 = this.getHeight()/2;    
	    g.drawString("Cercle", x1-15, y1-75);
	    g.fillOval(x1-50, y1-50, 100, 100);
  }               
}
