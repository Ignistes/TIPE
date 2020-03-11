package Programme;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestionFichier {

	public static int[] Xreturn() {
		double[] pointsX = new double[390];
		int[] res = new int[390];
	    int i = 0;
	    Path cheminX = Paths.get("pointX.txt");
	    try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		pointsX[i] = Double.valueOf(line);
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    for(i=0;i<390;i++) {
	    	res[i] = (int)(250 - 79.57747155 * Math.log(Math.tan(Math.PI/4+((pointsX[i]+180)/360)/2)));
	    	//res[i] = (int)((pointsX[i]-49.0)*500.0/-2.6);
	    }
	    return res;
	}
	
	public static int[] Yreturn() {
		double[] pointsY = new double[390];
		int[] res = new int[390];
	    int i = 0;
	    Path cheminY = Paths.get("pointY.txt");
	    try (BufferedReader reader = Files.newBufferedReader(cheminY)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		pointsY[i] = Double.valueOf(line);
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    for(i=0;i<390;i++) {
	    	res[i] = (int)(500 * ((pointsY[i]+180)/360));
	    	//res[i] = (int)(((-1.0*pointsY[i])-5.0)*500.0/-3.2);
	    }
	    return res;

	}
	
}
