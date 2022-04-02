package br.uniube.projetofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSejaBemvindoaAo = new JLabel("    Seja bem-vindo(a) ao cadastro de prontu\u00E1rio!\r\n\r\n\r\n");
		lblSejaBemvindoaAo.setFont(new Font("Arial", Font.BOLD, 18));
		lblSejaBemvindoaAo.setBounds(12, 21, 433, 58);
		contentPane.add(lblSejaBemvindoaAo);
		
		JLabel lblespecificamenteParaO = new JLabel("(Especificamente para o coronav\u00EDrus)");
		lblespecificamenteParaO.setFont(new Font("Arial", Font.PLAIN, 18));
		lblespecificamenteParaO.setBounds(76, 92, 311, 16);
		contentPane.add(lblespecificamenteParaO);
		
		//metodo para a chamada de outra janela
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro objCadastro = new Cadastro();
				objCadastro.setVisible(true);
			}
		});
		btnCadastrar.setBounds(76, 250, 97, 25);
		contentPane.add(btnCadastrar);
		
		//metodo para a chamada de outra janela
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sobre objSobre = new Sobre();
				objSobre.setVisible(true);
			}
		});
		btnSobre.setBounds(290, 250, 97, 25);
		contentPane.add(btnSobre);
	}
}
