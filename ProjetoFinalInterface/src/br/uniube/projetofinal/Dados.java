package br.uniube.projetofinal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Dados {
	
	//atributos
	private String nome;
	private String endereco;
	private String datanascimento;
	private String cpf;
	private String rg;
	private String uf;
	private String numerocelular;
	private String cidade;
	private boolean dor;
	private boolean dorcabeca;
	private boolean dorgarganta;
	private boolean febre;
	private boolean tosse;
	private boolean cansaco;
	private boolean difrespirar;
	private boolean perda;
	
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNumerocelular() {
		return numerocelular;
	}
	public void setNumerocelular(String numerocelular) {
		this.numerocelular = numerocelular;
	}
	public boolean isDor() {
		return dor;
	}
	public void setDor(boolean dor) {
		this.dor = dor;
	}
	public boolean isDorcabeca() {
		return dorcabeca;
	}
	public void setDorcabeca(boolean dorcabeca) {
		this.dorcabeca = dorcabeca;
	}
	public boolean isDorgarganta() {
		return dorgarganta;
	}
	public void setDorgarganta(boolean dorgarganta) {
		this.dorgarganta = dorgarganta;
	}
	public boolean isFebre() {
		return febre;
	}
	public void setFebre(boolean febre) {
		this.febre = febre;
	}
	public boolean isTosse() {
		return tosse;
	}
	public void setTosse(boolean tosse) {
		this.tosse = tosse;
	}
	public boolean isCansaco() {
		return cansaco;
	}
	public void setCansaco(boolean cansaco) {
		this.cansaco = cansaco;
	}
	public boolean isDifrespirar() {
		return difrespirar;
	}
	public void setDifrespirar(boolean difrespirar) {
		this.difrespirar = difrespirar;
	}
	public boolean isPerda() {
		return perda;
	}
	public void setPerda(boolean perda) {
		this.perda = perda;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//metodo para escrever os dados que serão passados pela classe cadastro e serão setados em um arquivo txt
	public void Salvar(){
			try {
				FileWriter fw = new FileWriter("Pacientes.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Nome: " + this.nome);
				pw.println("Idade: " + this.datanascimento);
				pw.println("Endereço: " + this.endereco);
				pw.println("CPF: " + this.cpf);
				pw.println("RG: " + this.rg);
				pw.println("UF: " + this.uf);
				pw.println("Cidade: " + this.cidade);
				pw.println("Número: " + this.numerocelular);
				pw.println();
				pw.flush();
				pw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	//metodo para escrever os dados que serão passados pela classe sintoma e serão setados no arquivo txt
	public void Salvar2(){
		try {
			FileWriter fw2 = new FileWriter("Pacientes.txt", true);
			PrintWriter pw2 = new PrintWriter(fw2);
			pw2.println("Sintomas");
			pw2.println();
			pw2.println("Dores no corpo: " + this.dor);
			pw2.println("Dor de cabeça: " + this.dorcabeca);
			pw2.println("Dor de garganta: " + this.dorgarganta);
			pw2.println("Febre: " + this.febre);
			pw2.println("Tosse: " + this.tosse);
			pw2.println("Cansaço: " + this.cansaco);
			pw2.println("Dificuldade respiratória: " + this.difrespirar);
			pw2.println("Perda de fala ou movimento: " + this.perda);
			pw2.println();
			pw2.flush();
			pw2.close();
			fw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
