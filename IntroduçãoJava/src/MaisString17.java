
public class MaisString17 {

	public static void main(String[] args) {
		String str ="Isto é uma String da Java";
		
		//o método split quebra a String e várias outras, pelo separador desejado
		
		String[] palavras = str.split("");
		
		int i + str.indexOf("uma"); //retorna o índice de palavra na String
		
		if(str.starsWith("Olá") || str.endsWith("Mundo!")){
			//testa o começoe  o fim da String - retorna boolean
		}
		
		str = str.trim(); //elimina os espaços em branco no início e no fim
		
		str = str.replace('a','@') //substitui os caracteres
				
		//substitui uma palavra(usa expressões regulares)
		str = str.replaceAll("String","Cadeia de caracteres");		

	}

}
