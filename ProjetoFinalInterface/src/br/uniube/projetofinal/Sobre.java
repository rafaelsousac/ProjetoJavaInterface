package br.uniube.projetofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//chamada de um TextPane
		JTextPane txtpnProgramaFeitosPelos = new JTextPane();
		txtpnProgramaFeitosPelos.setForeground(Color.DARK_GRAY);
		txtpnProgramaFeitosPelos.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnProgramaFeitosPelos.setText(" Programa feito pelo aluno:\r\n\r\n Rafael Sousa Chagas - 5149358\r\n\r\n Programa\u00E7\u00E3o Orientada a Objetos\r\n\r\n Orientadora: Luciene Chagas\r\n");
		txtpnProgramaFeitosPelos.setBounds(0, 0, 432, 253);
		contentPane.add(txtpnProgramaFeitosPelos);
	}
}
