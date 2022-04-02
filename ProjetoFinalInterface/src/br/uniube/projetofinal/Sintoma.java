package br.uniube.projetofinal;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Sintoma extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sintoma frame = new Sintoma();
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
	public Sintoma() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneOsSintomas = new JLabel("Selecione os sintomas apresentados:");
		lblSelecioneOsSintomas.setFont(new Font("Arial", Font.BOLD, 22));
		lblSelecioneOsSintomas.setBounds(37, 13, 403, 27);
		contentPane.add(lblSelecioneOsSintomas);
		
		
		final JCheckBox chckbxDoresNoCorpo = new JCheckBox("Dores no corpo");
		chckbxDoresNoCorpo.setBounds(37, 80, 143, 25);
		contentPane.add(chckbxDoresNoCorpo);

		final JCheckBox chckbxDorDeCabea = new JCheckBox("Dor de cabe\u00E7a");
		chckbxDorDeCabea.setBounds(37, 135, 113, 25);
		contentPane.add(chckbxDorDeCabea);
		
		final JCheckBox chckbxDorDeGarganta = new JCheckBox("Dor de garganta");
		chckbxDorDeGarganta.setBounds(37, 188, 143, 25);
		contentPane.add(chckbxDorDeGarganta);
		
		final JCheckBox chckbxFebre = new JCheckBox("Febre");
		chckbxFebre.setBounds(37, 240, 113, 25);
		contentPane.add(chckbxFebre);
		
		final JCheckBox chckbxTosse = new JCheckBox("Tosse");
		chckbxTosse.setBounds(260, 80, 113, 25);
		contentPane.add(chckbxTosse);
		
		final JCheckBox chckbxCansao = new JCheckBox("Cansa\u00E7o");
		chckbxCansao.setBounds(260, 135, 113, 25);
		contentPane.add(chckbxCansao);

		final JCheckBox chckbxDificuldadeRespiratria = new JCheckBox("Dificuldade respirat\u00F3ria");
		chckbxDificuldadeRespiratria.setBounds(260, 188, 161, 25);
		contentPane.add(chckbxDificuldadeRespiratria);
		
		final JCheckBox chckbxPerdaDeFala = new JCheckBox("Perda de fala ou movimento");
		chckbxPerdaDeFala.setBounds(260, 240, 197, 25);
		contentPane.add(chckbxPerdaDeFala);
		
		//metodo para setar os sintomas no arquivo txt
		JButton btnPrximo_1 = new JButton("Pr\u00F3ximo");
		btnPrximo_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				//metodo para setar os sintomas selecionados na classe Dados
				Dados objDados = new Dados();
				objDados.setDor(chckbxDoresNoCorpo.isSelected());
				objDados.setDorcabeca(chckbxDorDeCabea.isSelected());
				objDados.setDorgarganta(chckbxDorDeGarganta.isSelected());
				objDados.setFebre(chckbxFebre.isSelected());
				objDados.setTosse(chckbxTosse.isSelected());
				objDados.setCansaco(chckbxCansao.isSelected());
				objDados.setDifrespirar(chckbxDificuldadeRespiratria.isSelected());
				objDados.setPerda(chckbxPerdaDeFala.isSelected());
				objDados.Salvar2();
				
				//chamada de outra janela
				Final objFinal = new Final();
				objFinal.setVisible(true);
			}
		});
		
		btnPrximo_1.setBounds(180, 294, 97, 25);
		contentPane.add(btnPrximo_1);
		chckbxDorDeCabea.setBounds(37, 135, 113, 25);
		contentPane.add(chckbxDorDeCabea);
	}
}