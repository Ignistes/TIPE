package Graphique;

import java.awt.Color;
import java.awt.Dimension;
import Graphique.Panneau;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre {
	JFrame cadre;
	public Fenetre(JPanel panneau) {
		cadre = new javax.swing.JFrame("TIPE : Alexandre, Pierre et Louis");
		//cadre.setResizable(false);
		cadre.setLocation(100, 100);
		cadre.setContentPane(panneau);
		cadre.setSize(1000, 1000);
		cadre.pack();
		cadre.setVisible(true);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
