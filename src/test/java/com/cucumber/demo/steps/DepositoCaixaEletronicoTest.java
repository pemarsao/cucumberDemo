package com.cucumber.demo.steps;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import com.cucumber.demo.caixaeletronico.DepositoCaixaEletronico;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class DepositoCaixaEletronicoTest {
	
	private String agencia;
	private String conta;
	private BigDecimal valor;
	
	DepositoCaixaEletronico depositoCaixaEletronico = new DepositoCaixaEletronico();
	
	@Dado("que o Sr Pedro informou a agência (.*?)")
	public void informarAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	@E("informou a conta (.*?)")
	public void informarConta(String conta) {
		this.conta = conta;
	}
	
	@E("informou o valor de (\\d+\\.\\d+)")
	public void informarValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@E("já tenha um saldo de (\\d+\\.\\d+)")
	public void jaTenhoSaldo(BigDecimal saldor) {
		depositoCaixaEletronico.fazerDeposito(this.agencia, this.conta, saldor);
	}

	@Quando("confirmar a operação")
	public void confirmarOperacao() {
		depositoCaixaEletronico.fazerDeposito(this.agencia, this.conta, this.valor);
	}
	
	@Então("Ele terá (\\d+\\.\\d+) na conta")
	public void verificaSaldo(BigDecimal saldo) {
		assertTrue(saldo.compareTo(depositoCaixaEletronico.getSaldo()) == 0);
	}
}
