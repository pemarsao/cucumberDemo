package com.cucumber.demo.caixaeletronico;

import java.math.BigDecimal;

public class DepositoCaixaEletronico {

	private BigDecimal saldo = BigDecimal.ZERO;
	
	public void fazerDeposito(String agencia, String conta, BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
	}

	public BigDecimal getSaldo() {
		return this.saldo;
	}

}
