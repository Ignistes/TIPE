package Graphique;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JPanel;
import Programme.*;

public class PanneauBretagne extends JPanel {
	public void paintComponent(Graphics g){
	
	int x[] = GestionFichier.Yreturn();
    int y[] = GestionFichier.Xreturn();
    
    g.drawPolygon(x, y, x.length);
   
    
	}
}
