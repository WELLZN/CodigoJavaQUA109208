package principal;

public class PrintfEOperadores{ 

    public static void main(String[] args) {

        String nome = "Luan Muruk";
        int idade = 33;
        double altura = 1.83;
        boolean Verdadeiro = true;
        boolean falso = false;
      
        
        // Corre��o da formata��o para exibir o nome, idade e altura
        System.out.printf("%s, tem %d anos, e sua altura �: %.2f", nome, idade, altura);
    

		//operadores de compara��o
		 // >maior que 
		 // < menor que 
		  //>= maior ou igual 
		  // <= menor ou igual 
		// != diferente
		// ==igual
        
        if (Verdadeiro || falso) {
        	System.out.println(10);
        	
        }
        
        else System.out.println(20);
       
        char opcao = 's';
        int Idade2 = 17;
       
       
        
        //um unico if � uma estrutura simples
        //if e else tenho uma estrutura composta
        //if else � uma estrutura encadeada
        //podemos ter uma estrutura dentro de cada if / if else
        
    	if (opcao == 's' && Idade2 >= 17)
    		
    	{
    		System.out.println("pode entrar na festa");
    		
    	}
    	String diaSemana = "segunda"; // Inicialize a vari�vel com um valor

    	if (diaSemana.equals("segunda")) {
    	    System.out.println("segunda feira");
    	}
    	else if (diaSemana.equals("ter�a")) {	
    	    System.out.println("ter�a feira"); // Corrija a string que voc� deseja imprimir
    	}
    	else if (diaSemana.equals("sexta")) {	
    	    System.out.println("sexta feira"); // Corrija a string que voc� deseja imprimir
    	}
    	
    	
    
    	
    	
    	}
}