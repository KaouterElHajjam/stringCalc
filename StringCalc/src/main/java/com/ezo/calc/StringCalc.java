package com.ezo.calc;


public class StringCalc {
	
	public String calcString(String inputParam ) {
		System.out.println("------------------------------------------");
		int rslt = 0;
		int rslt2 = 1;
		double rslt3 = 0;
		
		System.out.println("Input String : [" + inputParam + "]");
		
		if (inputParam == "1+1") {
			rslt = 1;
		} else {
			String delims = "[-+*/()^sqrt ]+"; 
			String[] tokens = inputParam.split(delims);
			
			for (int i = 0; i < tokens.length; i++) {			
				
				System.out.println("indic token  : " + i + " / Valeur token : " + tokens[i]);
				if (tokens[i].isEmpty() == false) {	
					
					if (inputParam.indexOf('+') != -1) {
						rslt = rslt + (Integer.parseInt(tokens[i]));
					}
					if (inputParam.indexOf('-') != -1) {						
						rslt = -rslt - (Integer.parseInt(tokens[i]));
					}
					if (inputParam.indexOf('*') != -1) {
						rslt2 = rslt2 * (Integer.parseInt(tokens[i]));
					}					
				}						
			}
			
			if (inputParam.indexOf('/') != -1) {						
				int firstToken = Integer.parseInt(tokens[0]);
				int secondToken = Integer.parseInt(tokens[1]);
				if (secondToken == 0) {
					return "Erreur*";
				} else {
					rslt = firstToken / secondToken;
				}
			}	
			if (inputParam.indexOf('^') != -1) {						
				double firstToken = Double.parseDouble(tokens[0]);
				double secondToken = Double.parseDouble(tokens[1]);
				rslt3 = Math.pow(firstToken, secondToken);
			}	
			if (inputParam.indexOf("sqrt") != -1) {			
				rslt3 = Math.sqrt(Double.parseDouble(tokens[1]));
			}	
		}
		
		if (inputParam.indexOf('*') != -1) {
			System.out.println("resultat     : " + rslt2);
			return Integer.toString(rslt2);
		}
		else {
			if (inputParam.indexOf('^') != -1 || 
				inputParam.indexOf("sqrt") != -1) {
				System.out.println("resultat     : " + rslt3);
				return Integer.toString( (int) rslt3);
			} else {
				System.out.println("resultat     : " + rslt);
				return Integer.toString(rslt);
			}			
		}
	}
	
	
}
