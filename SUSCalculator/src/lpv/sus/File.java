package lpv.sus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.FileReader;

import com.opencsv.CSVReader;

public class File {
	
	public static void readFile(String path) {
		List<List<String>> records = new ArrayList<List<String>>();
		
		try (CSVReader csvReader = new CSVReader(new FileReader(path));) {
		    String[] values = null;
		    while ((values = csvReader.readNext()) != null) {
		        records.add(Arrays.asList(values));
		    }
		    
		    SUS.calculateEvaluation(records);
		    
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
