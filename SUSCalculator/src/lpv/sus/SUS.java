package lpv.sus;

import java.util.List;

public class SUS {
	
	public static void calculateEvaluation(List<List<String>> records) {
		Boolean isCSVStart = true;
		int sum = 0, answerValue = 0;
		float result = 0, finalResult;
		
		for(List<?> l: records) {
			// Ignora a linha que possui os titulos das colunas.
	    	if(isCSVStart) {
	    		isCSVStart = false;
	    		continue;
	    	}
	    	
	    	// Percorre as linhas/quest�es para obter o valor das respostas.
	    	for(int i=0; i<l.size(); i++) {	 
	    		// Ignora a primeira coluna que possui dados data e hora.
	    		if(i==0)
	    			continue;

	    		// Transforma o valor da resposta no tipo int.
	    		answerValue = Integer.parseInt(l.get(i).toString());
	    		
	    		// Verifica se a quest�o � par ou �mpar.
	    		if(i%2 == 0) {
	    			sum += 5 - answerValue;
	    		}
	    		else {
	    			sum += answerValue - 1;
	    		}
	    		   		
	    	}  // for interno
	    	
	    	// Ap�s realizar a soma das quest�es, multiplica por 2.5.
	    	result += sum*2.5f;
	    	System.out.println(sum*2.5f);
	    	sum = 0;
	    }
		
		// Realiza a m�dia dos resultados.
		finalResult = result/(records.size()-1);
		System.out.printf("\nResultado: %.1f", finalResult);
		
	}
	
}
