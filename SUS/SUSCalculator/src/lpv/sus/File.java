package lpv.sus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileReader;

import com.opencsv.CSVReader;
import lpv.gui.Error;

//Tratamento de evento
public class File {
	
	public static List<List<String>> readFile(String path) {
		List<List<String>> records = new ArrayList<List<String>>();
		
		try (CSVReader csvReader = new CSVReader(new FileReader(path));) {
		    String[] values = null;
		    
		    if(!verifyExtension(path))
				throw new Exception("File invalid! File is not CSV type.");		   
		    	
		    while ((values = csvReader.readNext()) != null) {
		        records.add(Arrays.asList(values));
		    }
		    
		        
		    //return records;
		    SUS.calculateEvaluation(records);
		    
		}catch(Exception e) {
			Error.messageError(e.getMessage());
			System.out.println(e.getMessage());
		}
		return records;
	
	}

	public static boolean verifyExtension(String path) {
		String ext = "";
		
		if(path.contains(".")) 
			ext = path.substring(path.lastIndexOf(".")+1);

		return ext.compareTo("csv") == 0 ? true : false;
	}
}
