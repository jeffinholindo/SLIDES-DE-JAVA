
public class MaisString17 {

	public static void main(String[] args) {
		String str ="Isto � uma String da Java";
		
		//o m�todo split quebra a String e v�rias outras, pelo separador desejado
		
		String[] palavras = str.split("");
		
		int i + str.indexOf("uma"); //retorna o �ndice de palavra na String
		
		if(str.starsWith("Ol�") || str.endsWith("Mundo!")){
			//testa o come�oe  o fim da String - retorna boolean
		}
		
		str = str.trim(); //elimina os espa�os em branco no in�cio e no fim
		
		str = str.replace('a','@') //substitui os caracteres
				
		//substitui uma palavra(usa express�es regulares)
		str = str.replaceAll("String","Cadeia de caracteres");		

	}

}
