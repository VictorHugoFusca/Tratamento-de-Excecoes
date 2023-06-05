package entidades;

import excecoes.ContaExcecao;

public class Conta {
	private double saldo;
	private double limite;
	private String codigoIdentificacao;

	// Construtor vazio
	public Conta() {
	}

	// Getters e Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	// Método para sacar dinheiro da conta
	public void sacar(double valor) throws ContaExcecao {
		if (saldo - valor < 0) {
			throw new ContaExcecao("Saldo insuficiente.");
		} 
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);	
		}

	// Método para depositar dinheiro na conta
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
	}
}
