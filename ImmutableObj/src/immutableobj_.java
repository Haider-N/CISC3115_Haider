import java.util.Scanner;

public class immutableobj_ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		    	float fahrenheit;
		    	float centigrade;
		    	fahrenheit = (float) 98.6;
		    	centigrade = (float) ((5.0/9.0) * ((fahrenheit-32.0)));
		    	System.out.println("Fahrenheit: " + fahrenheit + " Centigrade: " + centigrade);
		    	System.out.println("---------------------------------------");
		    	for(double i = 0.0; i <= 40.0; i = i + 4) {
		    		System.out.printf("Fahrenheit: %.2f Centigrade: %.2f%n", i, ((5.0/9.0) * (i-32.0)));
		    	}
		    	System.out.println("---------------------------------------");
		    	double i = 0.0;
		    	while(i <= 40.0) {
		    		System.out.printf("Fahrenheit: %.2f Centigrade: %.2f%n", i, ((5.0/9.0) * (i-32.0)));
		    		i = i + 4;
		    	}
		    	System.out.println();
		    	System.out.println();
		    	System.out.println();
		    	StopChecking();
			input.close();
		    }
		    public static void StopChecking() {
		    	Scanner input = new Scanner(System.in);
		    	String [][] myarray  = {
		    			{"BMW", "Ferrari", "Lambo"},
		    			{"pizza", "burger", "dumpling"}
		    	};
		    	String isin = "";
		    	String inputwords;
		    	System.out.println("Enter a word: ");
		    	inputwords = input.next();
		    	if(inputwords.equals("STOP")) {
		    		System.out.println("Program has been terminated");
		    	}
		    	else {
		    		isin = "False";
		    		for(int i = 0; i < myarray.length; i++) {
		    			for(int j = 0; j < myarray[i].length; j++) {
		    				if(myarray[i][j].equals(inputwords)) {
		    					isin = "True";
		    					break;
		    					
		    				}
		    			}
		    			if(isin.equals("True")) break;
		    		}
		    	}
		    	if(isin.equals("True")) {
		    		System.out.println("input words is in the 2D array");
		    	}
		    	else {
		    		System.out.println("input words is not in the 2D array");
		    	}
		    	input.close();
		    }	

	}