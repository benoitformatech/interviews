package com.interview.chaine;

public class ManipulerChaine {

	
	/**
	 * Methode pour compter le nombre de mot qui se termine par a ou b
	 * @param chaine
	 * @return
	 */
	public int countAB(String chaine){
		
		int compteur = 0;
		for (String mot:chaine.split(" ")){
			char end = mot.charAt(mot.length()-1);
			
			if(Character.toString(end).matches("[ab)]")){
				compteur++;
			}
		}
		return compteur;
	} 
}
