package com.javafirst;

public class NumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String sample = "krishna64";
	      char[] chars = sample.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : chars){
	         if(Character.isDigit(c)){
	            sb.append(c);
	         }
	      }
	      System.out.println(sb);*/
		
	      String Name = "22ndBirthday";
	      char[] chara = Name.toCharArray();
	      StringBuilder stb = new StringBuilder();
	      for(char l : chara) {
	    	  if (Character.isDigit(l)) {
	    		  stb.append(l);
	    	  }
	      }
    	  System.out.println(stb);
	      
	}

}
