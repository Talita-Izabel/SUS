package lpv.gui;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;


public class Error {
	public static void messageError(String mensagem) {
		showMessageDialog(null, mensagem, "Erro", ERROR_MESSAGE);
		new Frame();
	}
}
