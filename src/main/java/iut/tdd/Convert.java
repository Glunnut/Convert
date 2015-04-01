package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		String result = "";
		int taillemot= input.length();
		char [] chiffre = new char[]{'0','1','2','3','4','5','6','7','8','9'};
		String [] chiffre1 = new String[]{"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
		String [] centaine = new String[]{null,"cent","deux-cent","trois-cent","quatre-cent","cinq-cent","six-cent","sept-cent","huit-cent","neuf-cent"};
		String [] dizaine = new String[]{null,"dix","vingt","trente","quarante","cinquante","soixante","soixante-dix","quatre-vingt","quatre-vingt-dix"};
		
		if( taillemot==1){
			if(input.equals("0")){
				return "zéro";
			}
			else if(input.equals("1")){
				return "un";
			}
			else if(input.equals("2")){
				return "deux";
			}
			else if(input.equals("3")){
				return "trois";
			}
			else if(input.equals("4")){
				return "quatre";
			}
			else if(input.equals("5")){
				return "cinq";
			}
			else if(input.equals("6")){
				return "six";
			}
			else if(input.equals("7")){
				return "sept";
			}
			else if(input.equals("8")){
				return "huit";
			}
			else if(input.equals("9")){
				return "neuf";
			}
		}else if(taillemot==2){
			for(int i=0;i<10;i++){
					if(input.charAt(0)== chiffre[i]) result += dizaine[i];
					
			}	
		}else if(taillemot==3){
		for(int i=0;i<10;i++){
				if(input.charAt(0)== chiffre[i]) result += centaine[i];
				
		}	
	}
		
		
		
		
		return result;
	}
	public static String text2num(String input) {
		return null;
	}
}