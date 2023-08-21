package principal;

public class PrintfEOperadores{ 

    public static void main(String[] args) {

        String nome = "Luan Muruk";
        int idade = 33;
        double altura = 1.83;
        boolean Verdadeiro = true;
        boolean falso = false;
      
        
        // Correção da formatação para exibir o nome, idade e altura
        System.out.printf("%s, tem %d anos, e sua altura é: %.2f", nome, idade, altura);
    

		//operadores de comparação
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
       
       
        
        //um unico if é uma estrutura simples
        //if e else tenho uma estrutura composta
        //if else é uma estrutura encadeada
        //podemos ter uma estrutura dentro de cada if / if else
        
    	if (opcao == 's' && Idade2 >= 17)
    		
    	{
    		System.out.println("pode entrar na festa");
    		
    	}
    	String diaSemana = "segunda"; // Inicialize a variável com um valor

    	if (diaSemana.equals("segunda")) {
    	    System.out.println("segunda feira");
    	}
    	else if (diaSemana.equals("terça")) {	
    	    System.out.println("terça feira"); // Corrija a string que você deseja imprimir
    	}
    	else if (diaSemana.equals("sexta")) {	
    	    System.out.println("sexta feira"); // Corrija a string que você deseja imprimir
    	}
    	
    	
    
    	
    	
    	}
}