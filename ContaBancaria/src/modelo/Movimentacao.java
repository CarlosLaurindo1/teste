package modelo;

import visualizacao.*;

public class Movimentacao {

	private int tipo;
	private double valor;
	private String data;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void constroiExtratoCompleto(int tipo, double valor, String data) {
		setTipo(tipo);
		setValor(valor);
		setData(data);
	}

}
