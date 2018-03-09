
public class Operadores {

	public static void main(String[] args) {
		
		//OPERADORES UNÁRIOS
		
		//incremento e decremento ++ e --
			int a = 0;		
			int b = a++;	//incrementado depois de atribuir
			int c = ++a;	//incrementado antes de atribuir
			b = a--;		//decrementado depois de atribuir
			c = --a;		//decrementado depois de atribuir

		//Mais e Menos Unários: + e -
			int x = +3;		//x recebe o positivo 3
			x = -x;			//x recebe -3, neste caso
					
		//Inversão de bits: ~
			int i = ~1;		// 1 = -2 (os bits foram invertidos)
			
		//Complementar o booleano: !
			boolean falsidade = !(true); //inverte o valor booleano
			
		//Conversçao de Tipos: (tipo)
			double d = 1.99f;
			int i = (int) d; //converte de double p/ int (perda de precisão)
			
		//OPERADORES ARITMÉTICOS
			
		//Multiplicação e Divisão: * e /
			int um = 3/2;					//divisão de inteiros gera um inteiro
			float umEmeio = (float) 3/2;	//ocorre promoção aritmética para float
			double xyz = umEmeio * um;		//ocorre promoção aritmética para float
			
		//Módulo: %
			int resto = 7 %2;				//resto 1
			
		//Adição e subtração:n + e -
			long l = 1000 + 4000;
			double d = 1.0 - 0.01;
			
		//Concatenação
			long var = 12345;
			String str = "O valor de var é " + var;	
			
		//OPERADORES DE COMPARAÇÃO
			
		//Comparação ordinal	
			boolean b  = (10 < 3);
			boolean w = (x <= y );
			if( x >= y){}
			
		//Operador instanceof
			String str="Uma string";
			if(str instanceof String){} //true
			if(str instanceof object){} //true
			
		//Comparação de igualdade
			if(abc == 10){}
			boolean b = (xyz != 50);
			if (refObj == refObj2){}
			}
	
		//OPERADORES LÓGICOS DE CURTO-CIRCUITO
			if (a >10) && (b<5){
				//isso
			}
			if (x==y) || (b<5){
				//aquilo
			}
			
			boolean b = x && y || z;
		}
	}


