package lpv.gui;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class GraphSus extends JFrame {
	private float noteValueSUS; 
	//Container
	private JPanel contentPane;

	
	public GraphSus(float noteValueSUS) {
		this.noteValueSUS = noteValueSUS;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( new Dimension(900, 700));
		setLocationRelativeTo(null);
		setTitle("Calculadora de Usabildade");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Widget
		JLabel lblNewLabel = new JLabel("Seu resultado foi de: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 47, 864, 43);
		contentPane.add(lblNewLabel);
		
		//Widget
		JLabel lblNewLabel_1 = new JLabel(String.format("%1.2f", this.noteValueSUS));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 101, 864, 43);
		contentPane.add(lblNewLabel_1);
		
		//Container
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(44, 260, 402, 52);
		contentPane.add(panel_1);
		
		//Container
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(446, 260, 161, 52);
		contentPane.add(panel);
		
		//Container
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(607, 260, 241, 52);
		contentPane.add(panel_2);
		
		//Widget
		JLabel lblNewLabel_2 = new JLabel("Inaceitável");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(44, 230, 347, 19);
		contentPane.add(lblNewLabel_2);
		
		//Widget
		JLabel lblNewLabel_3 = new JLabel("Marginal");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(389, 230, 182, 19);
		contentPane.add(lblNewLabel_3);
		
		//Widget
		JLabel lblNewLabel_4 = new JLabel("Aceitável");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(571, 230, 275, 19);
		contentPane.add(lblNewLabel_4);
		
		//Widget
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(39, 323, 22, 19);
		contentPane.add(lblNewLabel_5);
		
		//Widget
		JLabel lblNewLabel_6 = new JLabel("50");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(435, 323, 28, 19);
		contentPane.add(lblNewLabel_6);
		
		//Widget
		JLabel lblNewLabel_7 = new JLabel("70");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(590, 323, 39, 18);
		contentPane.add(lblNewLabel_7);
		
		//Widget
		JLabel lblNewLabel_8 = new JLabel("100");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(828, 323, 46, 19);
		contentPane.add(lblNewLabel_8);
		
		
		Integer percentage = Math.round(((804 * this.noteValueSUS) / 100));
		if(this.noteValueSUS == 0)
			percentage += 25;
		else if(this.noteValueSUS != 100)
			percentage += 13;
		
		//Widget
		Icon arrow = new ImageIcon("F:\\SUS\\SUSCalculator\\icons\\arrow.png");
		
		//Widget
		JLabel btnNewButton = new JLabel(arrow);
		btnNewButton.setBounds(percentage, 353, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton buttonBack = new JButton("Voltar");
		buttonBack.setBounds(360, 500, 150, 50);
		buttonBack.setForeground(new Color(255, 255, 255));
		buttonBack.setBackground(new Color(0, 153, 255));
		buttonBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		buttonBack.addActionListener(new ActionListener() {
			//Tratamento de evento
			@Override 
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Frame();
			}
		});
		
		contentPane.add(buttonBack);
		
		
		
		setResizable(false);

		setVisible(true);
	}
}
