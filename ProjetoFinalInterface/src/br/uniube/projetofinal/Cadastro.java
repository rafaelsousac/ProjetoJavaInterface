package br.uniube.projetofinal;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtUf;
	private JTextField txtNumero;
	private JTextField txtEndereco;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPorFavorInsira = new JLabel("Por favor, insira os seguintes dados:");
		lblPorFavorInsira.setFont(new Font("Arial", Font.BOLD, 23));
		lblPorFavorInsira.setBounds(20, 13, 416, 24);
		contentPane.add(lblPorFavorInsira);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 16));
		lblNome.setBounds(12, 55, 105, 16);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 16));
		lblCpf.setBounds(12, 143, 56, 16);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Arial", Font.BOLD, 16));
		lblRg.setBounds(12, 172, 56, 16);
		contentPane.add(lblRg);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Arial", Font.BOLD, 16));
		lblUf.setBounds(12, 201, 56, 16);
		contentPane.add(lblUf);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Arial", Font.BOLD, 16));
		lblNmero.setBounds(12, 260, 74, 16);
		contentPane.add(lblNmero);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Arial", Font.BOLD, 16));
		lblIdade.setBounds(12, 84, 56, 16);
		contentPane.add(lblIdade);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 18));
		txtNome.setBounds(99, 53, 329, 22);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Arial", Font.PLAIN, 18));
		txtIdade.setBounds(99, 82, 329, 22);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCpf.setToolTipText("");
		txtCpf.setBounds(99, 141, 329, 22);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setFont(new Font("Arial", Font.PLAIN, 18));
		txtRg.setBounds(99, 170, 329, 22);
		contentPane.add(txtRg);
		txtRg.setColumns(10);
		
		txtUf = new JTextField();
		txtUf.setFont(new Font("Arial", Font.PLAIN, 18));
		txtUf.setBounds(99, 199, 329, 22);
		contentPane.add(txtUf);
		txtUf.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Arial", Font.PLAIN, 18));
		txtNumero.setText("");
		txtNumero.setBounds(98, 257, 329, 22);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				//metodo para setar os dados pessoais na classe Dados
				Dados objDados = new Dados();
				objDados.setNome(txtNome.getText());
				objDados.setDatanascimento(txtIdade.getText());
				objDados.setEndereco(txtEndereco.getText());
				objDados.setCpf(txtCpf.getText());
				objDados.setRg(txtRg.getText());
				objDados.setUf(txtUf.getText());
				objDados.setCidade(txtCidade.getText());
				objDados.setNumerocelular(txtNumero.getText());
				objDados.Salvar();
				
				//metodo para a chamada de outra janela
				Sintoma objSintoma = new Sintoma();
				objSintoma.setVisible(true);	
			}
		});
		
		btnPrximo.setFont(new Font("Arial", Font.PLAIN, 13));
		btnPrximo.setBounds(180, 294, 97, 25);
		contentPane.add(btnPrximo);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Arial", Font.BOLD, 16));
		lblEndereo.setBounds(12, 114, 99, 16);
		contentPane.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Arial", Font.PLAIN, 18));
		txtEndereco.setBounds(99, 111, 329, 22);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 16));
		lblCidade.setBounds(12, 230, 74, 16);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCidade.setBounds(99, 228, 329, 22);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
	}
}