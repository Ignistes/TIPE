package Programme;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import Graphique.*;

public class Start {
    
	public static void main(String[] arg) {	
		
		JPanel panneau = new PanneauBretagne();
		panneau.setPreferredSize(new Dimension(500, 500));
		
		Fenetre cadre = new Fenetre(panneau);
	
    }
	
}
