
public class String {

	public static void main(java.lang.String[] args) {
		
		String str = "Isto � um string em java";
		String xyz = new String("Isto � uma String em java");
		
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if(str equals(xyz)){
			//Maneira correta de se comparar o conte�do das strings
		}
		
		System.out.println("Tamanho da String" +str.lenght());
		System.out.println("SubString" +str.substring(0, 10));
		System.out.println("caracter na posi��o 5:" +strcharAt(5));
		

	}

}
