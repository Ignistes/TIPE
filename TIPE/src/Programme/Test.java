package Programme;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		String[] pointsX = new String[390];
	    int i = 0;
	    Path cheminX = Paths.get("pointX.txt");
	    try (BufferedReader reader = Files.newBufferedReader(cheminX)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		pointsX[i] = line;
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    String[] pointsY = new String[390];
	    i = 0;
	    Path cheminY = Paths.get("pointY.txt");
	    try (BufferedReader reader = Files.newBufferedReader(cheminY)){
	    	String line = null;
	    	while((line = reader.readLine())!=null) {
	    		pointsY[i] = line;
	    		i++;
	    	}
	    }catch (IOException e) {
	    	System.out.println(e);
	    }
	    
	    
	   /* System.out.println(pointsX[0]);
	    for(i = 0; i < 390; i++) {
	    	String line = pointsX[i];
	    	String newLine = "";
	    	for(int j = 0; j < line.length();j++) {
	    		Character c = line.charAt(j);
	    		if(c.equals('0') || c.equals('1') || c.equals('2') || c.equals('3') || c.equals('4') || c.equals('5') || c.equals('6') || c.equals('7') || c.equals('8') || c.equals('9') || c.equals(',')) {
	    			if(c.equals(',')) {
	    				c = '.';
	    			}
	    		}
    			newLine = newLine + c.toString();
	    	}
	    	
	    	
	    }*/
	    Double[] pointX = new Double[390];
	    for(i = 0; i < 390; i++) {
	    	String line = pointsX[i];
	    	pointX[i] = Double.valueOf(line);
	    	System.out.println(pointX[i]);
	    }
	    Double[] pointY = new Double[390];
	    for(i = 0; i < 390; i++) {
	    	String line = pointsY[i];
	    	pointY[i] = Double.valueOf(line);
	    }
	    

	}
}


