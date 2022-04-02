package br.uniube.projetofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Final extends JFrame {

	private JPanel contentPane;
	
	private static Final frame = new Final();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public Final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPron = new JLabel("Prontu\u00E1rio cadastrado com sucesso!");
		lblPron.setFont(new Font("Arial", Font.BOLD, 20));
		lblPron.setBounds(48, 40, 364, 16);
		contentPane.add(lblPron);
		
		JLabel lblobrigadoPorUsar = new JLabel("(Obrigado por usar nosso programa!)");
		lblobrigadoPorUsar.setBounds(117, 83, 261, 16);
		contentPane.add(lblobrigadoPorUsar);
		
		//chama a janela cadastro
		JButton btnSim = new JButton("Sim");
		btnSim.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Cadastro objCadastro = new Cadastro();
				objCadastro.setVisible(true);
			}
		});
		btnSim.setBounds(107, 237, 97, 25);
		contentPane.add(btnSim);
		
		//fecha o programa
		JButton btnNo = new JButton("N\u00E3o");
		btnNo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnNo.setBounds(249, 237, 97, 25);
		contentPane.add(btnNo);
		
		JLabel lblDesejaCadastrarOutro = new JLabel("    \t    Deseja cadastrar outro prontu\u00E1rio?");
		lblDesejaCadastrarOutro.setFont(new Font("Arial", Font.BOLD, 16));
		lblDesejaCadastrarOutro.setBounds(61, 163, 364, 16);
		contentPane.add(lblDesejaCadastrarOutro);
	}
}
