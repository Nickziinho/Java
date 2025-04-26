// class ExemploBreakContinue.java
public class ExemploDeFor {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?
	//1
	//2
	//4
	//5
	//O número 3 não foi impresso no console, pois o continue faz com que o loop pule a iteração atual e continue com a próxima.
    }
}