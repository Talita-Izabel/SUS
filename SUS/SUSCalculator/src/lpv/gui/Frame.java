package lpv.gui;

import java.awt.BorderLayout.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.SwingConstants;

import lpv.sus.File;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame extends JFrame {

	private JPanel contentPane;

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( new Dimension(900, 700));
		setLocationRelativeTo(null);
		setTitle("Calculadora de Usabildade");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Escolha o arquivo .csv para calcular a nota de usabilidade");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(23, 101, 829, 25);
		contentPane.add(label);
		
		JButton btnSelecionarArquivo = new JButton("Selecionar arquivo");
		
		btnSelecionarArquivo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileFilter(new FileNameExtensionFilter("Planilhas", "csv"));
				fileChooser.setAcceptAllFileFilterUsed(false);
				 if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					 System.out.println(fileChooser.getSelectedFile().toString());
					 File.readFile(fileChooser.getSelectedFile().toString());
					 dispose();
					 
				 }
			}
		});

		
		btnSelecionarArquivo.setForeground(new Color(255, 255, 255));
		btnSelecionarArquivo.setBackground(new Color(0, 153, 255));
		btnSelecionarArquivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSelecionarArquivo.setBounds(365, 189, 161, 60);
		contentPane.add(btnSelecionarArquivo);
		setResizable(false);
		
		setVisible(true);
		
	}
}
