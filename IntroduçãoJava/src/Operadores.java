
public class Operadores {

	public static void main(String[] args) {
		
		//OPERADORES UN�RIOS
		
		//incremento e decremento ++ e --
			int a = 0;		
			int b = a++;	//incrementado depois de atribuir
			int c = ++a;	//incrementado antes de atribuir
			b = a--;		//decrementado depois de atribuir
			c = --a;		//decrementado depois de atribuir

		//Mais e Menos Un�rios: + e -
			int x = +3;		//x recebe o positivo 3
			x = -x;			//x recebe -3, neste caso
					
		//Invers�o de bits: ~
			int i = ~1;		// 1 = -2 (os bits foram invertidos)
			
		//Complementar o booleano: !
			boolean falsidade = !(true); //inverte o valor booleano
			
		//Convers�ao de Tipos: (tipo)
			double d = 1.99f;
			int i = (int) d; //converte de double p/ int (perda de precis�o)
			
		//OPERADORES ARITM�TICOS
			
		//Multiplica��o e Divis�o: * e /
			int um = 3/2;					//divis�o de inteiros gera um inteiro
			float umEmeio = (float) 3/2;	//ocorre promo��o aritm�tica para float
			double xyz = umEmeio * um;		//ocorre promo��o aritm�tica para float
			
		//M�dulo: %
			int resto = 7 %2;				//resto 1
			
		//Adi��o e subtra��o:n + e -
			long l = 1000 + 4000;
			double d = 1.0 - 0.01;
			
		//Concatena��o
			long var = 12345;
			String str = "O valor de var � " + var;	
			
		//OPERADORES DE COMPARA��O
			
		//Compara��o ordinal	
			boolean b  = (10 < 3);
			boolean w = (x <= y );
			if( x >= y){}
			
		//Operador instanceof
			String str="Uma string";
			if(str instanceof String){} //true
			if(str instanceof object){} //true
			
		//Compara��o de igualdade
			if(abc == 10){}
			boolean b = (xyz != 50);
			if (refObj == refObj2){}
			}
	
		//OPERADORES L�GICOS DE CURTO-CIRCUITO
			if (a >10) && (b<5){
				//isso
			}
			if (x==y) || (b<5){
				//aquilo
			}
			
			boolean b = x && y || z;
		}
	}


