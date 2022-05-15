package lpv.gui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import lpv.sus.File;

public class ReadFile {
	
	public static JFrame createWindow() {
		JFrame frame = new  JFrame();
		frame.setSize( 900 , 700 );   
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculadora de Usabildade");
		frame.setLayout( new FlowLayout(1, 100, 100));
		
		
		JLabel title = new JLabel("Escolha o arquivo .csv para calcular a nota de usabilidade");
		
		title.setFont(new Font("SansSerif", Font.BOLD, 25));
		title.setBackground(Color.black);
		
		JPanel panel = new JPanel();
		
		panel.add(title);
		panel.setLocation(100, 800);
		
		JButton button = new JButton("Selecione o arquivo.");
		button.setSize(new Dimension(30, 30));
		
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				 if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					 System.out.println(fileChooser.getSelectedFile().toString());
					 
					 File.readFile(fileChooser.getSelectedFile().toString());
				 }
			}
		});
		
		
//		fileChooser.showSaveDialog(null);
		
		panel.add(button);
		frame.add(title);
		frame.add(panel);
		frame.setVisible( true );
		return frame;
	}
	

}
