package lpv.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import lpv.sus.File;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

public class Frame extends JFrame {

	private JPanel contentPane;

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( new Dimension(900, 700));
		setLocationRelativeTo(null);
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
