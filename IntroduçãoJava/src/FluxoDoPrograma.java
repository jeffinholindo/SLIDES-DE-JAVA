
public class FluxoDoPrograma {

	public static void main(String[] args) {
		int idade = 20;
		if(idade <= 12){
			System.out.println("criança");
		}
		if(idade > 12 && idade <= 19){
			System.out.println("Adolescente");
		}
		if(idade > 19 && idade <=60 ){
			System.out.println("Adulto");
		}
		if(idade > 60){
			System.out.println("Idoso");
		}

		//else if
		int idade = 20;
		if(idade <= 12){
			System.out.println("criança");
		}
		else if(idade <= 19){
			System.out.println("Adolescente");
		}
		else if( idade <=60 ){
			System.out.println("Adulto");
		}
		else{
			System.out.println("Idoso");
		}
		
		//SWITCH
		int numero =1;
		switch (numero){
		case 1:
			System.out.println("UM");
			break;
		
		case 2:
			System.out.println("DOIS");
			break;
		
		case 3:
			System.out.println("TRES");
			break;
		defualt:
			System.out.println("NENHUM");
		}


	}

	}
