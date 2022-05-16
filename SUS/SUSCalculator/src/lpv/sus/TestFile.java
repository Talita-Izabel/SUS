package lpv.sus;

public class TestFile {

	public static void main(String[] args) {
		testeFile();
	}

	private static void testeFile() {
		try {			
			//File file = new File();
			File.readFile("C:\\Users\\talit\\OneDrive\\Documentos\\TSI\\3° Período\\LPV\\teste.txt");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
